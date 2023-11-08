package com.jorge.companyapp;

public class CompanyExample {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Jorge");
        persona.setApellido("Gonzalez");
        persona.setNumeroFiscal("123456789");
        persona.setDireccion("Calle 1, 123");

        Cliente cliente = new Cliente();
        cliente.setNombre("Lina");
        cliente.setApellido("Gonzalez");
        cliente.setNumeroFiscal("987654321");
        cliente.setDireccion("Calle 2, 456");
        cliente.setClienteId(1213);

        Empleado empleado = new Empleado();
        empleado.setNombre("Santiago");
        empleado.setApellido("Franco");
        empleado.setNumeroFiscal("5454545454");
        empleado.setDireccion("Calle 3, 789");
        empleado.setEmpleadoId(123234);
        empleado.setSalario(1000);

        Gerente gerente = new Gerente();
        gerente.setNombre("Juan");
        gerente.setApellido("Perez");
        gerente.setNumeroFiscal("3673522342");
        gerente.setDireccion("Calle 4, 1011");
        gerente.setEmpleadoId(3454);
        gerente.setSalario(2000);
        gerente.setPresupuesto(10000);

        System.out.println(persona);
        System.out.println("==============================");
        System.out.println(cliente);
        System.out.println("==============================");
        System.out.println(empleado);
        System.out.println("==============================");
        System.out.println("Nuevo Salario:");
        empleado.aumentarSalario(10);
        System.out.println(empleado);
        System.out.println("==============================");
        System.out.println(gerente);
    }
}
