
package repeticao;

import java.util.Scanner;

public class Repeticao8 {
    
    public static void main (String args[]){
    
    long numero;
    long x=0;
    
    String binario="";
    Scanner objS = new Scanner (System.in);
    System.out.print("Digite um número: ");
    
    numero = objS.nextLong();
    
    x = numero;
    while (numero>0){
        binario = (numero%2) + binario;
        numero = numero/2;
    
    }
    
    System.out.println("O binário de "+x+" é igual "+binario);
        
    }
    
}
