public static String allStar(String str) {
    if (str.length() == 0) {
        return "";
    }
    if (str.length() == 1) {
        return str;
    }
    String result = str.substring(0, 1) + "*";
    String rest = str.substring(1, str.length());
    return result + allStar(rest);
}