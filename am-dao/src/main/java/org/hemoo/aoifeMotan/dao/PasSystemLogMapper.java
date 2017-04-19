package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasSystemLog;
import org.hemoo.aoifeMotan.domain.PasSystemLogWithBLOBs;

public interface PasSystemLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PasSystemLogWithBLOBs record);

    int insertSelective(PasSystemLogWithBLOBs record);

    PasSystemLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PasSystemLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PasSystemLogWithBLOBs record);

    int updateByPrimaryKey(PasSystemLog record);
}