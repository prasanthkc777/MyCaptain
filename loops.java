/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycaptain;
import java.util.*;
/**
 *
 * @author new
 */
public class loops {
    

    public static void main(String[] args) {  
    //Code of Java for loop 
    System.out.println("output for FOR loop");
    for(int i=1;i<=10;i++){  
        System.out.println(i);    
    }
       //Code of Java for while loop
       System.out.println("output for WHILE loop");
     int j=1;  
    while(j<=10){  
        System.out.println(j);  
    j++; 
    }
      //Code of Java for while loop
       System.out.println("output for DO WHILE loop")
    int k=1;  
    do{  
        System.out.println(k);  
    k++;  
    }while(k<=10); 
    //code for if else 
         System.out.println("output for if else ")
  
Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
System.out.print("Enter first number :  ");
int a= sc.nextInt();
    if(a>0){  
    System.out.println("POSITIVE");  
    }else if(a<0){  
    System.out.println("NEGATIVE");  
    }else{  
    System.out.println("ZERO");
    }
    
    
     
System.out.print("select anyone from _ 10, 20, 30 :  ");
Scanner cd= new Scanner(System.in); //System.in is a standard input stream.
int number = cd.nextInt();
    //Switch expression  
    switch(number){  
    //Case statements  
    case 10: System.out.println(" you have selected 10");  
    break;  
    case 20: System.out.println("you have selected  20");  
    break;  
    case 30: System.out.println("you have selected  30");  
    break;  
    //Default case statement  
    default:System.out.println("Not in 10, 20 or 30");  
    }  
}
