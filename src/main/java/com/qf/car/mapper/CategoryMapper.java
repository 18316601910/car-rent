package com.qf.car.mapper;

import com.qf.car.domain.entity.Category;
import com.qf.car.domain.vo.CategoryVo;

import java.util.List;

public interface CategoryMapper {
    List<CategoryVo> findAll();
}