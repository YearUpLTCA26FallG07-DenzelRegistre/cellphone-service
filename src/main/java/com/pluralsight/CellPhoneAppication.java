package com.pluralsight;

import java.util.Scanner;
import com.pluralsight.CellPhone;

import static jdk.internal.org.jline.keymap.KeyMap.display;






public class CellPhoneAppication {



    public static void main(String[] args) {

        CellPhone userCellPhone = new CellPhone();

        userCellPhone.setModel(Console.promptForString("Model: "));
        userCellPhone.setCarrier(Console.promptForString(("Carrier: ")));
        userCellPhone.setPhoneNumber(Console.promptForString("Phone Number: "));
        userCellPhone.setOwner(Console.promptForString("Owner: "));
        userCellPhone.setSerialNumber(Console.promptForInt("Serial Number: "));

        CellPhone denzelCellPhone = new CellPhone();
        denzelCellPhone.setSerialNumber(2455);
        denzelCellPhone.setModel("Iphone 12 pro; ");
        denzelCellPhone.setPhoneNumber("555-555-5555");
        denzelCellPhone.setOwner("Denzel");

        display(userCellPhone);
        userCellPhone.dial(denzelCellPhone.getPhoneNumber());








        System.out.println();
        System.out.println(userCellPhone.getSerialNumber());
        System.out.println(userCellPhone.getModel());
        System.out.println(userCellPhone.getCarrier());
        System.out.println(userCellPhone.getPhoneNumber());
        System.out.println(userCellPhone.getOwner());


    }





}
