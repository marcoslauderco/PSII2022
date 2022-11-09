/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.psii.pkg2022;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lauder
 */
public class Bolo {
    public String sabor;
    public String formato;
    public int tamanhoEmCm;
    private Date dataDeFabricacao;
    private SimpleDateFormat formatador;
    private Date DataDevalidade;

    public Bolo() {
        this.formatador = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    public void baterOBolo(){
        System.out.println("O bolo de sabor "+sabor+" está sendo batido");
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }
    
    public String getDataDeFabricacaoFormatada(){
        if(this.dataDeFabricacao != null){
            return this.formatador.format(this.dataDeFabricacao);
        }
        return "";
    }
    
    public String getDataDeValidadeFormatada(){
        if(this.DataDevalidade != null){
            return this.formatador.format(this.DataDevalidade);
        }
        return "";
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dataDeFabricacao);
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        this.DataDevalidade = calendar.getTime();
    }
    
    public void setDataDeFabricacao(String dataDeFabricacao){
        try {
            setDataDeFabricacao(this.formatador.parse(dataDeFabricacao));
        } catch (ParseException ex) {
            String erro = ex.getMessage();
            System.out.println("Data em formato inválido: "+erro);
        }
    }
    
    
}
