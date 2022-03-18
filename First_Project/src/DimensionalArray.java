public class DimensionalArray {
    public static void main(String[] args) {
        int[][] scores = { { 22, 55, 56 }, { 45, 12, 44 }, { 48, 12, 90 }, { 48, 92, 100 } };
        System.out.println(scores.length);

        System.out.println(scores[0][1]);

        for (int i = 0; i <= scores.length - 1; i++) {
            for (int j = 0; j <= scores[i].length - 1; j++) {
                System.out.println(scores[i][j]);
            }
        }

        String name = "Jonathan Ocampo";
        System.out.println(name.length());

        System.out.println(name.concat(" A"));
        System.out.println(name);

        // BODMAS - Brackets, Operators, Multiplication, Division, Addition, Subtraction
        System.out.println(3 + 6 / 2 - 9 * 3);

        for (String arg : args) {
            System.out.println(arg);
        }

        // How many times will it print
        int count = 5;
        while (count <= 14) {
            System.out.println(count++);
        }

        // Access modifiers - public, private, protected, default(package)

        // Inheritance - extends, @Override(It's an annotation), super()

        // Implicit & explicit type casting

        /*
         * int a = ______
         * byte b = (byte) a;
         * 3
         * S.O.P(b);
         * 
         * b = 50;
         * a = 256, b = 0;
         * a = 128, b = -128;
         * a = -129, b = 127;
         */

    }
}
