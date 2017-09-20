public boolean xyBalance(String str)
{
    if(str == "x"){
        return false;
    }
    int pointer = 0;
    for(int i = 0; i < str.length(); i++) {
        if(str.charAt(i) == 'y'){
            pointer = i;
        }
    }
    for(int j = pointer + 1; j < str.length(); j++) {
        if(str.charAt(j) == 'x'){
            return false;
        }
    }
    return true;
}