package kadai_021;
import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {
	
	protected HashMap<String, String> jisho = new HashMap<>();
	
	public Dictionary_Chapter21(){
			jisho.put("apple","りんご");
			jisho.put("peach","桃");
			jisho.put("banana","バナナ");
			jisho.put("lemon","レモン");
			jisho.put("pear","梨");
			jisho.put("kiwi","キウィ");
			jisho.put("strawberry","いちご");
			jisho.put("grape","ぶどう");
			jisho.put("muscat","マスカット");
			jisho.put("cherry","さくらんぼ");
	}
	
    public void printAllEntries() {
        for (Map.Entry<String, String> entry : jisho.entrySet()) {
            System.out.println(entry.getKey() + "の意味は" + entry.getValue());
        }
    }
}
