package com.piyush.staticexamples;

public class Human {
    int age;
    int salary;
    String name;
    static int population;


    static {
        System.out.println("i run only oncce");
        population = 23;
    }

    static void message(){
        //System.out.println(this.age);
        //This isn't valid because static dont need an obj to be called , butour this.age does needs it
        System.out.println("hi");
    }

    public Human(int age,int salary,String name){
        this.name = name;
        this.age = age;
        this.salary =salary;

        Human.population +=1;
    }

}
