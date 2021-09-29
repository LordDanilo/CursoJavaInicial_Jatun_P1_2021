public class Ejercicio4_Modulo{
    public int calcularHojasNecesarias(int cantPag){
        int respuesta = 0;
        int div = cantPag/2;
        int mod = cantPag%2;
        respuesta = div+mod;
        return respuesta; 
    }
}
