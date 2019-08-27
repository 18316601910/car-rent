package com.qf.car.service.impl;

import com.qf.car.domain.vo.CategoryVo;
import com.qf.car.mapper.CategoryMapper;
import com.qf.car.service.CateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("cateService")
public class CateServiceImpl implements CateService {
    @Resource
    CategoryMapper categoryMapper;
    @Override
    public List<CategoryVo> getHeader() {
        return categoryMapper.findAll();
    }
}
