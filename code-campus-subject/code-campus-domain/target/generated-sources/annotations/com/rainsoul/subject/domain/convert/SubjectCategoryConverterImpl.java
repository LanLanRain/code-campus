package com.rainsoul.subject.domain.convert;

import com.rainsoul.subject.domain.entity.SubjectCategoryBO;
import com.rainsoul.subject.infra.basic.entity.SubjectCategory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-29T21:21:15+0800",
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

    @Override
    public List<SubjectCategoryBO> convertCategoryListToBoList(List<SubjectCategory> subjectCategoryList) {
        if ( subjectCategoryList == null ) {
            return null;
        }

        List<SubjectCategoryBO> list = new ArrayList<SubjectCategoryBO>( subjectCategoryList.size() );
        for ( SubjectCategory subjectCategory : subjectCategoryList ) {
            list.add( subjectCategoryToSubjectCategoryBO( subjectCategory ) );
        }

        return list;
    }

    protected SubjectCategoryBO subjectCategoryToSubjectCategoryBO(SubjectCategory subjectCategory) {
        if ( subjectCategory == null ) {
            return null;
        }

        SubjectCategoryBO subjectCategoryBO = new SubjectCategoryBO();

        subjectCategoryBO.setId( subjectCategory.getId() );
        subjectCategoryBO.setCategoryName( subjectCategory.getCategoryName() );
        subjectCategoryBO.setCategoryType( subjectCategory.getCategoryType() );
        subjectCategoryBO.setImageUrl( subjectCategory.getImageUrl() );
        subjectCategoryBO.setParentId( subjectCategory.getParentId() );
        subjectCategoryBO.setCreatedBy( subjectCategory.getCreatedBy() );
        subjectCategoryBO.setCreatedTime( subjectCategory.getCreatedTime() );
        subjectCategoryBO.setUpdateBy( subjectCategory.getUpdateBy() );
        subjectCategoryBO.setUpdateTime( subjectCategory.getUpdateTime() );
        subjectCategoryBO.setIsDeleted( subjectCategory.getIsDeleted() );

        return subjectCategoryBO;
    }
}
