package com.company.project;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public static void createFolder(String path){
        File f = new File(path);
        f.mkdirs();
    }

    public static void createFile(String path, String name){
        File file = new File(path + File.separator + name);
        try {
            file.createNewFile();
        }
        catch (IOException e){
          e.printStackTrace();
        }
    }

    public static void writeFile(String path, String text){
        try{
            Files.write(Paths.get(path), text.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String path){
        try{
            return Files.readAllLines(Paths.get(path));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
