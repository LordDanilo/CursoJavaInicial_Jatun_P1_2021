public class Ejercicio10_NumeroMalvado{
    public String verificar(int numero){
        int binario = transformar(numero);
        int cantUnos = contarUnos(binario);
        return (cantUnos%2 == 0)? "Numero Malvado":"Numero Odioso";
    }
    
    private int contarUnos(int binario){
        int cantUnos = 0;
        while(binario>0){
            int dig = binario%10;
            if(dig == 1){
                cantUnos++;
            }
            binario = binario/10;
        }
        return cantUnos;
    }
    
    private int transformar(int num){
        int res = 0;
        int mult = 1;
        while(num>0){
            int residuo = num%2;
            res = res+(residuo*mult);
            num = num/2;
            mult = mult*10;
        }
        return res;
    }
}
