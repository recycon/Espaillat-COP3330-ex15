package org.example;

import java.util.Scanner;

/**
 * user and pss?
 * is pass corrct?
 * Welcome!
 *
 *if no
 * I don't know you.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in= new Scanner(System.in) ;
        String passOg="Mar1234";
        System.out.print( "What is the username? " );
        String user=in.next();
        System.out.print("What is the Password? ");
        String pass=in.next();
        if(pass.equals("Mar1234")){
            System.out.println("Welcome!");

        }
        else {
            System.out.println("I don't know you.");
        }


        }
}
