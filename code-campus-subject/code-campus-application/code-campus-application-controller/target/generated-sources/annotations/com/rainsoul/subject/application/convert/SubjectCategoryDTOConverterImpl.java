package com.rainsoul.subject.application.convert;

import com.rainsoul.subject.application.dto.SubjectCategoryDTO;
import com.rainsoul.subject.domain.entity.SubjectCategoryBO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-29T21:21:20+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_412 (Azul Systems, Inc.)"
)
public class SubjectCategoryDTOConverterImpl implements SubjectCategoryDTOConverter {

    @Override
    public SubjectCategoryBO convertDtoToCategoryBO(SubjectCategoryDTO subjectCategoryDTO) {
        if ( subjectCategoryDTO == null ) {
            return null;
        }

        SubjectCategoryBO subjectCategoryBO = new SubjectCategoryBO();

        subjectCategoryBO.setId( subjectCategoryDTO.getId() );
        subjectCategoryBO.setCategoryName( subjectCategoryDTO.getCategoryName() );
        subjectCategoryBO.setCategoryType( subjectCategoryDTO.getCategoryType() );
        subjectCategoryBO.setImageUrl( subjectCategoryDTO.getImageUrl() );
        subjectCategoryBO.setParentId( subjectCategoryDTO.getParentId() );
        subjectCategoryBO.setCreatedBy( subjectCategoryDTO.getCreatedBy() );
        subjectCategoryBO.setCreatedTime( subjectCategoryDTO.getCreatedTime() );
        subjectCategoryBO.setUpdateBy( subjectCategoryDTO.getUpdateBy() );
        subjectCategoryBO.setUpdateTime( subjectCategoryDTO.getUpdateTime() );
        subjectCategoryBO.setIsDeleted( subjectCategoryDTO.getIsDeleted() );

        return subjectCategoryBO;
    }

    @Override
    public List<SubjectCategoryDTO> convertCategoryBOListToDTOList(List<SubjectCategoryBO> subjectCategoryBOList) {
        if ( subjectCategoryBOList == null ) {
            return null;
        }

        List<SubjectCategoryDTO> list = new ArrayList<SubjectCategoryDTO>( subjectCategoryBOList.size() );
        for ( SubjectCategoryBO subjectCategoryBO : subjectCategoryBOList ) {
            list.add( subjectCategoryBOToSubjectCategoryDTO( subjectCategoryBO ) );
        }

        return list;
    }

    protected SubjectCategoryDTO subjectCategoryBOToSubjectCategoryDTO(SubjectCategoryBO subjectCategoryBO) {
        if ( subjectCategoryBO == null ) {
            return null;
        }

        SubjectCategoryDTO subjectCategoryDTO = new SubjectCategoryDTO();

        subjectCategoryDTO.setId( subjectCategoryBO.getId() );
        subjectCategoryDTO.setCategoryName( subjectCategoryBO.getCategoryName() );
        subjectCategoryDTO.setCategoryType( subjectCategoryBO.getCategoryType() );
        subjectCategoryDTO.setImageUrl( subjectCategoryBO.getImageUrl() );
        subjectCategoryDTO.setParentId( subjectCategoryBO.getParentId() );
        subjectCategoryDTO.setCreatedBy( subjectCategoryBO.getCreatedBy() );
        subjectCategoryDTO.setCreatedTime( subjectCategoryBO.getCreatedTime() );
        subjectCategoryDTO.setUpdateBy( subjectCategoryBO.getUpdateBy() );
        subjectCategoryDTO.setUpdateTime( subjectCategoryBO.getUpdateTime() );
        subjectCategoryDTO.setIsDeleted( subjectCategoryBO.getIsDeleted() );

        return subjectCategoryDTO;
    }
}
