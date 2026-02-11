package POO.Classes;

public class canetainta {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();

        caneta1.modelo = "Bic";
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 100;
        caneta1.tampada = true;

        caneta1.destampar();
        caneta1.tampar();
        caneta1.escrever();
        caneta1.status();
    }
}
