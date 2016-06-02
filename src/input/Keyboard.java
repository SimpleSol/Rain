package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Leon on 26.05.2016.
 */
public class Keyboard implements KeyListener {

    public boolean up;
    public boolean down;
    public boolean left;
    public boolean right;

    private boolean[] keys = new boolean[120];

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    public void update() {
        up = keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_DOWN] || keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_LEFT] || keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_RIGHT] || keys[KeyEvent.VK_D];
    }

}
