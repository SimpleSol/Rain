package graphics;

/**
 * Created by Leon on 02.06.2016.
 */
public class Sprite {

    public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
    public final int SIZE;
    public int[] pixels;

    private int x;
    private int y;
    private SpriteSheet sheet;

    public Sprite(int size, int x, int y, SpriteSheet sheet) {
        this.SIZE = size;
        pixels = new int[SIZE * SIZE];
        this.x = x * SIZE;
        this.y = y * SIZE;
        this.sheet = sheet;
        load();
    }

    private void load() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                pixels[x + (y * SIZE)] = sheet.pixels[(x + this.x) + ( (y + this.y) * sheet.SIZE)];
            }
        }
    }
}
