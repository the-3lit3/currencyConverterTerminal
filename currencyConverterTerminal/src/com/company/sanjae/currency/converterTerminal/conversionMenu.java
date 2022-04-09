package com.company.sanjae.currency.converterTerminal;

//import java.util.Scanner;

public class conversionMenu{
    private int option;
    public conversionMenu(){}

    public void setOption(int optionInput){
        this.option = optionInput;
    }

    public void menu(){
        //Scanner scan = new Scanner(System.in);
        System.out.println("Currency Converter App");
        System.out.println("\t============================== MENU ==============================\n\r");
        System.out.println("\t============================== ==== ==============================\n\r");
        System.out.println("\t\t\t1. USD to JMD");
        System.out.println("\t\t\t2. CAD to JMD");
        System.out.println("\t\t\t3. EUR to JMD");
        System.out.println("\t\t\t4. EXIT");
        System.out.print("\t\t\tEnter Option : ");
        //setOption(scan.nextInt());
    }

}

