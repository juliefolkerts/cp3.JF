public class C3{
    private boolean[] arr;

    public C3(boolean[] arr) {
        this.arr = arr;
    }
    public int opposite(){
        int count = 0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]!=arr[i] && arr[i+1]!=arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        boolean[] arr1 = new boolean[] {true,false,true,false};
        System.out.println(new C3(arr1).opposite());
    }

}