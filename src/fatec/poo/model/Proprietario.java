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
public class Proprietario extends Pessoa{
    
    private String telefone;
    private double valorAluguel;

    public Proprietario(String telefone, int identificacao, String nome) {
        super(identificacao, nome);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    
    
}
