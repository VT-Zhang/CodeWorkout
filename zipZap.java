public String zipZap(String str)
{
    if(str.length() <= 2) {
        return str;
    }
    String result = new String("");
    result += str.charAt(0);
    for (int i = 1; i < str.length() - 1; i++) {
     	if(str.charAt(i-1) == 'z' && str.charAt(i+1) == 'p') {
            System.out.println(result);
        }
        else {
        	result += str.charAt(i);
        }
    }
    result += str.charAt(str.length()-1);
    return result;
}

zipZap("zipXzap");