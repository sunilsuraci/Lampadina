public class Lampadina {
    
    private int maxUse;
    private static String interruttore;

    public Lampadina(){
        this.maxUse = 40;
        this.interruttore = interruttore;
    }

     
    public static void click(){
        if(interruttore =="Spento"){
            interruttore = "Acceso";
        }else{
            interruttore ="Acceso";
        }
    }

    public static void stato(){
        
    }

}