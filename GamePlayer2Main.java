package 練習問題11;

import java.util.Random;

public class GamePlayer2Main {

	public static void main(String[] args) {
		Random random = new Random();
		GamePlayer2[] player = new GamePlayer2[5];
		player[0]=new GamePlayer2("Ben");
		player[1]=new GamePlayer2("Mike");
		player[2]=new GamePlayer2("Sam");
		player[3]=new GamePlayer2("Ali");
		player[4]=new GamePlayer2("John");
        
		
		
		System.out.println(GamePlayer2.countAlivePlayer()+"人のプレイヤが生き残りました。");
		
		
		for(int i=0; i<player.length; i++) {

			if(5<random.nextInt(9)) {
				GamePlayer2.die();
			}
			System.out.println(player[i]);
		}
	




		}
	}






