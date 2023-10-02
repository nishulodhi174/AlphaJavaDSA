package gitwork.AlphaJavaDSA.Recursion;

public class Exercise6 {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,5,11,12,13,14};
        System.out.println(checkSorted(a,0));
    }

    private static boolean checkSorted(int[] a, int i) {
        if(i==a.length-1){
            return true;
        }
        if(a[i] > a[i+1]){
            return false;
        }
        return checkSorted(a, i+1);
    }
}
