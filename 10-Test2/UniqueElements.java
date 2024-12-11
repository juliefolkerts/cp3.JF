



public class UniqueElements {
    private int[] arr;

    public UniqueElements(int[] arr) {
        this.arr = arr;
    }
    public UniqueElements unique(){
        int count = 0;
        for (int i =0;i<arr.length;i++){
            for (int j = 1; j<arr.length;j++){
                if (arr[i]!= arr[j]){
                    count++;
                }
            }
        }
        int[] uniquearr = new int[count];
        int j = 0;
        for (int i =0;i<(arr.length);i++){
            for (int k = 1; k<arr.length;k++){
                if (i!=k && arr[i]== arr[k]){
                    uniquearr[j]=arr[i];
                    j++;
                }
            }
        }
        return new UniqueElements(uniquearr);
            
    }
    public String elements(){
        StringBuilder answer = new StringBuilder();
        for (int i = 0;i<arr.length-1;i++){
            answer.append(arr[i]);
            answer.append(",");
        }
        answer.append(arr[arr.length-1]);
        return answer.toString();
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,4,4,5};
        UniqueElements g = new UniqueElements(arr1);
        System.out.println(g.unique().elements());
    }
}
