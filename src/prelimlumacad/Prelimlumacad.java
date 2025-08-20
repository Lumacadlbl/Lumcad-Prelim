
package prelimlumacad;

import java.util.Scanner;

public class Prelimlumacad {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter price of Item: ");
        double item = sc.nextDouble();
        
        System.out.print("Enter quantity: ");
        double quan = sc.nextDouble();
        
        double total = (item * quan);
        
        System.out.println("Total amount "+total);
                
        
    
}
}