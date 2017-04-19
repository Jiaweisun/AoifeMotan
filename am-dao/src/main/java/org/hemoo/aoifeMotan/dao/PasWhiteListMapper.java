package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasWhiteList;

public interface PasWhiteListMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasWhiteList record);

    int insertSelective(PasWhiteList record);

    PasWhiteList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasWhiteList record);

    int updateByPrimaryKey(PasWhiteList record);
}