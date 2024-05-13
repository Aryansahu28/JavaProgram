class Outerclass{
    public void heythere(){
        System.out.println("Hey there from Outer Class");
    }
    public static class Inner_class{
        public void whatsup(){
            System.out.println("konichiwa from static inner class");
        }    }
}
public class staticinnerclass {
    public static void main(String args[]){
        Outerclass.Inner_class inn = new Outerclass.Inner_class();
        
    }
}
