public class Main {
    public static void main (String[] args) {

        int[] arr = {6,1,2,8,3,4,7,10,5,2,4,10};
        int[] newArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(!isPresent(arr[i], newArr)){
                newArr[i] = arr[i];
            }
        }

        for(int i : newArr){
            System.out.print(i + " ");
        }
    }

    public static boolean isPresent(int n, int[] arr){
        boolean flag;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }
}