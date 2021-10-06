/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Gustavo Patricio
 */
public class Pessoa {
    
    private int identificacao;
    private String nome;

    public Pessoa(int identificacao, String nome) {
        this.identificacao = identificacao;
        this.nome = nome;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public String getNome() {
        return nome;
    }

}
