package com.zhul.spring5.bean;

//员工类
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式展示
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    //生成Dept的get方法
    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add(){
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
