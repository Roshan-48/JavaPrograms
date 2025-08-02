package arrays;
public class UniqueElementsArray {
	public static void findUniqueElements(int[] a, int[] b) {
        int[] combined = new int[a.length + b.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            combined[index++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            combined[index++] = b[i];
        }

        System.out.print("Unique elements: ");
        for (int i = 0; i < combined.length; i++) {
            int count = 0;
            for (int j = 0; j < combined.length; j++) {
                if (combined[i] == combined[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(combined[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        findUniqueElements(arr1, arr2);  
    }
}
