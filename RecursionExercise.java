public class RecursionExercise {
    public static void main(String[] args) {
        float result = divideRecursive(10);
        System.out.println("result: " + result);
    }

    public static float divideRecursive(int num) {
        if (num == 1) return num;
        return num / divideRecursive(num - 1);
    }
}

