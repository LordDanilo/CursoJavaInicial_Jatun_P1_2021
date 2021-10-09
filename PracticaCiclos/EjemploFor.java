public class EjemploFor{
    public String verificarNumero(int numero){
        boolean esPrimo = true;
        //for(variableDeControlLocal; condicion(es); variacion)
        for(int div = 2; div <= (numero/2) && (esPrimo == true) ; div++){
            if(numero%div == 0){
                esPrimo = false;
            }
        }
        String res;
        if(esPrimo == true){
            if(numero == 1){
                res = "El numero es Compuesto";
            }else{
                res = "El numero es Primo";
            }
        }else{
            res = "El numero es Compuesto";
        }
        return res;
    }
}
