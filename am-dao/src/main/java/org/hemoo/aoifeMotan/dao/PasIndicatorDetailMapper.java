package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasIndicatorDetail;

public interface PasIndicatorDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasIndicatorDetail record);

    int insertSelective(PasIndicatorDetail record);

    PasIndicatorDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasIndicatorDetail record);

    int updateByPrimaryKey(PasIndicatorDetail record);
}