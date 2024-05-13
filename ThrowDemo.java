public class ThrowDemo{
    static void demoproc(){
        System.out.println("Throwing Error");
        try{
            throw new NullPointerException("Demo");
        }catch(NullPointerException e){
            System.out.println("Demoproc Exception caught");
            throw e;
        }
    }
    public static void main(String args[]){
        try{
            demoproc();
        }catch(NullPointerException e){
            System.out.println("Exception recaught" + e);
        }
    }
}