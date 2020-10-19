package principal;

/**
 *
 * @author CES
 */
public class Contacto {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;
    private String telefono;
    
    public Contacto(){
    }    
    
    public Contacto(String nombre,String apellidos, int edad,
                                String email, String telefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad=edad;
        this.email=email;
        this.telefono=telefono;
    }
    
   
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String a) {
        apellidos = a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
       nombre = n;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int e) {
        edad = e;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String em) {
        email = em;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String t) {
        telefono = t;
    }
         
    public void imprimeDatos(){
        System.out.println("Nombre: "+ nombre +
                           " Apellidos: " + apellidos +
                           " Edad: " +edad+
                           " Email: "+ email +
                           " Teléfono: "+ telefono);
    }
}
