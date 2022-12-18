package クラス練習問題;

import java.util.Random;
import java.util.Scanner;

public class JankenIf{
	public static void main(String[] args){
		int user = getUser();
		int pc = getPc();
		String result = judgeJanken(user,pc);
		showResult(user,pc,result);
	}
	public static int getUser(){
		Scanner s = new Scanner(System.in);
		while (true){
			System.out.println("あなたのじゃんけんの手を入力してください");
			System.out.println("(グー：０,チョキ：１,パー：２,無敵：3,無敵返し:4)");
			if(s.hasNextInt()){
				int number = s.nextInt();
				if(number <= -1 || number >= 5){
					System.out.println("【エラー】入力できるのは０～4です。");
					continue;
				}else {
					return number;
				}
			}else{
				System.out.println("入力できるのは整数のみです。");
				s.next();
			}

		}
	}

public static int getPc(){
	Random rand = new Random();
	return rand.nextInt(4);
}
public static String judgeJanken(int user,int pc){
	String result = "";
	if((user == 0 && pc == 1) || (user == 1 && pc == 2) || (user == 2 && pc == 0)||(user==3 && pc==0)||(user==3&&pc==1)||(user==3&&pc==2)||(user==4&&pc==3)){
		result="勝ち";
	}else if((user == 0 && pc == 2) || (user == 1 && pc == 0) || (user == 2 && pc == 1)||(user==0&&pc==3)||(user==1&&pc==3)||(user==2&&pc==3)||(user==4&&pc==0)||(user==4&&pc==1)||(user==4&&pc==2)){
		result="負け";
	}else {
		result="あいこ";
	}
	return result;
}
public static void showResult(int user,int pc,String result){
	String[] janken = {"グー","チョキ","パー","無敵","無敵返し"};//配列の添字は０番～始まる
	System.out.println("あなたの手:"+janken[user]+",コンピュータの手"+janken[pc]);
	System.out.println("結果:"+result); 
}


}


