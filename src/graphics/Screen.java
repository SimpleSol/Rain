package graphics;

import java.util.Random;

/**
 * Created by Leon on 15.05.2016.
 */
public class Screen {

    public final int MAP_SIZE = 64;
    public final int MAP_SIZE_MASK = MAP_SIZE - 1;

    public int[] pixels;
    public int[] tiles = new int[MAP_SIZE * MAP_SIZE];

    private int width;
    private int height;
    private Random random = new Random();

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];

        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = random.nextInt(0xFFFFFF);
            tiles[0] = 0;
        }
    }

    public void render(int xOffset, int yOffset) {
        for (int y = 0; y < height; y++) {
            int yp = y + yOffset;
            if (yp < 0 || yp >= height) {
                continue;
            }
            for (int x = 0; x < width; x++) {
                int xp = x + xOffset;
                if (xp < 0 || xp >= width) {
                    continue;
                }
                pixels[xp + yp * width] = Sprite.grass.pixels[(x & 15) + ((y & 15) * Sprite.grass.SIZE)];
            }
        }
    }

    public void clear() {
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = 0;
        }
    }

}
