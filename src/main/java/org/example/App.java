/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter y for yes and n for no");
        System.out.print("Is the car silent when you turn the key? ");
        String str1 = sc.nextLine();
        if(str1.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            String str2 = sc.nextLine();
            if(str2.equals("y"))
            {
                System.out.print("Clean terminals and try starting again.");
                System.exit(0);
            }
            else if(str2.equals("n"))
            {
                System.out.print("Replace cables and try again.");
                System.exit(0);
            }
            else
            {
                System.out.print("Invalid input.");
                System.exit(0);
            }
        }
        else if (str1.equals("n"))
        {
            System.out.print("Does the car make a slicking noise? ");
            String str3 = sc.nextLine();
            if(str3.equals("y"))
            {
                System.out.print("Replace the battery.");
                System.exit(0);
            }
            if(str3.equals("n")) {
                System.out.print("Does the car crank up but fail to start? ");
                String str4 = sc.nextLine();
                if (str4.equals("y")) {
                    System.out.print("Check the spark plug connections.");
                    System.exit(0);
                }
                if (str4.equals("n")) {
                    System.out.print("Does the engine start and then die? ");
                    String str5 = sc.nextLine();
                    if (str5.equals("y")) {
                        System.out.print("Does you car have fuel injection?");
                        String str6 = sc.nextLine();
                        if (str6.equals("y")) {
                            System.out.print("Get it in for service.");
                            System.exit(0);
                        } else if (str6.equals("n")) {
                            System.out.print("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        } else {
                            System.out.print("Invalid input.");
                            System.exit(0);
                        }
                    } else if (str5.equals("n")) {
                        System.out.print("This should not be possible.");
                        System.exit(0);
                    } else
                    {
                        System.out.print("Invalid input");
                        System.exit(0);
                    }
                }
                else
                {
                    System.out.print("Invalid input");
                    System.exit(0);
                }
            }
            else
            {
                System.out.print("Invalid input");
                System.exit(0);
            }
        }
        else
        {
            System.out.print("Invalid input");
            System.exit(0);
        }
    }
}
