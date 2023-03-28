public class Recursion {
    public int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }
    public int sumofnatual(int n){
        if(n<1){
            return n;
        }
        return n + sumofnatual(n-1);
    } 
    public static void main(String[] args) {
        
    }
}
