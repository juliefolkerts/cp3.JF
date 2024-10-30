public class InternetDevicedisplay {
    public static void main(String[] args) {
        InternetDevice device1 = new InternetDevice("Laptop");
        InternetDevice device2 = new InternetDevice("Phone");
        InternetDevice device3 = new InternetDevice("Radio");
        InternetDevice device4 = new InternetDevice("TV");
        InternetDevice device5 = new InternetDevice("Ipad");

        InternetDevice.connect(device1);
        InternetDevice.connect(device2);
        InternetDevice.connect(device3);

        InternetDevice.displayStatus(device1);
        InternetDevice.displayStatus(device2);
        InternetDevice.displayStatus(device3);
        InternetDevice.displayStatus(device4);
        InternetDevice.displayStatus(device5);

        InternetDevice.displayConnections();
    }
}
