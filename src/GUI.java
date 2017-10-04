import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class GUI {
        public static void main(String args[]){

            String responce = JOptionPane.showInputDialog("Please choose an option");
            if(responce.equals("1")){
                JOptionPane.showMessageDialog(null, "You have decided to add two numbers together", "Choice 1", JOptionPane.PLAIN_MESSAGE);
                String number1 = JOptionPane.showInputDialog("Please enter your first number");
                String number2 = JOptionPane.showInputDialog("Please enter your second number");
                double number1_ = Double.parseDouble(number1);
                double number2_ = Double.parseDouble(number2);
                double numbertotal = number1_ + number2_;
                JOptionPane.showMessageDialog(null, "Your total is "+numbertotal, "Title", JOptionPane.PLAIN_MESSAGE);


            }else if(responce.equals("2")){
                JOptionPane.showMessageDialog(null, "You have decided to minus two numbers", "Choice 2", JOptionPane.PLAIN_MESSAGE);
                String number3 = JOptionPane.showInputDialog("Please enter your first number");
                String number4 = JOptionPane.showInputDialog("Please enter your second number");
                double number3_ = Double.parseDouble(number3);
                double number4_ = Double.parseDouble(number4);
                double numbertotal1 = number3_ - number4_;
                JOptionPane.showMessageDialog(null, "Your total is "+numbertotal1, "Title", JOptionPane.PLAIN_MESSAGE);

            }else if(responce.equals("3")){
                JOptionPane.showMessageDialog(null, "You have decided to multiply two numbers together", "Choice 3", JOptionPane.PLAIN_MESSAGE);
                String number5 = JOptionPane.showInputDialog("Please enter your first number");
                String number6 = JOptionPane.showInputDialog("Please enter your second number");
                double number5_ = Double.parseDouble(number5);
                double number6_ = Double.parseDouble(number6);
                double numbertotal2 = number5_ * number6_;
                JOptionPane.showMessageDialog(null, "Your total is "+numbertotal2, "Title", JOptionPane.PLAIN_MESSAGE);

            }else if(responce.equals("4")){
                JOptionPane.showMessageDialog(null, "You have decided to divide two numbers together", "Choice 4", JOptionPane.PLAIN_MESSAGE);
                String number7 = JOptionPane.showInputDialog("Please enter your first number");
                String number8 = JOptionPane.showInputDialog("Please enter your second number");
                double number7_ = Double.parseDouble(number7);
                double number8_ = Double.parseDouble(number8);
                double numbertotal3 = number7_ / number8_;
                JOptionPane.showMessageDialog(null, "Your total is "+numbertotal3, "Title", JOptionPane.PLAIN_MESSAGE);

            }else if(!responce.equals("1")){
                JOptionPane.showMessageDialog(null, "Please enter a valid input", "ERROR", JOptionPane.PLAIN_MESSAGE);
            }
        }
}
