package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasSalaryChange;

public interface PasSalaryChangeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasSalaryChange record);

    int insertSelective(PasSalaryChange record);

    PasSalaryChange selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasSalaryChange record);

    int updateByPrimaryKey(PasSalaryChange record);
}