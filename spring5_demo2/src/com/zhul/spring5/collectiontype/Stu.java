package com.zhul.spring5.collectiontype;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //1.数组类型属性
    private String[] courses;

    //2.list集合类型属性
    private List<String> list;

    //3.map类型属性
    private Map<String,String> maps;

    //4.set集合类型属性
    private Set<String> sets;

    private List<Course> courseList;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
