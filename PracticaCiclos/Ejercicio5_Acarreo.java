public class Ejercicio5_Acarreo{
    public int calcularAcarreos(int num1, int num2){
        int res = 0;
        int acarreo = 0;
        while(num1>0 || num2>0){
            int dig1 = num1%10;
            int dig2 = num2%10;
            int suma = dig1+dig2+acarreo;
            if(suma>9){
                res++;
                acarreo = 1;
            }else{
                acarreo = 0;
            }
            num1 = num1/10;
            num2 = num2/10;
        }
        return res;
    }
}
