/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package aulas.psii.slides;

/**
 *
 * @author Lauder
 */
public enum TipoDeConstrucao {
    ALVENARIA(1, "Alvenaria"),
    MADEIRA(2, "Madeira rustica"),
    STEEL_FRAME(3, "Steel Frame");
    
    private int id;
    private String label;

    private TipoDeConstrucao(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    
    
    
}
