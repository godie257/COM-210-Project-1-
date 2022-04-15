
import java.util.*;
import java.lang.*;
import java.io.*;

public class project1 {
    
    
  
    public static void main(String[] args) {
        //Stack stack1 = new Stack();
        //Stack<String> stack1 = new Stack<String>(); 
        String str = " [{(a b  c})]  " ; 

        
        // variables for delimiters open & close 
        String opening_brace = "{" ;
        String closing_brace = "}";
        String opening_bracket = "[";
        String closing_bracket = "]"; 
        String opening_parent = "(" ; 
        String closing_parent = ")";
        

        for (int i = 0; i < str.length(); i ++){
            Stack<String> stack1 = new Stack<String>(); 
            //making a string variable for the character to be able to compare
            
            String letter = Character.toString(str.charAt(i));
            //System.out.println(letter);
            int score = 0 ; 
            //first if statement checking for the opening delimiter 
            if (letter.contains(opening_brace)){
                System.out.println("Opening BRACE found");
                    //here want to now add it to the stack using .push 
                    stack1.push(letter); 
                    System.out.println("Items in stack:  " + stack1);

                    // if letter is opening brace, add it to the stack 
                    // if there is an opening brace, it is added to the stack
                    

                //for loop used to iteriate through the orginal str to be able to delcare a new string variable to compare to find the closing delimiter 
                for (int j = 0; j < str.length(); j++){
                    String next_letter = Character.toString(str.charAt(j));

                    //now going through all the letters of str to see if there is a closing brace matching the opening one, 

                    // if statement to check to see if there is a closing delimiter 
                    //closing delimiter check 
                    if (next_letter.contains(closing_brace)){
                        System.out.println("Closing BRACE found");
                        //here want to .pop it from the stack 
                        stack1.pop(); 
                        System.out.println("Items in stack:  " + stack1);
                        score = 5; 
                    }
                }
                //no closing delimiter check 
                if (score != 5){
                    System.out.println("ERROR: No closing brace delimiter found!");
                } 
                        
                    
                     
                        
                    
                    
                }
         


            //now must make an if statement for each type of delimiter 

            //if statement for bracket 
            if (letter.contains(opening_bracket)){
                System.out.println("Opening BRACKET found");
                stack1.push(letter); 
                System.out.println("Items in stack:  " + stack1);

                for (int j = 0; j < str.length(); j++){
                    String next_letter = Character.toString(str.charAt(j));
                    // if statement to check to see if there is a closing delimiter 
                    if (next_letter.contains(closing_bracket)){
                        System.out.println("Closing BRACKET found");
                        stack1.pop(); 
                        System.out.println("Items in stack:  " + stack1);
                        score = 7; 
                    }
                }
            if (score != 7){
                System.out.println("ERROR: No closing bracket delimiter found!");
                }
            }
             
      
                //if statement for partenthes 
            if (letter.contains(opening_parent)){
                System.out.println("Opening PARENT found");
                stack1.push(letter); 
                System.out.println("Items in stack:  " + stack1);

                for (int j = 0; j < str.length(); j++){
                    String next_letter = Character.toString(str.charAt(j));
                    // if statement to check to see if there is a closing delimiter 
                    if (next_letter.contains(closing_parent)){
                        System.out.println("Closing PARENT found");
                        stack1.pop(); 
                        System.out.println("Items in stack:  " + stack1);
                        score = 9; 
                    }
                }
                if (score != 9){
                    System.out.println("ERROR: No closing parenthese delimiter found!");
                }
            }
         }

        
    }
}