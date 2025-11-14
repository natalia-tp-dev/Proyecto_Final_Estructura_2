package modelo;

public class Estudiante {

    //Variables que construyen a estudiante
    private int id;
    private String nombres;
    private String apellidos;
    private String correoInstitucional;

    //Constructor
    public Estudiante(int id, String nombres, String apellidos, String correoInstitucional) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoInstitucional = correoInstitucional;
    }

    //Getter id
    public int getId() throws IndexOutOfBoundsException {
        if (this.id < 0) {
            throw new IndexOutOfBoundsException();
        }
        return this.id;
    }
    
    //Getter nombre
    public String getNombres() {
        return this.nombres;
    }
    
    //Setter nombre
    public void setNombre(String nombres){
        if (this.nombres.equalsIgnoreCase((nombres))) {
            System.out.println("Modifique los campos");
        }
        this.nombres = nombres;
    }
    
    //Getter apellidos
    public String getApellidos() {
        return this.apellidos;
    }
    
    //Setter apellidos
    public void setApellidos(String apellidos) {
        if (this.apellidos.equalsIgnoreCase(apellidos)) {
            System.out.println("Modifique los campos");
        }
        this.apellidos = apellidos;
    }

    //Getter correo institucional
    public String getCorreoInstitucional(){
        if (!correoInstitucional.contains("@")) {
            System.out.println("No es valido");
        }
        
        if (correoInstitucional.split("@")[1].contains("ucompensar.edu.co")) {
            return this.correoInstitucional;
        }
        
        return this.correoInstitucional;
    }
    
    //Setter correo institucional
    public void setCorreoInstitucional(String correo){
        if (correoInstitucional.split("@")[1].contains("ucompensar.edu.co") && correoInstitucional.contains("@")) {
            this.correoInstitucional = correo;
        }
        
    }
}
