package com.rainsoul.subject.application.convert;

import com.rainsoul.subject.application.dto.SubjectLabelDTO;
import com.rainsoul.subject.domain.entity.SubjectLabelBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author RainSoul
 * @create 2024-07-30
 */
@Mapper
public interface SubjectLabelDTOConverter {

    SubjectLabelDTOConverter INSTANCE = Mappers.getMapper(SubjectLabelDTOConverter.class);

    SubjectLabelBO convertSubjectLabelDTOToBO(SubjectLabelDTO subjectLabelDTO);

    List<SubjectLabelDTO> convertSubjectLabelBOListToDTOList(List<SubjectLabelBO> subjectLabelBOList);

}
