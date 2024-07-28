package com.rainsoul.subject.domain.convert;

import com.rainsoul.subject.domain.entity.SubjectCategoryBO;
import com.rainsoul.subject.infra.basic.entity.SubjectCategory;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-28T22:03:28+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_412 (Azul Systems, Inc.)"
)
public class SubjectCategoryConverterImpl implements SubjectCategoryConverter {

    @Override
    public SubjectCategory convertBoToCategory(SubjectCategoryBO subjectCategoryBO) {
        if ( subjectCategoryBO == null ) {
            return null;
        }

        SubjectCategory subjectCategory = new SubjectCategory();

        subjectCategory.setId( subjectCategoryBO.getId() );
        subjectCategory.setCategoryName( subjectCategoryBO.getCategoryName() );
        subjectCategory.setCategoryType( subjectCategoryBO.getCategoryType() );
        subjectCategory.setImageUrl( subjectCategoryBO.getImageUrl() );
        subjectCategory.setParentId( subjectCategoryBO.getParentId() );
        subjectCategory.setCreatedBy( subjectCategoryBO.getCreatedBy() );
        subjectCategory.setCreatedTime( subjectCategoryBO.getCreatedTime() );
        subjectCategory.setUpdateBy( subjectCategoryBO.getUpdateBy() );
        subjectCategory.setUpdateTime( subjectCategoryBO.getUpdateTime() );
        subjectCategory.setIsDeleted( subjectCategoryBO.getIsDeleted() );

        return subjectCategory;
    }
}
