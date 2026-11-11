/**
 * Representa un personaje dentro del sistema de juego.
 *
 * @author JuanfranCR
 * @version 1.0
 */
public class Personaje {
//ATRIBUTOS
    /** Vida maxima permitida para el personaje.*/
    private static final int VIDA_MAXIMA=100;
    /** Puntos de vida que restaura cada poción. */
    private static final int POCIONES_INICIO=2;
    /** Puntos de vida que restaura cada poción. */
    private static final int CURACION_POCION=30;

    /** Nombre del personaje. */
    private String nombre;
    /** Puntos de vida actuales del personaje. */
    private int vida;
   /** Cantidad actual de pociones disponibles. */
    private int pociones;
//CONSTRUCTOR
    // Si siempre empiezan con la vida y pociones máximas/iniciales,
    // no hace falta pedirlas en los paréntesis del constructor:
    /**
     * Crea un nuevo personaje inicializando su vida al máximo y con el número base de pociones.
     *
     * @param nombre El nombre asignado al personaje.
     */
    public Personaje(String nombre){
        this.nombre=nombre;
        this.vida=VIDA_MAXIMA;
        this.pociones=POCIONES_INICIO;

    }
    /**
     * Muestra en la consola la ficha con los datos actuales del personaje (nombre, vida y pociones).
     */
    public void mostrarFicha(){
        System.out.println("Personaje: "+nombre);
        System.out.println("Vida: "+vida);
        System.out.println("Pociones: "+pociones);
        System.out.println();
    }
    /**
     * Reduce la vida del personaje según la cantidad de daño recibida.
     * La vida no descenderá por debajo de 0.
     *
     * @param cantidad Cantidad de puntos de daño a restar a la vida.
     */
    public void recibirDanio(int cantidad){
        if (cantidad>0){
            vida=Math.max(0,vida-cantidad);
        }}
    /**
     * Consume una poción para restaurar vida al personaje.
     * No se podrá usar si no quedan pociones o si la vida ya está al máximo.
     *
     * @return {@code true} si la poción fue consumida con éxito; {@code false} si no tenía pociones o tenía la vida al máximo.
     */

    public boolean usarPocion() {
        if (pociones == 0 || vida == VIDA_MAXIMA) {
            return false;
        }

        pociones--;
        vida = Math.min(VIDA_MAXIMA, vida + CURACION_POCION);
        return true;
    }

}


