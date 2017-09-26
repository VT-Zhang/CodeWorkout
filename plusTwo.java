public int[] plusTwo(int[] a, int[] b)
{
    int[] result = new int[4];
    for(int i = 0; i < 2; i++) {
        result[i] = a[i];
    }
    for(int j = 2; j < 4; j++) {
        result[j] = b[j-2];
    }
    return result;
}