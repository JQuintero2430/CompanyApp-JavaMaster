package com.jorge.companyapp;

public class Empleado extends Persona{
    private double salario;
    private int empleadoId;

    public Empleado() {
    }

    public Empleado(double salario, int empleadoId) {
        this.salario = salario;
        this.empleadoId = empleadoId;
    }
    public Empleado(double salario, int empleadoId, String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.salario = salario;
        this.empleadoId = empleadoId;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public double getSalario() {
        return salario;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarSalario(int porcentaje){
        salario = salario + (salario * porcentaje / 100);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSalario: " + salario +
                "\nEmpleadoId: " + empleadoId;
    }
}
