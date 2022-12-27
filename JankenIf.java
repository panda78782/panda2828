package practiceproblems;

import java.util.Random;
import java.util.Scanner;

/*ルール
 * グーはチョキに勝つ。パーはグーに勝つ。チョキはパーに勝つ
 * 「無敵」グーチョキパー全てに勝てるが無敵返しにのみ負ける
 * 「無敵返し」グーチョキパーに全てに負けるが無敵にのみ勝てる
 * 「神」パーにのみ負ける*/
public class JankenIf {
	public static void main(String[] args) {
		int user = thinkUser();
		int pc = thinkPC();
		String result = judgeJanken(user, pc);
		showResult(user, pc, result);
	}

	public static int thinkUser() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("あなたのじゃんけんの手を入力してください");
			System.out.println("(グー：０,チョキ：１,パー：２,無敵：3,無敵返し:4,神:)");
			if (scanner.hasNextInt()) {
				int number = scanner.nextInt();
				if (number <= -1 || number >= 6) {
					System.out.println("【エラー】入力できるのは０～5です。");
					continue;
				} else {
					return number;
				}
			} else {
				System.out.println("入力できるのは整数のみです。");
				scanner.next();
			}

		}
	}

	public static int thinkPC() {
		Random rand = new Random();
		return rand.nextInt(5);
	}

	public static String judgeJanken(int user, int pc) {
		String[][] matrix = {
				//user       グー    チョキ      パー      無敵     返し   神  pc
				/*グー*/ { "あいこ", "勝ち", "負け", "勝ち", "負け", "勝ち" },
				/*チョキ*/ { "負け", "あいこ", "勝ち", "勝ち", "負け", "勝ち" },
				/*パー*/ { "勝ち", "負け", "あいこ", "勝ち", "  負け", "負け" },
				/*無敵*/ { "勝ち", "勝ち", "勝ち", "あいこ", "勝ち", "勝ち" },
				/*返し*/ { "負け", "負け", "負け", "負け", "あいこ", "勝ち" },
				/*神*/ { "勝ち", "勝ち", "負け", "勝ち", "勝ち", "あいこ", }
		};
		return matrix[user][pc];
	}

	public static void showResult(int user, int pc, String result) {
		String[] janken = { "グー", "チョキ", "パー", "無敵", "無敵返し", "神" };//配列の添字は０番～始まる
		System.out.println("あなたの手:" + janken[user] + ",コンピュータの手" + janken[pc]);
		System.out.println("結果:" + result);
	}

}
