/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulas.psii.pkg2022;

import aulas.psii.slides.Predio;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lauder
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bolo bolo = new Bolo();
        bolo.sabor = "chocolate";
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Infome a data de Fabricação");
        String fabricacao = scan.nextLine();
        
        
        bolo.setDataDeFabricacao(fabricacao);
        System.out.println("O bolo foi fabricado em: "+
                bolo.getDataDeFabricacaoFormatada());
        System.out.println("O bolo vence em: "+
                bolo.getDataDeValidadeFormatada());
    }
    
    public static void trocaValor(Bolo parametro){
        parametro.sabor = "Morango";
    }
    
}
