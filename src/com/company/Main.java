package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static char getCharacter(){
        char b = ' ';
        String characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abckdefhijklmnopqrstuvwxyz";
        int rand = (int)(Math.random()*characterSet.length());
//        System.out.print(rand + " ");
        b = characterSet.charAt(rand);
        System.out.print(b +" ");
        return b;
    }
    public static void main(String[] args) throws Exception{
        //create output stream

        FileOutputStream output = new FileOutputStream("result.txt");
        for(int i = 0; i < 100;i++) {

           output.write(getCharacter());
        }
        output.close();
        System.out.print('\n');
        FileInputStream input = new FileInputStream("result.txt");
        int x = 0;
        while((x = input.read()) !=-1){
            System.out.print(x + " ");
        }
    }
}
