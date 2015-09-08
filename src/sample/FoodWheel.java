package sample;

import com.sun.corba.se.impl.io.TypeMismatchException;

import java.math.BigInteger;
import java.util.AbstractCollection;
import java.util.Scanner;

/**
 * Created by VincentYang on 9/7/15.
 * This is a singleton design pattern
 */
public class FoodWheel {
   //FIELDS
    private static FoodWheel instance;
    private SplayTree data;

   //CONSTRUCTOR
    private FoodWheel()
    {

    }
    //METHODS
    public static FoodWheel getInstance()
    {
        if (instance == null)
        {
            instance = new FoodWheel();
        }
        return instance;
    }
    public String toString()
    {
        return "FoodWheel Application!";
    }
    public void showMenu ()
    {
        Scanner kboard = new Scanner(System.in);
        int input = -1;
        do {
            printMenu();
            try
            {
                input = new BigInteger(kboard.next()).intValue();
            }
            catch (NumberFormatException ex)
            {
                System.out.println("That is not a valid option, please try again.");
                continue;
            }
            processOption(input);
        } while (input != 0);
        System.out.println("Have a great day!");
    }
    private void processOption(int input)
    {
        switch (input)
        {
            case 1:
                System.out.println("View List");
                break;
            case 2:
                System.out.println("Add Item");
                break;
            case 3:
                System.out.println("case three");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
    private void printMenu()
    {
        System.out.println("~~Menu~~");
        System.out.println("0) Exit");
        System.out.println("1) View List");
        System.out.println("2) Add Item");
    }

}
