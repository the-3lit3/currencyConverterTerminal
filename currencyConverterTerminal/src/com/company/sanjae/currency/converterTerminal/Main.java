package com.company.sanjae.currency.converterTerminal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        conversionMenu newConvert = new conversionMenu();

        US_JMD usConv = new US_JMD();
        CAD_JMD cadConv = new CAD_JMD();
        EU_JMD euConv = new EU_JMD();

        Scanner scan = new Scanner(System.in);

            try {
                while (true) {
                newConvert.menu();
                int option = scan.nextInt();
                switch (option) {
                    case 1: {
                        System.out.print("\n\r\t\tUSD : $");
                        usConv.setValues(scan.nextDouble());
                        System.out.println();
                        usConv.getConversion();
                        System.out.println("\t\tJMD : $" + usConv.getConversionS());
                        break;
                    }
                    case 2: {
                        System.out.print("\n\r\t\tCAD : $");
                        cadConv.setValues(scan.nextDouble());
                        cadConv.getConversion();
                        System.out.println("\t\tJMD : $" + cadConv.getConversionS());
                        break;
                    }
                    case 3: {
                        System.out.print("\n\r\t\tEUR : €");
                        euConv.setValues(scan.nextDouble());
                        euConv.getConversion();
                        System.out.println("\t\tJMD : $" + euConv.getConversionS());
                        break;
                    }
                    case 4: {
                        System.exit(0);
                        break;
                    }
                    default:
                        System.out.println("\t\tExit without input...");
                }
            }
            } catch (Exception e) {
                System.out.println("Invalid Input. Only accepts decimal number values.\n\n\r" + e);

            }
    }
}
