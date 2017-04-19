package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasCompanyChange;

public interface PasCompanyChangeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasCompanyChange record);

    int insertSelective(PasCompanyChange record);

    PasCompanyChange selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasCompanyChange record);

    int updateByPrimaryKey(PasCompanyChange record);
}