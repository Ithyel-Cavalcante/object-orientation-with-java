package creatingCharacters;

import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    void status(){
        System.out.format("Personagem: %s com lvl %d e %d de força \n", this.nome, this.nivel, this.forca);


    }
    int calculoDano () {
        Random num = new Random();

        int dado = 1 + num.nextInt(19);
        int dano = forca + dado;

        return dano;

    }
    void atacar(String alvo, String habilidade){
        int danoCausado = calculoDano();

        if(habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano \n", nome, alvo, danoCausado);
        } else {
            System.out.format("%s atacou %s e causou %d de dano com %s\n", nome, alvo, danoCausado, habilidade);
        }


    }
}

