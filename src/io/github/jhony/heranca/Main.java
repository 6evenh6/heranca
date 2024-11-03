package io.github.jhony.heranca;

public class Main {
    public static void main(String[] args) {
        Panda panda = new Panda();
        Hipopotamo hipopotamo = new Hipopotamo("Hipopotamojão");

        panda.setNome("Pangatinha");
        panda.setIdade(23);
        panda.setSexo('F');
        panda.setCor("Preto");
        panda.setCorSecundaria("Branco");

        hipopotamo.setNome("Hipopotomojão");
        hipopotamo.setIdade(23);
        hipopotamo.setSexo('M');
        hipopotamo.setForcaMordida(100);

        panda.imprimirDados();
        hipopotamo.imprimirDados();

    }

}
