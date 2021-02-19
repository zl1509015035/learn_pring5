package com.zhul.reflect;

import com.zhul.domain.Person;
import com.zhul.domain.Student;

public class ReflectDemo1 {

    /**
     * 获取Class对象的方式：
     * 1.Class.forName("全类名"):将字节码文件加载进内存，返回Class对象
     *   多用于配置文件，将类定义在配置文件中。读取文件，加载类
     * 2.类名.class：通过类名的属性class获取
     *   多用于参数的传递
     * 3.对象.getClass():getClass()方法在Object类中定义着。
     *   多用于对象的获取字节码方式
     * <p>
     * 结论：
     * 同一个字节码文件(*.class)再一次程序运行过程中，只会被加载一次，不论
     * 通过哪一种方式获取的class对象都是同一个。
     */

    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class.forName("全类名")
        //多用于配置文件，将类定义在配置文件中。读取文件，加载类
        Class cls1 = Class.forName("com.zhul.domain.Person");
        System.out.println(cls1);

        //2.类名.class
        //多用于参数的传递
        Class cls2 = Person.class;
        System.out.println(cls2);

        //3.对象.getClass()
        //多用于对象的获取字节码方式
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //==比较三个对象
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);

        Class c = Student.class;
        System.out.println(c == cls1);
    }
}
