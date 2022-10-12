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
public class Casa {
    private String corDaParede, portaDaFrente;
    private String materialDoTelhado = "cêramica";
    private int numeroDoEndereco;
    private int codigoControle = 2355;

    public Casa() {
        Bolo novoBolo = new Bolo();
    }
    
    public void abrirPortaoDaGaragem(int codigoControle){
        if(this.verificaCodigo(codigoControle)){
            System.out.println("Portão foi aberto");
        }else{
            System.out.println("Portão não abriu");
        }
    }
    
    private boolean verificaCodigo(int codigoControle){
        if(this.codigoControle == codigoControle){
            return true;
        }
        return false;
    }
    
    public void ligarLuzDaCozinha(){
        System.out.println("Luz da Cozinha da casa de cor "+this.corDaParede+" ligada!");
    }
    
    public String tocarCampainha(){
        return "din-don";
    }
    
    public void setNumeroDoEndereco(int numeroDoEndereco){
        if(this.numeroDoEndereco == 0){
            this.numeroDoEndereco = numeroDoEndereco;
        }
    }
    
    public int getNumeroDoEndereco(){
        return this.numeroDoEndereco;
    }

    public String getCorDaParede() {
        return corDaParede;
    }

    public void setCorDaParede(String corDaParede) {
        this.corDaParede = corDaParede;
    }

    public String getPortaDaFrente() {
        return portaDaFrente;
    }

    public void setPortaDaFrente(String portaDaFrente) {
        this.portaDaFrente = portaDaFrente;
    }

    public String getMaterialDoTelhado() {
        return materialDoTelhado;
    }

    public void setMaterialDoTelhado(String materialDoTelhado) {
        this.materialDoTelhado = materialDoTelhado;
    }
    
    
}
