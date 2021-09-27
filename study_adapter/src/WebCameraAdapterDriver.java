public class WebCameraAdapterDriver implements USB {

    private WebCamera webCamera;

    public WebCameraAdapterDriver(WebCamera webCamera) {
        setWebCamera(webCamera);
    }

    @Override
    public void connectWithUsbCable() {
        webCamera.connect();
        webCamera.takePicture();
        webCamera.removeWebCamera();
    }

    @Override
    public void disconnectFromUsbCable() {
        System.out.println("Выключение службы драйвера веб-камеры");
    }

    public WebCamera getWebCamera() {
        return webCamera;
    }

    public void setWebCamera(WebCamera webCamera) {
        this.webCamera = webCamera;
    }
}
