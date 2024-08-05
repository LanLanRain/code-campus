package com.rainsoul.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.google.common.base.Preconditions;
import com.rainsoul.subject.application.convert.SubjectLabelDTOConverter;
import com.rainsoul.subject.application.dto.SubjectLabelDTO;
import com.rainsoul.subject.common.entity.Result;
import com.rainsoul.subject.domain.entity.SubjectLabelBO;
import com.rainsoul.subject.domain.service.SubjectLabelDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author RainSoul
 * @create 2024-07-30
 */
@RestController
@RequestMapping("/subject/label")
@Slf4j
public class SubjectLabelController {
    @Resource
    private SubjectLabelDomainService subjectLabelDomainService;

    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectLabelDTO subjectLabelDTO) {
        try {
            if (log.isDebugEnabled()) {
                log.info("SubjectLabelController.add subjectLabelDTO: {}", subjectLabelDTO);
            }
            Preconditions.checkArgument(StringUtils.isBlank(subjectLabelDTO.getLabelName()), "标签名称不能为空");
            SubjectLabelBO subjectLabelBO = SubjectLabelDTOConverter.INSTANCE.convertSubjectLabelDTOToBO(subjectLabelDTO);
            Boolean result = subjectLabelDomainService.add(subjectLabelBO);
            return Result.success(result);
        } catch (Exception e) {
            log.error("SubjectLabelController.add subjectLabelDTO: {}", subjectLabelDTO, e);
            return Result.fail("新增标签失败");
        }
    }

    @PostMapping("/update")
    public Result<Boolean> update(@RequestBody SubjectLabelDTO subjectLabelDTO) {
        try {
            if (log.isDebugEnabled()) {
                log.info("SubjectLabelController.update subjectLabelDTO: {}", JSON.toJSONString(subjectLabelDTO));
            }
            Preconditions.checkNotNull(subjectLabelDTO.getId(), "标签id不能为空");
            SubjectLabelBO subjectLabelBO = SubjectLabelDTOConverter.INSTANCE.convertSubjectLabelDTOToBO(subjectLabelDTO);
            Boolean result = subjectLabelDomainService.update(subjectLabelBO);
            return Result.success(result);
        } catch (Exception e) {
            log.error("SubjectLabelController.update subjectLabelDTO: {}", subjectLabelDTO, e);
            return Result.fail("更新标签失败");
        }
    }

        @PostMapping("/delete")
        public Result<Boolean> delete(@RequestBody SubjectLabelDTO subjectLabelDTO) {
            try {
                if (log.isInfoEnabled()) {
                    log.info("SubjectLabelController.delete.dto:{}", JSON.toJSONString(subjectLabelDTO));
                }
                Preconditions.checkNotNull(subjectLabelDTO.getId(), "标签id不能为空");
                SubjectLabelBO subjectLabelBO = SubjectLabelDTOConverter.INSTANCE.convertSubjectLabelDTOToBO(subjectLabelDTO);
                Boolean result = subjectLabelDomainService.delete(subjectLabelBO);
                return Result.success(result);
            } catch (Exception e) {
                log.error("SubjectLabelController.delete.error:{}", e.getMessage(), e);
                return Result.fail("删除标签失败");
            }
        }

    /**
     * 查询分类下标签
     */
    @PostMapping("/queryLabelByCategoryId")
    public Result<List<SubjectLabelDTO>> queryLabelByCategoryId(@RequestBody SubjectLabelDTO subjectLabelDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("SubjectLabelController.queryLabelByCategoryId.dto:{}",
                        JSON.toJSONString(subjectLabelDTO));
            }
            Preconditions.checkNotNull(subjectLabelDTO.getCategoryId(), "分类id不能为空");
            SubjectLabelBO subjectLabelBO = SubjectLabelDTOConverter.INSTANCE.convertSubjectLabelDTOToBO(subjectLabelDTO);
            List<SubjectLabelBO> subjectLabelBOList = subjectLabelDomainService.queryLabelByCategoryId(subjectLabelBO);
            List<SubjectLabelDTO> subjectLabelDTOList = SubjectLabelDTOConverter.INSTANCE.convertSubjectLabelBOListToDTOList(subjectLabelBOList);
            return Result.success(subjectLabelDTOList);
        } catch (Exception e) {
            log.error("SubjectLabelController.queryLabelByCategoryId.error:{}", e.getMessage(), e);
            return Result.fail("查询分类下标签失败");
        }

    }

}