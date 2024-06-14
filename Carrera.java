import java.util.Random;
import java.util.Scanner;


public class Carrera {
    public static void main(String[] args) throws InterruptedException{

        int dinero = 1000;
        int camello1 = 0;
        int camello2 = 0;
        int camello3 = 0;
        int rule1 = 0;
        int rule2 = 0;
        int dineroLoco = 0;
        String camelloE = "Hola";
        String salida = "Hola";
        int resultadoApuesta = 0;
        int salir = 0;
        
        while(salir == 0){
        System.out.println("¡Bienvenido a las carreras de camellos! \nDispone usted de " +dinero+ " euros.");
        
        while (rule1 == 0) {
        
        System.out.print("¿Cuanto desea apostar?: ");
        Scanner A1 = new Scanner(System.in);
        int dineroApostado = A1.nextInt();
        dineroLoco = dineroApostado;
        if(dineroLoco > dinero){
            System.out.println("No dispone de tanto dinero. Actualmente dispone de " +dinero+ " euros.");
        }
        else{
            rule1++;
        }
        }
        rule1--;
        

        while (rule2 == 0) {
        System.out.println("Elija un camello (A, B o C): ");
        Scanner A2 = new Scanner(System.in);
        String camelloElegido = A2.nextLine();
        camelloE = camelloElegido;
        if(camelloElegido.equalsIgnoreCase("A")||camelloElegido.equalsIgnoreCase("B")||camelloElegido.equalsIgnoreCase("C") ){
            rule2++;
        }
        else{
            System.out.println("Recuerde escoger entre uno de los camellos A,B o C");
        }
        }
        rule2--;

        System.out.println("Ha apostado "  +dineroLoco+  " euros al camello "+camelloE+". La carrera comenzará en breves instantes.");

        System.out.print("3,");
        Thread.sleep(1000);
        System.out.print("2,");
        Thread.sleep(1000);
        System.out.print("1,");
        Thread.sleep(1000);
        System.out.println("¡Ya!");
        Thread.sleep(1000);


        
        while (camello1 <= 20 && camello2 <= 20 && camello3 <= 20){

        Random aleatorio = new Random();
        int seleccionCamello = aleatorio.nextInt(3)+1;
        
        System.out.println("|--------------------|");

        if (seleccionCamello == 1){
            camello1++;
        }
        if (seleccionCamello == 2){
            camello2++;
        }
        if (seleccionCamello == 3){
            camello3++;
        }
        
        
        for(int i=0; i <= camello1; i++){
            System.out.print("+");
                }
        for (int o=0; o <= 19-camello1; o++){
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println(" ");
        
        for(int i=0; i <= camello2; i++){
            System.out.print("+");
        }
        for (int o=0; o <= 19-camello2; o++){
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println(" ");
        
        for(int i=0; i <= camello3; i++){
            System.out.print("+");
        }
        for (int o=0; o <= 19-camello3; o++){
            System.out.print(" ");
        }
        System.out.print("|");

        System.out.println(" ");
        System.out.println("|--------------------|"); 
        

        Thread.sleep(500);
    }

    System.out.println(" ");
    if (camello1 == 21) {
        System.out.print("¡El ganador es el Camello 1! ");
        
        if (camelloE.equalsIgnoreCase("A")){
            resultadoApuesta = dineroLoco * 3; 
            System.out.println("¡¡Ha ganado " +resultadoApuesta+ " euros!!");
        }
        else{
            dinero = dinero - dineroLoco;
            System.out.println("Ha perdido " +dineroLoco+ " euros.");
        }
    }
    if (camello2 == 21) {
        System.out.println("¡El ganador es el Camello 2! ");

        if (camelloE.equalsIgnoreCase("B")){
            resultadoApuesta = dineroLoco * 3; 
            System.out.println("¡¡Ha ganado " +resultadoApuesta+ " euros!!");
        }
        else{
            dinero = dinero - dineroLoco;
            System.out.println("Ha perdido " +dineroLoco+ " euros.");
    }
}
    if (camello3 == 21) {
        System.out.println("¡El ganador es el Camello 3! ");

        if (camelloE.equalsIgnoreCase("C")){
            resultadoApuesta = dineroLoco * 3; 
            System.out.println("¡¡Ha ganado " +resultadoApuesta+ "euros!!");
        }
        else{
            dinero = dinero - dineroLoco;
            System.out.println("Ha perdido " +dineroLoco+ " euros.");
    }
}
            camello1 = 0;
            camello2 = 0;
            camello3 = 0;

    System.out.println("Desea volver a jugar? (Si/No)");
    Scanner A3 = new Scanner(System.in);
    String salido = A3.nextLine();
    salida = salido;

    switch (salida) {
        case "Si":
            
            System.out.println("Let's Go");
            break;
        case "No":
            System.out.println("¡Hasta luego!");
            break;
    }
    }
}
}

