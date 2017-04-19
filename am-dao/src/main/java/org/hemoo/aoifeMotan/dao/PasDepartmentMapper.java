package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasDepartment;

public interface PasDepartmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasDepartment record);

    int insertSelective(PasDepartment record);

    PasDepartment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasDepartment record);

    int updateByPrimaryKey(PasDepartment record);
}