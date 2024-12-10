public class p14 {
    private int judge1;
    private int judge2;
    private int judge3;
    private int judge4;
    private int judge5;
    private int[] scores = new int[5];
    //private int highest = 0;
    //private int lowest = 6;
    //private int sum = 0;

    public void setJudge1(int judge1) {
        if (judge1 == 1 || judge1 == 2 || judge1 ==3 || judge1 == 4 || judge1 == 5){
            this.judge1 = judge1;
            this.scores[0] = judge1;
        }
    }

    public void setJudge2(int judge2) {
        if (judge2 == 1 || judge2 == 2 || judge2 ==3 || judge2 == 4 || judge2 == 5){
            this.judge2 = judge2;
            this.scores[1] = judge2;
        }
    }

    public void setJudge3(int judge3) {
        if (judge3 == 1 || judge3 == 2 || judge3 ==3 || judge3 == 4 || judge3 == 5){
            this.judge3 = judge3;
            this.scores[2] = judge3;
        }
    }

    public void setJudge4(int judge4) {
        if (judge4 == 1 || judge4 == 2 || judge4 ==3 || judge4 == 4 || judge4 == 5){
            this.judge4 = judge4;
            this.scores[3] = judge4;
        }
    }

    public void setJudge5(int judge5) {
        if (judge5 == 1 || judge5 == 2 || judge5 ==3 || judge5 == 4 || judge5 == 5){
            this.judge5 = judge5;
            this.scores[4] = judge5;
        }
    }

    public int getJudge1() {
        return judge1;
    }

    public int getJudge2() {
        return judge2;
    }

    public int getJudge3() {
        return judge3;
    }

    public int getJudge4() {
        return judge4;
    }

    public int getJudge5() {
        return judge5;
    }
    public float result(){
        int lowest = 6;
        int highest = 0;
        int sum = 0;
        for (int score : this.scores){
            if (score < lowest){
                lowest = score;
            }
        }
        for (int score : this.scores){
            if (score > highest){
                highest = score;
            }
        }
        for (int score : this.scores){
            sum += score;
        }
        return (float)(sum - highest - lowest)/3;
    }

    public static void main(String[] args) {
        p14 player = new p14();
        player.setJudge1(1);
        player.setJudge2(3);
        player.setJudge3(3);
        player.setJudge4(5);
        player.setJudge5(3);
        System.out.println(player.result());
    }
    
}
