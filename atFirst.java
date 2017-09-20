public String atFirst(String str)
{
    String result = new String("");
    if(str.length() >= 2){
        result += str.charAt(0);
        result += str.charAt(1);
    }
    else if (str.length() == 1) {
        result += str.charAt(0);
        result += "@";
    }
    else {
        result += "@@";
    }
    return result;   
}