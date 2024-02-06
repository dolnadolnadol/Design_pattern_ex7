public class ImageProxy implements IImage{
    private String fileName;
    private Image image;
    
    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }
    
    public void display() {
        if (image == null) {
            image = new Image(fileName);
        }
        image.display();
    }
}