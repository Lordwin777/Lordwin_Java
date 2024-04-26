import javax.swing.*;

class gui1{

    public static void main(String args[]){

        JFrame jframe = new JFrame("GUI1 Screen");   //create JFrame object

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.setSize(400,400);            //set size of GUI screen

        JButton pressButton = new JButton("Press");  //create JButton object

        jframe.getContentPane().add(pressButton);

        jframe.setVisible(true);

    }

}