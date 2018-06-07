/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minerider;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Heroina {
    private String direccion;
    private String salto;
    private char espada;
    private char látigo;
    private char pala;

    public Heroina() {
    }

    public Heroina(String direccion, String salto, char espada, char látigo, char pala) {
        this.direccion = direccion;
        this.salto = salto;
        this.espada = espada;
        this.látigo = látigo;
        this.pala = pala;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSalto() {
        return salto;
    }

    public void setSalto(String salto) {
        this.salto = salto;
    }

    public char getEspada() {
        return espada;
    }

    public void setEspada(char espada) {
        this.espada = espada;
    }

    public char getLátigo() {
        return látigo;
    }

    public void setLátigo(char látigo) {
        this.látigo = látigo;
    }

    public char getPala() {
        return pala;
    }

    public void setPala(char pala) {
        this.pala = pala;
    }

    @Override
    public String toString() {
        return "Heroina{" + "direccion=" + direccion + ", salto=" + salto + ", espada=" + espada + ", l\u00e1tigo=" + látigo + ", pala=" + pala + '}';
    }
     
}
