class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String[]> hMap = new HashMap<Character,String[]>();
        hMap.put('2',new String[]{"a","b","c"});
        hMap.put('3',new String[]{"d","e","f"});
        hMap.put('4',new String[]{"g","h","i"});
        hMap.put('5',new String[]{"j","k","l"});
        hMap.put('6',new String[]{"m","n","o"});
        hMap.put('7',new String[]{"p","q","r","s"});
        hMap.put('8',new String[]{"t","u","v"});
        hMap.put('9',new String[]{"w","x","y","z"});
        ArrayList<String> resultSet = new ArrayList<String>();

        for(int  c = 0 ; c < digits.length();c++)
        {
            char number = digits.charAt(c);
            String[] ch = hMap.get(number);
            List<String> secList = Arrays.asList(ch);
            if(resultSet.size() == 0 ){
                resultSet.addAll(secList);
            }
            else{
                ArrayList<String> currentList = (ArrayList<String>)resultSet.clone();
                resultSet = new ArrayList<String>();

                for(int i = 0 ; i < secList.size();i++){
                    List<String> addList = new ArrayList<String>();
                    for(int j = 0; j < currentList.size();j++){
                    addList.add(currentList.get(j)+secList.get(i));
                    }
                    resultSet.addAll(addList);
                }
            }
            
            
        }
        return resultSet;
        
    }
}
