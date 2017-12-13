public static Map<String, String> flipMap(Map<String, String> map) {
    HashMap<String, String> result = new HashMap<String, String>();
    for (String key : map.keySet()) {
        result.put(map.get(key), key);
    }
    return result;
}