package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasSubordinate;

public interface PasSubordinateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasSubordinate record);

    int insertSelective(PasSubordinate record);

    PasSubordinate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasSubordinate record);

    int updateByPrimaryKey(PasSubordinate record);
}