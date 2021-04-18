package ejercicioII;

import ejercicioII.Herencia.*;

public class Main {
    public static void main(String[] args) {
/*
        Persona[] estudiantes = new Estudiante[4];
        estudiantes[0]= new Estudiante(35478250, "Matias", "Perez", "matip@gmail.com",
                "direccion 234", 2019, 2500F, "Programacion");
        estudiantes[1]= new Estudiante(35698252, "Maria", "Pellegrini", "mariap@gmail.com",
                "direccion 22", 2019, 2500F, "Programacion");
        estudiantes[2]= new Estudiante(36985754, "Marina", "Peralta", "marinap@gmail.com",
                "direccion 5413", 2019, 2500F, "Programacion");
        estudiantes[3]= new Estudiante(35687495, "Mercedes", "Paff", "mercep@gmail.com",
                "direccion 564", 2019, 2500F, "Programacion");

        for (Persona p : estudiantes) {
            System.out.println(p));
        }

       Persona[] personaStaff = new Staff[4];
        personaStaff[0] = new Staff(35478250, "Matias", "Perez", "matip@gmail.com",
                "direccion 234", 58000F, "mañana");
        personaStaff[1] = new Staff(35478250, "Matias", "Perez", "matip@gmail.com",
                "direccion 234", 58000F, "mañana");
        personaStaff[2] = new Staff(35478250, "Matias", "Perez", "matip@gmail.com",
                "direccion 234", 58000F, "mañana");
        personaStaff[3] = new Staff(35478250, "Matias", "Perez", "matip@gmail.com",
                "direccion 234", 58000F, "mañana");

        for (Persona p : personaStaff) {
            System.out.println(p));
        }


        */

        Persona[] personas = new Persona[8];
        personas[0]= new Estudiante(35478250, "Matias", "Perez", "matip@gmail.com",
                "direccion 234", 2019, 2500F, "Programacion");
        personas[1]= new Estudiante(35698252, "Maria", "Pellegrini", "mariap@gmail.com",
                "direccion 22", 2019, 2500F, "Programacion");
        personas[2]= new Estudiante(36985754, "Marina", "Peralta", "marinap@gmail.com",
                "direccion 5413", 2019, 2500F, "Programacion");
        personas[3]= new Estudiante(35687495, "Mercedes", "Paff", "mercep@gmail.com",
                "direccion 564", 2019, 2500F, "Programacion");
        personas[4] = new Staff(35478250, "Matias", "Perez", "matip@gmail.com",
                "direccion 234", 58000F, "mañana");
        personas[5] = new Staff(35478250, "Matias", "Perez", "matip@gmail.com",
                "direccion 234", 58000F, "mañana");
        personas[6] = new Staff(35478250, "Matias", "Perez", "matip@gmail.com",
                "direccion 234", 58000F, "mañana");
        personas[7] = new Staff(35478250, "Matias", "Perez", "matip@gmail.com",
                "direccion 234", 58000F, "mañana");

       float ingresoMensual = 0, sueldoMensual=0;

        for (Persona p : personas){
            if(p instanceof Estudiante){
                System.out.println("ESTUDIANTE: " + p);
                ingresoMensual += ((Estudiante) p).getCuotaMensual();
            }else {
                System.out.println("STAFF : "+ p);
                sueldoMensual += ((Staff) p).getSalarioMensual();
            }
        }

        System.out.println("Total de ingresos por cuotas este mes: $" + ingresoMensual);
        System.out.println("Total de sueldos a pagar este mes: $" + sueldoMensual);



    }
}
