/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerra;

/**
 *
 * @author Erick Zarto
 * * @author Natalia Ruiz
 */
/**
 * Clase que representa a un troyano, un tipo de guerrero.
 * Los troyanos no pueden retirarse.
 */
public class Troyano extends Guerrero {

    /**
     * Constructor para crear un troyano con nombre, edad y fuerza.
     *
     * @param nombre El nombre del troyano.
     * @param edad La edad del troyano.
     * @param fuerza La fuerza del troyano.
     */
    public Troyano(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }

    /**
     * Constructor por defecto para crear un troyano sin parámetros.
     */
    public Troyano() {
        super();
    }

    /**
     * Constructor para crear un troyano a partir de otro guerrero y un nombre.
     *
     * @param guerrero El guerrero base.
     * @param nombre El nombre del troyano.
     */
    public Troyano(Guerrero guerrero, String nombre) {
        super(guerrero, nombre);
    }

    /**
     * Método que indica si el troyano debe retirarse.
     * Los troyanos no pueden retirarse, por lo que siempre devuelve falso.
     *
     * @return Siempre falso.
     */
    @Override
    protected boolean retirarse() {
        return false;
    }
}
