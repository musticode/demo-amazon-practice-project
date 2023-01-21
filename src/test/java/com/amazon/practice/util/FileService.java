package com.amazon.practice.util;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileService {
    private static Path filePAth = Path.of("src/test/java/resources/test_result.txt");

    private static FileService instance;

    public static FileService getInstance(){
        if (instance == null){
            instance = new FileService();
        }

        return instance;
    }


    public void writeToFile(String text){
        try {
            Files.writeString(filePAth, text);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readFromFile(){
        try {
            String fileContent = Files.readString(filePAth);
            System.out.println(fileContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
