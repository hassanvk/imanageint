package com.hassan.imanage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void encodePublic() {
        assertEquals(main.encode("Public"),"P");
    }
    @Test
    void encodePrivate() {
        assertEquals(main.encode("Private"),"X");
    }
    @Test
    void encodeView() {
        assertEquals(main.encode("View"),"V");
    }
    @Test
    void encodeInherit() {
        assertEquals(main.encode("Inherit"),"I");
    }

    @Test
    void decodePublic() {
        assertEquals(main.decode("P"),"Public");
    }
    @Test
    void decodePrivate() {
        assertEquals(main.decode("X"),"Private");
    }
    @Test
    void decodeView() {
        assertEquals(main.decode("V"),"View");
    }
    @Test
    void decodeInherit() {
        assertEquals(main.decode("I"),"Inherit");
    }

    @Test
    void shoppingCartBookPen() {
        ArrayList<Item> shoppingCart = new ArrayList<Item>();
        Item item1 = new Item("Book",1,1.00);
        Item item2 = new Item("Pen",1,2.00);
        shoppingCart.add(item1);
        shoppingCart.add(item2);
        assertEquals(main.discountSum(shoppingCart),"$2.96");
    }

    @Test
    void shoppingCartManyBookManyPen() {
        ArrayList<Item> shoppingCart = new ArrayList<Item>();
        Item item1 = new Item("Book",11,1.00);
        Item item2 = new Item("Pen",50,2.00);
        shoppingCart.add(item1);
        shoppingCart.add(item2);
        assertEquals(main.discountSum(shoppingCart),"$109.78");
    }
}