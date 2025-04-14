package br.projeto.rpg;

import br.projeto.rpg.UI.UI;

public class Main {
    public static void main(String[] args) {

        iniciarJogo();

    }

    public static void iniciarJogo() {
        UI ui = new UI();
        ui.telaInicial();
    }
}