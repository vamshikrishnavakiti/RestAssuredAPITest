package org.example.Lab1;

public class Main {

    public static void main(String[] args) {

        //Rest Assured is Library, Which will help to make http request and to verify.
        //Testng- it is used to manage our test cases.
        // Allure- is for reporting purpose.
        // Maven - Build and dependency management and taking care of project.

        // Rest Assured - BDD syntax.
        //Give - When- Then.

        // Patter- builder pattern.
        NonBuilderPattern bp = new NonBuilderPattern();
        bp.groundFloor();
        bp.FirstFloor();
        bp.SecondFloor();
        bp.groundFloor("Nice pattern");

        BuilderPatter bp2 = new BuilderPatter();
        bp2.groundFloor().firstFloor().secondFloor();

    }
}
