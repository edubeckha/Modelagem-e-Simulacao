/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoi.Utilitarios;

/**
 *
 * @author Eduardo
 */
public class Utilitarios {
    
    
    public double poisson(){
        double poisson = 0;
        int n = 0, p = 1, x = 0;
        double r = (0.8187) * ((0.2)/fatorial(x));
        return poisson;
    }
    
    public int fatorial(int numero){
        int fatorial = 1;
        while(numero != 0)
            fatorial *= numero--;
        return fatorial;
    }
    
    public double empirica_discreta(){
        double empirica_discreta = 0;
        return empirica_discreta;
    }
    public double uniforme(int min, int max){
        double uniforme = min + (max - min)*gerarNumeroRandomico(0, 1);
        return uniforme;
    }
    
    public double triangular(int min, int moda, int max){
        double triangular = 0;
        double r = gerarNumeroRandomico(0, 1);
        if(r <= ((moda - min)/(max - min)))
            triangular = min + (Math.sqrt(r*(moda - min)*(max - min)));
        else
            triangular = max - (Math.sqrt((1 - r)*(max - moda)*(max-min)));
        return triangular;
    }
   
    public double exponencial(int media){
        double exponencial = 0;
        exponencial = - Math.log(1 - gerarNumeroRandomico(0, 1));
        return exponencial;
    }
    
    public double normal(int media, int dp){
        double normal = 0;
        return normal;
    }
   
    public static double gerarNumeroRandomico(int max, int min){
        return Math.floor(Math.random() *(max-min)) + min;
    }
    
    public static void mostraMensagem(String mensagem){
        System.out.println(mensagem);
    }
    
}
