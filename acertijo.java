public class acertijo {
public static void main(String[] args) {
    char answer;
    System.out.println("Tengo ojos pero no veo, agua pero no bebo y barba pero no me afeito, ¿Quién soy?"); 
    System.out.println("(--------------------------)");
    System.out.println("a) Pez manta");
    System.out.println("b) Coco");
    System.out.println("c) Caqui");
    System.out.println("d) Melocotón")
    
    while (answer=b){

    switch (answer) {
        case a:
            System.out.println("¡Incorrecto!");
            break;
        case b:
            System.out.println("¡Correcto!");
            break;
        case c:
            System.out.println("¡Incorrecto!");
            break;
        case d:
            System.out.println("¡Incorrecto!");
            break;
        default:
            System.out.println("ERROR: Debes seleccionar una letra del menú")
            break;
    }
    System.out.println("¡Hasta luego!");
}
}
}