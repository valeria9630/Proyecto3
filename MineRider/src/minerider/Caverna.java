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
public class Caverna {

    private int tamano;
    private String tipo;
    private int visibilidad;
    private String estadoCasilla;
    private String elementos;

    public Caverna() {
    }

    public Caverna(int tamano, String tipo, int visibilidad, String estadoCasilla, String elementos) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.visibilidad = visibilidad;
        this.estadoCasilla = estadoCasilla;
        this.elementos = elementos;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(int visibilidad) {
        this.visibilidad = visibilidad;
    }

    public String getEstadoCasilla() {
        return estadoCasilla;
    }

    public void setEstadoCasilla(String estadoCasilla) {
        this.estadoCasilla = estadoCasilla;
    }

    public String getElementos() {
        return elementos;
    }

    public void setElementos(String elementos) {
        this.elementos = elementos;
    }

    @Override
    public String toString() {
        return "Caverna{" + "tamano=" + tamano + ", tipo=" + tipo + ", visibilidad=" + visibilidad + ", estadoCasilla=" + estadoCasilla + ", elementos=" + elementos + '}';
    }

}
