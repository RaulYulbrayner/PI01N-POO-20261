package uniquindio.edu.co;

import uniquindio.edu.co.model.Empleado;
import uniquindio.edu.co.model.TipoEmpleado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Empleado empleado = new Empleado("Yulbraynner", 123, 314, 100, TipoEmpleado.ADMIN);
        System.out.println(empleado);
    }


}