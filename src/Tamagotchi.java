public class Tamagotchi {
    private String nombre;
    private Estado estadoActual;

    public Tamagotchi(String nombre) {
        this.nombre = nombre;
        this.estadoActual = new Feliz();
    }


    public void darDeComer(){
        estadoActual = estadoActual.comer();
    };
    public void darDeBeber(){
        estadoActual = estadoActual.beber();
    };
    public void hacerMimos(){
        estadoActual = estadoActual.mimos();
    };
}
