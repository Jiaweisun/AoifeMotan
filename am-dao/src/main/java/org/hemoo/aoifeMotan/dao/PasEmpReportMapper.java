package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasEmpReport;

public interface PasEmpReportMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasEmpReport record);

    int insertSelective(PasEmpReport record);

    PasEmpReport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasEmpReport record);

    int updateByPrimaryKey(PasEmpReport record);
}