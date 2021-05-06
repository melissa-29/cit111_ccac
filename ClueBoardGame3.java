

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fundamentals_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author melissa-29
 */
public class ClueBoardGame3 {
    public static final ArrayList CLUE_ROOMS = new ArrayList(Arrays.asList("Ball_Room", "Billiard_Room", "Conservatory", "Dining_Room", "Hall", "Kitchen", "Lounge", "Library", "Study"));
    public static final ArrayList CLUE_CHARACTERS = new ArrayList(Arrays.asList("Colonel_Mustard", "Miss_Scarlet", "Professor_Plum", "Mr._Green", "Mrs._White", "Mrs._Peacock"));
    public static final ArrayList CLUE_WEAPONS = new ArrayList(Arrays.asList("Rope", "Lead_Pipe", "Knife", "Wrench", "Candlestick", "Pistol"));
    public static ArrayList clueRooms = new ArrayList(Arrays.asList("Ball_Room", "Billiard_Room", "Conservatory", "Dining_Room", "Hall", "Kitchen", "Lounge", "Library", "Study"));
    public static ArrayList clueCharacters = new ArrayList(Arrays.asList("Colonel_Mustard", "Miss_Scarlet", "Professor_Plum", "Mr._Green", "Mrs._White", "Mrs._Peacock"));
    public static ArrayList clueWeapons = new ArrayList(Arrays.asList("Rope", "Lead_Pipe", "Knife", "Wrench", "Candlestick", "Pistol"));
    public static String finalRoom = "";
    public static String finalCharacter = "";
    public static String finalWeapon = "";
    public static ArrayList envelopeCards = new ArrayList();
    public static ArrayList returnedPlayer1Cards = new ArrayList();
    public static ArrayList returnedPlayer2Cards = new ArrayList();
    public static ArrayList returnedPlayer3Cards = new ArrayList();
    public static ArrayList returnedPlayer4Cards = new ArrayList();
    public static ArrayList returnedPlayer5Cards = new ArrayList();
    public static ArrayList returnedPlayer6Cards = new ArrayList();
    public static ArrayList remainingCards = new ArrayList();
    public static int diceRollCount = 0;
    
