public class Ejercicio11_Multiplicacion{
    public int multiplicar(int num, int multiplicador){
        int res = 0;
        for(int cont = 1; cont <= multiplicador; cont++){
            res = res+num;
        }
        return res;
    }
    public int multiplicarWhile(int num, int multiplicador){
        int res = 0;
        int cont = 1;
        while(cont <= multiplicador){
            res = res+num;
            cont++;
        }
        return res;
    }
}
