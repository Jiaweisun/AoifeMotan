package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasSalaryAdjust;

public interface PasSalaryAdjustMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasSalaryAdjust record);

    int insertSelective(PasSalaryAdjust record);

    PasSalaryAdjust selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasSalaryAdjust record);

    int updateByPrimaryKey(PasSalaryAdjust record);
}