public class ac14 {
    private int scoreA;
    private int scoreB;
    private int scoreC;
    private int scoreD;
    private int scoreE;
    private int[] scores = new int[5];

    public void setScoreA(int scoreA) {
        if (scoreA >= 1 && scoreA <= 5){
            this.scoreA = scoreA;
            scores[0] = scoreA;

        }
    }

    public void setScoreB(int scoreB) {
        if (scoreB >= 1 && scoreB <= 5){
            this.scoreB = scoreB;
            scores[1] =scoreB;
        }
    }

    public void setScoreC(int scoreC) {
        if (scoreC >= 1 && scoreC <= 5){
            this.scoreC = scoreC;
            scores[2] = scoreC;
        }
    }

    public void setScoreD(int scoreD) {
        if (scoreD >= 1 && scoreD <= 5){
            this.scoreD = scoreD;
            scores[3] = scoreD;
        }
    }

    public void setScoreE(int scoreE) {
        if (scoreE >= 1 && scoreE <= 5){
            this.scoreE = scoreE;
            scores[4] = scoreE;
        }
    }

    public void displayResult(){
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        for (int score : scores) {
            if (score > max){
                max = score;
            }
            if (score < min){
                min = score;
            }
            sum+=score;
        }
        double result = sum/3.0;
        System.out.println("Final score: "+ result);
    }

    public static void main(String[] args) {
        ac14 c1 = new ac14();
        c1.setScoreA(1);
        c1.setScoreB(2);
        c1.setScoreC(3);
        c1.setScoreD(4);
        c1.setScoreE(5);
        c1.displayResult();

        ac14 c2 = new ac14();
        c2.setScoreA(1);
        c2.setScoreB(2);
        c2.setScoreC(20);
        c2.setScoreC(3);
        c2.setScoreD(3);
        c2.setScoreE(4);
        c2.displayResult();
    }

}
