package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasContants;

public interface PasContantsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasContants record);

    int insertSelective(PasContants record);

    PasContants selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasContants record);

    int updateByPrimaryKey(PasContants record);
}