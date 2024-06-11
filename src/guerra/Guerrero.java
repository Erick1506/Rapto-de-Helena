/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guerra;

/**
 *
 * @author Erick Zarto
 *  @author Natalia Ruiz
 */
/**
 * Clase abstracta que representa a un guerrero.
 * Los guerreros tienen un nombre, edad, fuerza y estado de herida o muerte.
 */
public abstract class Guerrero {

    /**
     * Nombre del guerrero.
     */
    protected final String nombre;

    /**
     * Edad del guerrero (debe estar entre 15 y 60 años).
     */
    protected int edad;

    /**
     * Fuerza del guerrero (debe estar entre 1 y 10).
     */
    protected int fuerza;

    /**
     * Indica si el guerrero está herido.
     */
    protected boolean herido;

    /**
     * Indica si el guerrero está muerto.
     */
    protected boolean muerto;

    /**
     * Constructor para crear un guerrero con nombre, edad y fuerza.
     *
     * @param nombre El nombre del guerrero.
     * @param edad La edad del guerrero.
     * @param fuerza La fuerza del guerrero.
     */
    public Guerrero(String nombre, int edad, int fuerza) {
        this.nombre = nombre;
        this.edad = (edad >= 15 && edad <= 60) ? edad : 25;
        this.fuerza = (fuerza >= 1 && fuerza <= 10) ? fuerza : 5;
        this.herido = false;
        this.muerto = false;
    }

    /**
     * Constructor por defecto para crear un guerrero sin parámetros.
     */
    public Guerrero() {
        this("GuerreroX", 15, 1);
    }

    /**
     * Constructor para crear un guerrero a partir de otro guerrero y un nombre.
     *
     * @param guerrero El guerrero base.
     * @param nombre El nombre del guerrero.
     */
    public Guerrero(Guerrero guerrero, String nombre) {
        this.nombre = nombre;
        this.edad = guerrero.edad;
        this.fuerza = guerrero.fuerza;
        this.herido = guerrero.herido;
        this.muerto = guerrero.muerto;
    }

    /**
     * Obtiene el nombre del guerrero.
     *
     * @return El nombre del guerrero.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la edad del guerrero.
     *
     * @return La edad del guerrero.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Obtiene la fuerza del guerrero.
     *
     * @return La fuerza del guerrero.
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * Indica si el guerrero está herido.
     *
     * @return Verdadero si el guerrero está herido, falso en caso contrario.
     */
    public boolean Herido() {
        return herido;
    }

    /**
     * Indica si el guerrero está muerto.
     *
     * @return Verdadero si el guerrero está muerto, falso en caso contrario.
     */
    public boolean Muerto() {
        return muerto;
    }

    /**
     * Método abstracto que indica si el guerrero debe retirarse.
     *
     * @return Verdadero si el guerrero debe retirarse, falso en caso contrario.
     */
    protected abstract boolean retirarse();
}