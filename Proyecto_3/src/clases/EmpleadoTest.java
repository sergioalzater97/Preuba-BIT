package clases;

public class EmpleadoTest {

    public static void main(String[] args) {
        Empleado empleado_1 = new Empleado("Sergio", "Alzate", 3000000.0);
        Empleado empleado_2 = new Empleado("Alejandro", "Loaiza", 4000000.);

        System.out.println("El salario mensual de " + empleado_1.getNombre() + " " + empleado_1.getApellido() + " es: " + empleado_1.getSalarioMensual());
        System.out.println("El salario mensual de " + empleado_2.getNombre() + " " + empleado_2.getApellido() + " es: " + empleado_2.getSalarioMensual());

        double salarioAnual_1 = 0;
        double salarioAnual_2 = 0;
        
        double salarioNuevo_1 = empleado_1.getSalarioMensual() + empleado_1.getSalarioMensual() * 0.10;
        empleado_1.setSalarioMensual(salarioNuevo_1);
        
        double salarioNuevo_2 = empleado_2.getSalarioMensual() + empleado_2.getSalarioMensual() * 0.10;
        empleado_2.setSalarioMensual(salarioNuevo_2);
        
        salarioAnual_1 = empleado_1.getSalarioMensual()*12;
        salarioAnual_2 = empleado_2.getSalarioMensual()*12;
        
        System.out.println("El salario anual de " + empleado_1.getNombre() + " " + empleado_1.getApellido() + " es: " + salarioAnual_1);
        System.out.println("El salario anual de " + empleado_2.getNombre() + " " + empleado_2.getApellido() + " es: " + salarioAnual_2);

    }

}
