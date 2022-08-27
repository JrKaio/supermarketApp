/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spr;

/**
 *
 * @author KAIO
 */
public class SPR {

   
    private String desc;
    private String marca;
    private int qtd;
    private double preco;
    private static int qtdeProdutos = 0;
    private double total;
 
    
    // Método Construtor
    public SPR(String des, String ma, int q, double p){
        desc = des;
        marca = ma;
        qtd = q;
        preco = p;
        qtdeProdutos++;}
        
    
    // Setter
    public void setAno(int q){
        qtd = q;
    }
   
    
    public static int getQtdeProdutos(){
        return qtdeProdutos;
    }
    public double getTotal()
    {
    return preco * qtd;
    }
    public double getPreco(){
        return preco;
    }

    
    

    
    
}
