package GameTTT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTGame extends JFrame implements ActionListener {
    public static int BoardSize = 3;
    private boolean crossTurn = false;

    private JButton buttons[][] = new JButton[BoardSize][BoardSize];

    private enum GameStatus {
        X_Wins, Z_Wins, Tie, GameINcomplete;

    }

    public TTTGame() {
        super.setTitle("Tic Tac Toe");
        super.setResizable(false);
    super.setSize(800, 800);


        GridLayout gridLayout = new GridLayout(BoardSize, BoardSize);
        super.setLayout(gridLayout);
        Font font = new Font("Comic Sans", 1, 125);
        for (int row = 0; row < BoardSize; row++) {
            for (int column = 0; column < BoardSize; column++) {
                JButton button = new JButton("");
                button.setFont(font);
                this.buttons[row][column] = button;
                button.addActionListener(this);
                super.add(button);
            }

        }

        super.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton Button = (JButton) e.getSource();
        makeMove(Button);
        GameStatus gs = getGameStatus();
        if (gs != GameStatus.GameINcomplete) {
            declareWinner(gs);
        }
    }

    private void makeMove(JButton button) {
        if (button.getText().length() > 0) {
            JOptionPane.showMessageDialog(this, "InvalidMove");
            return;
        }
        if (crossTurn) {
            button.setText("X");
        } else {
            button.setText("0");
        }
        crossTurn = !crossTurn;
    }

    private GameStatus getGameStatus() {
        String text1 = " ";
        String text2 = "";

        //Diagonal 1
        int row = 0;
        int col = 0;
        while (row < BoardSize - 1) {
            text1 = buttons[row][col].getText();
            text2 = buttons[row + 1][col + 1].getText();
            if (!text1.equals(text2) || text1.length() == 0) {
                break;

            }
            col++;
            row++;

        }
        if (row == BoardSize - 1) {
            if (text1.equals("X")) {
                return GameStatus.X_Wins;
            } else {
                return GameStatus.Z_Wins;
            }

        } row = 0;
        col = BoardSize - 1;
        while (row < BoardSize - 1) {
            text1 = buttons[row][col].getText();
            text2 = buttons[row + 1][col - 1].getText();
            if (!text1.equals(text2) || text1.length() == 0) {
                break;
            }
            row++;
            col--;
        }


        if (row == BoardSize - 1) {
            if (text1.equals("X")) {
                return GameStatus.X_Wins;
            } else {
                return GameStatus.Z_Wins;
            }
        }


        row = 0;
        while (row < BoardSize) {
            col = 0;
            while (col < BoardSize - 1) {
                text1 = buttons[row][col].getText();
                text2 = buttons[row][col + 1].getText();

                if (!text1.equals(text2) || text1.length() == 0) {
                    break;
                }
                col++;

            }


            if (col == BoardSize-1) {
                if (text1.equals("X")) {
                    return GameStatus.X_Wins;
                } else {
                    return GameStatus.Z_Wins;

                }
            }
            row++;

        }
        col = 0;
        while (col < BoardSize) {
            row =0;
            while (row < BoardSize - 1) {
                text1 = buttons[row][col].getText();
                text2 = buttons[row + 1][col].getText();

                if (!text1.equals(text2) || text1.length() == 0) {
                    break;
                }
                row++;

            }

            if (row == BoardSize - 1) {
                if (text1.equals("X")) {
                    return GameStatus.X_Wins;
                } else {
                    return GameStatus.Z_Wins;

                }
            }
            col++;
        }

        for (row=0;row<BoardSize;row++){
            for(col=0;col<BoardSize;col++){
                if(buttons[row][col].getText().length()==0){
                    return GameStatus.GameINcomplete;
                }
            }
        }
        return GameStatus.Tie;
    }

    private void declareWinner(GameStatus gs) {
        if (gs == GameStatus.X_Wins) {
            JOptionPane.showMessageDialog(this, "X Wins");

        } else if (gs == GameStatus.Z_Wins) {
            JOptionPane.showMessageDialog(this, "Z Wins");
        } else if (gs == GameStatus.Tie) {
            JOptionPane.showMessageDialog(this, "Tie");
        }
        int choice = JOptionPane.showConfirmDialog(this, "Restart?");
        if (choice == JOptionPane.YES_OPTION) {
            for (int row = 0; row < BoardSize; row++) {
                for (int col = 0; col < BoardSize; col++) {
                    buttons[row][col].setText("");
                }
            }

        } else {
            super.dispose();
        }
    }
}
