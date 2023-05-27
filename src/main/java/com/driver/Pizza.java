package com.driver;

public class Pizza {

    public int totalPrice;
    public int cheesePrice;
    public int toppingsPrice;
    public int paperBagPrice;
    public int basePrice;
    public Boolean isVeg;
    public String bill;

    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        // your code goes here
        if(isVeg){
            basePrice =  300;
            toppingsPrice = 70;
        }
        else{
            //in non veg case
            basePrice = 400;
            toppingsPrice = 120;
        }
        paperBagPrice = 20;
        cheesePrice = 80;

        isCheeseAdded = false;
        isPaperBagAdded = false;
        isBillGenerated = false;

        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: "+basePrice+ "\n";
    }
    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            totalPrice = totalPrice + cheesePrice;
            isCheeseAdded = true;
        }

    }
    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            totalPrice = totalPrice+toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded==false){
            totalPrice = totalPrice + paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (isBillGenerated == false){

            if(isCheeseAdded==true){
                bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if(isToppingsAdded==true){
                bill = bill + "Extra Toppings Added: " + toppingsPrice + "\n";
            }
            if(isPaperBagAdded==true){
                bill = bill + "Paperbag Added: " + paperBagPrice + "\n";
            }

            bill = bill + "Total Price: " +totalPrice+ "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
