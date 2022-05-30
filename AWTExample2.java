import java.awt.*; 
class AWTExample2 extends Frame { 
 // initializing using constructor 
 AWTExample2() { 
 
 // creating a Label 
 Label l = new Label("Employee id:"); 
 // creating a Button 
 Button b = new Button("Submit"); 
 // creating a TextField 
 TextField t = new TextField(); 
 // creating a choice
 Choice c = new Choice();
 c.add("Male");
 c.add("Female");
 c.add("Others");
 
 // setting position of above components in the frame 
 l.setBounds(20, 80, 80, 30); 
 t.setBounds(20, 110, 80, 30); 
 b.setBounds(100, 110, 80, 30); 
 c.setBounds(20,140,80,30); 
 // adding components into frame 
 add(b); 
 add(l); 
 add(t); 
 add(c);

 // frame size 800 width and 700 height 
 setSize(800,700); 
 
 // frame colour
 setBackground(Color.RED);
 
 // setting the title of frame 
 setTitle("Employee info"); 
 
 // no layout 
 setLayout(null); 
 
 // setting visibility of frame 
 setVisible(true); 
} 
 
// main method 
public static void main(String args[]) { 
 
// creating instance 
AWTExample2 f = new AWTExample2(); 
 
} 
 
}