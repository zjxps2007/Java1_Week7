public class Ex2 {
    public static void main(String[] args) {
        int arr[] = {30,90,10,40,60};
        int min,temp;

        for(int i =0;i<arr.length;i++) {
            min = i;
            for(int j =i;j<arr.length;j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
