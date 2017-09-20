public boolean endOther(String a, String b)
{
    String str1 = a.toLowerCase();
    String str2 = b.toLowerCase();
    if(str1.length() >= str2.length()){
        for(int i = str1.length() - 1; i >= 0; i--) {
            for(int j = str2.length() - 1; j >= 0; j--){
                if(str2.charAt(j) != str1.charAt(i)){
                    return false;
                }
                else {
                    i--;
                }
            }
    	    return true;
        }
    }
    else {
        for(int k = str2.length() - 1; k >= 0; k--) {
            for(int l = str1.length() - 1; l >= 0; l--){
                if(str1.charAt(l) != str2.charAt(k)){
                    return false;
                }
                else {
                    k--;
                }
            }
    	    return true;
        }
    }
    return false;
}