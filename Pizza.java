//TASK 1

package org.collect;

import java.util.Scanner;

public class Pizza {
	private String pizzabase; int price;
	
	
		Pizza(String base, int price)
		{
			this.pizzabase = base;
			this.price = price;
		}
		void display()
		{
			System.out.println(pizzabase + " " + price);;
		}
	}

	class ChickenPizza extends Pizza
	{
		String cvariable    = "Chicken Topping";
		ChickenPizza(String base, int price)
		{
			super(base,price);
		}
		void display()
		{
			System.out.println( ""  + price + " " + cvariable);
		}
	}

	class MuttonPizza extends ChickenPizza
	{
		String pizzabase;
		int price;
		String flavouredtopping   = "Mutton Topping";
		MuttonPizza (String pizzabase, int price)
		{
			super(pizzabase,price);
		}
		void display()
		{
			System.out.println(pizzabase + " " + price + " " + flavouredtopping );
		}
	}
	 class Pizzahut {

		
		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose option from given below");
			System.out.println("press 1 for Your Simple Pizza Order ");
			System.out.println("press 2 for Your Chicken pizza Order");
			System.out.println("press 3 for Your Mutton pizza Order");
			int option = sc.nextInt();
			
			if(option==1)
			{
				Pizza pz = new Pizza("YOUR SIMPLE PIZZA ORDER",230);
				pz.display();
			}
			else if(option==2)
			{

				Pizza pz1 = new ChickenPizza("YOUR CHIKKEN PIZZA ORDER",240);
				pz1.display();
				
			}
			else if(option==3)
			{
				ChickenPizza pz2 = new MuttonPizza("YOUR MUTTON PIZZA ORDER",250);
				pz2.display();
			}
			else
			{
				System.out.println("Wrong input");
			}
			
		 sc.close();
		}

	

	}


