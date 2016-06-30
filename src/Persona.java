import java.util.*;

public class Persona {

    private Long id;
    private String dni;
    private String nombre;
    private Integer edad;


    // Constructor
    public Persona(Long id, String dni, String nombre, Integer edad) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }


    // Getter & Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    // toString
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}
