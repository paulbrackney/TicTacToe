import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeGUI extends JFrame implements ActionListener {
    
JButton b1;
JButton b2;
JButton b3;
JButton b4;
JButton b5;
JButton b6;
JButton b7;
JButton b8;
JButton b9;

    TicTacToeGUI(String title){
        
        super(title);
        setLayout(new GridLayout(3,3));
        b1 = new JButton("");
        b1.addActionListener(this);
        b1.setActionCommand("c1");
        b2 = new JButton("");
        b2.setActionCommand("c2");;
        b2.addActionListener(this);
        b3 = new JButton("");
        b3.setActionCommand("c3");;
        b3.addActionListener(this);
        b4 = new JButton("");
        b4.setActionCommand("c4");;
        b4.addActionListener(this);
        b5 = new JButton("");
        b5.setActionCommand("c5");;
        b5.addActionListener(this);
        b6 = new JButton("");
        b6.setActionCommand("c6");;
        b6.addActionListener(this);
        b7 = new JButton("");
        b7.setActionCommand("c7");;
        b7.addActionListener(this);
        b8 = new JButton("");
        b8.setActionCommand("c8");;
        b8.addActionListener(this);
        b9 = new JButton("");
        b9.setActionCommand("c9");;
        b9.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void checkWin(){
        boolean win1 = false;
        boolean win2 = false;
        boolean win3 = false;
        boolean win4 = false;
        boolean win5 = false;
        boolean win6 = false;
        boolean win7 = false;
        boolean win8 = false;
        boolean computer = true;

        if(b1.getText() == b2.getText() && b1.getText() == b3.getText()){
            if(b1.getText() != ""){win1 = true;}
            if(b1.getText() == "X"){
                computer = false;
            }
        }
        if(b1.getText() == b4.getText() && b1.getText() == b7.getText()){
            if(b1.getText() != ""){win2 = true;}
            if(b1.getText() == "X"){
                computer = false;
            }
        }
        if(b5.getText() == b2.getText() && b5.getText() == b8.getText()){
            if(b5.getText() != ""){win3 = true;}
            if(b5.getText() == "X"){
                computer = false;
            }
        }
        if(b4.getText() == b5.getText() && b4.getText() == b6.getText()){
            if(b4.getText() != ""){win4 = true;}
            if(b4.getText() == "X"){
                computer = false;
            }
        }
        if(b7.getText() == b8.getText() && b8.getText() == b9.getText()){
            if(b7.getText() != ""){win5 = true;}
            if(b7.getText() == "X"){
                computer = false;
            }
        }
        if(b3.getText() == b6.getText() && b6.getText() == b9.getText()){
            if(b3.getText() != ""){win6 = true;}
            if(b3.getText() == "X"){
                computer = false;
            }
        }
        if(b1.getText() == b5.getText() && b5.getText() == b9.getText()){
            if(b1.getText() != ""){
                win7 = true;
            }
            if(b1.getText() == "X"){
                computer = false;
            }
        }
        if(b3.getText() == b5.getText() && b3.getText() == b7.getText()){
            if(b3.getText() != ""){
                win8 = true;
            }
            if(b3.getText() == "X"){
                computer = false;
            }
        }

        if(win1 || win2 || win3 || win4 || win5 || win6 || win7 || win8){
            JFrame winner = new JFrame("Game over!");
            JLabel label;
            if(computer){
                label = new JLabel("You have lost the game. Better luck next time!");
            } else {
                label = new JLabel("You won! Congratulations!");
            }
            winner.add(label);
            winner.setSize(1000,1000);
            winner.setVisible(true);
        }

    }

    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()){
            case "c1" : 
            b1.setText("X");
            break;
            case "c2" : 
            b2.setText("X");
            break;
            case "c3" : 
            b3.setText("X");
            break;
            case "c4" : 
            b4.setText("X");
            break;
            case "c5" : 
            b5.setText("X");
            break;
            case "c6" : 
            b6.setText("X");
            break;
            case "c7" : 
            b7.setText("X");
            break;
            case "c8" : 
            b8.setText("X");
            break;
            case "c9" : 
            b9.setText("X");
            break;
            default: System.out.print("");
        }

        checkWin();

        if(b1.getText() == ""){
            b1.setText("O");
        } else if(b2.getText() == ""){
            b2.setText("O");
        } else if (b5.getText() == ""){
            b5.setText("O");
        } else if (b9.getText() == ""){
            b9.setText("O");
        } else if (b4.getText() == ""){
            b4.setText("O");
        } else if (b7.getText() == ""){
            b7.setText("O");
        } else if (b3.getText() == ""){
            b3.setText("O");
        } else if (b8.getText() == ""){
            b8.setText("O");
        } else {
            b6.setText("O");
        } 
    
        checkWin();
    }



    public static void main(String[] args){
        TicTacToeGUI game = new TicTacToeGUI("Tic-Tac-Toe");
        game.setBackground(Color.cyan);
        game.setSize(300,300);
        game.setVisible(true);
    }
}
