package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasDeductType;

public interface PasDeductTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasDeductType record);

    int insertSelective(PasDeductType record);

    PasDeductType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasDeductType record);

    int updateByPrimaryKey(PasDeductType record);
}