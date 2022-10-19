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
public class Moradia {
    protected String corDaParede, portaDaFrente;
    protected String materialDoTelhado = "cêramica";
    protected int numeroDoEndereco;
    protected int codigoControle = 2355;
    
    public void abrirPortaoDaGaragem(int codigoControle){
        if(this.verificaCodigo(codigoControle)){
            System.out.println("Portão foi aberto com sucesso!");
        }else{
            System.out.println("Portão não abriu");
        }
    }
    
    protected boolean verificaCodigo(int codigoControle){
        if(this.codigoControle == codigoControle){
            return true;
        }
        return false;
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

    public int getNumeroDoEndereco() {
        return numeroDoEndereco;
    }

    public void setNumeroDoEndereco(int numeroDoEndereco) {
        this.numeroDoEndereco = numeroDoEndereco;
    }
    
    
}
