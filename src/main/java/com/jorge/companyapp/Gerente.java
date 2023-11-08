package com.jorge.companyapp;

public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente() {
    }

    public Gerente(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Gerente(double presupuesto, double salario, int empleadoId) {
        super(salario, empleadoId);
        this.presupuesto = presupuesto;
    }


    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPresupuesto: " + presupuesto;
    }
}
