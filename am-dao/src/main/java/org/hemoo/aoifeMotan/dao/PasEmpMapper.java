package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasEmp;

public interface PasEmpMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasEmp record);

    int insertSelective(PasEmp record);

    PasEmp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasEmp record);

    int updateByPrimaryKey(PasEmp record);
}