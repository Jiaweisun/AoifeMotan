package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasBranchCompany;

public interface PasBranchCompanyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasBranchCompany record);

    int insertSelective(PasBranchCompany record);

    PasBranchCompany selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasBranchCompany record);

    int updateByPrimaryKey(PasBranchCompany record);
}