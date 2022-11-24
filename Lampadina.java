public class Lampadina {
    
    //Attributi
    private int maxUse;//max volte che può accendersi
    private int countClick;//il numero di click
    private boolean light;//spenta o accesa

    //costruttore
    public Lampadina( int countClick){
        this.maxUse = 40;
        this.countClick = countClick;
        this.light = true;
    }

     
    public void click(){
        if(this.light == true){
            light = false;
        }else{
            light= false;
        }
    }

    public static void stato(){

    }

}