package ru.andestech.learning.rfb18.at.day4;

import ru.andestech.learning.rfb18.utils.FileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class App 
{
    public static void main( String[] args ) throws IOException {

    // test FileUtiles....

    String f1 = "C:\\Users\\and\\IdeaProjects2\\ModuleTestNGday4\\numbers1.txt";
    Object[][] dar = FileUtils.readMultyLines(f1, ",");

    int i=0;
    for(; i< dar.length; i++){
        System.out.println();
       for (int k=0; k < dar[i].length; k++ )
       {
           System.out.printf(new Locale("eng"),
                   "%6.1f,", dar[i][k]);
       }
        System.out.print("\b");
    }
        System.out.println("\n----------------------");

    //test simple case list to array
    //student case [][3] array
        ArrayList<Object[]> arr3= new ArrayList<>();
        arr3.add(new Object[]{1,2,3});
        arr3.add(new Object[]{11,12,23});
        arr3.add(new Object[]{-1,2,3});

        Object[][] o1 = new Object[arr3.size()][3];

        arr3.toArray(o1);

        // debug and stop here, check o1.





    }
}
