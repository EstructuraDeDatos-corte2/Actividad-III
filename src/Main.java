public class Main {
    public static void main(String[] args) {

        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

        abb.insertar(8);
        abb.insertar(3);
        abb.insertar(10);
        abb.insertar(1);
        abb.insertar(6);

        System.out.println("Recorrido Inorden:");
        abb.inorden(abb.raiz);

        System.out.println("\nBuscar 6: " + abb.buscar(6));
        System.out.println("Buscar 15: " + abb.buscar(15));
    }
}