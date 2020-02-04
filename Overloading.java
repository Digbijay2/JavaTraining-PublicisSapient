public class Overloading{

    public long sum(int a, long b){
        System.out.println("int and long");
        return a+b;
    }

    public long sum(long a, int b){
        System.out.println("long and integer");
        return a+b;
    }

    public long sum(int a, int b){
        System.out.println("Both integers");
        return a+b;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.sum(12,12);
    }
    
}