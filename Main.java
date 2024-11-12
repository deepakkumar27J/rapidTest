

class Solution {
    public static void reverseString(String s) {
        StringBuilder newStr = new StringBuilder(s);
        char temp;
         for(int i =0;i<(newStr.length()/2);i++){
            temp = newStr.charAt(i);
            newStr.setCharAt(i, newStr.charAt((newStr.length() - 1) - i));
            newStr.setCharAt(((newStr.length() - 1) - i), temp);
        }

        String reversedStr = newStr.toString();
        System.out.println("Reversed string: " + reversedStr);
    }
    public static int factorialByLoop(int n){
        int answer = 1;
        for(int i=1;i<=n;i++){
            answer *= i;
        }
        return answer;
    }
    public static int factorialByRec(int n){
        if (n==1 || n==0){
            return 1;
        }
        return n * factorialByRec(n-1);
    }
    public static int largestNumber(int [] arr){
        if(arr == null || arr.length==0){
            return 0;
        }
        int max =arr[0];
        for (int i : arr) {
            if( i > max){
                max = i;
            }
        }
        return max;
    }
}
public class Main {
    public static void main(String[] args) {

        String s = "hello";
        Solution.reverseString(s);

        int n = 5;
        int factorialByLoop = Solution.factorialByLoop(n);
        int factorialByRec = Solution.factorialByRec(n);
        System.out.println("Factorial by Loop " +factorialByLoop);
        System.out.println("Factorial by Recursion " +factorialByRec);

        int [] arr = new int[]{-9,7,6,10,200,50,0,300};
        int largestNum = Solution.largestNumber(arr);
        System.out.println("Largest Number " +largestNum);
    }
}


