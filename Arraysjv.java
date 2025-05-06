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
// import java.util.Scanner;
// public class Arraysjv {
//     public static int linerserach(int numbers[], int key) {
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int numbers[] = {1, 2, 3, 4, 5};
//         System.out.print("Enter ur key value : ");
//         int key = sc.nextInt();
//         int index = linerserach(numbers, key);
//         System.out.print("The key is present in : " + index);
//     }
// }
// // 5) this is finding the smallest and largest from array question
// public class Arraysjv {
//     public static int largestNumber(int numbers[]) {
//         int largest = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//             if (min > numbers[i]) {
//                 min = numbers[i];
//             }
//         }
//         System.out.println("The smallest Number is : " + min);
//         return largest;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1, 2, 6, 3, 5};
//         System.out.println("The largest number in array is :" + largestNumber(numbers));
//     }
// }
// // 6) binary search
// public class Arraysjv {
//     public static int binarySerach(int numbers[], int key) {
//         int start = 0, end = numbers.length - 1;
//         while (start <= end) {
//             int mid = (start + end) / 2;
//             if (numbers[mid] == key) {
//                 return mid;
//             }
//             if (numbers[mid] < key) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         int key = 8;
//         System.out.println("Index of key is : " + binarySerach(numbers, key));
//     }
// }
// // 7) reverse an array
// public class Arraysjv {
//     public static void reverse(int numbers[]) {
//         int first = 0, last = numbers.length - 1;
//         while (first < last) {
//             int temp = numbers[first];
//             numbers[first] = numbers[last];
//             numbers[last] = temp;
//             first++;
//             last--;
//         }
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         System.out.print("Araay before reverse: ");
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();
//         reverse(numbers);
//         System.out.print("Arrays after reverse : ");
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();
//     }
// }
// // 8) pairs in an array : ...
public class Arraysjv {

    public static void PrintPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are : " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        PrintPairs(numbers);
    }
}
