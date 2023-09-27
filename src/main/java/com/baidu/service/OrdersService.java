package com.baidu.service;

import com.baidu.pojo.Orders;
import com.baidu.pojo.QueryVo;


import java.util.List;

public interface OrdersService {
    /*查询所有的订单*/
    List<Orders> findOrders(QueryVo vo);

    //根据id删除订单
    int delById(Integer oid);
}
