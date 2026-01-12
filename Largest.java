class Largest {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};

        int lar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (lar < arr[i]) {
                lar = arr[i];
            }
        }
        System.out.print("Largest num: " + lar);
    }
}