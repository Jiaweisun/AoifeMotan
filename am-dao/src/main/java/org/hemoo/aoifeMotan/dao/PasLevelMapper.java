package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasLevel;

public interface PasLevelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasLevel record);

    int insertSelective(PasLevel record);

    PasLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasLevel record);

    int updateByPrimaryKey(PasLevel record);
}