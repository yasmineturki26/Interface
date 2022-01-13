
public class SeqDouble implements Sequence {
    
    private int number;
    
    public SeqDouble (int number){
        this.number=number;
    }
    
    @Override
    public int getNext(){
        if (number*2>Sequence.max){
            return number;
        }
        else 
            return number=number*2;
    }
    
    @Override
    public int getPrevious(){
        if (number/2<Sequence.min){
            return number;
        }
        else
            return number=(int)number/2;
    }
}
