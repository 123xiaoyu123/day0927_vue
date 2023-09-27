package com.baidu.service;

import com.baidu.mapper.OrdersMapper;
import com.baidu.pojo.Orders;
import com.baidu.pojo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class OrdersServiceImp implements OrdersService{

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> findOrders(QueryVo vo) {
        //通用mapper的条件查询
        Example example = new Example(Orders.class);
        Example.Criteria criteria = example.createCriteria();
        //对编号onumber进行判断
        if (vo.getOnumber()!=null && vo.getOnumber()!=""){
            criteria.equals(vo.getOnumber());
        }/*else if (vo.getCreatetime())*/
        return ordersMapper.selectByExample(example);
    }

    @Override
    public int delById(Integer oid) {
        return ordersMapper.delById(oid);
    }
}
