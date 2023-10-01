
package repeticao;

import java.util.Scanner;

public class Repeticao3 {
    
    public static void main(String[] args){
    
        int num;
        Scanner ObjS = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = ObjS.nextInt();
        
        for (int i = 1;i <= 10;i++){
        System.out.println(num +"x"+i+"="+num*i);
        }
        
    }
    
}
