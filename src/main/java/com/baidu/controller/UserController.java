package com.baidu.controller;

import com.baidu.pojo.Orders;
import com.baidu.pojo.QueryVo;
import com.baidu.pojo.User;
import com.baidu.service.OrdersService;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

//控制层
//@RestController =@Controller+@ResponseBody(使返回的是数据)
@Controller
//@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrdersService ordersService;

    //订单展示
    @GetMapping("showOrd")
    public String show(Model model, QueryVo vo){
        //查
        List<Orders> ordersLists = ordersService.findOrders(vo);
        //存值
        model.addAttribute("ordersList",ordersLists);
        return "orders";
    }
    //订单删除
    @GetMapping("del")
    public String del(Integer oid){
        int i = ordersService.delById(oid);
        if (i>0){
            return "redirect:showOrd";
        }else {
            return "error";
        }
    }
    //删除第二种方法
   /* @DeleteMapping("/del/{oid}")
    public String del(@PathVariable("oid") Integer oid){
        int i = ordersService.delById(oid);
        if (i>0){
            return "redirect:showOrd";
        }else {
            return "error";
        }
    }*/


    @GetMapping("test")
    public String TestHell(){
        return "hello";
    }

   /* @GetMapping("show")
    public List<User> show(){
        return userService.findUsers();
    }

    @GetMapping("showOrder")
    public List<Orders> showOrder(){
        return ordersService.findOrders();
    }
*/
}
