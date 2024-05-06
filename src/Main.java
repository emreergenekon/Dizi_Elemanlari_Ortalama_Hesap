
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        double harmonicSum = 0;

        // Harmonik seriyi hesapla
        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1.0 / numbers[i];
        }

        // Harmonik ortalama hesapla
        double harmonicMean = numbers.length / harmonicSum;

        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }
}
