/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author Admin
 */
public class Pr3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World...");
       try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
        }
        Pr3_Frame1 pr3_f = new Pr3_Frame1();//создание объекта pr1_f с помощью Pr1_Frame1
        Dimension da=Toolkit.getDefaultToolkit().getScreenSize();//сохранение в объект размер экрана
        Dimension df=pr3_f.getSize();//сохранение в объект текущий размер формы
        pr3_f.setLocation((da.width-df.width)/2, (da.height-df.height)/2);//установка нового размера формы
        pr3_f.setVisible(true);//установка видимости формы
    }
    
}
