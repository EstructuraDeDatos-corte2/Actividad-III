public class ArbolBinarioBusqueda {
    Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }

        return nodo;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Nodo nodo, int valor) {
        if (nodo == null) return false;
        if (nodo.valor == valor) return true;

        return valor < nodo.valor
                ? buscarRec(nodo.izquierdo, valor)
                : buscarRec(nodo.derecho, valor);
    }

    public void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorden(nodo.derecho);
        }
    }
}