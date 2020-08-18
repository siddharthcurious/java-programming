package com.learn.coding.designpatterns.creational.builder;

public class TaskBuilderTestMain {

    public static void main(String[] args) {
        Task task = new TaskBuilder(5).setDescription("Hello").setSummary("Test").setDone(true).build();
        System.out.println(task);
    }

}