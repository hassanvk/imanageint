package com.hassan.imanage;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class main {

    public static void main (String [] args){

        ArrayList<Item> shoppingCart = new ArrayList<Item>();
        Item item1 = new Item("Book",1,1.00);
        Item item2 = new Item("Pen",1,2.00);
        shoppingCart.add(item1);
        shoppingCart.add(item2);
        System.out.println(discountSum(shoppingCart));

    }

    public static String encode(String string){
        if(string.equals("Public"))
            return "P";
        else if(string.equals("Private"))
            return "X";
        else if(string.equals("View"))
            return "V";
        else if(string.equals("Inherit"))
            return "I";
        else
            return "Not valid entry";
    }

    public static String decode(String string){
        if(string.equals("P"))
            return "Public";
        else if(string.equals("X"))
            return "Private";
        else if(string.equals("V"))
            return "View";
        else if(string.equals("I"))
            return "Inherit";
        else
            return "Not valid entry";
    }

    public static String discountSum(ArrayList<Item> shoppingCart){
        double totalPrice = 0;
        DecimalFormat df = new DecimalFormat("#");
        df.setMinimumFractionDigits(2);
        for(Item item : shoppingCart){
            totalPrice = totalPrice + ((item.getPrice() - 0.02)*item.getQuantity());
        }
        return "$" + df.format(totalPrice);
    }
}
