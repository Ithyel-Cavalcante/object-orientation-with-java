package creatingCharacters;

public class app {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();

        heroi.nome = "ivzin";
        heroi.nivel = 20;
        heroi.forca = 10;
        //Personagem: <nome> com lvl <nivel> e <forca> de força


        heroi.status();
        heroi.atacar("goblin", "espinhos de gelo");
    }
}