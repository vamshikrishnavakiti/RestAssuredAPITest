package org.example.Lab1;

public class BuilderPatter {
    public BuilderPatter groundFloor(){
        System.out.println("Ground Floor");
        return this;
    }
    public BuilderPatter secondFloor(){
        System.out.println("Second Floor");
        return this;
    }
    public BuilderPatter firstFloor(){
        System.out.println("First Floor");
        return this;
    }
}
