import java.util.List;

public class Topology {

    public NetworkDevice addRouterV4(NetworkDeviceBuilder Device,String modelName,String deviceName,String macAddress,String ipV4) {
        Device.turnOff();
        Device.setModelName("Netlab Ruter");
        Device.setDeviceName(deviceName);
        Device.setIpV4(ipV4);
        Device.setMacAddress(macAddress);
        return Device.turnOn();
    }

    public NetworkDevice addSwitch (NetworkDeviceBuilder Device,String modelName,String deviceName,String macAddress,String ipV4){
        Device.turnOff();
        Device.setModelName("Netlab Switch");
        Device.setDeviceName(deviceName);
        Device.setIpV4(ipV4);
        Device.setMacAddress(macAddress);
        return Device.turnOn();
    }

    public NetworkDevice addPCv4 (NetworkDeviceBuilder Device,String modelName,String deviceName,String macAddress,String ipV4){
        Device.turnOff();
        Device.setModelName("Netlab PC");
        Device.setDeviceName(deviceName);
        Device.setIpV4(ipV4);
        Device.setMacAddress(macAddress);
        return Device.turnOn();
    }




}


