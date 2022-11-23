/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.psii.slides;

import aulas.psii.pkg2022.Bolo;

/**
 *
 * @author Lauder
 */
public class Casa extends Moradia {

    private TipoDeConstrucao tipoDeConstrucao;
    private static String nomeDoProfessor = "Marcos";

    public Casa() {
        super(2354);
    }

    public Casa(String corDaParede, String logradouro, int numeroDoEndereco) {
        super(2353);
        this.setCorDaParede(corDaParede);
        this.setLogradouro(logradouro);
        this.setNumeroDoEndereco(numeroDoEndereco);
    }

    public void ligarLuzDaCozinha() {
        System.out.println("Luz da Cozinha ligada!");
    }

    public String tocarCampainha() {
        return "din-don";
    }

    public TipoDeConstrucao getTipoDeConstrucao() {
        return tipoDeConstrucao;
    }

    public void setTipoDeConstrucao(TipoDeConstrucao tipoDeConstrucao) {
        this.tipoDeConstrucao = tipoDeConstrucao;
    }

    @Override
    public void receberCarta() {
        System.out.println("A carta foi recebida por caixa de correio.");
    }
    
    public static void metodoEstaticoTeste(){
        System.out.println(nomeDoProfessor);
    }
    
}
