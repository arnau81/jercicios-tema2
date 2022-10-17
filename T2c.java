import java.util.Scanner;
public class T2c {
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int n = 0 , ndos = 0 , res = 0; 
String suma = "" , resta = "" , mult = "", div = "";

System.out.println("Intro num");
n = sc. nextInt();
System.out.println("Intro otro número");
ndos = sc. nextInt();
System.out.println("Elige una de las siguientes opciones; suma , resta , multiplicación, división");
suma = n + ndos;
resta = n - ndos;
mult = n * ndos;
div = n / ndos;


switch (n)
{
    case 0:
     = "cero";
    break;
    case 1:
    n = "uno";
    break;
    case 2:
    n = "dos";
    break;
}

System.out.println(lit);
}
}