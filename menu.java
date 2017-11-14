
/**
 * Write a description of class menu here.
 * 
 * @author (Osman Ahumada) 
 * @version (1.0)
 */
import java.util.Scanner;
public class menu
{
    
    public menu()
    {
      
    }
    
    public static void main(String[] args)
    {
        try
        {
          Scanner teclado = new Scanner(System.in);
          int opc = 5;
          int num1 = 0;
          int num2 = 0;
          int res = 0;
          
          while(opc>0)
          {
            System.out.print("\u000C");
            System.out.println("**** Bienvenidos a mi menu ****");
            System.out.println("[2] Sumar");
            System.out.println("[1] Restar");
            System.out.println("[0] Salir");
            opc = teclado.nextInt();
            
            switch(opc)
            {
              case 2:
                  System.out.print("Ingresar primer numero  : "); num1 = teclado.nextInt();
                  System.out.print("Ingresar segundo numero : "); num2 = teclado.nextInt();
                  res = num1 + num2;
                  System.out.println("La suma de "+num1+" + "+num2+" es igual a : "+res);                 
                  System.out.println("Para volver al menu escriba [5] si desea salir presione [0] : ");
                  opc = teclado.nextInt();
              break;
              case 1:
                  System.out.print("Ingresar primer numero  : "); num1 = teclado.nextInt();
                  System.out.print("Ingresar segundo numero : "); num2 = teclado.nextInt();
                  res = num1 - num2;
                  System.out.println("La resta de "+num1+" - "+num2+" es igual a : "+res);                 
                  System.out.println("Para volver al menu escriba [5] si desea salir presione [0] : ");
                  opc = teclado.nextInt();
              break;
              case 0:
                  System.out.print("\u000C");
                  System.out.println("Gracias por ocupar mi programa en java, Adios!!");
                  opc = 0;
              break;
            
            }
            
          }
            
            
            
            
        }
        catch(Exception ex)
        {
            System.out.print("Error : "+ex);
        }
    }

   
}
