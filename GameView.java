import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class GameView 
{
    private JFrame frame;
    private JButton[] buttons;

    public GameView() 
    {
        // Create and set up the window.
        frame = new JFrame("TicTacToe Game");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create grid layout
        int rows = 3;
        int cols = 3;
        GridLayout layout = new GridLayout(rows, cols);
        frame.setLayout(layout);

        buttons = new JButton[9];
        // Create buttons
        for (int i = 0; i <= 8; i++) 
        {
            buttons[i] = new JButton();
            buttons[i].setActionCommand(String.format("%d", i));
            frame.add(buttons[i]);
        }
    }

    public void shown() 
    {
        frame.setVisible(true);
    }

    public void SetController(GameController c) 
    {
        // Add OnClicked event
        //buttons[0].addActionListener(c);
        for (int i = 0; i <= 8; i += 1)
        {
            buttons[i].addActionListener(c);
        }
    }
    public void exit()
    {
        this.frame.dispose();
    }
}
