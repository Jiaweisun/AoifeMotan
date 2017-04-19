package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasSerial;

public interface PasSerialMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasSerial record);

    int insertSelective(PasSerial record);

    PasSerial selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasSerial record);

    int updateByPrimaryKey(PasSerial record);
}