package com.vallabha;

import java.util.Scanner;

public class GroceryShopping {

	static Scanner sc = new Scanner(System.in);

	public static void products() {
		System.out.println("Available products in the Store");
		System.out.println(" 1) Fruits");
		System.out.println(" 2) Vegetables");
		System.out.println(" 3) Cosmetics");
		System.out.println(" 4) Masala powders \n");
	}

	public static void fruits() {
		System.out.println(" ---Welcome to Fruits Section--- /n");
		System.out.println("125-----Mangoes-----1 kg is 50/- Rs");
		System.out.println("126-----Apples-----1 kg is 100/- Rs");
		System.out.println("127-----Bananas-----1 kg is 25/- Rs");
		System.out.println("128-----Papaya-----1 kg is 44/- Rs");
		System.out.println("129-----Grapes-----1 kg is 60/- Rs");
		System.out.println("130-----Oranges-----1 kg is 50/- Rs \n");
	}

	public static void vegetables() {
		System.out.println(" ---Welcome to Vegetables Section--- ");
		System.out.println("225-----Potato-----1 kg is 41/- Rs");
		System.out.println("226-----Bringel-----1 kg is 35/- Rs");
		System.out.println("227-----Carrots-----1 kg is 60/- Rs");
		System.out.println("228-----Beetroot-----1 kg is 44/- Rs");
		System.out.println("229-----Drumstick-----1 kg is 60/- Rs");
		System.out.println("230-----Mushroom-----1 kg is 50/- Rs \n");
	}

	public static void cosmetics() {
		System.out.println(" ---Welcome to Cosmetics Section--- ");
		System.out.println("325-----Toner-----1 pack is 50/- Rs");
		System.out.println("326-----Lipstick-----1 pack is 100/- Rs");
		System.out.println("327-----Nail polish-----1 pack is 25/- Rs");
		System.out.println("328-----Brightner-----1 kg pack 50/- Rs");
		System.out.println("329-----Lotion-----1 pack is 60/- Rs");
		System.out.println("330----Face cream-----1 pack is 50/- Rs \n");
	}

	public static void masalaPowders() {
		System.out.println(" ---Welcome to Masala Powders Section--- ");
		System.out.println("425-----Garlic-----1 kg is 50/- Rs");
		System.out.println("426-----Turmeric-----1 kg is 100/- Rs");
		System.out.println("427-----Clove-----1 kg is 25/- Rs");
		System.out.println("428-----Chilli-----1 kg is 44/- Rs");
		System.out.println("429-----Fennel-----1 kg is 60/- Rs");
		System.out.println("430-----Dal-----1 kg is 50/- Rs \n");
	}

	public static void main(String[] args) {
		System.out.println("=======WELCOME TO ONLINE STORE=======");
		System.out.println("-------------------------------------");
		GroceryShopping gs = new GroceryShopping();
		int totalPrice = 0;

		while (true) {
			gs.products();
			System.out.println(">>> Please Enter Your choice (1 to 4):");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("You selected Fruits that is a good choice \n");
				gs.fruits();
				break;
			case 2:
				System.out.println("You selected Vegetables that is a good choice \n");
				gs.vegetables();
				break;
			case 3:
				System.out.println("You selected Cosmetics that is a good choice \n");
				gs.cosmetics();
				break;
			case 4:
				System.out.println("You selected masala powders that is a good choice \n");
				gs.masalaPowders();
				break;
			default:
				System.out.println(">>> Enter valid number upto 1 to 4 ;");
				System.out.println("---------------------------------");
				products();
			}

			System.out.println(">>> Please Enter your Product code :");
			int code = sc.nextInt();

			int kgs;
			switch (code) {
			case 125:
				System.out.println("You selected Mangoes it is king of fruits...");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 50;
				break;
			case 126:
				System.out.println("You selected Apples good for health...\n");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 100;
				break;
			case 127:
				System.out.println("You selected Bananas good for health...\n");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 25;
				break;
			case 128:
				System.out.println("You selected Papaya...\n");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 44;
				break;
			case 129:
				System.out.println("You selected Grapes...\n");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 60;
				break;
			case 130:
				System.out.println("You selected Oranges good for vitamin_c...\n");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 50;
				break;
			case 225:
				System.out.println("You selected Potato...\n");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 41;
				break;
			case 226:
				System.out.println("You selected Bringle...");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 35;
				break;
			case 227:
				System.out.println("You selected Carrots good for eyes...\n");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 60;
				break;
			case 228:
				System.out.println("You selected Beetroot for boold...\n");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 44;
				break;
			case 229:
				System.out.println("You selected Drumstick...\n");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 60;
				break;
			case 230:
				System.out.println("You selected Mushrooom good for taste...\n");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 50;
				break;
			case 325:
				System.out.println("You selected Toner good for looking...\n");
				System.out.println(">>> How many do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 100;
				System.out.println();
				break;
			case 326:
				System.out.println("You selected Lipstick..\n");
				System.out.println(">>> How many do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 45;
				System.out.println();
				break;
			case 327:
				System.out.println("You selected Nail polish...\n");
				System.out.println(">>> How many  do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 45;
				System.out.println();
				break;
			case 328:
				System.out.println("You selected Brightner...\n");
				System.out.println(">>> How many do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 45;
				System.out.println();
				break;
			case 329:
				System.out.println("You selected Lotoin for freshness...\n");
				System.out.println(">>> How many do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 45;
				System.out.println();
				break;
			case 330:
				System.out.println("You selected Face cream to get beauti...\n");
				System.out.println(">>> How many kgs do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 45;
				break;
			case 425:
				System.out.println("You selected Garlic...\n");
				System.out.println(">>> How many do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 45;
				System.out.println();
				break;
			case 426:
				System.out.println("You selected Turmeric...\n");
				System.out.println(">>> How many do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 45;
				System.out.println();
				break;
			case 427:
				System.out.println("You selected Clove...\n");
				System.out.println(">>> How many do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 45;
				System.out.println();
				break;
			case 428:
				System.out.println("You selected Chilli for hot...\n");
				System.out.println(">>> How many do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 45;
				System.out.println();
				break;
			case 429:
				System.out.println("You selected Fennel...\n");
				System.out.println(">>> How many do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 45;
				System.out.println();
				break;
			case 430:
				System.out.println("You selected Dal...\n");
				System.out.println(">>> How many do you want ?");
				kgs = sc.nextInt();
				totalPrice += kgs * 45;
				System.out.println();
				break;
			default:
				System.out.println(">>> Enter valid number code :");
				System.out.println("---------------------------------\n");
				gs.products();
			}

			System.out.println("For More Shoping Press 1...");
			System.out.println("For Exit Press 2...");

			int enteredNum = sc.nextInt();
			if (enteredNum == 2)
				break;
		}

		System.out.println("=======WELCOME TO ONLINE STORE======= \n ");
		System.out.println(" Total Bill: " + totalPrice+" Rs.");
		double discount = 0;
		if (totalPrice >= 200) {
			discount = totalPrice * 0.10;
			System.out.println(" You've got 10% Discount :" + discount);
		} else if (totalPrice >= 500) {
			discount = totalPrice * 0.20;
			System.out.println(" You've got 20% Discount :" + discount);
		}
		double overallAmount = totalPrice - discount;
		System.out.println(" TOTAL_AMOUNT : " + overallAmount+" Rs.");
		System.out.println(" You saved amount of " + discount + " Rs. \n");
		System.out.println("\t Visit_Again");
	}
}