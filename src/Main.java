import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0;i < n;i++){
        arr[i] = sc.nextInt();
    }
    Sorter.sort(arr);
    for(int i = 0;i < arr.length;i++){
        IO.println(arr[i]);
    }
    sc.close();

}





