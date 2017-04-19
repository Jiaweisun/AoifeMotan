package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasRank;

public interface PasRankMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasRank record);

    int insertSelective(PasRank record);

    PasRank selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasRank record);

    int updateByPrimaryKey(PasRank record);
}