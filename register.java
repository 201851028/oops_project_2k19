import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class register {
   /* 
    public static void main(String[] args){
      new register();
    }
*/
  register(){
      JFrame f = new JFrame();
      JLabel l1 = new JLabel("Full Name");
      JLabel l = new JLabel("Registration Form");
      Choice c = new Choice();
      Choice c1 = new Choice();
      c.setBounds(180,220,100,30);
      l.setBounds(150,20,130,30);
      l1.setBounds(20,60,100,30);
       JLabel l2 = new JLabel("Date of birth");
       l2.setBounds( 20,100,100,30);
        JLabel l3 = new JLabel("Address");
        l3.setBounds(20,140,100,30);
         JLabel l4 = new JLabel("Mobile no.");
         l4.setBounds(20,180,100,30);
          JLabel l5 = new JLabel("Loan type");
          l5.setBounds(20,220,100,30);
          JLabel l6 = new JLabel("Gender");
          l6.setBounds(20,260,100,30);

          JLabel l7 = new JLabel("year");
          l7.setBounds(20,300,100,30);
          JLabel l8 = new JLabel("amount");
          l8.setBounds(20,340,100,30);

//this is for "your registration successful"... JLabel l9
           JLabel l10 = new JLabel();
          l10.setBounds( 160,440,180,30);
         
          JTextField b1 = new JTextField();
          b1.setBounds(180,60,100,30);
          //JTextField b2 = new JTextField();
           //b2.setBounds(180,100,100,30);
           JButton b2 = new JButton();
           b2.setBounds(180,100,100,30);

           JLabel l9 = new JLabel();
           l9.setBounds(180,300,100,30);


            JTextField b3 = new JTextField();
             b3.setBounds(180,140,100,30);
             JTextField b4 = new JTextField();
              b4.setBounds(180,180,100,30);
              //JTextField b5 = new JTextField();
              // b5.setBounds(180,220,100,30);
               JTextField b6 = new JTextField();
               b6.setBounds(180,300,100,30);
               JTextField b7 = new JTextField();
                b7.setBounds(180,340,100,30);
  JButton b8 = new JButton("submit");
  b8.setBounds(160,390,80,40);
  JButton b9 = new JButton("reset");
  b9.setBounds(50,390,80,40);
                Choice c2 = new Choice();
                c2.setBounds(180,300,100,30);
                c2.add("select no. of years");c2.add("1");c2.add("2");c2.add("3");c2.add("4");c2.add("5");
             //   JTextField b8 = new JTextField();
             // b8.setBounds(180,380,100,30);
               c1.setBounds(180,260,100,30);
               c1.add("select option");
               c1.add("Male");
               c1.add("Female");
               c1.add("other");
               c.add("loan types");
               c.add("Home loan");
               c.add("personal loan");
               c.add("education loan");
               c.add("Agriculture loan");

   b2.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
       Picker ob=new Picker();  
       }
   });
  
  /* String name = b1.getText();
   String add=b3.getText();
   int mob= Integer.parseInt(b4.getText());
  /*
   MyObjectFileStore mof = new MyObjectFileStore(name,add,mob); 
   
   b1.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){     
        String s1=b1.getText(); 
        MyObjectFileStore obj=new MyObjectFileStore();
         obj.Customer(s1);
       }
   });
   b3.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
         String s3=b3.getText(); 
         MyObjectFileStore obj=new MyObjectFileStore();
         obj.Customer(s3);
       }
   });
   b4.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
            String s4=b4.getText();
         MyObjectFileStore obj=new MyObjectFileStore();
         obj.Customer(s4);
       }
   });

*/
//submit button action listener;;
   b8.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){

        String name = b1.getText();
      String add=b3.getText();
       int mob= Integer.parseInt(b4.getText());  
       MyObjectFileStore ob =new MyObjectFileStore(name,mob,add);
         l10.setText("your registration is successful");

       }
   });
  
//reset button action listener;
  b9.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
          
       }
   });


      f.add(c);f.add(c1);f.add(c2);
    f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l);f.add(l6);f.add(l7);f.add(l8);f.add(l9);
    f.add(l10);
    f.add(b1);    f.add(b2);    f.add(b3);    f.add(b4); /*f.add(b6);*/ f.add(b7); // f.add(b5);
    f.add(b8);f.add(b9);
    f.setSize(400,800);
    f.setLayout(null);
    f.setVisible(true);
  }

}
