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
public class Sistema {
    private int _tipo;
    private FilaPorPrioridade _servidor1, _servidor2;
    
    public Sistema(){
        _servidor1 = new FilaPorPrioridade();
        _servidor2 = new FilaPorPrioridade();
    }
    
    public void adicionaEntidadeComBaseNoTipo(Entidade e){
        if(e.getTipo() == 1){
            _servidor1.adicionarEntidadePorTempo(e);
            return;
        }
            _servidor2.adicionarEntidadePorTempo(e);
    }
}
