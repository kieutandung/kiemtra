public class B18 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng: " + max);
    }
}
