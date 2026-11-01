public class Semana7 {

    public static boolean empiezaPor(String palabra, char letra) {

        if (palabra.isEmpty()) {
            return false;
        }

        return palabra.charAt(0) == letra;
    }
}
