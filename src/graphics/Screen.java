package graphics;

/**
 * Created by Leon on 15.05.2016.
 */
public class Screen {

    public int[] pixels;

    private int width;
    private int height;

    private int counter;
    private int time;

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];
    }

    public void render() {
        counter++;
        if (counter % 44 == 0) {
            time++;
        }
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                try {
                    pixels[(time + time * width) % pixels.length] = 0xff00ff;
                } catch (IndexOutOfBoundsException e) {
                    time = 0;
                }
            }
        }
    }

    public void clear() {
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = 0;
        }
    }

}
