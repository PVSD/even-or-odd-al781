package com.company;
import java.util.Scanner;

public class Main
    {

        public static void main(String[] args)
            {
                Scanner intScan = new Scanner(System.in);
                Scanner strScan = new Scanner(System.in);
                int num = 0;
                int evenOrOdd = 0;
                String cont = "";
                boolean looper = true;
                while(true)
                    {
                        System.out.print("Enter an Integer : ");
                        do
                            {
                                try
                                    {
                                        num = intScan.nextInt();

                                        looper = false;
                                    }
                                catch (Exception e)
                                    {
                                        System.out.println("ENTER A VALID COMMAND");
                                    }
                            }
                        while(looper);
                        looper = true;
                        evenOrOdd = num % 2;
                        if (evenOrOdd == 0)
                            {
                                System.out.println(num + " is an even number." );
                            }
                        else if (evenOrOdd == 1)
                            {
                                System.out.println(num + " is an odd number.");
                            }
                        num = 0;
                        evenOrOdd = 0;
                        System.out.println("Again?\nY for yes\nN for no");
                        do
                            {
                                cont = strScan.nextLine();
                                switch (cont)
                                    {
                                        case "Y":
                                            looper = false;
                                        break;

                                        case "N":
                                            System.exit(0);
                                        break;

                                        default:
                                            System.out.println("INPUT A VALID COMMAND");
                                        break;
                                    }
                            }
                        while(looper);
                    }
            }
    }