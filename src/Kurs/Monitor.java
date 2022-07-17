package Kurs;

public class Monitor {
    private int width = 1920;
    private int height = 1080;

    public void setLowResolution() {
        width = 800;
        height = 600;
    }

    public void setMaxResolution() {
        width = 3840;
        height = 1080;
    }
    public String getResolution() {
        return width + "x" + height;
    }
}
