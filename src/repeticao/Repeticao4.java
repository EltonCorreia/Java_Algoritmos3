
package repeticao;

import java.util.Scanner;

public class Repeticao4 {
    
    public static void main(String[] args){
    
    int num,fim,inicio;
    
    Scanner ObjS = new Scanner(System.in);
    System.out.print("Digite o número da tabuada: ");
    num = ObjS.nextInt();
    
    System.out.print("Digite o inicio da multiplicação: ");
    inicio = ObjS.nextInt();
    
    System.out.print("Digite o fim da multiplicação: ");
    fim = ObjS.nextInt();
    
    for(int j = inicio;j <= fim;j++){
        System.out.println(num+"x"+j+"="+num*j);
        
    }
    
    }
    
}
