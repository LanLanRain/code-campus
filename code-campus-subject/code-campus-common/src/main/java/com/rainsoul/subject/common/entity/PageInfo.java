package com.rainsoul.subject.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author RainSoul
 * @create 2024-08-06
 */
@Data
public class PageInfo implements Serializable {
    private Integer pageNo = 1;
    private Integer pageSize = 10;

    public Integer getPageNo() {
        if (pageNo == null || pageNo < 1) {
            return 1;
        }
        return pageNo;
    }

    public Integer getPageSize() {
        if (pageSize == null || pageSize < 1 || pageSize > Integer.MAX_VALUE) {
            return 10;
        }
        return pageSize;
    }
}
