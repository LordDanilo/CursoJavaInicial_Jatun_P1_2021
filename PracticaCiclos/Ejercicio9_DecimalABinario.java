public class Ejercicio9_DecimalABinario{
    public int transformar(int num){
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
    public int transformarFor(int num){
        int res = 0;
        int mult = 1;
        for(int numero=num; numero>0; numero=numero/2){
            int residuo = numero%2;
            res = res+(residuo*mult);
            mult = mult*10;
        }
        return res;
    }
}
