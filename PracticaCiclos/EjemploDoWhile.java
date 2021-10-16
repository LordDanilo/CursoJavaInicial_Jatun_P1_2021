import java.util.Scanner;
public class EjemploDoWhile{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese un numero mayor o igual que cero");
            num = sc.nextInt();
        }while(num<0);
        System.out.print("El valor del numero, es correcto");
    }
}
