package com.zhul.spring5.service;

import com.zhul.spring5.dao.UseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//在注解里面value属性值可以忽略不写
//默认值是类名称，首字母小写
//UserService ---> useService
@Service(value = "useService")//<bean id="useService" class="..."/>
public class UseService {

    @Value(value ="abc")
    private String name;

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
    @Autowired//根据类型进行注入
//    @Qualifier(value = "useDaoImpl")  根据名称注入
//    @Resource 可以根据类型注入，也可以根据名称注入
    private UseDao useDao;


    public void add(){
        System.out.println("service add .....");
        useDao.add();
        System.out.println(name);
    }

}
