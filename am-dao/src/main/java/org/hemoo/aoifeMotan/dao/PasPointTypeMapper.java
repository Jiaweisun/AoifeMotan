package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasPointType;

public interface PasPointTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasPointType record);

    int insertSelective(PasPointType record);

    PasPointType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasPointType record);

    int updateByPrimaryKey(PasPointType record);
}