package com.company;

import java.util.Scanner;

public class Account {
    private int accNum;
    private int balance;
    private String custName;

    Scanner scanner=new Scanner(System.in);

    public Account(int accNum, String custName) {
        this.accNum = accNum;
        this.custName = custName;
    }

    public void deposit(){
        System.out.println("Enter the amount u want to deposit.");
        int fund= scanner.nextInt();
        if (fund>0){
            this.balance+=fund;
        }
        System.out.println("updated balance is: " + balance);
    }

    public void withdraw(){
        System.out.println("enter the amount u would like to withdraw");
        int fund= scanner.nextInt();
        if (fund >0){
            this.balance-=fund;
        }
        System.out.println("updated balance is: " + balance);
    }

    public void checkBal(){
        System.out.println("present balance is: " + balance + "\n");
    }

    public void exit(){
        System.out.println("thanks for using our service");
        System.exit(0);
    }

    public void initiate(){

        boolean flag=true;
        do {
            System.out.println("Press 1 for deposit");
            System.out.println("Press 2 for withdraw");
            System.out.println("Press 3 for check balance");
            System.out.println("Press 4 to quit");

            int action=scanner.nextInt();

            switch (action) {
                case 1: this.deposit();
                    break;
                case 2: this.withdraw();
                    break;
                case 3: this.checkBal();
                    break;
                case 4: this.exit();
                    break;
                default:
                    System.out.println("option does exist. enter a valid number");
                    break;
            }

            System.out.println("would u like to have another transaction?");
            System.out.println("press y for yes and n for no");
            char x=scanner.next().charAt(0);

            if (x=='y') flag=true;
            else flag=false;
        }
        while (flag);
       // System.out.println("thanks for using our service");
    }
}
