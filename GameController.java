import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class GameController implements ActionListener
{
    GameModel model;
    GameView view;
    public boolean circle = false;
    public int counter;

    public GameController(GameModel model, GameView view)
    {
        this.model = model;
        this.view = view;
        this.counter = 1;
    }
    public void start()
    {
        this.view.SetController(this);
        this.view.shown();
    }

    @Override
	public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String id = button.getActionCommand();
        int id2 = Integer.parseInt(id);
        int i = (id2) / 3;
        int j = (id2) % 3;

        
		if (button.getText().length() > 0) {
			return;
		}

		if (this.counter % 2 == 1) {
            button.setText("O");
            if (this.model.SetCircle(i, j))
            {
                JOptionPane.showMessageDialog(null, "Circle wins!");
                this.view.exit();
            }
		} else {
            button.setText("X");
            if (this.model.SetCross(i, j))
            {
                JOptionPane.showMessageDialog(null, "Cross wins!");
                this.view.exit();
            }
		}
        this.counter += 1;
        if (this.counter == 9)
        {
            JOptionPane.showMessageDialog(null, "Game over. It's a tie!");
            this.view.exit();
        }
	}
}

class Game
{
    public static void main (String[] args) 
    {
        GameModel model = new GameModel();
        GameView view = new GameView();
        GameController controller = new GameController(model, view);
        controller.start();
    }
}