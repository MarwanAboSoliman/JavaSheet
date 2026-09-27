public class Main {
    public static void main(String[] args) {

        for (char letter = 'A'; letter <= 'E'; letter++) {

            for (char i = 'A'; i <= letter; i++) {
                System.out.print(letter + " ");
            }

            System.out.println();
        }
    }
}


// public class Main {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {

//             // Print spaces
//             for (int j = 1; j <= 5 - i; j++) {
//                 System.out.print("  ");
//             }

//             // Print increasing numbers
//             for (int j = i; j <= 2 * i - 1; j++) {
//                 System.out.print(j + " ");
//             }

//             // Print decreasing numbers
//             for (int j = 2 * i - 2; j >= i; j--) {
//                 System.out.print(j + " ");
//             }

//             System.out.println();
//         }
//     }
// }