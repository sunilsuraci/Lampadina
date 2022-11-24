public class Lampadina {
    
    //Attributi
    private int maxUse;//max volte che può accendersi
    private int countClick;//il numero di click
    private String light;//spenta o accesa

    //costruttore
    public Lampadina( int countClick, String light){
        this.maxUse = 40;
        this.countClick = countClick;
        this.light = "accesa";
    }

    //metodi

    //per accendere o spegnere
    public void click(){
       if(countClick == maxUse) {
        this.light = "rotta";
       } else if (light.equals(light)){
        this.light = "spenta";
       } else{
        this.light = "accesa";
       }
    }

    public  void stato(){
        
        if(countClick == maxUse){

        }
    }

}