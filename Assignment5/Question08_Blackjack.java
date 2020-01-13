package assignments.Assignment5;

public class Question08_Blackjack {

	public static void main(String[] args) {
		/* in blackjack after the player asks to keep the house 4 things may happen.
		 
		 * player and house scores are represented by player and house int variables.
		 * check them using ifs to determine the result.

				for example:
					player = 21
					house = 8
				output: bust

					player = 7
					house = 10
				output: player loss

					player = 4
					house = 4
				output: its a tie

					player = 12
					house = 7
				output: player wins     */

		int CardTotal, house = 7, player = 12;
		CardTotal = house + player;
		
		if (CardTotal>21) {
			System.out.println("bust");
			//1)if the card total is bigger then 21 the player busts.
		
		}else if (house > player) {
			System.out.println("player loss");
			//2)if the house score is bigger then the player, the player loses.
		
		}else if (player == house) {
			//3)if the player score is equal to the house then they are a draw.
			System.out.println("its a tie");
		
		}else if(player > house) {
			//4)if the player score is bigger then the house the player wins.
			System.out.println("player wins");
		}
		
	}

}
