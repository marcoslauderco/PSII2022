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
        casa1.abrirPortaoDaGaragem(2355);
        casa1.ligarLuzDaCozinha();
        
        System.out.println("Predio");
        Predio predio = new Predio();
        predio.setCorDaParede("Azul");
        predio.setNumeroDoEndereco(255);
        predio.abrirPortaoDaGaragem(2355);
        predio.interfonar(105);
        predio.abrirPortaoDosFundos(2355);
        
        System.out.println("Mansao");
        Mansao mansaoDoProfessor = new Mansao();
        mansaoDoProfessor.setCorDaParede("Vermelho");
        mansaoDoProfessor.setNumeroDoEndereco(899);
        mansaoDoProfessor.abrirPortaoDaGaragem(2355);
        mansaoDoProfessor.ligarLuzDaCozinha();
        
     
    }
}
