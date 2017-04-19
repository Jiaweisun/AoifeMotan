package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasAction;

public interface PasActionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasAction record);

    int insertSelective(PasAction record);

    PasAction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasAction record);

    int updateByPrimaryKey(PasAction record);
}