import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber
        System.out.println("Números aleatorios hasta que salga el número 7");
        int i = 0;
        while (i != 7) {
            i = getRandomNumber(7);
            System.out.println("Número aleatorio generado: " + i);
        }

        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        System.out.println("Números aleatorios hasta que salga un número mayor a 70");
        int n = 0;
        while (n <= 70) {
            n = getRandomNumber(150);
            System.out.println("Número aleatorio generado: " + n);
        }

        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber
        int randomNumber = getRandomNumber(100);
        int userNumber;

        Scanner randomNumberScanner = new Scanner(System.in);
        System.out.println("Adivina el número. Introduce un numero del 1 al 100: ");
        do {
            userNumber = randomNumberScanner.nextInt();
            if (userNumber > randomNumber) {
                System.out.println("Prueba con un número menor.");
            } else if (userNumber < randomNumber) {
                System.out.println("Prueba con un número mayor.");
            }
        }
        while (userNumber != randomNumber);

        System.out.println("¡Enhorabuena! Has acertado el número.");
        randomNumberScanner.close();
    }

        /**
         * Function name: getRandomNumber
         *
         * @param number (int)
         * @return (int)
         *
         * Inside the function:
         * 1. choose a random integer between 1 and the number given
         */

        public static int getRandomNumber(int number){
            return (int) (Math.random() * number) + 1;
        }
    }