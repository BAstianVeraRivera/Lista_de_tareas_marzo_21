public class Tarea {
    private String nombre;
    private String descripcion;

    public String toString(){
        return this.nombre+"\n"+this.descripcion;
    }
    public Tarea (String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
