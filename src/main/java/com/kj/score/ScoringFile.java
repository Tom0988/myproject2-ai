package com.kj.score;

import com.kj.kotlin_tester.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("C:\\Users\\kj537\\IdeaProjects\\myproject2-ai\\src\\main\\java\\com\\kj\\score\\scores.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null){
                String[] token = line.split(",");
                String name = token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student stu = new Student(name, english, math);
                stu.print();
                line = reader.readLine();
            }
            /*int data = fileReader.read();
            while(data != -1){
                System.out.println((char)data);
                data = fileReader.read();
            }*/
        } catch (FileNotFoundException ex){
            System.out.println("file cant be read...");
        } catch (IOException e){
            System.out.println("data cant be read...");
        }
        System.out.println("continuing...");
    }
}
