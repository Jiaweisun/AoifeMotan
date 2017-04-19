package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasPositionChange;

public interface PasPositionChangeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasPositionChange record);

    int insertSelective(PasPositionChange record);

    PasPositionChange selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasPositionChange record);

    int updateByPrimaryKey(PasPositionChange record);
}