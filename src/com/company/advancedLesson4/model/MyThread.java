package com.company.advancedLesson4.model;

import java.io.File;

public class MyThread extends Thread{
    public long finalLength = 0;

    @Override
    public void run() {
        File directory = new File("C:\\Users\\ZenBook\\IdeaProjects\\PicsArtHW\\src\\com\\company\\lesson9");
        sizeCalculator(directory);
        if (finalLength > 1024 * 1024 * 1024){
            long gigabytes = finalLength / (1024 * 1024 * 1024);
            finalLength -= gigabytes * 1024 * 1024 * 1024;
            long megabytes = finalLength / (1024 * 1024);
            finalLength -= megabytes * 1024 * 1024;
            long kilobytes = finalLength / 1024;
            finalLength -= kilobytes * 1024;
            long bytes = finalLength;
            System.out.println(gigabytes + " gigabytes " + megabytes + " megabytes " + kilobytes + " kilobytes " + bytes + " bytes");
        }
        else if (finalLength > 1024 * 1024){
            long megabytes = finalLength / (1024 * 1024);
            finalLength -= megabytes * 1024 * 1024;
            long kilobytes = finalLength / 1024;
            finalLength -= kilobytes * 1024;
            long bytes = finalLength;
            System.out.println(megabytes + " megabytes " + kilobytes + " kilobytes " + bytes + " bytes");
        }
        else if (finalLength > 1024){
            long bytes = finalLength % 1024;
            long kilobytes = finalLength / 1024;
            System.out.println(kilobytes + " kilobytes " + bytes + " bytes");
        }
        else{
            System.out.println(finalLength + " bytes");
        }
    }

    public void sizeCalculator(File directory){
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                finalLength += file.length();
                System.out.println(finalLength);
            }
            else{
                sizeCalculator(file);
            }
        }
    }
}