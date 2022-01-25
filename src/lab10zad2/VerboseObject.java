package lab10zad2;

public class VerboseObject {
   private String name; 

    public VerboseObject(String name) {
        this.name = name;
        System.out.println(name+" constructed");
    }
   
   public void finalize(){
        System.out.println(name+" deconstructed");
   }
   
   public void saySomething(){
       System.out.println(name+" said");
   }
}
