package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		
		//正しいジャンケンの手でない場合、エラーを出力し、再度自分のじゃんけんの手を選ぶ
		while(!input.equals("r") && !input.equals("s") && !input.equals("p")) {
			System.out.println("r, s, pのいずれかで入力してください");
			input = scanner.next();
		}
		
		scanner.close();
		return input;
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		String[] jyanken = {"r", "s", "p"};
		int random = (int)Math.floor(Math.random() * 3);
		return jyanken[random];
	}
	
	//じゃんけんを行うメソッド
	public void playGame() {
		String myHand = getMyChoice();
		String enemyHand = getRandom();
		
		//じゃんけんの手を出力する
		HashMap<String, String> jyankenMap = new HashMap<String, String>();
		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");
		
		System.out.println("自分の手は" + myHand +",対戦相手の手は" + enemyHand);
		
		if(myHand.equals(enemyHand)) {
			System.out.println("あいこです");
		} else {
			if(myHand.equals("r")) {
				switch(enemyHand) {
				case "s" -> System.out.println("自分の勝ちです");
				case "p" -> System.out.println("自分の負けです");
				}
			}else if(myHand.equals("s")) {
				switch(enemyHand) {
				case "p" -> System.out.println("自分の勝ちです");
				case "r" -> System.out.println("自分の負けです");
				}
			}else if(myHand.equals("p")) {
				switch(enemyHand) {
				case "r" -> System.out.println("自分の勝ちです");
				case "s" -> System.out.println("自分の負けです");
				}
			}else {
				System.out.println("test");
			}
		}
	}
}
