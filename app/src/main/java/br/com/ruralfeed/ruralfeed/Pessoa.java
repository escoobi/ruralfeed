package br.com.ruralfeed.ruralfeed;

public class Pessoa {
    public Pessoa() {
    }

    public String nome;
    public String email;
    public String senha;

    public Pessoa(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}
