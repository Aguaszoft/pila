import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pila {
    static ClasePila Pila=new ClasePila();  // Declaracion del objeto Pila

    public static void main(String[] args) throws IOException {

        int op=0;
        do {
            op=0;
            System.out.println("\n\n<<< PILAS >>>");
            System.out.println("1.-Push");
            System.out.println("2.-Pop");
            System.out.println("3.-Mostrar Pila");
            System.out.println("0.-Salir");

            //op=Integer.parseInt(JOptionPane.showInputDialog("Opcion? "));
            System.out.print("Opcion? ---> ");
            op=getInt();

            switch(op) {
                case 1 : Altas();                break;
                case 2 : Bajas();               break;
                case 3 : Pila.Mostrar();     break;
            }
        }while(op!=0);
    }

    public static void Altas() throws IOException {
        int dato=0;
        System.out.println("\n\n<<< ALTAS >>>");
        System.out.print("\nAnote el dato que desea insertar ---> ");
        dato=getInt();
        Pila.Push(dato);  // Invocar el metodo Push del objeto Pila
    }

    public static void Bajas() throws IOException {
        int dato=0;
        System.out.println("\n\n<<< BAJAS >>>");
        System.out.print("\nAnote el dato que desea eliminar ---> ");
        dato=getInt();
        Pila.Pop(dato); // Invocar el metodo Pop del objeto Pila
    }

    // Funcion para capturar una cadena desde el teclado
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    // Funcion para capturar un entero desde el teclado
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
    }
