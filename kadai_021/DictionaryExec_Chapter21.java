package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 Dictionary = new Dictionary_Chapter21();
		Dictionary.putDic();
		
		String[] searchList = {"apple", "banana", "grape", "orange"};
		
		Dictionary.searchDic(searchList);

	}

}
