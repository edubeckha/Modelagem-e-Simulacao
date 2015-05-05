/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoi.Modelo;

/**
 *
 * @author Eduardo
 */
public class Entidade {
    
    private int _tipo;
    private int _tempoEChegada;
    private int _tempoServico;
    private String _nome;
    
    
    public Entidade(int tipo, int tEChegada, int tServico, String nome){
        _tipo = tipo;
        _tempoEChegada = tEChegada;
        _tempoServico = tServico;
        _nome = nome;
    }
    public int getTipo(){
        return _tipo;
    }
    
    public int getTChegada(){
        return _tempoEChegada;
    }
     public int getTServico(){
        return _tempoServico;
    }
    public String getNome(){
        return _nome;
    }
    
    public void setaTipo(int tipo){
        _tipo = tipo;
    }

}
