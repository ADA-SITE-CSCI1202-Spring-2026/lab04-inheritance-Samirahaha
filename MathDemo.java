package lab04;
public class MathDemo{
    public static int min(int a, int b){
        if(a>b){
            return b;
        } else{
            return a;
        }
    }
    public static int max(int a, int b){
        if(a>b){
            return a;
        } else{
            return b;
        }
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
    }

    /* f. So you can call the method without 
    creating an object of the class */
}