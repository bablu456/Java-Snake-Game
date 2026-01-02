import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GameFrame(){
        this.setTitle("Snake Game - By Bablu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);  // screen ke beech me laane ke liye
    }
}
