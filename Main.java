public class Main{
    public static void main (String args[]){
        Komputer myComputer = new Komputer(); 
        Proyektor myProyektor = new Proyektor(); 
        Button buttonP = new Button(); 
        Button buttonC = new Button();
        
        myProyektor.connectTo(myComputer); 
        buttonC.connectTo(myComputer); 
        buttonP.connectTo(myProyektor); 
        buttonC.buttonPressed();
        buttonP.buttonPressed();
        buttonP.buttonPressed();
    }
}