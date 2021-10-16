public class Ejercicio_TipoDeNumero{
    public String verificarTipo(int numero){
        String res = "";
        int sumatoriaDiv = calcularSumatoriaDiv(numero);
        if(sumatoriaDiv == numero){
            res = "Numero Perfecto";
        }else{
            if(sumatoriaDiv > numero){
                res = "Numero Abundadnte";
            }else{
                res = "Numero Defectivo";
            }
        }
        return res;
    }
    
    private int calcularSumatoriaDiv(int num){
        int res = 0;
        for(int div = 1; div<=(num/2); div++){
            if(num%div == 0){
                res = res+div;
            }
        }
        return res;
    }
}
