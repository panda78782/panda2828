package 練習問題11;

public class GamePlayer2 {
	static int numberOfAlivePlayer;
	String name;
	static boolean isAlive;

	public GamePlayer2(String name) {
		this.name=name;
		isAlive=true;
		numberOfAlivePlayer++;
	}
	static int countAlivePlayer() {
		return numberOfAlivePlayer;

	}
	static void die() {
		isAlive=false;
		numberOfAlivePlayer--;
	}
	@Override
	public String toString(){
		if(isAlive==true) {
		return name+"は生き残っています。";
		}else {
		return name+"は倒されました。";	
		}
		
	}

	}

