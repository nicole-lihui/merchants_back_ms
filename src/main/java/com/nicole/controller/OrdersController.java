package com.nicole.controller;

import com.nicole.dto.OrdersDTO;
import com.nicole.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.LinkedList;
import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("orders")
    public List<OrdersDTO> getOrders(Integer shopId, Integer status) {
        List<OrdersDTO> ol = null;
        ol = ordersService.selectMany(shopId, status);

        return  ol;
    }

    @RequestMapping("orders/info")
    public OrdersDTO OrdersInfo(Integer id) {
        OrdersDTO ol = null;
        ol = ordersService.selectOne(id);

        return  ol;
    }
}
