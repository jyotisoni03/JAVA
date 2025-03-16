package GFG.condition;

public  class calculator {
public static void utility(int a, int b, int operator){

    //write your code here
    String result;
        switch (operator) {
            case 1:
                result = String.valueOf(a + b);
                break;
            case 2:
                result = String.valueOf(a-b); // Note: Subtract `a` from `b`
                break;
            case 3:
                result = String.valueOf(a * b);
                break;
            default:
                result = "Invalid Input";
        }
        System.out.print(result); 
}
    

public static void main(String[] args) {
    
}
}