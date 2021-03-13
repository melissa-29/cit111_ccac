/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk1_mod3and4;

/**
 *
 * @author melissa-29
 */
public class RoadTrip {
    public static void main(String[] args){
        
        final double NEDS_MILES_PER_GALLON = 32.0;
        final double AVERAGE_GAS_PRICE = 2.65;
        
        //declaring and initializing variables
        String carMake = "1996 Mazda Protege";
        String carName = "Nedfry";
        int maxPassengers = 5; // primitive type variable
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double cashOnHand = 300.0;
        double tripOdometer = 0.0;
        double tripBudget = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;
        
        double legDistance; // declaring this variable but not initializing
        
        // simulation of the roadtrip
        System.out.println("Road trip simulator");
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println("Starting trip with " + currentNumberOfPassengers + " Passenger");
        System.out.println("Destination Reached? " + destinationReached);
        
        System.out.println();
        System.out.println("Beginning leg 1:");
        // Calculate the leg distance: 25% of total trip, store in legDistance
        double decimalOfOneQuarter = .25;
        legDistance = distanceToMoabUtah * decimalOfOneQuarter;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        // increment trip odometer by leg distance, overwrite odometer
        tripOdometer = tripOdometer + legDistance;
        
        // subtract leg distance from distanceTo destination, overwrite distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // "see" hitchhiker heading West
        System.out.println("Oh, look! A person who wants to go West, too!");
        
        // Check if there is room in the car, if so, pick up hitchhiker
        if(carFull == false){
            System.out.println("Car is not full, picking up hitchhiker");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;
            // alternative shorter version: currentNumberOfPassengers++
        } // closes if()
        
        // calculate price of gas for first leg and store in temp varaible
        // gas price = (distance / milesPerGallon) * price per gallon
        double gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        // deduct $ spent on gas from money remaining and overwrite cashOnHand
        cashOnHand = cashOnHand - gasPriceForLeg;

        System.out.println();
        System.out.println("****Variable stats at end of leg 1****");
        System.out.println("Distance to Destination: " + distanceToMoabUtah);
        System.out.println("Full car? " + carFull);
        System.out.println("Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in the car");
        System.out.println("Destination reached? " + destinationReached);

        
        //beginning of leg 2
        System.out.println();
        System.out.println("Beginning leg 2:");
        legDistance = 500.00;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        System.out.println("Look, two more people heading the same way we are!");
        if(carFull == false){
            System.out.println("Car is not full, picking up two hitchhikers");
            currentNumberOfPassengers = currentNumberOfPassengers + 2;
        }
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        tripOdometer = tripOdometer + legDistance;
        cashOnHand = cashOnHand - gasPriceForLeg;
        
        System.out.println();
        System.out.println("****Variable stats at end of leg 2****");
        System.out.println("Distance to Destination: " + distanceToMoabUtah);
        System.out.println("Full car? " + carFull);
        System.out.println("Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in the car");
        System.out.println("Destination reached? " + destinationReached);
        
        //beginning of leg 3
        System.out.println();
        System.out.println("Beginning leg 3:");
        legDistance = distanceToMoabUtah;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        System.out.println("There's another hitchhiking couple, let's stop to see if we can pick them up.");
        if(carFull == false){
            System.out.println("We can only fit one more person, not both of you. Are you ok splitting up?");
        }
        boolean coupleSplitsUp = false;
        if(coupleSplitsUp == false){
            System.out.println("Couple's answer: No, thank you anyways.");
            System.out.println("Ok, let's keep going!");
        }
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        tripOdometer = tripOdometer + legDistance;
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        cashOnHand = cashOnHand - gasPriceForLeg;
        
        System.out.println();
        System.out.println("****Variable Stats at end of leg 3****");
        destinationReached = true;
        System.out.println("Distance to Destination: " + distanceToMoabUtah);
        System.out.println("Full car? " + carFull);
        System.out.println("Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " left");
        System.out.println(currentNumberOfPassengers + " passengers in the car");
        System.out.println("Destination reached? " + destinationReached);      
    
    }
}
