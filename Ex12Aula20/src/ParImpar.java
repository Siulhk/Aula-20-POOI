public class ParImpar {
    public static void main (String args[]) {
        int num;
        try {
        num = Integer.parseInt(args[0]);

            if ((num % 2) == 0)
                System.out.println("Número par");
            else
                System.out.println("Número impar");
        }
 catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Não foi fornecido um argumento.");
        }
    }
}
