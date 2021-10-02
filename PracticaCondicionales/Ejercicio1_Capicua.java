public class Ejercicio1_Capicua{
    public String verificar(int numero){
        String res = "";
        int ultDig = numero%10;
        int primerDig = numero/100;
        if(ultDig == primerDig){
            res = "Si";
        }else{
            res = "No";
        }
        return res;
    }
}
