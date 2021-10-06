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
public class Corretor extends Pessoa{

    private double taxaComissao;
    private double totalComissao;
    
    
    public Corretor(int identificacao, String nome, double taxaComissao) {
        super(identificacao, nome);
        this.taxaComissao = taxaComissao;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalComissao() {
        return totalComissao;
    }
    
    public void calcTotalComissao(double aluguel)
    {
    totalComissao += (aluguel / 100) * taxaComissao;
    }
    
    
    
    
}
