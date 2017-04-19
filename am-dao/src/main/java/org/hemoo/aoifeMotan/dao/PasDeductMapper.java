package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasDeduct;

public interface PasDeductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasDeduct record);

    int insertSelective(PasDeduct record);

    PasDeduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasDeduct record);

    int updateByPrimaryKey(PasDeduct record);
}