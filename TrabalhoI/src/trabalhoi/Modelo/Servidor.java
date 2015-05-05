/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoi.Modelo;

import trabalhoi.Utilitarios.Constantes;
import trabalhoi.Utilitarios.Utilitarios;

public class Servidor {
    
    private FilaPorPrioridade _fila;
    private Entidade _entidadeExecutando;
    private final int _tipo;
    private int tempoFalha;
    boolean estadoOcupado, estadoFalha;
    
    public Servidor(int tipo){
        _tipo = tipo;
        _fila = new FilaPorPrioridade();
    }
    
    public boolean estaOcupado(){
        return estadoOcupado;
    }
    
    public void setarEstado(boolean eocupado){
        estadoOcupado = eocupado;
    }
    public boolean apresentaFalha(){
        return estadoFalha = (Utilitarios.gerarNumeroRandomico(10, 0) <= 2);
    }
    
    public boolean alocarEntidadeServidor(Entidade e){
        if(apresentaFalha()){
            Utilitarios.mostraMensagem(_tipo == 1 ? Constantes.servidorComFalha1 : Constantes.servidorComFalha2);
            estadoFalha = true;
            return false;
        }
        if(estadoOcupado){
          Utilitarios.mostraMensagem(Constantes.servidorOcupado);
          e.setaTipo(_tipo);
         _fila.adicionarElemento(e);
         return true;
        }
         Utilitarios.mostraMensagem(_tipo == 1 ?  e.getNome()+ ": " + Constantes.entidadeExecutando1 : e.getNome()+ ": " + Constantes.entidadeExecutando2);
        _entidadeExecutando = e;
        e.setaTipo(_tipo);
        estadoOcupado = true;
        return true;      
    }
    
    public FilaPorPrioridade filaAssociada(){
        return _fila;
    }
    
    
}