   public static void main(String[] args) throws InterruptedException{
        
        System.out.println("Welcome to Clue! Everyone's favorite Board Game!");
        System.out.println("There's been a murder committed, and it's your job to figure out the 'where', the 'who', and the 'how'...");
        Thread.sleep(5000);
        System.out.println();
        System.out.println("For your reference, here are all of the available cards, and remember, they're CASE SENSITIVE!:");
        System.out.println("Rooms: " + CLUE_ROOMS);
        System.out.println("Characters: " + CLUE_CHARACTERS);
        System.out.println("Weapons: " + CLUE_WEAPONS);
        
        // picking 3 cards to go in envelope in middle of the board -- this is who/how/where committed the crime!
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
              
        // picking the room the murder was committed
        Thread.sleep(5000);
        System.out.println();
        System.out.println("We will begin by selecting the final cards for the envelope...");
        Thread.sleep(5000);
        System.out.println("We have selected a room card, a character card, and a weapon card at random. This is the 'where', 'who', and 'how' of the murder for you to figure out...");
        int randomRoom = random.nextInt(clueRooms.size());
        finalRoom = (clueRooms.get(randomRoom)).toString();
        clueRooms.remove(randomRoom);
        //System.out.println("Remaining rooms: " + clueRooms);
        
        // picking the suspect (character) who committed the murder
        int randomCharacter = random.nextInt(clueCharacters.size());
        finalCharacter = (clueCharacters.get(randomCharacter).toString());
        clueCharacters.remove(randomCharacter);
        //System.out.println("Remaining characters: " + clueCharacters);
        
        // picking the weapon that was used to commit the murder
        int randomWeapon = random.nextInt(clueWeapons.size());
        finalWeapon = (clueWeapons.get(randomWeapon).toString());
        clueWeapons.remove(randomWeapon);
        //System.out.println("Remaining weapons: " + clueWeapons);
      
        envelopeCards.add(finalRoom);
        envelopeCards.add(finalCharacter);
        envelopeCards.add(finalWeapon);
        System.out.println(envelopeCards);
                
        // gathering remaining cards
        System.out.println();
        remainingCards.addAll(clueRooms);
        remainingCards.addAll(clueCharacters);
        remainingCards.addAll(clueWeapons);
        //System.out.println("Remaining cards: " + remainingCards);
        
        // shuffling deck of remaining cards
        Collections.shuffle(remainingCards);
        Thread.sleep(5000);
        System.out.println("Now we will shuffle the remaining cards for dealing...");
        Thread.sleep(3000);
        System.out.println("Shuffling...");
        Thread.sleep(3000);
        //System.out.println("Shuffled remaining cards: " + remainingCards);
        

        //deal cards prompt
        System.out.println();
        System.out.println("It's time to deal out the cards to the 6 players");
        System.out.println("When you're ready, type 'deal'");
        String startCardDeal = scan.next();
        
        do{    
            if(startCardDeal.equals("deal")){
                Thread.sleep(3000); 

                // dealing player 1's cards

                returnedPlayer1Cards = cardDeal(remainingCards);
                System.out.println("Your (Player 1) card hand is: " + returnedPlayer1Cards);
                //System.out.println(remainingCards + " are left to be dealt...");
                Thread.sleep(1000);

                //dealing player 2's cards
                returnedPlayer2Cards = cardDeal(remainingCards);
                System.out.println("Player 2's (computer) card hand is: " + returnedPlayer2Cards);
                System.out.println(remainingCards + " are left to be dealt...");
                Thread.sleep(1000);

                //dealing player 3's cards
                returnedPlayer3Cards = cardDeal(remainingCards);
                System.out.println("Player 3's (computer) card hand is: " + returnedPlayer3Cards);
                System.out.println(remainingCards + " are left to be dealt...");      
                Thread.sleep(1000);

                // dealing player 4's cards
                returnedPlayer4Cards = cardDeal(remainingCards);
                System.out.println("Player 4's (computer) card hand is: " + returnedPlayer4Cards);
                System.out.println(remainingCards + " are left to be dealt...");
                Thread.sleep(1000);

                //dealing player 5's cards
                returnedPlayer5Cards = cardDeal(remainingCards);
                System.out.println("Player 5's (computer) card hand is: " + returnedPlayer5Cards);
                System.out.println(remainingCards + " are left to be dealt...");
                Thread.sleep(1000);

                // dealing player 6's cards
                returnedPlayer6Cards = cardDeal(remainingCards);
                System.out.println("Player 6's (computer) card hand is: " + returnedPlayer5Cards);
                System.out.println(remainingCards + " are left to be dealt...");


            }else{
                System.out.println("Ok, we'll wait for when you're ready.");
            }
        }while(!startCardDeal.equals("deal"));
        
        
        Thread.sleep(1000);
              
        rollDice();
        System.out.println();
        System.out.println("Oh no, looks like you're out of rolls! When you're ready to guess, type 'guess' below:");
        String outOfRollsResponse = scan.next();
        if(outOfRollsResponse.equals("guess")){
            
            // lock in final guess
            ArrayList returnedFinalGuessArray = readyForGuess();
            
            // final results
            System.out.println("Tabulating results...");
            boolean returnedFinalResults = calculatedFinalResults(returnedFinalGuessArray);
            System.out.println();
            if(returnedFinalResults == true){
                System.out.println("Congratulations! The cards in the envelope were: " + Arrays.asList(envelopeCards));
            }else{
                System.out.println("Oh no, the killer got away! The cards in the envelope were not " + returnedFinalGuessArray + " but were instead: " + Arrays.asList(envelopeCards));
            }
            System.out.println();
        }else{
            notReadyForGuess();
        }
                   
        System.out.println("Thanks for playing Clue!");
        
        
   }// close main
    
