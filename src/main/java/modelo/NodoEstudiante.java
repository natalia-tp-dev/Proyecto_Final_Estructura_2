
package modelo;


public class NodoEstudiante {
    //Nodo base
    Estudiante estudiante;
    //Apuntadores de izquierda y derecha
    NodoEstudiante izquierda, derecha;
    
    //El nodo recibe un objeto de tipo estudiante
    public NodoEstudiante(Estudiante estudiante){
        this.estudiante = estudiante;
        //Inicializan en nulos ya que no siempre los nodos van a tener hijos
        izquierda = derecha = null;
    }
    
    
}
