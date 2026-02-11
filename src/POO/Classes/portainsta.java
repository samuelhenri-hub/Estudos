package POO.Classes;

public class portainsta {
    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.cor = "Marrom";
        porta.material = "Madeira";
        porta.altura = 1.70f;
        porta.aberta = false;
        porta.trancada = true;

        porta.destrancar();
        porta.abrir();
        porta.status();
    }
}
