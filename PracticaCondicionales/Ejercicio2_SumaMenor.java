public class Ejercicio2_SumaMenor{
    public int calcularSumaMenor(int num1, int num2, int num3){
        int res = 0;
        int suma1 = num1+num2; //200
        int suma2 = num1+num3; //200
        int suma3 = num2+num3; //200
        
        if(suma1 < suma2 && suma1 < suma3){
            res = suma1;
        }else{
            if(suma2<suma3){
                res = suma2;
            }else{
                res = suma3;
            }
        }
        
        return res;
    }
}
