package org.hemoo.aoifeMotan.service;

import org.hemoo.aoifeMotan.dao.PasPointMapper;
import org.hemoo.aoifeMotan.domain.PasPoint;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sunjiawei on 2017/4/18.
 */
@Service
public class TestService {

    @Resource
    private PasPointMapper pointMapper;

    public List<PasPoint> ps(){
        return pointMapper.selectAll();
    }
}
