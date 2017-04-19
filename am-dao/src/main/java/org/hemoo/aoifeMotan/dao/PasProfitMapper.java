package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasProfit;

public interface PasProfitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasProfit record);

    int insertSelective(PasProfit record);

    PasProfit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasProfit record);

    int updateByPrimaryKey(PasProfit record);
}