package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasPoint;

import java.util.List;

public interface PasPointMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasPoint record);

    int insertSelective(PasPoint record);

    PasPoint selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasPoint record);

    int updateByPrimaryKey(PasPoint record);

    List<PasPoint> selectAll();
}