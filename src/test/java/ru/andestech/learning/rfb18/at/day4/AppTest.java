package ru.andestech.learning.rfb18.at.day4;



import org.testng.annotations.*;
import ru.andestech.learning.rfb18.utils.FileUtils;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AppTest
{
    private static String fname, sep, fname2, sep2;

    @BeforeClass
    @Parameters({"fname", "sep", "fname2", "sep2"})
    public void init(String fn1, String s1, String fn2, String s2){
        fname = fn1;
        sep = s1;
        fname2 = fn2;
        sep2 = s2;

        System.out.println(fname + " : " +sep);
        System.out.println(fname2 + " : " +sep2);
    }



    @DataProvider(name = "externalData")
    private static Object[][] getNumbers() throws IOException {
        return FileUtils.readMultyLines(fname,sep);
    }

    @DataProvider(name = "externalData2")
    private static Object[][] getNumbers2() throws IOException {
        return FileUtils.readMultyLines(fname2,sep2);
    }

    @Test(dataProvider = "externalData")
    public void checkNumbers(double a, double b, double res)
    {

        assertEquals(res, a + b );
    }

    @Test(dataProvider = "externalData2")
    public void checkNumbers2(double res, double ... datas)
    {
        double calc = 0;
        for(double d: datas) calc += d;
        assertEquals(res, calc );
    }
}
