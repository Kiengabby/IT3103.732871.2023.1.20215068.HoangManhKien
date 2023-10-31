/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package aims;

/**
 *
 * @author kieng
 */

import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Cart anOrderCart = new Cart();

        //Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrderCart.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geoge Lucas", 87, 24.95f);
		anOrderCart.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 23.65f);
		anOrderCart.addDigitalVideoDisc(dvd3);
	
		//In ra total cost
		System.out.print("Total cost is: ");
		System.out.println(anOrderCart.totalCost());
		//In ra quantity
		System.out.print("Dvd quantity in cart: ");
		System.out.println(anOrderCart.qtyOrdered);
	}
}