   public static ArrayList cardDeal(ArrayList s){
       System.out.println();
       System.out.println("Dealing cards...");
       Random random = new Random();
       int dealtCard =  random.nextInt(s.size());

       ArrayList dealtCards = new ArrayList();
       
       String dealtCard1 = s.get(dealtCard).toString();
       dealtCards.add(dealtCard1);
       s.remove(dealtCard1);
       
       String dealtCard2 = s.get(dealtCard).toString();
       dealtCards.add(dealtCard2);
       s.remove(dealtCard2);
       
       String dealtCard3 = s.get(dealtCard).toString();
       dealtCards.add(dealtCard3);
       s.remove(dealtCard3);
       remainingCards = s;
       
       return dealtCards;
       
   } // close card deal
   
       // continuously rolling dice until either you hit 10 rolls or you make guess

 public static void rollDice() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println();
        System.out.println("Time to roll the dice! You'll have 5 chances to roll the dice. If a roll gets you into a room,");
        System.out.println("you can see if any players have a particular card, but if you don't get into a room, you'll just have to roll again!");
        Random random = new Random();
        String keepRolling;
  
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println();
            Thread.sleep(1000);
            System.out.println("Type the word 'roll' when you're ready below:");
            keepRolling = scan.next();
            int diceNumber;
            // rolled dice
            if(keepRolling.equals("roll")){
                diceRollCount = diceRollCount + 1;
                System.out.println();
                System.out.println("Roll Number: " + diceRollCount);
                Thread.sleep(1000);
                System.out.println();
                System.out.println("Rolling dice...");
                Thread.sleep(1000);
                boolean diceRoll = random.nextBoolean();
                diceNumber = random.nextInt(12);
                    if(diceNumber == 0){
                        diceNumber = 12;
                    }
                System.out.println();
                System.out.println("You rolled a(n) " + diceNumber);
                System.out.println();

                // entering room
                if(diceRoll == true){
                System.out.println("You rolled a(n) " + diceNumber + " and now you're in a room! You get to make an educated guess...");
                System.out.println("Guess a room, character, and weapon, and if a player has that card, he or she will let you know.");
                System.out.println("Then, you can mark it down or make a mental note, since that card is not in the envelope!");

                String roomGuess;
                do{
                    System.out.println();
                    System.out.println("What room would you like to ask about?");
                    roomGuess = scan.next();

                    if(CLUE_ROOMS.contains(roomGuess) && (returnedPlayer2Cards.contains(roomGuess) || returnedPlayer3Cards.contains(roomGuess) || returnedPlayer4Cards.contains(roomGuess)|| returnedPlayer5Cards.contains(roomGuess) || returnedPlayer6Cards.contains(roomGuess))){
                        System.out.println("Yes, one of the other players has the card: " + roomGuess);
                        break;
                    }else if(CLUE_ROOMS.contains(roomGuess) && !returnedPlayer2Cards.contains(roomGuess) && !returnedPlayer3Cards.contains(roomGuess) && !returnedPlayer4Cards.contains(roomGuess) && !returnedPlayer5Cards.contains(roomGuess) && !returnedPlayer6Cards.contains(roomGuess)){
                        System.out.println("None of the other players have the card: " + roomGuess);
                        break;
                    }else{
                       System.out.println("That is not a clue room, try again");
                    }
                }while(!CLUE_ROOMS.contains(roomGuess));// close roomGuess

                String characterGuess;
                do{
                    System.out.println();
                    System.out.println("What character (suspect) would you like to ask about?");
                    characterGuess = scan.next();

                    if(CLUE_CHARACTERS.contains(characterGuess) && (returnedPlayer2Cards.contains(characterGuess) || returnedPlayer3Cards.contains(characterGuess) || returnedPlayer4Cards.contains(characterGuess)|| returnedPlayer5Cards.contains(characterGuess) || returnedPlayer6Cards.contains(characterGuess))){
                        System.out.println("Yes, one of the other players has the card: " + characterGuess);
                        break;
                    }else if(CLUE_CHARACTERS.contains(characterGuess) && !returnedPlayer2Cards.contains(characterGuess) && !returnedPlayer3Cards.contains(characterGuess) && !returnedPlayer4Cards.contains(characterGuess) && !returnedPlayer5Cards.contains(characterGuess) && !returnedPlayer6Cards.contains(characterGuess)){
                        System.out.println("None of the other players have the card: " + characterGuess);
                        break;
                    }else{
                        System.out.println("That is not a clue character, try again");
                    }
                }while(!CLUE_CHARACTERS.contains(characterGuess));// close suspectGuess

                String weaponGuess;
                do{   
                    System.out.println();
                    System.out.println("What weapon would you like to ask about?");
                    weaponGuess = scan.next();

                    if(CLUE_WEAPONS.contains(weaponGuess) && (returnedPlayer2Cards.contains(weaponGuess) || returnedPlayer3Cards.contains(weaponGuess) || returnedPlayer4Cards.contains(weaponGuess)|| returnedPlayer5Cards.contains(weaponGuess) || returnedPlayer6Cards.contains(weaponGuess))){
                        System.out.println("Yes, one of the other players has the card: " + weaponGuess);
                        break;
                    }else if(CLUE_WEAPONS.contains(weaponGuess) && !returnedPlayer2Cards.contains(weaponGuess) && !returnedPlayer3Cards.contains(weaponGuess) && !returnedPlayer4Cards.contains(weaponGuess) && !returnedPlayer5Cards.contains(weaponGuess) && !returnedPlayer6Cards.contains(weaponGuess)){
                        System.out.println("None of the other players have the card: " + weaponGuess);      
                        break;
                    }else{
                        System.out.println("That is not a clue weapon, try again");
                    }
                }while(!CLUE_WEAPONS.contains(weaponGuess));// close weaponGuess

                }else{
                    System.out.println("Well, you rolled a(n) " + diceNumber + " and you're not able to enter a room... Guess you'll have to wait until your next roll!");
                }
            }else{
                System.out.println("Ok, we'll wait until you're ready.");
            }

        }while(diceRollCount < 5);// close do -- start roll
        
    }// close roll dice
 
    public static void notReadyForGuess() throws InterruptedException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Ok, when you're ready to guess, type 'guess' below:");
        String outOfRollsResponse = scan.next();
        while(!outOfRollsResponse.equals("guess")){
            notReadyForGuess();
        }
        
        readyForGuess();
    }
            
    public static ArrayList readyForGuess() throws InterruptedException{
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Take a guess as to what cards are in that envelope");
        System.out.println();
        Thread.sleep(2000);
        System.out.println("Where did the crime take place? (In what room)");
        String roomFinalGuess = scan.next();
        System.out.println();
        System.out.println("Who do you suspect perpetrated the crime? (What character)");
        String characterFinalGuess = scan.next();
        System.out.println();
        System.out.println("What weapon do you think was used to commit the crime?");
        String weaponFinalGuess = scan.next();
        System.out.println();
        
        ArrayList finalGuessArray = new ArrayList(Arrays.asList(roomFinalGuess, characterFinalGuess, weaponFinalGuess));
        System.out.println("You guessed: " + finalGuessArray);
        Thread.sleep(1000);
                   
        return finalGuessArray;  
        
    } // close readyForGuess
        
    public static boolean calculatedFinalResults(ArrayList results){
        if(results.equals(Arrays.asList(envelopeCards))){
            boolean finalResults = true;
            return finalResults;
        }else{
            boolean finalResults = false;
            return finalResults;
        }

    } 
    
   
   
   
   
}// close class
