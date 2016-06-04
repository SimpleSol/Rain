package level.tile;

import graphics.Screen;
import graphics.Sprite;

/**
 * Created by Leon on 04.06.2016.
 */
public class Tile {

    public static Tile grass = new GrassTile(Sprite.grass);

    public int x;
    public int y;
    public Sprite sprite;

    public Tile(Sprite sprite) {
        this.sprite = sprite;
    }

    public void render(int x, int y, Screen screen) {

    }

    public boolean solid() {
        return false;
    }

}
