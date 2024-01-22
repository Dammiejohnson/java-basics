package section4;

public class methods {
    public static void main(String[] args) {
        int position =  calculateHighScorePosition(1500);
        displayHighScorePosition("Oluwadamilola", position);

        position =  calculateHighScorePosition(900);
        displayHighScorePosition("Adeola", position);

        position =  calculateHighScorePosition(400);
        displayHighScorePosition("Jacinta", position);

        position =  calculateHighScorePosition(50);
        displayHighScorePosition("Solomon", position);

        position =  calculateHighScorePosition(1000);
        displayHighScorePosition("Lou", position);
    }

    public static void displayHighScorePosition(String nameOfPlayer, int position){
        System.out.println(nameOfPlayer + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        }
//        else if (score >= 500){
//            return 2;
//        }
//        else if (score >= 100){
//            return 3;
//        }
//        else {
//            return 4;
//        }
        // to eliminate multiple return statements

        int position = 4;
        if (score >= 1000) {
            position = 1;
        }
        else if (score >= 500) {
            position = 2;
        }
        else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
