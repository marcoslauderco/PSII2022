/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulas.psii.pkg2022;

/**
 *
 * @author Lauder
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.sabor = new String("Chocolate Meio-Amargo");
        boloDeChocolate.formato = "quadrado";
        boloDeChocolate.tamanhoEmCm = 15;
        
        boloDeChocolate.baterOBolo();
        
        Bolo boloDeMorango = new Bolo();
        boloDeMorango.sabor = "Morango 2";
        boloDeMorango.baterOBolo();
    }
    
}
