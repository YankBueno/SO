package so;
import java.util.Scanner;
public class SO {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int proces, totalut=0, media=0, tp=0, cont=1, un=0;
        System.out.println("Digite o número de processos desejado: ");
        proces = teclado.nextInt();
        int num[] = new int[proces];
        int espera[] = new int[proces];
         for (int i=0;i<proces;i++){
           System.out.println("Digite uma unidade de tempo para o processo "+cont);
           num[i] = teclado.nextInt();
               cont++;
    }
         cont=1;
         for(int i=0;i<proces;i++){
             System.out.println("ID: p"+cont+" | Execução: "+num[i] +" | Espera: "+tp);
            espera[i] = un;
            totalut += tp;
            tp = tp + num[i];
             cont++;
         }
         media = totalut / proces;
        System.out.println("A média de execução da UT é: "+media);
    }
   
}