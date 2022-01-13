
public class Test {

    public static void main(String[] args) {
        SeqDouble s1 = new SeqDouble(5);
        SeqArith s2 = new SeqArith(10);
        
        System.out.println(s1.getNext());
        System.out.println(s2.getPrevious());
        
        Sequence.displayrange();
    }
    
}
