/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycaptain;

/**
 *
 * @author new
 */
import java.util.*;  

public class Main {

  public static void main(String[] args) {


    Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
    System.out.print("Enter the value - ");  
    int num= sc.nextInt(); 
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
