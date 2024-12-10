/*
 Array Iteration - Enhanced for loop
Enhanced for loop provides shortened syntax to iterate an Array without worrying about the index and
Array size.
The below example uses enhanced for loop to iterate the Array numbers and print the values.
public class Hello {
 public static void main(String[] args) {
 int[] numbers = new int[]{5,10,15,20,25};
 for(int n:numbers){
 System.out.println(n);
 }
 }
}
The output of the above program is
5
10
15
20
25
ProgramID- 1650 SKILLRACK
Enhanced for loop
The below program accepts N numbers as input and stores them in the int Array values.
Fill in the missing lines of code so that the program iterates over the N values and populates their sum
in the variable total.
 */
public class ArrayIternation_EnhancedForLoop31 {
    
}public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Accept N indicating how many numbers
    int N = sc.nextInt();
    //Now declare an int Array of size N
    int[] values = new int[N];
    //Accept the N values as input
    for (int ctr = 0; ctr < N; ctr++) {
    values[ctr] = sc.nextInt();
    }
    int total=0;
    //Now use enhanced for loop to iterate
    for (int n : values) {
        total+=n;
    }
