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
        Casa casa2 = new Casa();
        Casa casa3 = new Casa();
        
        casa1.setCorDaParede("Branca");
        casa1.setNumeroDoEndereco(1500);
        casa1.setNumeroDoEndereco(1600);
        
        System.out.println("O número do endereço é "+ casa1.getNumeroDoEndereco());
        
        casa2.setCorDaParede("Azul");
        
        
        casa1.abrirPortaoDaGaragem(8977);
    }
}
