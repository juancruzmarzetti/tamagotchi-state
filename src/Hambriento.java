public class Hambriento implements Estado{
    @Override
    public Estado comer() {return new Feliz();}

    @Override
    public Estado beber() {return new Triste();}

    @Override
    public Estado mimos() {return new Hambriento();}
}
