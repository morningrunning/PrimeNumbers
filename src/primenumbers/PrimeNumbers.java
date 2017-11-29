/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

/**
 *
 * @author ronaldmorgan
 */
import java.io.*;

public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int i; 
        BufferedReader bf = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter Number: ");
        int num = Integer.parseInt(bf.readLine());
        System.out.println("Prime Number: ");
        
        for(i=1; i < num; i++ ){
            int j;
            for (j=2; j<i; j++){
                int n = i % j;
                if (n==0){
                    break;
                }
            }
            
            if (i == j){
                System.out.print("   " +i);
            }
        }
    }
    
}
