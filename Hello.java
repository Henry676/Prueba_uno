import java.util.Scanner;

public class Hello{
    private int [] numbers;

    public Hello(String [] values){
        this.numbers = new int[values.length];
    }

    public void conversion(String [] args){
        for(int i = 0; i<args.length; i++){
            numbers[i] = Integer.parseInt(args[i]);
        }
    }

    public boolean searchNumber(int n){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == n) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Hello h = new Hello(args);
        boolean flag = false;
        h.conversion(args);
        Scanner sc = new Scanner(System.in);
        System.out.println("Put a number: ");
        flag = h.searchNumber(sc.nextInt());
        if(flag) System.out.println("Number found");
        else System.out.println("Number does not exists");
        sc.close();

    }
}
//Dev 2 desarrollo una funcion que encuentre un numero en un array
//Documentando ando