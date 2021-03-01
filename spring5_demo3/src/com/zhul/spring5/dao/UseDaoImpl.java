package com.zhul.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "useDaoImpl")
public class UseDaoImpl implements UseDao{
    @Override
    public void add() {
        System.out.println("useDaoImpl add.....");
    }
}
