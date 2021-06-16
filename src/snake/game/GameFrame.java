package snake.game;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //makes the window big enough for all components
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
