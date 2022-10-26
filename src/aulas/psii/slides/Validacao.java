/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.psii.slides;

/**
 *
 * @author Lauder
 */
public class Validacao {
    public boolean enderecoValido(String endereco){
        if(endereco.isEmpty() ||
                endereco.length() < 2){
            return false;
        }
        return true;
    }
}
