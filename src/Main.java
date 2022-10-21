public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Muhammed Ali Cly",35,150,90,50);
        Fighter f2 =new Fighter("Mike Tyson",20,120,80,30);
        Ring r=new Ring( f1, f2,70,100);
            r.run();


    }
}