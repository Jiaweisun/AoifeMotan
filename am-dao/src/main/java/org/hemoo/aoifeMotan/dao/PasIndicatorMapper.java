package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasIndicator;

public interface PasIndicatorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasIndicator record);

    int insertSelective(PasIndicator record);

    PasIndicator selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasIndicator record);

    int updateByPrimaryKey(PasIndicator record);
}