package org.example;

public class Main {
    public static void main(String[] args) {

        UserRegistationFormClass userRegistationFormClass = new UserRegistationFormClass();
        boolean result = userRegistationFormClass.isAgeValid(20);
        System.out.println(result);

    }
}