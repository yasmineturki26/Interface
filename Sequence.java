
public interface Sequence {
   int max=100;
   int min=0;
   
   public int getNext();
   public int getPrevious();
   
   static void displayrange(){
       System.out.println("Max = "+ max + "Min= "+ min);
   }
}
