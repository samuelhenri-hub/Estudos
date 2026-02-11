package POO.Classes;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor da caneta:  " + this.cor);
        System.out.println("Ponta:  " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tamapada? " + this.tampada);
    }

    void escrever() {
        if (this.tampada == true) {
            System.out.println("Destampe antes de usar");
        } else {
            System.out.println("Escrevendo");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
