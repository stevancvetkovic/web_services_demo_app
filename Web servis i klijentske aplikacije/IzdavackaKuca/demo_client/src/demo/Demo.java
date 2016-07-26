//package kuca;
package demo;
import kuca.*;

public class Demo
{
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Prikaz p = new Prikaz();
                p.setLocationRelativeTo(null);
                p.setVisible(true);
            }
        });
    }
}
