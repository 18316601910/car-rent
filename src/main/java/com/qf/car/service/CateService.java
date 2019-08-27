package com.qf.car.service;

import com.qf.car.domain.vo.CategoryVo;
import com.qf.car.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public interface CateService {
  List<CategoryVo> getHeader();

}
