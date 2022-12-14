/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.psii.slides;

/**
 *
 * @author Lauder
 */
public class Predio extends Moradia{
    private int numeroDeApartamentos;
    private String nomeDoPredio;
    
    public void receberCarta() {
        System.out.println("A carta foi recebida pelo porteiro.");
    }

    public Predio() {
        super();
    }

    public Predio(int numeroDeApartamentos, String nomeDoPredio) {
        this.numeroDeApartamentos = numeroDeApartamentos;
        this.nomeDoPredio = nomeDoPredio;
    } 
    
    public String getEnderecoCompleto(){
        return super.getEnderecoCompleto()
                + " - "
                + this.getNomeDoPredio();
    }

    public String getNomeDoPredio() {
        return nomeDoPredio;
    }

    public void setNomeDoPredio(String nomeDoPredio) {
        this.nomeDoPredio = Util.paraCamelCase(nomeDoPredio);
    }
    
    
    
    public void interfonar(int numeroDoPartamento){
        System.out.println("Você interfonou para o ap: "+numeroDoPartamento);
    }
    
    public void abrirPortaoDosFundos(int codigoControle){
        if(this.verificaCodigo(codigoControle)){
            System.out.println("Portão dos Fundos foi aberto");
        }else{
            System.out.println("Portão dos Fundos não abriu");
        }
    }

    public int getNumeroDeApartamentos() {
        return numeroDeApartamentos;
    }

    public void setNumeroDeApartamentos(int numeroDeApartamentos) {
        this.numeroDeApartamentos = numeroDeApartamentos;
    }
    
    
}
