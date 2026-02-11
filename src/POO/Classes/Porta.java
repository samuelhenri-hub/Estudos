package POO.Classes;

public class Porta {
    String material;
    String cor;
    float altura;
    boolean trancada;
    boolean aberta;

    void status() {
        System.out.println("Material: " + this.material);
        System.out.println("Cor: " + this.cor);
        System.out.println("ALtura: " + this.altura);
        System.out.println("Trancada: " + this.trancada);
        System.out.println("Aberta: " + this.aberta);
    }

    void trancar() {
        this.trancada = true;
    }

    void destrancar() {
        this.trancada = false;
    }

    void abrir() {
        if (this.trancada == true) {
            System.out.println("Destranque a porta");
        } else {
            System.out.println("Porta aberta");
        }
    }

}
