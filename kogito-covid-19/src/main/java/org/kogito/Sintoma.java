package org.kogito;

public class Sintoma {
    private String nombre;
    private Object valor;

    public Sintoma() {
    }

    public Sintoma(String nombre, Object data) {
        this.nombre = nombre;
        this.valor = data;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object data) {
        this.valor = data;
    }

}
