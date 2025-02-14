package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

    public static void main(String[] args) {
        
        Dictionary_Chapter21 myDictionary = new Dictionary_Chapter21();
        
        // 検索対象の単語の配列
        String[] searchArray = { "apple", "banana", "grape", "orange"};
     
        for (String word : searchArray) {
            if (myDictionary.jisho.containsKey(word)) {
                System.out.println(word + "の意味は" + myDictionary.jisho.get(word));
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}