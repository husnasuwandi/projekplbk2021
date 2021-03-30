public class Proyektor implements OnOff { 
    private LineInOut outputDevice; 
    private boolean isOff;
    String nama;

    public Proyektor(){ 
        outputDevice = null; 
        isOff = true; 
    }

    public void connectTo(LineInOut device) {
        outputDevice = device;
    }

    public void pressed() { 
        if (isOff && outputDevice != null) { 
            outputDevice.transmitData(); 
            isOff = !isOff;
        }else {
            System.out.println("Proyektor Mati");
            isOff = !isOff;
        } 
    }    
}