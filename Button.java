public class Button { 
    private OnOff connectedDevice;

    public Button(){ 
        connectedDevice=null ;
    }

    public void connectTo(OnOff conDev) { 
        connectedDevice = conDev; 
    }

    public void buttonPressed() { 
        connectedDevice.pressed(); 
    }
}
