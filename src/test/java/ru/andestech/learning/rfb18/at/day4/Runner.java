package ru.andestech.learning.rfb18.at.day4;

import org.testng.TestNG;
public class Runner {

    public static void main(String[] args)
    {
        TestNG tn = new TestNG();
        tn.setTestClasses(
                new Class[]{
        ru.andestech.learning.rfb18.at.day4.AppTest.class,
        ru.andestech.learning.rfb18.at.day4.fast.AppTest2.class
                });

        tn.run();

        if(!tn.hasFailure()) System.out.println("!! success!");
        else System.out.println("... smth wrong..");



    }
}
