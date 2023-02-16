package Entidades;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int edadMinima = 50;

        //declaracion de un array list
        ArrayList<Persona> candidatos = new ArrayList<Persona>();
        ArrayList<Empleado> personalSoft = new ArrayList<Empleado>();

        //Areglo que tendra los cargos para los empleados

        String[] cargos = {"Jefe", "Developer Intermediate", "Developer Junior", "Coordinador", "Director IT", "QA"};

        //Creamos personas para la lista de candidatos

        Persona p1 = new Persona(1, "1214721492", "Albus", "Severus", "Potter", "Weasley", "3115828192", "Medellin", 29);
        Persona p2 = new Persona(1, "1547896352", "James", "Sirius", "Potter", "Weasley", "3158456598", "Bogota", 58);
        Persona p3 = new Persona(1, "1020526987", "Hugo", null, "Granger", "Weasley", "3108529635", "Cali", 26);
        Persona p4 = new Persona(1, "1214721492", "Scorpius", null, "Malfoy", null, "3158524712", "Bucaramanga", 38);
        Persona p5 = new Persona(1, "1214721492", "Lily", "Luna", "Potter", "Weasley", "3205893614", "Santa Marta", 34);
        Persona p6 = new Persona(1, "1214721492", "Rose", null, "Granger", "Weasley", "323589635", "Cucuta", 21);

        //Añadir el elemento
        candidatos.add(p1);
        candidatos.add(p2);
        candidatos.add(p3);
        candidatos.add(p4);
        candidatos.add(p5);
        candidatos.add(p6);

        for (int i = 0; i < candidatos.size(); i++) {
            //Validamos la edad de los candidatos para crear una seleccion y agregar al grupo de PersonalSoft
            if (candidatos.get(i).getEdad() > edadMinima) {
                Empleado aux = new Empleado();
                aux.setTipoDocumento(candidatos.get(i).getTipoDocumento());
                aux.setNumeroDocumento(candidatos.get(i).getNumeroDocumento());
                aux.setPrimerNombre(candidatos.get(i).getPrimerNombre());
                aux.setSegundoNombre(candidatos.get(i).getSegundoNombre());
                aux.setPrimerApellido(candidatos.get(i).getPrimerApellido());
                aux.setSegundoApellido(candidatos.get(i).getSegundoApellido());
                aux.setTelefono(candidatos.get(i).getTelefono());
                aux.setDireccion(candidatos.get(i).getDireccion());
                aux.setEdad(candidatos.get(i).getEdad());

                personalSoft.add(aux);
            }
        }
        for (int i = 0; i < personalSoft.size(); i++) {
            //Generamos un numero aleatorio para comparar con el arreglo de los cargos
            int numeroArreglo = (int) (Math.random() * 6);
            personalSoft.get(i).setCargo(cargos[numeroArreglo]);
        }
        int value = 0;

        while (value < personalSoft.size()) {
            boolean valide = false;
            int exp = (int) (Math.random() * 20) + 1;

            if (valide) {
                personalSoft.get(value).generarExperiencia(valide, (exp + 1));
            } else {
                personalSoft.get(value).generarExperiencia(valide, (exp));
            }
            value++;
        }
        for (int i = 0; i < personalSoft.size(); i++) {
            personalSoft.get(i).mostrarDatos();

        }

    }

}