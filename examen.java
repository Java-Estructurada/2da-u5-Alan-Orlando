public class examen{

    public static void main(String[] args) {
    
        String [] huertas ={"A" ,"B","C"};

    int [][] Humedad ={
        {40,25,35,30},
        {80,85,78,90},
        {50,60,55,48}
    };

    double promedio= resultado / 4;

   System.out.println( "📡 Analizando lecturas de humedad por sector... ");
   System.out.println("-----------------------------------------------------");

   System.out.println("Invernadero "+ nombres(huertas) +  "(Sectores: "+ operacion(Humedad, 0) );
   System.out.println("Promedio Humedad: "+ promedio); 

   if (promedio < 35){
    System.out.println("Requiere riego de emergencia");

    if (promedio >35 || promedio < 75) {
        System.out.println("Estable y Optimizado");

     if (promedio>75){
        System.out.println("Execeso de agua");

        }
     }
   }
 }
    

    public static int operacion(int [][] matriz, int fila){
    
    for(int i=0; i < matriz.length; i++){
    int resultado =+ matriz[fila][i];

    if (matriz[fila][i] < 30){
        int cont =0;
        cont =cont +1; 
        System.out.println("Alerta de Sequía: Se detectaron "+ cont +" sectores en estado crítico (Humedad < 30%).");

    }

    return resultado; 
    }
    }

    public static String nombres(String [] huertas){
    
        for (int j = 0;huertas.length; j++){
        int nom =+ huertas[j]; 
        }
    }


}