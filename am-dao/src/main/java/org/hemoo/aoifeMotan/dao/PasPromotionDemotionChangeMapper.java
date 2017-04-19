package org.hemoo.aoifeMotan.dao;

import org.hemoo.aoifeMotan.domain.PasPromotionDemotionChange;

public interface PasPromotionDemotionChangeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PasPromotionDemotionChange record);

    int insertSelective(PasPromotionDemotionChange record);

    PasPromotionDemotionChange selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PasPromotionDemotionChange record);

    int updateByPrimaryKey(PasPromotionDemotionChange record);
}