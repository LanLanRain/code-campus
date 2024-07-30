package com.rainsoul.subject.application.controller;

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

/**
 * @author RainSoul
 * @create 2024-07-30
 */
@RestController
@RequestMapping
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


}