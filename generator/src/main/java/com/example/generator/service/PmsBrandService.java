package com.example.generator.service;


import com.example.generator.mbg.model.PmsBrand;

import java.util.List;

/**
 * @description PmsBrandService
 */
public interface PmsBrandService {

    int create(PmsBrand brand);

    int update(Long id, PmsBrand brand);

    int delete(Long id);

    PmsBrand getItem(Long id);

    List<PmsBrand> list(Integer pageNum, Integer pageSize);

    List<PmsBrand> ListAll();
}
