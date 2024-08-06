package com.rainsoul.subject.domain.handler.subject;

import com.rainsoul.subject.common.enums.SubjectInfoTypeEnum;

/**
 * @author RainSoul
 * @create 2024-08-05
 */
public interface SubjectTypeHandler {
    SubjectInfoTypeEnum getHandlerType();

    void add()
}
