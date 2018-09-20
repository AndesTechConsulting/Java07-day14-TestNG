package ru.andestech.learning.rfb18.utils;


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.nio.file.Files.readAllLines;
import static java.nio.file.Paths.get;

public class FileUtils {

    public static Object[][] readMultyLines(String fname, String separator) throws IOException {

        if(fname == null || separator == null) return new Object[0][0];

        Path path = get(fname);
        if(Files.notExists(path, LinkOption.NOFOLLOW_LINKS) ||
           separator.equals("")) return new Object[0][0];

        int numberofLines = 0;
        for(String s : readAllLines(path)){numberofLines++;}

        Object[][] out = new Object[numberofLines][];

        int k =0;
        for(String s : readAllLines(path))
        {
            ArrayList arrayList = new ArrayList(3);
            for(String snum: s.split(separator))
            {
                String n = snum.trim();
                if(!n.matches("-?\\d+\\.?\\d*")) continue;

                arrayList.add( Double.parseDouble(n));
            }

            out[k] = new Object[arrayList.size()];
            arrayList.toArray(out[k]);
            k++;
        }

        return out;
    }

    public static Object[][] readMultyLines(String fname) throws IOException {
        return  readMultyLines(fname,",");
    }
}
