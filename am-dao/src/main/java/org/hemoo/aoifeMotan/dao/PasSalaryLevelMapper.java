package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasSalaryLevel;

public interface PasSalaryLevelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasSalaryLevel record);

    int insertSelective(PasSalaryLevel record);

    PasSalaryLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasSalaryLevel record);

    int updateByPrimaryKey(PasSalaryLevel record);
}