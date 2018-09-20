package ru.andestech.learning.rfb18.at.day4;

import ru.andestech.learning.rfb18.utils.FileUtils;

import java.io.IOException;
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
  }
}
