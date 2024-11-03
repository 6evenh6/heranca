package io.github.jhony.heranca;

public class Animal {
    private String nome;
    private int idade;
    private char sexo;

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void andar(){
        System.out.println("Animal andando...");
    }
    public void comer(){
        System.out.println("Animal comendo...");
    }
    public void dormir(){
        System.out.println("Animal dormindo...");
    }

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nSexo: " + this.sexo);
    }
}
