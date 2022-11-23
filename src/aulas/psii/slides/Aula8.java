/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.psii.slides;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Lauder
 */
public class Aula8 {

    public static void main(String[] args) {
        List<Casa> casas = new ArrayList<>();
        List<Object> objetos = new ArrayList<>();
        objetos.add("Olá");
        objetos.add(new Casa());

        List<List<Casa>> lista = new ArrayList<>();
        lista.add(casas);

        Map<String, String> map = new HashMap();
        map.put("chave", "valor");

        for (int i = 800; i > 792; i = i - 2) {
            Casa casa = new Casa("Branca", "Av. Brasil", i);
            casas.add(casa);
        }
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 2) {
            System.out.println("1 - Listar");
            System.out.println("2 - Encerrar");
            opcao = scan.nextInt();
            if (opcao == 1) {
                for (Casa casaAtual : casas) {
                    casaAtual.imprimirEnderecoCompleto();
                }
            }
        }

    }
}
