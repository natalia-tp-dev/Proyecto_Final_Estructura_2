
package modelo;


public class ArbolEstudiantes {
    //Nodo raiz
    private NodoEstudiante nodoRaiz;
    
    //Metodo de insertar
    public void insertar(Estudiante estudiante){
        nodoRaiz = insertarRecursivo(nodoRaiz, estudiante);
    }
    
    //Metodo de insertar recursivo
    private NodoEstudiante insertarRecursivo(NodoEstudiante nodoActual, Estudiante estudiante){
        //Validar si el nodo actual es nulo
        if(nodoActual == null)return new NodoEstudiante(estudiante);
        
        //Si el id del estudiante a insertar es menor al del nodo, se inserta a la izquierda, de lo contrario se inserta a la derecha
        if (estudiante.getId() < nodoActual.estudiante.getId()) {
            nodoActual.izquierda = insertarRecursivo(nodoActual.izquierda, estudiante);
        } else if (estudiante.getId() > nodoActual.estudiante.getId()){
            nodoActual.derecha = insertarRecursivo(nodoActual.derecha, estudiante);
        }
        
        //retornamos el nodo actual
        return nodoActual;
    }
}
