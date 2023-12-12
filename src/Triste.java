public class Triste implements Estado{
    @Override
    public Estado comer() {
        System.out.println("beep beep *muere*");
        return new Triste();
    }

    @Override
    public Estado beber() {
        System.out.println("beep beep BEEP *muere*");
        return new Triste();
    }

    @Override
    public Estado mimos() {
        return new Feliz();
    }
}
