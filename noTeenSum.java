public int noTeenSum(int a, int b, int c)
{
    int sum = 0;
    sum += fixTeen(a);    
    sum += fixTeen(b);
    sum += fixTeen(c);
	return sum;
}

public int fixTeen(int n)
{
    if(n >= 13 && n <= 19 && n != 15 && n != 16) {
        return 0;
    }
    else{
        return n;
    }
}