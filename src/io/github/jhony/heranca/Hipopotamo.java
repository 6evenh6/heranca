package io.github.jhony.heranca;

public class Hipopotamo extends Animal{
    private int forcaMordida;

    public Hipopotamo(String nome){
        super.setNome(nome);
    }

    public void ficarNaAgua(){
        System.out.println("Hipopotamo entrando na agua...");
    }
    public int getForcaMordida() {
        return forcaMordida;
    }
    public void setForcaMordida(int forcaMordida) {
        this.forcaMordida = forcaMordida;
    }
}
