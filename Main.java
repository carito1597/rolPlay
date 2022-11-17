import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        inicio();
    }

    static void inicio(){
        try {
            accion1();
        } catch (Exception e) {
            System.out.println("Hubo un error al ingresar la opcion. La historia comenzara de nuevo");
        }
    }
    static void accion1(){
        int op;
        System.out.println("Contexto de la historia: ");
        System.out.println("Eres una mujer de media edad con 2 hijos y un maravilloso esposo que te " +
                "mantiende. \nTu unica responsabilidad es el cuidado de los ninos y el tuyo. \n \n" +
                "Un dia llega a tu casa un paquete misterioso. Lo abres y resulta ser evidencia irrefutable sobre la infidelidad de tu marido.\n" +
                "Estas muy confundida por la situacion y ahora debes decidir como actuar: ");
        System.out.println("1. Llamar a mejor amiga para pedir consejo\n" +
                "2. Contactar un abogado \n" +
                "3. Subir a tu habitacion y esperar a que tu marido llegue para hablar con el\n" +
                "Elija una opcion: ");
        op = input.nextInt();
        if(op == 1){
            llamarAmiga();
        }else if (op == 2){
            llamarAbogado();
        } else if (op==3) {
            enfrentarMarido();
        } else {
            accion1();
        }
    }
    static void llamarAmiga(){
        System.out.println("\n\nTu amiga te da consuelo y te dice que deberias ir al psicologo o hacer asesorar con un abogado.\n" +
                "Tienes que decidir que hacer\n" +
                "1. Ir con el psicologo\n" +
                "2. Llamar a tu abogado\n" +
                "Elija una opcion:" );
        int op;
        op = input.nextInt();
        if(op == 1){
            irConPsicologo();
        }else if (op == 2){
            llamarAbogado();
        } else {
            llamarAmiga();
        }

    }
    static void irConPsicologo(){
        System.out.println("\n\nTomas terapia y el psicologo te dice que te puede derivar con un psiquiatra para que te de\n" +
                "medicacion o continuar con terapias diarias.\n" +
                "Tienes que decidir que hacer\n" +
                "1. Ignorar al psicologo y perdonar la infidelidad de tu marido\n" +
                "2. Ir con el psiquiatra para tener medicacion\n" +
                "3. Continuar con las terapias diarias.\n" +
                "Elija una opcion:" );
        int op;
        op = input.nextInt();
        if(op == 1){
            finalContinuarConMarido();
        }else if (op == 2){
            irConPsiquiatra();
        } else if (op==3) {
            finalSuperacionPersonal();
        } else {
            irConPsicologo();
        }
    }
    static void irConPsiquiatra(){
        System.out.println("\n\nEl psiquiatra te reseta medicacion muy fuerte para tu depresion\n" +
                "1. Tomar medicacion\n" +
                "2. No tomar medicacion\n" +
                "Elija una opcion:" );
        int op;
        op = input.nextInt();
        if(op == 1){
            finalSuperacionPersonal();
        }else if (op == 2){
            finalSuicidio();
        } else {
            irConPsiquiatra();
        }
    }
    static void llamarAbogado(){
        System.out.println("\n\nEl abogado te explica tu situacion legal refente a la reparticion de bienes. \n" +
                "Debido al contrato prenupcial no tienes derecho a nada y como nunca trabajaste quedarias en la calle\n" +
                " sin ningun bien y posiblemente te quiten a tus hijos.\n" +
                "1. Dejas pasar por alto la infidelidad para mantener tu estatus social y economico.\n" +
                "2. Haces un plan para quedarte con todos los bienes.\n" +
                "3. Decides que no vale la pena pelear por dinero, buscas un trabajo y procedes con el divorcio\n" +
                "Elige una opcion:");
        int op;
        op = input.nextInt();
        if (op == 1) {
            finalContinuarConMarido();
        }else if (op == 2){
            planHerencia();
        } else if (op==3) {
            finalSuperacionPersonal();
        } else {
            llamarAbogado();
        }
    }
    static void planHerencia(){
        System.out.println("\n\nDespues de analizar la situacion, te das cuenta que la unica forma de quedarte con los\n" +
                "bienes y mantener tu estatus social es convirtiendote en viuda. Por lo tanto, decides quitar del camino\n" +
                "a tu marido.\n" +
                "1. Contratas un sicario que haga el trabajo por ti\n" +
                "2. Decides matarlo con tus propias manos\n" +
                "Elija una opcion:" );
        int op;
        op = input.nextInt();
        if(op == 1){
            extorsion();
        }else if (op == 2){
            inculpar();
        } else {
            planHerencia();
        }
    }
    static void inculpar(){
        System.out.println("\n\nDespues de matar a tu marido con un cuchillo debes deshacerte del arma homicida.\n" +
                "1. Lo ocultas en la casa de su amante\n" +
                "2. Lo botas en el basurero\n" +
                "Elija una opcion:" );
        int op;
        op = input.nextInt();
        if(op == 1){
            System.out.println("Le dices a los policias que tiene un amante y la policia encuentra el arma homicida en su casa por lo que la inculpan a ella.");
            finalSuperacionPersonal();
        }else if (op == 2){
            System.out.println("Encuentar el arma en tu basurero.");
            finalCarcel();
        }  else {
            inculpar();
        }
    }
    static void extorsion(){
        System.out.println("\n\nEl sicario se encarga del problema y decide extorsionarte por mas dinero.\n" +
                "1. Pagas lo que te pide y te evitas de problemas pero te quedas sin dinero.\n" +
                "2. No pagas la extorsion pero el sicario te delata\n" +
                "Elija una opcion:" );
        int op;
        op = input.nextInt();
        if(op == 1){
            finalSuperacionPersonal();
        }else if (op == 2){
            finalCarcel();
        } else {
            extorsion();
        }
    }
    static void enfrentarMarido(){
        System.out.println("\n\nEscuchas a tu marido entrar y le exiges una explicacion del paquete que te acaba de llegar.\n" +
                "Tu marido te confieza que nunca te quizo y solo se caso contigo porque te embarazo. Tambien te dice que \n" +
                "te quitara tu estatus, te quitara a tus hijos y se ira con su amante.\n" +
                "1. Sales corriendo de la habitacion y subes a la terraza de tu edificio para que no te vean llorar.\n" +
                "2. Estas enojada y lo empujas por las escaleras\n" +
                "Elige una opcion:");
        int op;
        op = input.nextInt();
        if (op == 1) {
            finalSuicidio();
        }else if (op == 2){
            empujar();
        } else {
            enfrentarMarido();
        }
    }
    static void empujar(){
        System.out.println("\n\nTu marido cae por las escaleras golpeandose seriamente la cabeza. No tiene pulso, esta muerto.\n" +
                "1. Sales huyendo de la casa\n" +
                "2. Llamas a la policia y te declaras culpable\n" +
                "3. Llamas a emergencias para intentar salvarlo\n" +
                "Elija una opcion:" );
        int op;
        op = input.nextInt();
        if(op == 1){
            finalDesaparecer();
        }else if (op == 2){
            finalCarcel();
        } else if (op==3) {
            System.out.println("La ambulacia dice que ya es demasiado tarde. Gracias a que llamaste a la ambulacia, \n" +
                    "declaran que no fue intencional y solo te dan 1 anio de carcel");
            finalSuperacionPersonal();
        } else {
            empujar();
        }
    }
    static void finalSuicidio(){
        System.out.println("\n\nTe das cuenta que nada tiene sentido y tomas la decision saltar de la terraza de tu edificio.\n" +
                "Tu mueres y tu esposo se vuelve a casar y se queda con los hijos.");
    }
    static void finalContinuarConMarido(){
        System.out.println("\n\nDespues de analizar la situacion prefieres mantener silencio y que todo siga como siempre.");
    }
    static void finalSuperacionPersonal(){
        System.out.println("Olvidas todo lo ocurrido y decides continuar tu vida. Con un nuevo inicio en algun pueblito lejano.");
    }
    static void finalDesaparecer(){
        System.out.println("\n\nDecides cambiar de identidad y dejas a tus hijos con tus padres para desaparecer sin dejar rastro.");
    }
    static void finalCarcel(){
        System.out.println("\n\nLa policia te detiene y te llevan a prision donde te condenan a cadena perpetua por homicidio culposo.");
    }
}