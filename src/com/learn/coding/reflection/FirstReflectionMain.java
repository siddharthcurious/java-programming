package com.learn.coding.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {
    private String name;
    public String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}

public class FirstReflectionMain {
    public static void main(String[] args) {

        Student student = new Student("Siddharth", "UG107");

        Method [] methods = student.getClass().getMethods();

        for(Method method: methods){
            System.out.println(method);
        }

        System.out.println("--------------------------------");

        Field [] fields = student.getClass().getFields();

        for(Field field: fields){
            System.out.println(field);
        }

    }
}
