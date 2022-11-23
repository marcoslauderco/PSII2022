/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.psii.slides;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lauder
 */
public class MyClass {
    public static void main(String[] args) {
        int valorA = 1;
        int valorB = 1;
        
        List<Casa> casas = new ArrayList<>();
        
        if(valorA == valorB){
            System.out.println("Os valores são iguais");
        }
        
        Casa casa1 = new Casa("Branca","aV. prof MARCOS",1600); 
        casa1.setTipoDeConstrucao(TipoDeConstrucao.ALVENARIA);
        System.out.println(casa1);
        casa1.imprimirEnderecoCompleto("Casa 1:");
        System.out.println("A casa foi construida com: " 
                + casa1.getTipoDeConstrucao());
        
        casas.add(casa1);
        casas.add(new Casa());
        
        Casa casa2 = new Casa();        
        casa2.setCorDaParede("Branca");
        casa2.setNumeroDoEndereco(1600);
        casa2.setLogradouro("aV. prof MARCOS");
        casa2.setTipoDeConstrucao(TipoDeConstrucao.STEEL_FRAME);
        System.out.println(casa2.toString());
        casa2.imprimirEnderecoCompleto("Casa 2:");
        System.out.println("A casa foi construida com: " 
                + casa2.getTipoDeConstrucao().getLabel());
        
        if(casa1.equals(casa2)){
            System.out.println("As casas são iguais");
        }else{
            System.out.println("As casas são diferentes");
        }
        
        System.out.println("Predio");
        Predio predio = new Predio();
        predio.setCorDaParede("Azul");
        predio.setNumeroDoEndereco(255);
        predio.setLogradouro("R. paulista");
        predio.setNomeDoPredio("edificio UNIcesumar");
        //imprimeEndereco("O endereço do Prédio é ", predio);
        predio.imprimirEnderecoCompleto("", "do Prédio");
        
        casa1.abrirPortaoDaGaragem(2353);
        casa2.abrirPortaoDaGaragem(2354);
        predio.abrirPortaoDaGaragem(2355);
        
        casa1.receberCarta();
        predio.receberCarta();
        
        Casa.metodoEstaticoTeste();
     
    }
    
    public static void imprimeEndereco(String prefixo,
            Moradia moradia){
        System.out.println(prefixo
                + moradia.getEnderecoCompleto());
    }
}
