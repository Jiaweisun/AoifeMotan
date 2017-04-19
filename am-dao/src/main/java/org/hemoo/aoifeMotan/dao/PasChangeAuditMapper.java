package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasChangeAudit;

public interface PasChangeAuditMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasChangeAudit record);

    int insertSelective(PasChangeAudit record);

    PasChangeAudit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasChangeAudit record);

    int updateByPrimaryKey(PasChangeAudit record);
}