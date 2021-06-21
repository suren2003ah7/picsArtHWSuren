package com.company.advancedLesson4.test;

import com.company.advancedLesson4.model.FolderSizeCalculator;
import java.io.File;

public class FolderSizeCalculatorTest {
    public static void calculate(){
        File dir = new File("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\lesson9");
        long size = FolderSizeCalculator.sizeCalculator(dir);
        if (size > 1024 * 1024 * 1024){
            long gigabytes = size / (1024 * 1024 * 1024);
            size -= gigabytes * 1024 * 1024 * 1024;
            long megabytes = size / (1024 * 1024);
            size -= megabytes * 1024 * 1024;
            long kilobytes = size / 1024;
            size -= kilobytes * 1024;
            long bytes = size;
            System.out.println(gigabytes + " gigabytes " + megabytes + " megabytes " + kilobytes + " kilobytes " + bytes + " bytes");
        }
        else if (size > 1024 * 1024){
            long megabytes = size / (1024 * 1024);
            size -= megabytes * 1024 * 1024;
            long kilobytes = size / 1024;
            size -= kilobytes * 1024;
            long bytes = size;
            System.out.println(megabytes + " megabytes " + kilobytes + " kilobytes " + bytes + " bytes");
        }
        else if (size > 1024){
            long bytes = size % 1024;
            long kilobytes = size / 1024;
            System.out.println(kilobytes + " kilobytes " + bytes + " bytes");
        }
        else{
            System.out.println(size + " bytes");
        }
    }
}
