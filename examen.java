public class examen{

    public static void main(String[] args) {
        
    int [][] Humedad ={
        {40,25,35,30},
        {80,85,78,90},
        {50,60,55,48}
    };
   System.out.println( "📡 Analizando lecturas de humedad por sector... ");
   System.out.println("-----------------------------------------------------");

   System.out.println("Invernadero A "+ "(Sectores: "+ operacion(Humedad, 0) );
   System.out.println(); 
    }

    public static int operacion(int [][] matriz, int fila){
    

    for(int i=0; i < matriz.length; i++){
    int resultado =+ matriz[fila][i];

    promedio = resultado /4;

    return promedio;  
    }
    }


}