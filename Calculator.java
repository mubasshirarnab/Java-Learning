import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    public Calculator(){
        this.setTitle("Calculator");
        this.setSize(1000,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JButton plus = new JButton("Plus");
        plus.setBounds(250,100,80,40);

        JButton minus = new JButton("Minus");
        minus.setBounds(500,100,80,40);

        JButton multi = new JButton("Multiply");
        multi.setBounds(250,200,80,40);

        JButton div = new JButton("Divide");
        div.setBounds(500,200,80,40);


        JTextField textField1 = new JTextField();
        textField1.setBounds(250,30,80,40);
        textField1.setFont(new Font("Arial",Font.ITALIC,20));

        JTextField textField2 = new JTextField();
        textField2.setBounds(500,30,80,40);

        JLabel label = new JLabel();
        label.setBounds(400,300,80,40);
        //label.getRootPane().setBackground(Color.BLUE);


        
        plus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                if (e.getActionCommand().equals("Plus")){
                    double result = num1 + num2;
                    label.setText(String.valueOf(result));
                }
            }
        });

        minus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());

                if (e.getActionCommand().equals("Minus")){
                    double result = num1 - num2;
                    textField2.setText(String.valueOf(result));
                }
            }
        });

        multi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());

                if (e.getActionCommand().equals("Multiply")){
                    double result = num1 * num2;
                    textField2.setText(String.valueOf(result));
                }
            }
        });
        div.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());

                if (e.getActionCommand().equals("Divide")){
                    double result = num1 / num2;
                    textField2.setText(String.valueOf(result));
                }
            }
        });




//        minus.addActionListener(new ButtonListener(plus,minus,multi,div,textField1,textField2,label));
//        multi.addActionListener(new ButtonListener(plus,minus,multi,div,textField1,textField2,label));
//        div.addActionListener(new ButtonListener(plus,minus,multi,div,textField1,textField2,label));

        this.add(plus);
        this.add(minus);
        this.add(multi);
        this.add(div);
        this.add(textField1);
        this.add(textField2);
        this.add(label);

        this.setLayout(null);
        this.setVisible(true);


    }
}

//class ButtonListener implements ActionListener{
//    JButton b1,b2,b3,b4;
//    JTextField t1, t2;
//    JLabel l1;
//
//    public ButtonListener(JButton b1, JButton b2, JButton b3, JButton b4, JTextField t1, JTextField t2, JLabel l1) {
//        this.b1 = b1;
//        this.b2 = b2;
//        this.b3 = b3;
//        this.b4 = b4;
//        this.t1 = t1;
//        this.t2 = t2;
//        this.l1 = l1;
//    }
//
//
//    @Override
////    public void actionPerformed(ActionEvent e) {
////        double num1 = Double.parseDouble(t1.getText());
////        double num2 = Double.parseDouble(t2.getText());
//
////        if (e.getActionCommand().equals("Plus")){
//////            double result = num1 + num2;
//////            l1.setText(String.valueOf(result));
//            //System.out.println(e.getActionCommand());
////        }
////        if (e.getActionCommand().equals("Minus")){
////           // double result = num1 - num2;
////            l1.setText(String.valueOf(result));
////        }
////        if (e.getActionCommand().equals("Multiply")){
////            double result = num1 * num2;
////            l1.setText(String.valueOf(result));
////        }
////        if (e.getActionCommand().equals("Divide")){
////            double result = num1 / num2;
////            l1.setText(String.valueOf(result));
////        }
//    }
//}

class Main2 {
    public static void main(String[] args) {
        Calculator C = new Calculator();
    }
}
