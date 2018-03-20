/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysterydoorsproject;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 * You pick a box and you get a cake. Or something scary 
 * @author saradyson
 */
public class MysteryDoorsProject {
    public static void main(String[] args) {
        // create a scanner object to read in user input
        Scanner keyboardScanner = new Scanner(System.in);
        // create a variable for holding user selection and running switch
        int userSelection;
        
        System.out.println("Welcome to the Cake Room.");
        System.out.println("You will win a nice cake, or maybe another festive surprise.");
        System.out.println("Please enter through the door behind me, and you can begin.");
        System.out.println ("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\n" +
                            "█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\n" +
                            "█░░░░░░░░░░░░░░▄░░░░░░░░░░░░░░░░░░░░░█\n" +
                            "█░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░░░█\n" +
                            "█░░░░░░░░░░░▄▄░▄▀░░░░░░░░░░░░░░░░░░░░█\n" +
                            "█░░░░░░░░▄██████▄░░░░░▄▄▄▄▄▄███▀█░░░░█\n" +
                            "█░░░░░░▄█░███████░██▀▀▀░▄▄█▀█▄███░░░░█\n" +
                            "█░░░░█▀▀▀░█████▀▀▄█▀▄▄▀▀▄▄███████░░░░█\n" +
                            "█░░░░█▀▄▄▄▄███░▄▄█▀▀▄▄███████▀▀▄▄░░░░█\n" +
                            "█░░░░█░░░░▀▀▀▀▀▀▄▄███████▀▀▄▄████░░░░█\n" +
                            "█░░░░█░░░░░░░░░█████▀▀▀▄▄███████▀░░░░█\n" +
                            "█░░░░█░░░░░░░░░█▀▀░▄▄███████▀█▄▄█░░░░█\n" +
                            "█░░░░█░░░░░░░░░▄▄███████▀█▄██████░░░░█\n" +
                            "█░░░░█░░░░░░░░░████▀▀▄▄███████▀▀░░░░░█\n" +
                            "█░░░░█░░░░░░░░░▀▀▄▄███████▀▀░░░░░░░░░█\n" +
                            "█░░░░█░░░░░░░░░███████▀▀░░░░░░░░░░░░░█\n" +
                            "█░░░░░▀▄▄▄░░░░░███▀▀░░░░░░░░░░░░░░░░░█\n" +
                            "█░░░░░░░░░▀▀▀▀▀▀░░░░░░░░░░░░░░░░░░░░░█\n" +
                            "█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█\n");

        
        System.out.println("You are in a barren room with a concrete floor and white walls.");
          System.out.println("The door you entered through has disappeared.");
          System.out.println("You must make a choice, and then you will be allowed to leave.");
         System.out.println("The only furniture in the room is a table.");
        System.out.println("On the table are three packages.");
        System.out.println("_____  _____  _____");
        System.out.println("| 1 |  | 2 |  | 3 |");
        System.out.println("_____  _____  _____");
        System.out.println("An envelope [1], a wooden box [2], and a cardboard box[3]");
        System.out.println("The envelope is thick, deteriorating and covered in mold. ");
        System.out.println("The wooden box is intricately carved, and a low hum can be heard from inside. It gives off an aura of danger. I wouldn't open it.");
        System.out.println("The cardboard box is thin and white, a standard box that you would take home from a bakery.");
        System.out.println("Which package would you like to open? Enter 1, 2, or 3.");
        
        // allows player to enter an integer to select a package
        userSelection = keyboardScanner.nextInt();
        
      
        switch(userSelection){
            case 1:
                plainBox();
                break;
            case 2:
                ornateBox(); 
                break;
            case 3:
                moldyEnvelope();
                break;
        } // close switch
    } // close main
    
    // open the cardboard box
    public static void plainBox(){
        System.out.println("You open the plain white box.");
        System.out.println("Inside is a a cake. ");
	System.out.println("It is yellow cake with chocolate frosting.");
	System.out.println("On top, Congratulations is spelled out in pink icing.");
	System.out.println("What is it congratulating you for? I am not sure.");
    } // close method plainbox

    
    public static void moldyEnvelope(){
        System.out.println("Are you sure you want to open this damp, moldy envelope?");
        Scanner input = new Scanner(System.in);
        String a = input.next();
        
        // answer yes
        if(a.equals("yes")){
            System.out.println("You tear open the damp, slightly sticky envelope.");
	    System.out.println("A smashed piece of cake plops onto the table in front of you.");
	    System.out.println("It is a putrid green color, and smells unpleasant.");
            System.out.println("Why would you choose to open this? You knew it would be something foul.");
            System.out.println("Take a moment to think about your poor decision making skills.");
            
       // answer no
        } else {
            System.out.println("A wise decision.");
            //looked at code from github.com/laurapintar/cit111_ccac/blob/master/MysteryDoors.java for help with creating if/else method
        }
      
    } // close method envelope
        
    // open the ornate box 
    public static void ornateBox(){
        System.out.println("You unfasten a delicate gold latch on the front of the box.");
        System.out.println("A piercing shriek fills the room, and the air is sucked from your lungs.");
        System.out.println("It seems as though this box contained an ancient spirit with a deep hatred for humanity, rather than a cake.");
        System.out.println("As you regain your senses and catch your breath, an alert goes off on your phone. You check it to find that news channels all over the world are reporting monumental disasters.");
        Random r = new Random();
        BigInteger bigInt = new BigInteger(25, r);
        System.out.println(bigInt + " people have died.");
        System.out.println("I said you shouldn't open that one. I guess it's too late now.");
        System.out.println("Now that the spirit has vacated the box, it is revealed that there is a lovely strawberry creme cupcake inside.");
        System.out.println("Maybe it will help you cope with the fact that you just released an unspeakable evil into your world.");
        System.out.println("Enjoy!");
        
        //I don't know if I have to cite my own work, but I used a previous project with biginteger/random to help me with this
    } // close method ornatebox
    
} // close class

//Cake ASCII from http://www.facegarage.com/textEffect/ASCIICodes/birthday
