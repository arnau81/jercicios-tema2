
import java.util.Scanner;
public class Tema2b {
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
double n = 0;

System.out.println("Intro nota");
n = sc. nextDouble();

if (n => 9)
{
    System.out.println ("Excelente");
}

else if ( n => 5 && n =< 6.6)
{
    System.out.println ("Aprobado");
}

else if ( n > 6.5 && n <= 9 )
{
    System.out.println ("Notable");
}

else {System.out.println ("Suspendido");}
}
}