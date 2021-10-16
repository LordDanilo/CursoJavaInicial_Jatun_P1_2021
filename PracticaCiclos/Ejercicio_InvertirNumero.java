public class Ejercicio_InvertirNumero{
    public int invertirNumero(int numero){        
        int exp = contarDigitos(numero)-1;
        int mult = (int)(Math.pow(10,exp));
        int res = 0;
        while(numero > 0){
            int dig = numero%10;
            res = res+(dig*mult);
            numero = numero/10;
            mult = mult/10;
        }
        return res;
    }
    private int contarDigitos(int num){
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
    public static void main(String args[]){
        Ejercicio_InvertirNumero obj = new Ejercicio_InvertirNumero();
        int aux = obj.invertirNumero(132);
        System.out.println(aux);
        aux = obj.invertirNumero(73942);
        System.out.println(aux);
        aux = obj.invertirNumero(36000);
        System.out.println(aux);
        aux = obj.invertirNumero(10002);
        System.out.println(aux);
        aux = obj.invertirNumero(6);
        System.out.println(aux);
    }
}
