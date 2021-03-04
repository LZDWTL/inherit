package cn.Test;

import cn.Test.util.ConfigReader;

import java.util.Scanner;

/**
 * Hello world!
 * OCP：对扩展开放（可以新增类或配置文件）
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Student stu = new Student();
        stu.setId("111");
        System.out.println(stu.getId());
        ;

        /*Cat cat=new Cat();
        cat.bark();

        Dog dog=new Dog();
        dog.bark();*/

        /**
         * 利用面向抽象实现OCP原则：Open Close Principle（开闭原则 或闭合原则 :对修改闭合，对扩展开放）
         * 对修改闭合：将来系统新增需求，不修改原代码软件，通过配置文件来修改
         * 对扩展开放：只需要新增相应的类和配置文件来满足需求
         */
        //向上转型，特点：父类的引用(animal)指向子类的对象( new Dog() 或 new Cat() )
        /*Animal animal =new Dog();
        animal.bark(); //该行代码不变，就会出现多态，即同一种行为作用在不同得对象上，有不同的结果*/

        String className = ConfigReader.getClassName();
        /*
        利用反射机制使用className动态创建对象
         */
        Animal animal = (Animal) Class.forName(className).newInstance();
        animal.bark();

    }
}
