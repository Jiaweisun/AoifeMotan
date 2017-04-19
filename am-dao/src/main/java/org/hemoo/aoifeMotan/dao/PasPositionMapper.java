package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasPosition;

public interface PasPositionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasPosition record);

    int insertSelective(PasPosition record);

    PasPosition selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasPosition record);

    int updateByPrimaryKey(PasPosition record);
}