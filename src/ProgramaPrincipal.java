import java.util.*;

import static java.lang.System.in;

public class ProgramaPrincipal {

    private static Map<Long,Persona> mapId = new HashMap<>();
    private static Map<String,Persona> mapNombre = new HashMap<>();
    private static Map<String,Persona> mapDni = new HashMap<>();

    static List<Persona> personaList = new ArrayList<>();


    public static void main (String[] args) {

        CrearPersona();

        ConsultarPersona();

    }


    private static void ConsultarPersona() {

        Scanner sc = new Scanner(in); // Para leer nombre, en vez de incluir "System.in", se incluye solo "in"

        /*
        for (int pos = 0 ; pos < personaList.size() ; pos++) {

            System.out.println("Nombre: " + personaList.get(pos));

        }
        */

        while (true) {

            System.out.println("Por que campo quieres filtrar?: ");
            System.out.println("1. Id");
            System.out.println("2. Nombre");
            System.out.println("3. DNI");
            System.out.println("4. Salir\n");
            int filtro = sc.nextInt();

            bucle:

            switch (filtro) {

                case 1:

                    System.out.println("Introduce el ID que quieres buscar: ");
                    Long numero = sc.nextLong();
                    Persona personaId = mapId.get(numero);

                    if (personaId != null) {

                        System.out.println(personaId);

                    } else {

                        System.out.println("El ID no existe");
                    }

                    break;

                case 2:

                    System.out.println("Introduce el nombre que quieres buscar: ");
                    String cadenaNombre = sc.next();
                    Persona personaNombre = mapNombre.get(cadenaNombre);

                    if (personaNombre != null) {

                        System.out.println(personaNombre);

                    } else {

                        System.out.println("El nombre no existe");
                    }

                    break;

                case 3:

                    System.out.println("Introduce el DNI que quieres buscar: ");
                    String cadenaDni = sc.next();
                    Persona personaDni = mapDni.get(cadenaDni);

                    if (personaDni != null) {

                        System.out.println(personaDni);

                    } else {

                        System.out.println("El DNI no existe");
                    }

                    break;

                case 4:

                    break bucle;
/*
                default:

                    System.out.println("OPCION INCORRECTA!");
                    break;
*/
            }

        }

    }

    private static void CrearPersona() {

        Persona persona1 = new Persona(1L, "Sergio", "11111111A", 21); // 1L significa que es un numero "1" del tipo Long
        personaList.add(persona1);

        mapId.put(persona1.getId(), persona1);
        mapNombre.put(persona1.getNombre(), persona1);
        mapDni.put(persona1.getDni(), persona1);

        Persona persona2 = new Persona(2L, "Jaime", "22222222B", 24);
        personaList.add(persona2);

        mapId.put(persona2.getId(), persona2);
        mapNombre.put(persona2.getNombre(), persona2);
        mapDni.put(persona2.getDni(), persona2);

        Persona persona3 = new Persona(3L, "Laura", "33333333C", 28);
        personaList.add(persona3);

        mapId.put(persona3.getId(), persona3);
        mapNombre.put(persona3.getNombre(), persona3);
        mapDni.put(persona3.getDni(), persona3);

        Persona persona4 = new Persona(4L, "Carmen", "44444444D", 35);
        personaList.add(persona4);

        mapId.put(persona4.getId(), persona4);
        mapNombre.put(persona4.getNombre(), persona4);
        mapDni.put(persona4.getDni(), persona4);

        Persona persona5 = new Persona(5L, "Paco", "55555555E", 45);
        personaList.add(persona5);

        mapId.put(persona5.getId(), persona5);
        mapNombre.put(persona5.getNombre(), persona5);
        mapDni.put(persona5.getDni(), persona5);

    }

}
