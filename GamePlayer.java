package practiceProblems11;
public class GamePlayer {
	//フィールド宣言
	static int numberOfAlivePlayer = 0;	//生きているプレイヤの数
	String name;						//プレイヤ名
	boolean isAlive;					//プレイヤの状態（true:生き残っている、false:倒された）
	
	//コンストラクタ宣言
	public GamePlayer(String name) {
		this.name = name;		//名前の設定
		isAlive = true;			//インスタンス生成時は生きている状態に設定
		numberOfAlivePlayer++;	//インスタンス（プレイヤ）の数をカウントアップ
	}

	//メソッド宣言
	
	//生き残っているプレイヤの数を返すメソッド
	static int countAlivePlayer() {
		return numberOfAlivePlayer;
	}
	
	//倒された状態にするメソッド
	void die() {
		isAlive = false;		//プレイヤが倒された状態に設定
		numberOfAlivePlayer--;	//インスタンス（プレイヤ）の数をカウントダウン
	}

	//標準的な文字列表現
	@Override
	public String toString() {
		String msg = name;
		if( isAlive ) {
			msg += "は生き残っています。";
		} else {
			msg += "は倒されました。";
		}
		return msg;
	}
}
