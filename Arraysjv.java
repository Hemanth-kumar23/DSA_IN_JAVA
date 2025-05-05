// // 1) creating an array : ...
// public class Arraysjv {
//     public static void main(String[] args) {
//         int marks[] = new int[50];
//         int numbers[] = {1 , 2 , 3 };
//     }
// }

// // 2) input ans output in arrays : ...
// import java.util.Scanner;
// public class Arraysjv {
//     public static void main(String[] args) {
//         int marks[] = new int[100];
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter ur phy marks : ");
//         marks[0] = sc.nextInt();
//         System.out.print("Enter ur chem marks : ");
//         marks[1] = sc.nextInt();
//         System.out.print("Enter ur maths marks : ");
//         marks[2] = sc.nextInt();
//         System.out.println("phy : " + marks[0]);
//         System.out.println("chm : " + marks[1]);
//         System.out.println("maths : " + marks[2]);
//         int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//         System.out.println("Your total percentage is : " + percentage);
//     }
// }
// // 3) passing arrys as argument : ...
// public class Arraysjv {
//     public static void update(int marks[]) {
//         for (int i = 0; i < marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args[]) {
//         int marks[] = {97, 98, 99};
//         update(marks);
//         System.out.println(marks);
//         for (int i = 0; i < marks.length; i++) {
//             System.out.println(marks[i] + " ");
//         }
//         System.out.println();
//     }
// }
// // 4) linerseach in java : ...
import java.util.Scanner;

public class Arraysjv {

    public static int linerserach(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1, 2, 3, 4, 5};
        System.out.print("Enter ur key value : ");
        int key = sc.nextInt();

        int index = linerserach(numbers, key);
        System.out.print("The key is present in : " + index);
    }
}

// // this is finding the smallest and largest from array question
// public class Arraysjv {
//     public static int largestNumber(int numbers[]) {
//         int largest = Integer.MIN_VALUE;  //-infinity
//         int minimum = Integer.MAX_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//             if (minimum > numbers[i]) {
//                 minimum = numbers[i];
//             }
//         }
//         System.out.println("The smallest value is :" + minimum);
//         return largest;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1, 2, 6, 3, 5};
//         System.out.println(("the largest number is at index: " + largestNumber(numbers)));
//     }
// }
// public class Arraysjv{
//     public static int binarySearch(){
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,4,6,8,10,12,14};
//         int key = 10;
//     }
// }
