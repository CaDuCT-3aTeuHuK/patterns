public class Main {

    public static void main(String[] args) {
        USB cardReader = new CardReader(new MicroSD());
        cardReader.connectWithUsbCable();
        cardReader.disconnectFromUsbCable();
        USB webCameraAdapterDriver = new WebCameraAdapterDriver(new WebCamera());
        webCameraAdapterDriver.connectWithUsbCable();
    }
}
