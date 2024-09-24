package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> dic = new HashMap<String, String>();
	
	public void putDic() {
		dic.put("apple", "りんご");
		dic.put("peach", "桃");
		dic.put("banana", "バナナ");
		dic.put("lemon", "レモン");
		dic.put("pear", "梨");
		dic.put("kiwi", "キウィ");
		dic.put("strawberry", "いちご");
		dic.put("grape", "ぶどう");
		dic.put("muscat", "マスカット");
		dic.put("cherry", "さくらんぼ");
	}
	
	public void searchDic(String[] searchList) {
		for(int i = 0; i < searchList.length; i++){
			if(dic.get(searchList[i]) != null) {
				System.out.println(searchList[i] + "の意味は" + dic.get(searchList[i]));
			} else {
				System.out.println(searchList[i] + "は辞書に存在しません");
			}
		}
	}
}
