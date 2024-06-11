/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerra;

/**
 *
 * @author Erick Zarto
 * @author Natalia Ruiz
 * 
 * Clase que representa a un guerrero griego.
 * Los griegos pueden retirarse si están heridos pero no muertos.
 */
public class Griego extends Guerrero {

    /**
     * Constructor para crear un guerrero griego con nombre, edad y fuerza.
     *
     * @param nombre El nombre del guerrero griego.
     * @param edad La edad del guerrero griego.
     * @param fuerza La fuerza del guerrero griego.
     */
    public Griego(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }

    /**
     * Constructor por defecto para crear un guerrero griego sin parámetros.
     */
    public Griego() {
        super();
    }

    /**
     * Constructor para crear un guerrero griego a partir de otro guerrero y un nombre.
     *
     * @param guerrero El guerrero base.
     * @param nombre El nombre del guerrero griego.
     */
    public Griego(Guerrero guerrero, String nombre) {
        super(guerrero, nombre);
    }

    /**
     * Método que indica si el guerrero griego debe retirarse.
     * Los griegos pueden retirarse si están heridos pero no muertos.
     *
     * @return Verdadero si el guerrero griego debe retirarse, falso en caso contrario.
     */
    @Override
    protected boolean retirarse() {
        return (herido && !muerto);
    }
}