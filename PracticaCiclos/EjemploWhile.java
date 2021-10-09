public class EjemploWhile{
    public int contarDigitos(int num){
        int res = 0;
        if(num==0){
            res = 1;
        }else{
            while(num != 0){
                num = num/10;
                res++;
            }
        }
        return res;
    }
}
