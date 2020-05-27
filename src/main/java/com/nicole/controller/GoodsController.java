package com.nicole.controller;

import com.nicole.dao.model.GoodDO;
import com.nicole.dto.GoodsDTO;
import com.nicole.service.GoodStatusService;
import com.nicole.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private GoodStatusService goodStatusService;

    @RequestMapping("/goods")
    public List<GoodDO> searchGoods(Integer shopId, Integer status) {
        List<GoodDO> gl = null;
        gl = goodsService.selectMany(shopId, status);

        return gl;
    }
}
