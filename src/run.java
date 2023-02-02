public class run {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        m.emitirSom();

        Cachorro c = new Cachorro();

        c.emitirSom();
        c.reagir(true);
        c.reagir("Olá");
    }
}
