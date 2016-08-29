/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteu;
import java.util.Scanner;

/**
 *
 * @author Skhiburdhurs
 */
public class Iteu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in); 
        //String str ;//= "abcd1234";
        System.out.println("Input: ");
        String str = reader.nextLine();
        //String[] part = str.split("(?<=\\D)(?=\\d)");
        //System.out.println(part[0]);
        //System.out.println(part[1]);
        for(int i=0;i<str.length();i++)
        {
            //System.out.println("Length: "+str.length());
            if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            {
                //System.out.print("Token: ");
                //System.out.println(str.charAt(i));
                
                System.out.print("Token: ");
                
                
                    
                while(Character.isDigit(str.charAt(i)))//(str.charAt(i)>='0' && str.charAt(i)<='9')&&i<str.length())
                {
                    
                    System.out.print(str.charAt(i));
                    
                    //if(str.charAt(i+1)>='0' && str.charAt(i+1)<='9')
                    //    i++;
                    //System.out.println(i);
                    
                    if(i==str.length()-1||!Character.isDigit(str.charAt(i+1)))
                        break;
                    if(Character.isDigit(str.charAt(i+1)))
                        i++;
                }
                
                //i--;
                
                System.out.println("");
                System.out.println("Type: Number");
            }
            else if(Character.isLetter(str.charAt(i)))
            {
                //System.out.print("Token: ");
                //System.out.println(str.charAt(i));
                
                System.out.print("Token: ");
                
                
                    
                while(Character.isLetter(str.charAt(i))||Character.isDigit(str.charAt(i)))//(str.charAt(i)>='0' && str.charAt(i)<='9')&&i<str.length())
                {
                    
                    System.out.print(str.charAt(i));
                    
                    //if(str.charAt(i+1)>='0' && str.charAt(i+1)<='9')
                    //    i++;
                    //System.out.println(i);
                    
                    if(i==str.length()-1||(!Character.isDigit(str.charAt(i+1))&&!Character.isLetter(str.charAt(i+1))))
                        break;
                    if(Character.isDigit(str.charAt(i+1))||Character.isLetter(str.charAt(i+1)))
                        i++;
                }
                
                //i--;
                
                System.out.println("");
                System.out.println("Type: Identifier");
            }
            else if(str.charAt(i)=='*')//[i].matches("(?<=\\D)"))
            {
            System.out.println("Token: *");
            System.out.println("Type: Times");
            }
            else if(str.charAt(i)=='+')//[i].matches("(?<=\\D)"))
            {
            System.out.println("Token: +");
            System.out.println("Type: Plus");
            }
            else if(str.charAt(i)=='-')//[i].matches("(?<=\\D)"))
            {
            System.out.println("Token: -");
            System.out.println("Type: Minus");
            }      
            else if(str.charAt(i)=='=')//[i].matches("(?<=\\D)"))
            {
            System.out.println("Token: =");
            System.out.println("Type: Assign");
            }
            else if(str.charAt(i)=='(')//[i].matches("(?<=\\D)"))
            {
            System.out.println("Token: (");
            System.out.println("Type: Left Parenthesis");
            }   
            else if(str.charAt(i)==')')//[i].matches("(?<=\\D)"))
            {
            System.out.println("Token: )");
            System.out.println("Type: Right Parenthesis");
            }   
            else if(str.charAt(i)=='/')//[i].matches("(?<=\\D)"))
            {
            System.out.println("Token: /");
            System.out.println("Type: Divide");
            }   
            else if(str.charAt(i)==';')//[i].matches("(?<=\\D)"))
            {
            System.out.println("Token: ;");
            System.out.println("Type: Semi");
            }   
             
        }
    }
    
}
