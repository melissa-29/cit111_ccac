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
public class MuffinsLand {
    public static void main(String[] args) throws InterruptedException{
        BananaOatMuffins firstBatch = new BananaOatMuffins();
        firstBatch.eggs = 2;
        firstBatch.bakingPowder = 1.5;
        firstBatch.bakingSoda = .5;
        firstBatch.bananas = 2;
        firstBatch.oats = 2.5;
        firstBatch.sugar = false;
        firstBatch.sugarOrHoney = .33;
        firstBatch.ovenTemp = 420;
        firstBatch.bakeTimeElapsed = true;
        
        
        
        Thread.sleep(2000);
        firstBatch.turnOvenOn();
        Thread.sleep(2000);
        firstBatch.preheatOven();
        Thread.sleep(2000);
        firstBatch.setPreheatOvenTemp();
        Thread.sleep(3000);
        firstBatch.isOvenHeated();
        Thread.sleep(3000);
        firstBatch.displayIngredients();
        Thread.sleep(3000);
        System.out.println("Checking to see if we have all ingredients...");
        Thread.sleep(3000);
        firstBatch.checkIngredients();
        Thread.sleep(3000);
        firstBatch.ingredientsInBlender();
        Thread.sleep(3000);
        firstBatch.closeBlender();
        Thread.sleep(3000);
        firstBatch.startBlender();
        Thread.sleep(3000);
        System.out.println("Mixing... Mixing... Mixing...");
        Thread.sleep(3000);
        firstBatch.stopBlender();
        Thread.sleep(3000);
        firstBatch.ingredientsMixed();
        Thread.sleep(3000);
        firstBatch.pourMixInTins();
        Thread.sleep(3000);
        firstBatch.bakeMuffins();
        Thread.sleep(3000);
        firstBatch.setBakeTime();
        Thread.sleep(3000);
        System.out.println("Baking... Baking... Baking...");
        Thread.sleep(3000);
        firstBatch.takeMuffinsOutOfOven();
        
        
                
    }
}
