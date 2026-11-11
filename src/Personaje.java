public class Personaje {
//ATRIBUTOS
    private static final int VIDA_MAXIMA=100;
    private static final int POCIONES_INICIO=2;
    private static final int CURACION_POCION=30;

    private String nombre;
    private int vida;
    private int pociones;
//CONSTRUCTOR
    // Si siempre empiezan con la vida y pociones máximas/iniciales,
    // no hace falta pedirlas en los paréntesis del constructor:
    public Personaje(String nombre){
        this.nombre=nombre;
        this.vida=VIDA_MAXIMA;
        this.pociones=POCIONES_INICIO;

    }
    public void mostrarFicha(){
        System.out.println("Personaje: "+nombre);
        System.out.println("Vida: "+vida);
        System.out.println("Pociones: "+pociones);
        System.out.println();
    }
    public void recibirDanio(int cantidad){
        if (cantidad>0){
            vida=Math.max(0,vida-cantidad);
        }}

    public boolean usarPocion() {
        if (pociones == 0 || vida == VIDA_MAXIMA) {
            return false;
        }

        pociones--;
        vida = Math.min(VIDA_MAXIMA, vida + CURACION_POCION);
        return true;
    }

}



