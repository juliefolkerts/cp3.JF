public class InternetDevice {
    String name;
    boolean connected;
    public static int connectedDevices = 0;

    public InternetDevice(String name){
        this.name = name;
        this.connected = false;
    }

    public static void connect(InternetDevice device){
        device.connected = true;  
        connectedDevices += 1;  
    }
    public static void disconect(InternetDevice device){
        device.connected = false;
        connectedDevices -= 1;
    }
    public static boolean isConnected(InternetDevice device){
        return device.connected;
    }
    public static void displayStatus(InternetDevice device){
        String status = "disconnected";
        if (isConnected(device) == true){
            status = "connected";
        }
        System.out.println(device.name+" is "+status);
    }
    public static void displayConnections(){
        System.out.println("Amount of connected devices: "+connectedDevices);
    }
}
