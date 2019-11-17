package restauramtApp;
import java.util.Scanner;

public class ResaturantApp {

	public static void main(String[] args) {
		
		final String CURRENCY = "MDL";
		final float ORDER_DELIVERY = 200f;
		final float DELIVERY_PRICE = 50f;
        
        final String FOOD_1_NAME = "\"Pizza\"";
        int food_1_available_quantity = 5; 
        final float FOOD_1_PRICE = 75.5f;
        
        final String FOOD_2_NAME = "\"Mamaliga\"";
        int food_2_available_quantity = 5;
        final float FOOD_2_PRICE = 150f;
        
        final String FOOD_3_NAME = "\"Salad\"";
        int food_3_available_quantity = 5;
        final float FOOD_3_PRICE = 30f;
        
        

        // PRESENTATION & LOGIC LAYER
        System.out.printf("\n********* MENU **********\n" +
                        "1. %-10s %7.2f %s\n" +
                        "2. %-10s %7.2f %s\n" +
                        "3. %-10s %7.2f %s\n" +
                        "*************************\n",
                FOOD_1_NAME, FOOD_1_PRICE, CURRENCY,
                FOOD_2_NAME, FOOD_2_PRICE, CURRENCY,
                FOOD_3_NAME, FOOD_3_PRICE, CURRENCY);
        
        System.out.println("CHOOSE AN OPTION >>>");

        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        if (option == 1) {
            System.out.println("Your choise is: " + FOOD_1_NAME);
            System.out.println("\nHow many do you want ? ");
            
            int quantityFood = in.nextInt();
            
            float sum = quantityFood*FOOD_1_PRICE;
            
            if(quantityFood <= food_1_available_quantity){
            		System.out.printf("%d x %s (%.2f%s) = %.2f %s \nConfirm order ( 1 - yes, 0 - no )?\n", 
            				quantityFood, FOOD_1_NAME, FOOD_1_PRICE, CURRENCY, sum, CURRENCY);
            		
            		int orderConfirm = in.nextInt();
            		
            System.out.printf("Free delivery if your order is more than %.2f%s " +
            		"\nelse price for delivery is %.2f%s \nConfirm delivery (1 - yes, 0 - no )?\n",
            		ORDER_DELIVERY, CURRENCY, DELIVERY_PRICE, CURRENCY );
            
            		int deliveryConfirm = in.nextInt();
            		
            		if(deliveryConfirm == 1 & sum < ORDER_DELIVERY){
            			float totalSum = sum + DELIVERY_PRICE;
            			System.out.printf("Your order's cost = %.2f%s + %.2f%s delivery\nTotal = %.2f%s\n", sum, CURRENCY, DELIVERY_PRICE,
            					CURRENCY, totalSum, CURRENCY );
            		}else {
            			System.out.printf("Total %.2f%s\n", sum, CURRENCY);
            		}
            
            		if(orderConfirm == 1) {
            			System.out.println("THANK YOU!");
            		}
            }else {
            	System.out.printf("You've ordered too many %s, we only have %d \nPLEASE TRY AGAIN!",
            			FOOD_1_NAME, food_1_available_quantity);
            }
            
        } 
        if (option == 2) {
            System.out.println("Your choise is: " + FOOD_2_NAME);
            System.out.println("\nHow many do you want ? ");
            
            int quantityFood = in.nextInt();
            
            float sum = quantityFood*FOOD_2_PRICE;
            
            if(quantityFood <= food_2_available_quantity){
            		System.out.printf("%d x %s (%.2f%s) = %.2f %s \nConfirm order ( 1 - yes, 0 - no )?\n", 
            				quantityFood, FOOD_2_NAME, FOOD_2_PRICE, CURRENCY, sum, CURRENCY);
            		
            		int orderConfirm = in.nextInt();
            		
            System.out.printf("Free delivery if your order is more than %.2f%s " +
            		"\nelse price for delivery is %.2f%s \nConfirm delivery (1 - yes, 0 - no )?\n",
            		ORDER_DELIVERY, CURRENCY, DELIVERY_PRICE, CURRENCY );
            
            		int deliveryConfirm = in.nextInt();
            		
            		if(deliveryConfirm == 1 & sum < ORDER_DELIVERY){
            			float totalSum = sum + DELIVERY_PRICE;
            			System.out.printf("Your order's cost = %.2f%s + %.2f%s delivery\nTotal = %.2f%s\n", sum, CURRENCY, DELIVERY_PRICE,
            					CURRENCY, totalSum, CURRENCY );
            		}else {
            			System.out.printf("Total %.2f%s\n", sum, CURRENCY);
            		}
            
            		if(orderConfirm == 1) {
            			System.out.println("THANK YOU!");
            		}
            }else {
            	System.out.printf("You've ordered too many %s, we only have %d \nPLEASE TRY AGAIN!",
            			FOOD_2_NAME, food_2_available_quantity);
            }
            
        } 
        if (option == 3) {
            System.out.println("Your choise is: " + FOOD_3_NAME);
            System.out.println("\nHow many do you want ? ");
            
            int quantityFood = in.nextInt();
            
            float sum = quantityFood*FOOD_3_PRICE;
            
            if(quantityFood <= food_3_available_quantity){
            		System.out.printf("%d x %s (%.2f%s) = %.2f %s \nConfirm order ( 1 - yes, 0 - no )?\n", 
            				quantityFood, FOOD_3_NAME, FOOD_3_PRICE, CURRENCY, sum, CURRENCY);
            		
            		int orderConfirm = in.nextInt();
            		
            System.out.printf("Free delivery if your order is more than %.2f%s " +
            		"\nelse price for delivery is %.2f%s \nConfirm delivery (1 - yes, 0 - no )?\n",
            		ORDER_DELIVERY, CURRENCY, DELIVERY_PRICE, CURRENCY );
            
            		int deliveryConfirm = in.nextInt();
            		
            		if(deliveryConfirm == 1 & sum < ORDER_DELIVERY){
            			float totalSum = sum + DELIVERY_PRICE;
            			System.out.printf("Your order's cost = %.2f%s + %.2f%s delivery\nTotal = %.2f%s\n", sum, CURRENCY, DELIVERY_PRICE,
            					CURRENCY, totalSum, CURRENCY );
            		}else {
            			System.out.printf("Total %.2f%s\n", sum, CURRENCY);
            		}
            
            		if(orderConfirm == 1) {
            			System.out.println("THANK YOU!");
            		}
            }else {
            	System.out.printf("You've ordered too many %s, we only have %d \nPLEASE TRY AGAIN!",
            			FOOD_3_NAME, food_3_available_quantity);
            }
            
        } 
         
        
        
        
       
        
	}

	}


