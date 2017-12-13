public List<String> listFilter(List<String> list) {
    List <String> result = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).length() % 2 == 0
           || (list.get(i).length() >= 3 &&
            list.get(i).substring(list.get(i).length() - 3).equals("ing"))) {
            result.add(list.get(i));
        }
    }
    return result; 
}