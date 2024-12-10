

public class Numbers {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int[] numbers = new int[5];

    public Numbers(int A, int B, int C, int D, int E) {
        this.A = A;
        this.numbers[0] = A;
        this.B = B;
        this.numbers[1] = B;
        this.C = C;
        this.numbers[2] = C;
        this.D = D;
        this.numbers[3] = D;
        this.E = E;
        this.numbers[4] = E;
    }
    public boolean different(){
        boolean answer = true;
        for (int i = 0; i<5;i++){
            for (int j =0;j<5;j++){
                if (i!=j && this.numbers[i]==this.numbers[j]){
                    answer = false;
                }
            }
        }
        return answer;
    }

}
