public class Exercise_5_4 {
    public static void main(String args[]) {
        String arr[] = {"вы", "кто", "такие?", "я", "вас", "не звал,", "идите", "на хуй!"};
        String t;


        System.out.println("Исходный масив");
        for (String a : arr)
            System.out.print(a + " ");
        System.out.println("\n");

        for (int b = 1; b < arr.length; b++)
            for (int c = arr.length - 1; c >= b; c--)
            {
                if (arr[c - 1].compareTo(arr[c]) < 0)
                {
                    t = arr[c - 1];
                    arr[c - 1] = arr[c];
                    arr[c] = t;
                }

            }
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "; ");
            //System.out.println();
        }
    }
}