/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoi.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class FilaPorPrioridade {
    
    private ArrayList<Entidade> _filaEntidades;
    private boolean _estadoFalha;
    
    public FilaPorPrioridade(){
          _filaEntidades = new ArrayList<>();
          _estadoFalha = false;
    }
    
    
    public void adicionarElemento(Entidade e){
        _filaEntidades.add(e);
    }
    
    public Entidade removerElemento(){
        return _filaEntidades.remove(0);
    }
    
    public void adicionarEntidadePorTempo(Entidade e){
        for(int i = 0; i < _filaEntidades.size(); i++){
            if(e.getTChegada() < _filaEntidades.get(i).getTChegada()){
                _filaEntidades.add(i, e);
                return;               
            }
            
        }
        _filaEntidades.add(e);       
    }
    
    public void mostrarFila(){
        for(int i = 0; i < _filaEntidades.size(); i++){
            System.out.println(_filaEntidades.get(i).getNome());
        }
    }
    public int tamanhoFila(){
        return _filaEntidades.size();
    }
}
