import javax.swing.*;
import javax.swing.plaf.ColorChooserUI;

import java.awt.*;
public class Test1
{
    
    public static void main(String[] args)
    {
        JFrame f1=new JFrame("Student Form");
        JTabbedPane tb=new JTabbedPane();
        //panel creation
        JPanel jp1=new JPanel();
        jp1.setLayout(null);
        JPanel jp2=new JPanel();
        jp2.setLayout(null);
        JPanel jp3=new JPanel();
        jp3.setLayout(null);
        jp1.setBackground(new Color(249,161,144)); 
        jp2.setBackground(new Color(3,18,17));
        jp3.setBackground(new Color(161,4,90));
       //tabbed pane
       tb.setBounds(20, 20, 900, 700);
       tb.add("Registration",jp1);
       tb.add("Login",jp2);
       tb.add("Search",jp3);
       //panel1
       //name labels
       JLabel name=new JLabel("FIRST NAME:",JLabel.LEFT);
       name.setFont(new java.awt.Font("Georgia",Font.BOLD,22));
       name.setFont(new java.awt.Font("Georgia",Font.ITALIC,22));
       name.setBounds(20,20,200,90);
       name.setForeground(Color.black);
       jp1.add(name);

       JTextField n1=new JTextField();
       n1.setFont(new Font("Times New Roman",Font.BOLD,25));
       n1.setBounds(180,50,200,30);
       n1.setForeground(Color.BLUE);
       jp1.add(n1);
       //middle name
       JLabel name1=new JLabel("MIDDLE NAME:",JLabel.LEFT);
       name1.setFont(new java.awt.Font("Georgia",Font.BOLD,22));
       name1.setFont(new java.awt.Font("Georgia",Font.ITALIC,22));
       name1.setBounds(20,60,200,90);
       name1.setForeground(Color.black);
       jp1.add(name1);

       JTextField n2=new JTextField();
       n2.setFont(new Font("Times New Roman",Font.BOLD,25));
       n2.setBounds(180,90,200,30);
       n2.setForeground(Color.BLUE);
       jp1.add(n2);
       //last name
       JLabel name3=new JLabel("LAST NAME:",JLabel.LEFT);
       name3.setFont(new java.awt.Font("Georgia",Font.BOLD,22));
       name3.setFont(new java.awt.Font("Georgia",Font.ITALIC,22));
       name3.setBounds(20,100,200,90);
       name3.setForeground(Color.black);
       jp1.add(name3);

       JTextField n3=new JTextField();
       n3.setFont(new Font("Times New Roman",Font.BOLD,25));
       n3.setBounds(180,130,200,30);
       n3.setForeground(Color.BLUE);
       jp1.add(n3);

       //email
       JLabel email=new JLabel("EMAIL:",JLabel.LEFT);
       email.setFont(new java.awt.Font("Georgia",Font.BOLD,22));
       email.setFont(new java.awt.Font("Georgia",Font.ITALIC,22));
       email.setBounds(20,140,200,90);
       email.setForeground(Color.black);
       jp1.add(email);

       JTextField e1=new JTextField();
       e1.setFont(new Font("Times New Roman",Font.BOLD,25));
       e1.setBounds(180,170,300,30);
       e1.setForeground(Color.BLUE);
       jp1.add(e1);

       //phno
       JLabel phno=new JLabel("PH NO:",JLabel.LEFT);
       phno.setFont(new java.awt.Font("Georgia",Font.BOLD,22));
       phno.setFont(new java.awt.Font("Georgia",Font.ITALIC,22));
       phno.setBounds(20,180,200,90);
       phno.setForeground(Color.black);
       jp1.add(phno);

       JTextField p1=new JTextField();
       p1.setFont(new Font("Times New Roman",Font.BOLD,25));
       p1.setBounds(180,210,200,30);
       p1.setForeground(Color.BLUE);
       jp1.add(p1);

       //regno
       JLabel regno=new JLabel("REG_NO:",JLabel.LEFT);
       regno.setFont(new java.awt.Font("Georgia",Font.BOLD,22));
       regno.setFont(new java.awt.Font("Georgia",Font.ITALIC,22));
       regno.setBounds(20,220,200,90);
       regno.setForeground(Color.black);
       jp1.add(regno);

       JTextField r1=new JTextField();
       r1.setFont(new Font("Times New Roman",Font.BOLD,25));
       r1.setBounds(180,250,200,30);
       r1.setForeground(Color.BLUE);
       jp1.add(r1);

       //gender
       JLabel gen =new JLabel("GENDER",JLabel.LEFT);
       gen.setFont(new java.awt.Font("Georgia",Font.BOLD,22));
       gen.setFont(new java.awt.Font("Georgia",Font.ITALIC,22));
       gen.setBounds(20,260,200,90);
       gen.setForeground(Color.black);
       jp1.add(gen);

       JComboBox gen1=new JComboBox();
       String colors[] = {"Male","Female"};
       gen1 =new JComboBox(colors);
       gen1.setBounds(180,290,90,30);
       jp1.add(gen1);

       //address
       JLabel add=new JLabel("ADDRESS:",JLabel.LEFT);
       add.setFont(new java.awt.Font("Georgia",Font.BOLD,22));
       add.setFont(new java.awt.Font("Georgia",Font.ITALIC,22));
       add.setBounds(20,300,200,90);
       add.setForeground(Color.black);
       jp1.add(add);

       JTextField a1=new JTextField();
       a1.setFont(new Font("Times New Roman",Font.BOLD,25));
       a1.setBounds(180,330,200,70);
       a1.setForeground(Color.BLUE);
       jp1.add(a1);

       //skills
       JLabel ho=new JLabel("HOBBIES:",JLabel.LEFT);
       ho.setFont(new java.awt.Font("Georgia",Font.BOLD,22));
       ho.setFont(new java.awt.Font("Georgia",Font.ITALIC,22));
       ho.setBounds(20,380,200,90);
       ho.setForeground(Color.black);
       jp1.add(ho);

       JTextField h1=new JTextField();
       h1.setFont(new Font("Times New Roman",Font.BOLD,25));
       h1.setBounds(180,410,200,70);
       h1.setForeground(Color.BLUE);
       jp1.add(h1);

       //button
       JButton b1=new JButton("SUBMIT");
       b1.setBounds(30,500,150,30);
       jp1.add(b1);
       b1.setBackground(new Color(0,206,209));
       b1.setForeground(new Color(75,0,130));
       JButton b2=new JButton("REFRESH");
       b2.setBounds(200,500,150,30);
       jp1.add(b2);
       b2.setBackground(new Color(0,206,209));
       b2.setForeground(new Color(75,0,130));
       JButton b3=new JButton("CANCEL");
       b3.setBounds(370,500,150,30);
       jp1.add(b3);
       b3.setBackground(new Color(0,206,209));
       b3.setForeground(new Color(75,0,130));

       //panel2
       JLabel lo=new JLabel("EMAIL:",JLabel.LEFT);
       lo.setFont(new java.awt.Font("Georgia",Font.BOLD,22));
       lo.setFont(new java.awt.Font("Georgia",Font.ITALIC,22));
       lo.setBounds(130,70,200,90);
       lo.setForeground(new Color(0,206,209));
       jp2.add(lo);
       JTextField y1=new JTextField();
       y1.setFont(new Font("Times New Roman",Font.BOLD,25));
       y1.setBounds(280,100,200,30);
       y1.setForeground(new Color(0,206,209));
       jp2.add(y1);

       JLabel po=new JLabel("PASSWORD:",JLabel.LEFT);
       po.setFont(new java.awt.Font("Georgia",Font.BOLD,22));
       po.setFont(new java.awt.Font("Georgia",Font.ITALIC,22));
       po.setBounds(130,110,200,90);
       po.setForeground(new Color(0,206,209));
       jp2.add(po);
       JTextField g1=new JTextField();
       g1.setFont(new Font("Times New Roman",Font.BOLD,25));
       g1.setBounds(280,140,200,30);
       g1.setForeground(new Color(0,206,209));
       jp2.add(g1);

       JButton m1=new JButton("LOGIN");
       m1.setBounds(100,220,150,30);
       jp2.add(m1);
       m1.setBackground(new Color(0,206,209));
       m1.setForeground(new Color(0,0,0));
       JButton m2=new JButton("FORGOT PASSWORD");
       m2.setBounds(270,220,200,30);
       jp2.add(m2);
       b2.setBackground(new Color(0,206,209));
       b2.setForeground(new Color(0,0,0));
       JButton m3=new JButton("CANCEL");
       m3.setBounds(490,220,150,30);
       jp2.add(m3);
       m3.setBackground(new Color(0,206,209));
       m3.setForeground(new Color(0,0,0));
       //panel3
       JLabel ko=new JLabel("REG_NO:",JLabel.LEFT);
       ko.setFont(new java.awt.Font("Georgia",Font.BOLD,22));
       ko.setFont(new java.awt.Font("Georgia",Font.ITALIC,22));
       ko.setBounds(130,70,200,90);
       ko.setForeground(new Color(3,18,17));
       jp3.add(ko);
       JTextField k1=new JTextField();
       k1.setFont(new Font("Times New Roman",Font.BOLD,25));
       k1.setBounds(280,100,200,30);
       k1.setForeground(new Color(0,206,209));
       jp3.add(k1); 
       JButton c1=new JButton("SEARCH");
       c1.setBounds(160,200,100,30);
       jp3.add(c1);
       c1.setBackground(new Color(3,18,17));
       c1.setForeground(new Color(0,206,209));
       JButton c2=new JButton("CANCEL");
       c2.setBounds(310,200,100,30);
       jp3.add(c2);
       c2.setBackground(new Color(3,18,17));
       c2.setForeground(new Color(0,206,209));
       f1.setSize(1000,800);
       f1.setLayout(null); 
       f1.setVisible(true);
       f1.add(tb,BorderLayout.CENTER);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}