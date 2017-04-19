package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasGrade;

public interface PasGradeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasGrade record);

    int insertSelective(PasGrade record);

    PasGrade selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasGrade record);

    int updateByPrimaryKey(PasGrade record);
}