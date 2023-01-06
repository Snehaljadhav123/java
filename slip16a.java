
import java.awt.*;  
class slip16a
{  
     slip16a(){  
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu menu=new Menu("File");  
         Menu menu1=new Menu("Edit");  
         Menu menu2=new Menu("About");  
         MenuItem i1=new MenuItem("New");  
         MenuItem i2=new MenuItem("Open");  
         MenuItem i3=new MenuItem("Save");  
         MenuItem i4=new MenuItem("Show About");  
         MenuItem i5=new MenuItem("Exit");  
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         menu.add(i4);  
         menu.add(i5);  
         mb.add(menu); 
         mb.add(menu1);  
         mb.add(menu2);  
 
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
}  
public static void main(String args[])  
{  
new slip16a();  
}  
}  























