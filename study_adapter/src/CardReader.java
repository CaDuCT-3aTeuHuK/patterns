public class CardReader implements USB{

    private MicroSD microSD;

    public CardReader(MicroSD microSD){
        setMicroSD(microSD);
    }

    @Override
    public void connectWithUsbCable() {
        getMicroSD().insert();
        getMicroSD().copyData();
        getMicroSD().removeMicroSD();
    }

    @Override
    public void disconnectFromUsbCable() {
        System.out.println("Кардридер успешнно отключен");
    }

    public MicroSD getMicroSD() {
        return microSD;
    }

    public void setMicroSD(MicroSD microSD) {
        this.microSD = microSD;
    }
}
