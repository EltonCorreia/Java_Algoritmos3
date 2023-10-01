
package repeticao;

import java.util.Scanner;

public class Repeticao2 {
    
    public static void main(String[] args){
    
        int n;
        long fatorial=1;
        Scanner ObjS = new Scanner(System.in);
        System.out.print("Digite um número para o fatorial: ");
        n = ObjS.nextInt();
        
        for(int cont=1;cont<=n;cont++){
            fatorial=fatorial*cont;
        }
        
        System.out.println("O fatorial de "+n+" é: \n" +fatorial);
           
    }
    
}
