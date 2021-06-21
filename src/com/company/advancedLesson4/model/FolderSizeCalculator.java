package com.company.advancedLesson4.model;

import java.io.File;

public class FolderSizeCalculator {
    public static long sizeCalculator(File directory){
        long length = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile())
                length += file.length();
            else
                length += sizeCalculator(file);
        }
        return length;
    }
}
