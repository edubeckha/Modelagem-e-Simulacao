/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoi.Modelo;

import trabalhoi.Utilitarios.Utilitarios;

/**
 *
 * @author Eduardo
 */
public class Sistema {
    private Servidor _servidor1, _servidor2;
    private FilaPorPrioridade _filaEspera;
    public Sistema(){
        _servidor1 = new Servidor(1);
        _servidor2 = new Servidor(2);
        _filaEspera = new FilaPorPrioridade();
    }
    
    public void adicionaEntidadeComBaseNoTipo(Entidade e){
     Servidor tmp = e.getTipo() == 1 ? _servidor1 : _servidor2;
     Servidor complemento = e.getTipo() == 1 ? _servidor2 : _servidor1;

     if(!tmp.alocarEntidadeServidor(e)){
         if(!complemento.alocarEntidadeServidor(e))
             _filaEspera.adicionarElemento(e);     
     }
    }
}
