package com.coolk1ng.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author coolk1ng
 * @since 2022/11/27 20:12
 */
@Mapper
public interface TestMapper {
    /**
     * 用于测试
     * @return Integer
     */
    Integer testCount();
}
