/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author mweis
 */
public class BananaOatMuffins {
    public int bananas;
    public boolean allIngredients;
    public int eggs;
    public double yogurt;
    public boolean sugar;
    public double sugarOrHoney;
    public double bakingSoda;
    public double bakingPowder;
    public double oats;
    public boolean isOvenOn = false;
    public boolean isOvenPreheating = false;
    public int setOvenTemp;
    public int ovenTemp;
    public boolean isOvenHeated = true;
    public boolean bakeTime;
    public boolean bakeTimeElapsed;
    public boolean blenderClosed;
    public boolean ingredientsInBlender = false;
    public boolean blenderOn = false;
    public boolean mixInTins = false;
    public boolean ingredientsMixed = true;
    public boolean muffinsInOven = false;
    public int timer;
    
    
    public BananaOatMuffins(){
        System.out.println("Time to simulate making some Banana Oat Muffins!");
        
    }// close BananaOatMuffins
    
    public void turnOvenOn(){
        if(!isOvenOn){
            isOvenOn = true;
            System.out.println("You've now turned the oven on.");
            
        }else{
            System.out.println("The oven is already on!");
        }
    }// close turnOvenOn
    
    public void turnOvenOff(){
        if(isOvenOn){
            isOvenOn = false;
        }
    }// close turnOvenOff
    
    public void preheatOven(){
        if(!isOvenPreheating){
            isOvenPreheating = true;
        }else{
            System.out.println("The oven is already preheating!");
        }
    }

    
    public int setPreheatOvenTemp(){
        if(setOvenTemp!= 420){
            setOvenTemp = 420;
            System.out.println("Oven temperature set to 420 degrees.");
        }else{
            System.out.println("You've already set the oven temperature to 420 degrees!");
        }
        return setOvenTemp;
    }
        
    public void turnOvenPreheatOff(){
        if(isOvenPreheating && isOvenOn){
            isOvenPreheating = false;
            System.out.println("Ok, maybe you don't want to bake right now.");
        }else{
            System.out.println("Cannot turn preheat off, oven is already not preheating.");
        }
    }
    
    public void isOvenHeated(){
        if(ovenTemp == 420){
            System.out.println("Oven is heated to 420 degrees and ready to bake!");
            isOvenHeated = true;
        }else{
            System.out.println("Oven is not quite ready to bake.");
        }
    }
    
    public boolean checkIsOvenOn(){
        return isOvenOn;
    }
    
    public boolean checkOvenTemp(){
        return isOvenHeated;
                
    }// close checkOvenTemp
    
    
    public void displayIngredients(){
        System.out.println("You have the following ingredients to make your muffins:");
        System.out.println(this.eggs + " eggs");
        System.out.println(this.bananas + " bananas");
        System.out.println(this.oats + " cups of oats");
        System.out.println("Will you be using sugar? " + this.sugar);
        System.out.println(this.sugarOrHoney + " cups of sugar/honey");
        System.out.println(this.yogurt + " cups of yogurt");
        System.out.println(this.bakingPowder + " teaspoons of baking powder");
        System.out.println(this.bakingSoda + " teaspoons of bakingSoda");
        System.out.println("****************");
    }
    
    public boolean checkIngredients(){
        if(this.bananas == 2 &&
                this.bakingPowder == 1.5 &&
                this.bakingSoda == .5 &&
                this.eggs == 2 &&
                this.oats == 2.5 &&
                this.sugarOrHoney == .33){
            System.out.println("You have all of the ingredients for the muffins recipe!");
            allIngredients = true;
        }else{
            System.out.println("You don't have the correct ingredients to make this recipe. We'll use them anyway, but I hope the muffins taste ok!");
            allIngredients = false;
        }
        return allIngredients;
    }
    
    public boolean ingredientsInBlender(){
        if(!ingredientsInBlender){
            ingredientsInBlender = true;
            System.out.println("All of your ingredients have been poured into the blender.");
        }else{
            System.out.println("Your ingredients are already in the blender!");
        }
        return ingredientsInBlender;
        
    }// close ingredients in blender
    
    public void closeBlender(){
        if(!blenderClosed){
            blenderClosed = true;
            System.out.println("Blender is now closed. That could have been messy!");
        }else{
            System.out.println("Your blender is already closed!");
        }
    }// close closeBlender
    
    public void openBlender(){
        if(blenderClosed){
            System.out.println("Blender is now open.");
        }else{
            System.out.println("Blender is already open!");
        }
    }// close openBlender
    
    public void startBlender(){
        if(!blenderOn){
            blenderOn = true;
            System.out.println("Blender is now turned on.");
        }else{
            System.out.println("Blender is already on!");
        }
    }// close startBlender
    
    public void ingredientsMixed(){
        if(ingredientsMixed){
            System.out.println("Ingredients are now mixed!");
        }else{
            System.out.println("Ingredients could use some more mixing.");
        }
    }
    
    public void stopBlender(){
        if(blenderOn){
            blenderOn = false;
            System.out.println("Blender is now turned off.");
        }else{
            System.out.println("Blender is already off!");
        }
    }// close stopBlender
    
    public boolean checkIngredientsMixed(){
        return ingredientsMixed;
    }
    
    public boolean checkBlender(){
        return blenderOn;
    }
    
    public void pourMixInTins() throws InterruptedException{
        if(!mixInTins){
            mixInTins = true;
            System.out.println("Pouring ingredients mix into tins...");
            Thread.sleep(2000);
            System.out.println("The mixed ingredients have been poured into the cupcake tins and are ready for baking!");
        }else{
            System.out.println("The mixed ingredients are already in the cupcake tins!");
        }
    }// close pourMixInTins
    
    public boolean checkMixInTins(){
        return mixInTins;
    }
    
    public void bakeMuffins(){
        if(!muffinsInOven){
            System.out.println("The muffins are now in the oven and baking!");
            muffinsInOven = true;
        }else{
            System.out.println("The muffins are already in the oven!");
        }
    }
    
    public void takeMuffinsOutOfOven(){
        if(bakeTimeElapsed){
            muffinsInOven = false;
            System.out.println("The timer is up! The muffins are now coming out of the oven. Enjoy your treats!");
        }else{
            System.out.println("The muffins have some more time to go...");
        }
    }//
    
    public void setBakeTime(){
        if(timer != 20){
            timer = 20;
            bakeTime = true;
            System.out.println("Timer set for " + timer + " minutes.");
        }else{
            System.out.println("The timer is already set for " + timer + " minutes!");
        }
    }
    
    public boolean checkMuffinsInOven(){
        return muffinsInOven;
    }
    
    public boolean checkTimerOn(){
        return bakeTime;
    }
    
    public boolean checkTimerFinished(){
        return bakeTimeElapsed;
    }
    
}// close class
