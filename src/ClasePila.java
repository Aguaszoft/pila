public  class ClasePila {   // Declaracion de la clase de la Pila
int max = 10;   // Tamano maximo de la pila
    int pila[] = new int[max];   // Arreglo para almacenar la pila
     int top;  // Indica la cantidad de datos en la pila

    public ClasePila() {   // Constructor
        top = 0;
        System.out.println("Pila creada !!!");
    }

    public void Push(int dato) {
        if (top == max)  // Esta llena la Pila?
        {
            System.out.println("Pila llena !!!");
            return;
        }
        for (int i = 0; i < top; i++) {
            if (pila[i] == dato) { // Ya existe el dato?
                System.out.println("Duplicado !!!");
                return;
            }
            if (dato < pila[i]) {  // Alta al principio o intermedia
                for (int j = top; j > i; j--)
                    pila[j] = pila[j - 1];
                pila[i] = dato;
                top++;
                System.out.println("Dato insertado al principio o intermedio !!!");
                return;
            }
        }
        pila[top++] = dato; // Alta al final
        System.out.println("Dato insertado al final !!!");
        return;
    }

    public void Pop(int dato) {
        if (top == 0) { // Esta vacia la Pila?
            System.out.println("Pila vacia !!!");
            return;
        }
        for (int i = 0; i < top; i++) {
            if (pila[i] == dato) {
                for (int j = i; j < top - 1; j++)
                    pila[j] = pila[j + 1];
                top--;
                System.out.println("Dato eliminado !!!");
                return;
            }
        }
        System.out.println("Dato inexistente !!!");
    }

    public void Mostrar() {
        System.out.println("\n\n<<< MOSTRAR LA PILA >>>");
        if (top == 0) System.out.println("Pila vacia !!!");
        for (int i = 0; i < top; i++)
            System.out.println("pila[" + i + "]=" + pila[i]);
        System.out.println("top=" + top);
        System.out.println("max=" + max);
    }
}
