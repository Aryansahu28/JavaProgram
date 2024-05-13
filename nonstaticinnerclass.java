class Outerclass{
    public void heythere(){
        System.out.println("Hello from outer class");
    }
    public class InnerClass{
        public void whatsup(){
            System.out.println("What's up from inner class ");
        }
    }
}


public class nonstaticinnerclass {
    public static void main(String args[]){
        Outerclass out = new Outerclass();
        out.heythere();

        Outerclass.InnerClass inner = out.new InnerClass();
        inner.whatsup();
    }
}
