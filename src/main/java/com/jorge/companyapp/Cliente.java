package com.jorge.companyapp;

public class Cliente extends Persona{
    private int clienteId;

    public Cliente() {
    }

    public Cliente(int clienteId) {
        this.clienteId = clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nClienteId: " + clienteId;
    }
}
