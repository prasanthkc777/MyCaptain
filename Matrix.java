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
public class Matrix {
   public static void main(String args[]){  
//creating two matrices    
int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
    
//creating another matrix to store the sum of two matrices    
int c[][]=new int[3][3];  //3 rows and 3 columns  
    System.out.println("output of addition matrix");
//adding and printing addition of 2 matrices    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  

System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}  

  

//creating another matrix to store the multiplication of two matrices    
int m[][]=new int[3][3];  //3 rows and 3 columns  
        System.out.println("output of multiplication matrix");
//adding and printing multiplication of 2 matrices    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
m[i][j]=a[i][j]*b[i][j];    //use * for multiplication  
System.out.print(m[i][j]+" ");    
}    
System.out.println();//new line    
}    





} 
    
    
}
