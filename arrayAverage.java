public double arrayAverage(int[] numbers) {
    if (numbers.length == 0) {
        return 0;
    }
    double sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
    return sum/numbers.length;
}