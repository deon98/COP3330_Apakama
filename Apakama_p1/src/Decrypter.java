public class Decrypter {

    public static String decrypt(String str) {
        int[] arr = new int[4];
        changeValues(arr, str);
        swap(arr, 0, 2);
        swap(arr, 1, 3);
        return "" + arr[0] + arr[1] + arr[2] + arr[3];
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void changeValues(int[] arr, String str) {
        for (int i = 0; i < str.length(); i++)
            arr[i] = Character.digit(str.charAt(i),10);
        for (int i = 0; i < str.length(); i++){
            if (arr[i] < 7)
                arr[i] += 10;
            arr[i] -= 7;
        }
    }
}
