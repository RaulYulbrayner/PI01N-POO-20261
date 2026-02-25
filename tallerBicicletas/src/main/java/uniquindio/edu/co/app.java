package uniquindio.edu.co;

import uniquindio.edu.co.model.Taller;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class app {

    public static void main(String[] args) {

        Taller taller = new Taller("Taller Yulbraynner", "2N", "12345");
        Taller taller1 = new Taller("Talleres", "5N", "123455678");
        Taller taller2 = new Taller("Honda", "14-21", "123hahah2");
        Taller taller3 = new Taller("Mazda", "10n", "123hhh45");
        Taller taller4 = new Taller("Kia", "10-222", "12345H");


        System.out.println(taller);
        System.out.println(taller1);
        System.out.println(taller2);
        System.out.println(taller3);
        System.out.println(taller4);

    }
}