import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4, 3};
        System.out.println("Array : " + Arrays.toString(array));

        int minimumAbsoluteDifference = solution(array);
        System.out.println("Minimum absolute difference is " + minimumAbsoluteDifference);
    }

    public static int solution(int[] array) {
        int leftSum = array[0];

        int rightSum = 0;
        for (int i = 1; i < array.length; i++) rightSum += array[i];

        int minimumAbsoluteDifference = Math.abs(leftSum - rightSum);

        for (int i = 1; i < array.length - 1; i++) {
            leftSum += array[i];
            rightSum -= array[i];
            int currentAbsoluteDifference = Math.abs(leftSum - rightSum);
            if (minimumAbsoluteDifference > currentAbsoluteDifference)
                minimumAbsoluteDifference = currentAbsoluteDifference;
        }

        return minimumAbsoluteDifference;
    }
}
