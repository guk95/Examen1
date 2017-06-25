package Model;

public class Jugador {

    private String nombre;
    private int edad;
    private String posicion;
    private String pais;

    public Jugador(String nombre, int edad, String posicion, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.pais = pais;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
