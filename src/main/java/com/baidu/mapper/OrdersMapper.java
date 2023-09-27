package com.baidu.mapper;

import com.baidu.pojo.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersMapper extends tk.mybatis.mapper.common.Mapper<Orders> {
    /*查询所有的订单*/
    List<Orders> findOrders();

    //根据id删除订单
    int delById(Integer oid);
}
