
package modelo;


public class Cliente {
private int id;
private int rut;
private String nombre;
private int telefono;
private String direccion;
private String Razon;

    public Cliente() {
    }

    public Cliente(int id, int rut, String nombre, int telefono, String direccion, String Razon) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.Razon = Razon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazon() {
        return Razon;
    }

    public void setRazon(String Razon) {
        this.Razon = Razon;
    }


}
