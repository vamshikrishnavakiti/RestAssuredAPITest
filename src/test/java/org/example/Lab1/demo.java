package org.example.Lab1;

import org.junit.Test;

public class demo {
    public static void main(String[] args) {
        String str = "ThjdfHVJbbjbJgJJJ";
        int upperCoint =0;
        int lowerCount =0;
        for (int i=0;i<str.length();i++){
          char c= str.charAt(i);
          if(Character.isUpperCase(c)){
              upperCoint++;}
              else if(Character.isLowerCase(c)){
                  lowerCount++;
              }
          }
        System.out.println(upperCoint);
        System.out.println(lowerCount);
        }

    }


