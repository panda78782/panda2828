package practiceProblems11;

public class GamePlayerMain {
	public static void main(String[] args) {
		final int MAX_PLAY = 5;
		//5人のプレイヤを生成
		String[] names = {"ゆき","みくる","いつき","ハルヒ","キョン"};
		GamePlayer[] players = new GamePlayer[MAX_PLAY];
		for (int i = 0; i < MAX_PLAY; i++) {
			players[i] = new GamePlayer(names[i]);
		}
		
		//5回対戦
		//0～9までのランダムな数を使い、5以上の数が出たら負けとする
		for (int i = 0; i < MAX_PLAY; i++) {
			int rand = (int)(Math.random() * 10);
			if( 5 <= rand ) {
				//負け
				players[i].die();
			}
		}
		
		//結果発表
		System.out.println(GamePlayer.countAlivePlayer() + "人が生き残りました。");
		for( GamePlayer player : players ) {
			System.out.println(player);
		}
	}
}
