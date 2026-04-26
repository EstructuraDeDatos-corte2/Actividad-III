public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Insertar (nivel por nivel)
    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (raiz == null) {
            raiz = nuevo;
            return;
        }

        insertarRec(raiz, nuevo);
    }

    private void insertarRec(Nodo actual, Nodo nuevo) {
        if (actual.izquierdo == null) {
            actual.izquierdo = nuevo;
        } else if (actual.derecho == null) {
            actual.derecho = nuevo;
        } else {
            insertarRec(actual.izquierdo, nuevo);
        }
    }

    // Recorridos
    public void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    public void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorden(nodo.derecho);
        }
    }

    public void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierdo);
            postorden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}