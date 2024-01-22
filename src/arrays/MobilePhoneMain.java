package arrays;

import java.util.Scanner;

public class MobilePhoneMain {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("09087654321");
    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {

        }
    }

    private static void startPhone(){
        System.out.println("Starting Phone....");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions\npress");
        System.out.println("""
                0 - to shutdown
                1 - to print contacts
                2 - to add a new contact
                3 - to update an existing contact
                4 - to remove an existing contact
                5 - query if an existing contact exists
                6 - to print a list of available actions
                """);
    }
}
