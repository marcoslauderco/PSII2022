/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.psii.slides;

/**
 *
 * @author Lauder
 */
public abstract class Util{

    public static String paraCamelCase(String texto) {
        texto = texto.toLowerCase();
        String[] partes = texto.split(" ");
        String camelCase = "";
        //for (int i = 0; i < partes.length; i++){;;
        //String parte = partes[i]; 
        for (String parte : partes) {
            char primeiraLetra = parte.charAt(0);
            String stringPrimeira = Character.toString(primeiraLetra);
            String restante = parte.substring(1);
            camelCase = camelCase.concat(stringPrimeira.toUpperCase())
                    .concat(restante).concat(" ");
        }
        return camelCase;
    }
}
