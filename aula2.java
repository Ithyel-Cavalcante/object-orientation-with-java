package cursoEmVideo.POO;

public class aula2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.7f;
        c1.carga = 70;
        c1.modelo = "bic";
        c1.tampada = false;
        
        c1.status();
    }
}
