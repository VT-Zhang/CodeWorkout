public String repeatEnd(String str, int n)
{
    String result = new String("");
    String repeat = new String("");
    for(int i = str.length() - n; i < str.length(); i++) {
        repeat += str.charAt(i);
    }
    for(int j = 0; j < n; j++) {
        result += repeat;
    }
    return result;
}