
public class SeqArith implements Sequence{
    private int number;
    
    public SeqArith(int number){
        this.number=number;
    }
    
    @Override
    public int getNext(){
        if(number+1>Sequence.max){
            return number;
        }
        else 
            return number+1;
    }
    
    @Override
    public int getPrevious(){
        if (number-1<Sequence.min){
            return number;
        }
        else
            return number-1;
    }
}
