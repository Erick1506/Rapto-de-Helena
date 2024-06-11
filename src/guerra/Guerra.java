/*/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guerra;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * * @author Erick Zarto
 * * @author Natalia Ruiz
 * 
 * La clase principal que simula una guerra entre griegos y troyanos.
 * Genera guerreros de ambos bandos y los enfrenta en una serie de combates.
 * El juego continúa hasta que los troyanos rescaten a Helena o los griegos ganen.
 * 
 * @version 1.0
 * @since 2024-06-10
 */
public class Guerra {

    /**
     * El método principal que ejecuta la simulación de la guerra.
     * Genera ejércitos, simula combates y determina el resultado.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int numCombate = 1;
        int continuar = 0;

        do {
            // Crear ejércitos de griegos y troyanos
            Guerrero[] ejercitoGriegos = new Guerrero[5];
            Guerrero[] ejercitoTroyanos = new Guerrero[5];

            // Nombres aleatorios para los guerreros
            String[] nombres = {"Achilles", "Hector", "Odysseus", "Agamemnon", "Paris", "Helen", "Andromache", "Cassandra", "Priam", "Menelaus"};
            for (int i = 0; i < 5; i++) {
                ejercitoGriegos[i] = new Griego(nombres[rand.nextInt(nombres.length)], rand.nextInt(46) + 15, rand.nextInt(10) + 1);
                ejercitoTroyanos[i] = new Troyano(nombres[rand.nextInt(nombres.length)], rand.nextInt(46) + 15, rand.nextInt(10) + 1);
            }

            // Simular el enfrentamiento (batalla)
            boolean helenaRescatada = false; // Bandera para indicar si los troyanos rescataron a Helena
            while (!helenaRescatada) {
                for (int i = 0; i < ejercitoGriegos.length; i++) {
                    Guerrero guerreroGriego = ejercitoGriegos[i];
                    Guerrero guerreroTroyano = ejercitoTroyanos[i];

                    int ataqueGriego = rand.nextInt(10) + 1;
                    int ataqueTroyano = rand.nextInt(10) + 1;

                    System.out.println("\nCombate #" + numCombate);
                    System.out.println("Ataque del Troyano " + guerreroTroyano.getNombre() + ": " + ataqueTroyano);
                    System.out.println("Ataque del Griego " + guerreroGriego.getNombre() + ": " + ataqueGriego);

                    // Lógica para calcular daño y estado del guerrero
                    if (guerreroGriego.getFuerza() > ataqueTroyano) {
                        guerreroGriego.fuerza -= ataqueTroyano;
                    } else {
                        guerreroGriego.fuerza = 0;
                        guerreroGriego.herido = true;
                    }

                    if (guerreroTroyano.getFuerza() > ataqueGriego) {
                        guerreroTroyano.fuerza -= ataqueGriego;
                    } else {
                        guerreroTroyano.fuerza = 0;
                        guerreroTroyano.herido = true;
                    }

                    // Mostrar resultado
                    if (guerreroGriego.Muerto()) {
                        System.out.println("El Griego " + guerreroGriego.getNombre() + " ha muerto.");
                    }

                    if (guerreroTroyano.Muerto()) {
                        System.out.println("El Troyano " + guerreroTroyano.getNombre() + " ha muerto.");
                    }

                    numCombate++;
                }

                // Comprobar si los troyanos rescataron a Helena
                int troyanosVivos = 0;
                for (Guerrero guerrero : ejercitoTroyanos) {
                    if (!guerrero.Muerto()) {
                        troyanosVivos++;
                    }
                }

                if (troyanosVivos > 0) {
                    helenaRescatada = true;
                }
            }

            // Indicar cuál bando ganó
            int griegosVivos = 0;
            for (Guerrero guerrero : ejercitoGriegos) {
                if (!guerrero.Muerto()) {
                    griegosVivos++;
                }
            }

            if (griegosVivos == 0) {
                System.out.println("¡Los troyanos ganaron, rescataron a Helena!");
            } else {
                System.out.println("¡Los griegos ganaron, Helena sigue secuestrada!");
            }

            continuar = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres intentar de nuevo?\n1. Sí\n2. No"));
        } while (continuar == 1);
    }
}
