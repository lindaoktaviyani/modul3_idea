import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiByText extends JFrame{
    JLabel label1 = new JLabel("Input Nama");
    JTextField textField1 = new JTextField();
    JButton button1 = new JButton("Greet");

    JLabel label2 = new JLabel("Panjang");
    JLabel label3 = new JLabel("Lebar");
    JLabel label4 = new JLabel("Hasil");
    JTextField tP = new JTextField();
    JTextField tL = new JTextField();
    JTextField tH = new JTextField();
    JButton bHitung = new JButton("Hitung luas");


    GuiByText(){
        setSize(640, 480);
        setLocationRelativeTo(null);
        setTitle("GUI By Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void meletakkanKomponen(){
        getContentPane().setLayout(null);

        getContentPane().add(label1);
        getContentPane().add(textField1);
        getContentPane().add(button1);
        getContentPane().add(label2);
        getContentPane().add(label3);
        getContentPane().add(label4);
        getContentPane().add(tP);
        getContentPane().add(tL);
        getContentPane().add(tH);
        getContentPane().add(bHitung);


        label1.setBounds(16,32,100,25);
        textField1.setBounds(124,32,100,25);
        button1.setBounds(232,32,80,25);
        label2.setBounds(16,80,100,25);
        tP.setBounds(124,80,100,25);
        label3.setBounds(16,113,100,25);
        tL.setBounds(124,113,100,25);
        bHitung.setBounds(16,146,208,25);
        label4.setBounds(16,179,100,25);
        tH.setBounds(124,179,100,25);
    }

    void meletakkanlistener(){
        button1.addActionListener(e -> {
            String nama = textField1.getText();
            JOptionPane.showMessageDialog(null,"Hai " + nama);
        });

        bHitung.addActionListener(actionEvent -> {
            int p = Integer.parseInt(tP.getText());
            int l = Integer.parseInt(tL.getText());

            int h = p * l;
            String sH = String.valueOf(h);

            tH.setText(sH);
        });
    }

    public static void main(String[] args){
        GuiByText guiByText = new GuiByText();
        guiByText.meletakkanKomponen();
        guiByText.meletakkanlistener();
        guiByText.setVisible(true);
    }
}
