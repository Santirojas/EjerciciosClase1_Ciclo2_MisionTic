import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ejercicio15();
    }
    private static void ejercicio1(){
        var cadena ="Santiago";

        System.out.printf("Hola %s, cómo van las cosas?", cadena);
    }
    private static void ejercicio2(){
        var sc=new Scanner(System.in);
        int numero;
        var longitud=0;
        String num;
        sc.close();

        System.out.print("Ingrese un número: ");
        numero =sc.nextInt();
        num=Integer.toString(numero);
        longitud=num.length();
        System.out.printf("El número %s tiene %s dígitos",num,longitud);
        sc.close();
    }
    private static void ejercicio3(){
        var sc=new Scanner(System.in);
        int numero;
        int doble;
        int triple;

        System.out.print("Ingrese un número: ");
        numero =sc.nextInt();
        doble=numero*2;
        triple=numero*3;
        System.out.printf("El doble del número %s es: %s \n",numero,doble);
        System.out.printf("El triple del número %s es: %s \n",numero,triple);
        sc.close();

    }
    private static void ejercicio4(){

        var sc=new Scanner(System.in);
        double celcius;
        System.out.print("Ingrese  la temperatura en grados Celcius: ");
        celcius= sc.nextDouble();
        var fahrenheit= 32 + ( 9 * celcius / 5);
        System.out.println("El equivalente en grados Fahrenheit de la temperatutra ingresada es: "+fahrenheit+"°F");
        sc.close();
    }
    private static void ejercicio5(){
        Scanner sc=new Scanner(System.in);
        int numero;
        String verificacion;        
        System.out.println("Ingrese un número entero:");
        numero=sc.nextInt();
        verificacion = numero%2==0? "par":"impar";
        System.out.printf("%d es %s",numero,verificacion);
        sc.close();
    }
    private static void ejercicio6(){
        Scanner sc =new Scanner(System.in);
        double a;
        double b;
        String operador;
        double resultado;
        System.out.printf("Ingrese un número: ");
        a=sc.nextDouble();
        
        System.out.printf("Ingrese otro número: ");
        b=sc.nextDouble();
      
        System.out.printf("Ingrese un operador (+,-,*,/): ");
        operador=sc.next();
        
        switch (operador) {
            case "+":
                resultado=a+b;
                System.out.println("El resultado de la suma de " + a + " y " + b +" es: "+ resultado);
                break;

            case "-":
                resultado=a-b;
                System.out.println("El resultado de la resta de " + a + " y " + b +" es: "+ resultado);
                break;

            case "*":
                resultado=a*b;
                System.out.println("El resultado de la multiplicación de " + a + " y " + b +" es: "+ resultado);
                break;
            
            case "/":
                if (b!=0) {
                    resultado=a/b;
                    System.out.println("El resultado de la división de " + a + " y " + b +" es: "+ resultado);
                    break;
                } else {
                    System.out.println("La división por 0 no está definida");
                    break;
                }
        
            default:
                System.out.println("El operador ingresado no es válido");
                break;
       
        }
        sc.close();
    }
    private static void ejercicio7(){
        Scanner sc =new Scanner(System.in);
        String nombre;
        double nota1;
        double nota2;
        double nota3;
        double promedio;
        String validacion;

        System.out.println("Ingrese el nombre del alumno: ");
        nombre=sc.nextLine();
        System.out.println("Ingrese la nota 1: ");
        nota1=sc.nextDouble();
        System.out.println("Ingrese la nota 2: ");
        nota2=sc.nextDouble();
        System.out.println("Ingrese la nota 3: ");
        nota3=sc.nextDouble();
        promedio=(nota1+nota2+nota3)/3;
        validacion=promedio>=3?"aprobado":"reprobado";
        System.out.printf("El alumno %s fue %s con una nota final de: %.2f ",nombre,validacion,promedio);
        sc.close();
    }
    private static void ejercicio8(){
        Scanner sc =new Scanner(System.in);
        int horas;
        int sueldo;
        System.out.println("Ingrese el número de horas del trabajador: ");
        horas=sc.nextInt();
        sueldo=horas*30000;
        System.out.printf("Por las %d horas trabajadas tiene un sueldo de $%,d ",horas,sueldo);
        sc.close();
    }
    private static void ejercicio9(){
        Scanner sc =new Scanner(System.in);
        int numero;
        int mult;
        System.out.println("Ingrese el número del que desea conocer la tabla de multiplicar");
        numero=sc.nextInt();
        System.out.printf("La tabla de multiplicar del %d es: \n",numero);
        for (int i=1;i<=10;i++) {
                mult=i*numero;
                System.out.printf("%d * %d = %d \n",i,numero,mult);
        }
        sc.close();
    }
    private static void ejercicio10(){
       Scanner sc =new Scanner(System.in);
       Random rnd = new Random();
       int numero;
       int aleatorio;
       aleatorio=rnd.nextInt(100);
       System.out.println("Un número aleatorio entre 0 y 100 se ha generado");
       System.out.println("Ingrese un número entre el 0 y el 100 para adivinar el número generado: ");
       numero=sc.nextInt();
       while (numero!=aleatorio) {
        if (aleatorio>numero) {
            System.out.println("El número que busca es mayor ");
            
        } else if (aleatorio<numero){
            System.out.println("El número que busca es menor ");    
        }   
        
        System.out.println("Ingrese nuevamente un número entre el 0 y el 100 para adivinar el número generado: ");
        numero=sc.nextInt();
       }
        if (aleatorio==numero){
        System.out.printf("Correcto!! El número ingresado %d es el aleatorio %d",numero,aleatorio);
        sc.close();
    }
}
    private static void ejercicio11(){
        Scanner sc =new Scanner(System.in);
        int estatura;
        String sexo;
        int peso_ideal=0;
        System.out.println("Ingrese el sexo H o M: ");
        sexo=sc.nextLine();
        System.out.println("Ingrese la estatura en cm: ");
        estatura=sc.nextInt();

        switch (sexo){
            case "H":
                peso_ideal=estatura-100;
                System.out.println("El peso ideal de la persona es: "+ peso_ideal);
                break;
            case "M":
                peso_ideal=estatura-110;
                System.out.println("El peso ideal de la persona es: "+ peso_ideal);
                break;
            default:
                System.out.println("Error con el sexo ingresado");
        }
        sc.close();
    }
    private static void ejercicio12(){
        Scanner sc =new Scanner(System.in);
        int numero;
        String pregunta;
        System.out.println("Ingrese un número para verificar si es primo: ");
        numero=sc.nextInt();
        if(numero==1 | numero==2){
            System.out.printf("El número %d es primo \n",numero);
            System.out.println("¿Desea verificar otro número (S/N)?");
            pregunta=sc.next();
            if (pregunta.equalsIgnoreCase("S")) {
                ejercicio12();
                
            } else if(pregunta.equalsIgnoreCase("N")){

            }else{
                System.out.println("Opción ingresada no valida");
            }
        }
        for (int index = 2; index < numero; index++) {
            if (numero%index==0) {
                System.out.printf("El número %d no es primo \n",numero);
                System.out.print("¿Desea verificar otro número (S/N)?");
                pregunta=sc.next();
                if (pregunta.equalsIgnoreCase("S")) {
                    ejercicio12();
                    break;
                    
                } else if(pregunta.equalsIgnoreCase("N")){
                    break;
                }else{
                    System.out.println("Opción ingresada no valida");
                    break;
                }
            }else if(index==numero-1){
                System.out.printf("El número %d es primo: \n",numero);
                System.out.print("¿Desea verificar otro número (S/N)?");
                pregunta=sc.next();
                if (pregunta.equalsIgnoreCase("S")) {
                    ejercicio12();
                    break;
                } else if(pregunta.equalsIgnoreCase("N")){
                    break;
                }else {
                    System.out.println("Opción ingresada no válida");
                    break;
                }
            }else{
                continue;
            }    
        }
        sc.close();     
            }
    private static void ejercicio13(){
        Scanner sc =new Scanner(System.in);
        Random rnd=new Random();
        String jugador1;
        String jugador2;
        int valor;

        String []array={"P","L","T"};
        System.out.println("Piedra, Papel o Tijera");
        System.out.println("Jugador 1, Ingrese una opción Piedra-P, Papel-L o Tijera-T: ");
        jugador1=sc.nextLine();
        System.out.println("La máquina ha seleccionado una opción");
        valor=rnd.nextInt(array.length);
        jugador2=array[valor];

        if (jugador1.equalsIgnoreCase(jugador2)) {
            System.out.printf("Empate, tanto el jugador como la máquina seleccionaron %s %s \n",jugador1.toUpperCase(),jugador2);
            volver_jugar();

        } else {
            switch (jugador1.toUpperCase()){
                case("T"):
                    if (jugador2.equalsIgnoreCase("L")){
                        System.out.printf("Gana el jugador con %s, la máquina sacó %s \n",jugador1.toUpperCase(),jugador2);
                        volver_jugar();
                        break;
                    }else if (jugador2.equalsIgnoreCase("P")){
                        System.out.printf("Pierde el jugador con %s, la máquina sacó %s \n",jugador1.toUpperCase(),jugador2);
                        volver_jugar();
                        break;
                    }
                case("L"):
                    if (jugador2.equalsIgnoreCase("P")){
                        System.out.printf("Gana el jugador con %s, la máquina sacó %s \n",jugador1.toUpperCase(),jugador2);
                        volver_jugar();
                        break;
                    }else if (jugador2.equalsIgnoreCase("T")){
                        System.out.printf("Pierde el jugador con %s, la máquina sacó %s \n",jugador1.toUpperCase(),jugador2);
                        volver_jugar();
                        break;
                    }
                case("P"):
                    if (jugador2.equalsIgnoreCase("T")){
                        System.out.printf("Gana el jugador con %s, la máquina sacó %s \n",jugador1.toUpperCase(),jugador2);
                        volver_jugar();
                        break;
                    }else if (jugador2.equalsIgnoreCase("L")){
                        System.out.printf("Pierde el jugador con %s, la máquina sacó %s \n",jugador1.toUpperCase(),jugador2);
                        volver_jugar();
                        break;
                    }

                default:
                    System.out.println("Error con alguno de los datos ingresados");
                    volver_jugar();

            }
        }
        sc.close();
    }
    private static void volver_jugar() {
        Scanner sc =new Scanner(System.in);
        String seleccion;
        System.out.println("¿Desea volver a jugar (S/N)?: ");
        seleccion=sc.next();
        if(seleccion.equalsIgnoreCase("N")){
                System.out.println("Fin del programa");
        } else if (seleccion.equalsIgnoreCase("S")){
                ejercicio13();
        }else{
                System.out.println("La opción ingresada no es válida");
                ejercicio13();
        }
        sc.close();
    }
    private static void ejercicio14(){
        Scanner sc =new Scanner(System.in);
        int edad;
        String nombre;
        double salario;
        String plantilla="El empleado %s con %d tiene un salario final de: $%,.2f \n";
        System.out.println("Ingrese el nombre del empleado: ");
        nombre=sc.nextLine();
        System.out.printf("Ingrese la edad de %s: \n",nombre);
        edad=sc.nextInt();
        System.out.printf("Ingrese el salario de %s: \n",nombre);
        salario=sc.nextDouble();

        if (edad<18){
            System.out.printf("%s no tiene edad para trabajar, es menor de edad con %d años",nombre,edad);
        }else if(edad>30 & edad<=50){
            salario=salario*1.05;
            System.out.printf(plantilla,nombre,edad,salario);
        }else if(edad>50 & edad<=60){
            salario=salario*1.1;
            System.out.printf(plantilla,nombre,edad,salario);
        }else if(edad>60 ){
            salario=salario*1.15;
            System.out.printf(plantilla,nombre,edad,salario);
        }else{
            System.out.printf(plantilla,nombre,edad,salario);
        }
        sc.close();
    }
    private static void ejercicio15(){
        Scanner sc =new Scanner(System.in);
        int numero;
        int f0=0;
        int f1=1;
        
        System.out.println("Sucesion de Fibonacci...");
        System.out.println("Ingrese un número hasta el cual desea que llegue la sucesion...");
        numero=sc.nextInt();
        if(numero>=0){
            System.out.printf("La sucesion de Fibonacci hasta el numero %d es: \n",numero);
            if (numero==0){
                System.out.println(f0);
            }else if(numero==1) {
                System.out.println(f0);
                System.out.println(f1);

            }else{
                for(int fn=0; fn<=numero; fn=f0+f1) {
                    System.out.println(fn);
                    f0=f1;
                    f1=fn;
                }
            } 
        }else{
            System.out.println("La sucesion de Fibonacci empieza desde el 0, no está definida para números negativos");
            ejercicio15();
        }
    }
}


        
    
