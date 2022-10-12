/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.psii.slides;

/**
 *
 * @author Lauder
 */
public class Casa {
    String corDaParede, portaDaFrente;
    String materialDoTelhado = "cêramica";
    int numeroDoEndereco;
    
    public void abrirPortaoDaGaragem(int codigoControle){
        System.out.println("Abrindo o portal com o código: "+codigoControle);
    }
    
    public void ligarLuzDaCozinha(){
        System.out.println("Luz da Cozinha da casa de cor "+this.corDaParede+" ligada!");
    }
    
    public String tocarCampainha(){
        return "din-don";
    }
}
