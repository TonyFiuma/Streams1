package it.develhope.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public
class Start{

    public static void main(String args[]){

        try{
            File file = new File("C:\\Users\\axelf\\OneDrive\\Desktop\\EserciziJava\\javaAvanzato2Modulo" +
                                         "\\Streams(2)\\"+"streams-1\\src\\file.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[]          bytesFromFile   = fileInputStream.readAllBytes();
            System.out.println(new String(bytesFromFile));
        }catch (IOException e){
            System.out.println("Please enter the correct path of the file");
            e.printStackTrace();
        }

    }

}
