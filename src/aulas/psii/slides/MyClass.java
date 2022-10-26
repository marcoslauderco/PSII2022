/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.psii.slides;

/**
 *
 * @author Lauder
 */
public class MyClass {
    public static void main(String[] args) {
        Casa casa1 = new Casa();        
        casa1.setCorDaParede("Branca");
        casa1.setNumeroDoEndereco(1600);
        casa1.setLogradouro("aV. prof MARCOS");
        //imprimeEndereco("O endereço da Casa é ", casa1);;
        casa1.imprimirEnderecoCompleto("O endereço da casa é ");
        
        System.out.println("Predio");
        Predio predio = new Predio();
        predio.setCorDaParede("Azul");
        predio.setNumeroDoEndereco(255);
        predio.setLogradouro("R. Paulista");
        predio.setNomeDoPredio("Edificio Unicesumar");
        //imprimeEndereco("O endereço do Prédio é ", predio);
        predio.imprimirEnderecoCompleto("", "do Prédio");
     
    }
    
    public static void imprimeEndereco(String prefixo,
            Moradia moradia){
        System.out.println(prefixo
                + moradia.getEnderecoCompleto());
    }
}
