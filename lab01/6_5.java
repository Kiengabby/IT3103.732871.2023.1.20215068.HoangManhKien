public class SortAndCalculateArray {
    public static void main(String[] args) {
        int[] a = {1, 5, 7, 4, 2, 0};
        System.out.print("My array: ");
        for(int x : a) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for(int x : a) {
            sum += x;
            System.out.print(x + " ");
        }
        System.out.println("\n");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double)sum / a.length);
    }
}
