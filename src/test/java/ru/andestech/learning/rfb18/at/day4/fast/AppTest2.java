package ru.andestech.learning.rfb18.at.day4.fast;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class AppTest2 {

  @Test(groups = {"g1"})
  public void methCC(){
      System.out.println(
     "++  " +
             Thread.currentThread().getStackTrace()[1].getMethodName()
      );

  }

    @Test(groups = {"g1","g2"})
    @Parameters({"version"})
    public void methAA(@Optional String ver){
        System.out.println(
                "++  " +
                        Thread.currentThread().getStackTrace()[1].getMethodName()
        );
        System.out.println("version: " +ver);
    }
    @Test(groups = {"g2"})
    @Parameters({"name2", "tel", "login"})
    public void methBB(@Optional String name,
                       @Optional String tel,
                       @Optional String login){
        System.out.println(
                "++  " +
                        Thread.currentThread().getStackTrace()[1].getMethodName()
        );
        System.out.println(name + ", tel:" + tel + ", login as:" + login);

    }

    @Test(groups = {"g3"})
    public void methDD(){
        System.out.println(
                "++  " +
                        Thread.currentThread().getStackTrace()[1].getMethodName()
        );

    }
}
