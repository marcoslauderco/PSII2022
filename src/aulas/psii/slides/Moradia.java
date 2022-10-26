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
    protected String logradouro;
    
    public void imprimirEnderecoCompleto(){
        this.imprimirEnderecoCompleto("");
    }
    
    public void imprimirEnderecoCompleto(String prefixo){
        if(!prefixo.isBlank()){
            System.out.print(prefixo+" ");
        }
        System.out.println(getEnderecoCompleto());
    }
    
    public String imprimirEnderecoCompleto(int prefixo){
        System.out.println(getEnderecoCompleto());
        return "Olá";
    }
    
    public boolean imprimirEnderecoCompleto(String prefixo,
            String sulfixo){
        if(!prefixo.isBlank()){
            System.out.print(prefixo+" ");
        }
        System.out.println(getEnderecoCompleto() + sulfixo);
        return true;
    }
   

    public String getEnderecoCompleto(){
        return this.getLogradouro() 
                + " " 
                + this.getNumeroDoEndereco()
                + " Maringá PR ";
    }
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        Validacao validacao = new Validacao();
        if(validacao.enderecoValido(logradouro)){
            if(logradouro.toUpperCase().startsWith("AV.")){
                logradouro = logradouro.toLowerCase().replace("av. ", 
                        "Avenida ");
                String[] partes = logradouro.split(" ");
                String logradouroCamelCase = "";
                for (String item : partes) {
                    String primeiraLetra = Character.toString(item.charAt(0));
                    String restante = item.replaceFirst(primeiraLetra, "");
                    logradouroCamelCase = logradouroCamelCase
                            .concat(primeiraLetra.toUpperCase())
                            .concat(restante).concat(" ");
                }
                logradouro = logradouroCamelCase;
            }
            this.logradouro = logradouro;
        }else{
            System.out.println("Endereço inválido!");
        }
        
    }
    
    
    
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
