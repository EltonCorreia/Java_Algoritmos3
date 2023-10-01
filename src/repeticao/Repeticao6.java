
package repeticao;

import java.util.Scanner;

public class Repeticao6 {
    
    public static void main(String[] args){
        Scanner objS = new Scanner(System.in);
        System.out.print("Quantos jogos deseja?: ");
        int fim = objS.nextInt();
        
        for (int x = 0; x < fim; x++){
            for (int i=1; i<6; i++){
                System.out.print((int) (Math.random()*25)+" ");
            
            }
            
            System.out.println("");
            
        }
        
    }
    
}
