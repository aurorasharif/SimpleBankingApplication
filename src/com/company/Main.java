package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Account auro=new Account(1234, "auro");
        Account mithi=new Account(2345, "mithi");

        auro.initiate();
    }
}
