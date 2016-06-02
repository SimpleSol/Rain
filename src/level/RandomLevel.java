package level;

import java.util.Random;

/**
 * Created by Leon on 02.06.2016.
 */
public class RandomLevel extends Level {

    private Random random = new Random();

    public RandomLevel(int width, int height) {
        super(width, height);
    }

    @Override
    protected void generateLevel() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                tiles[x + (y * width)] = random.nextInt(4);
            }
        }
    }
}
