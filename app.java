package gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.plaf.metal.*;
import com.jgoodies.forms.factories.*;

/**
 * @author Dmitry
 */
public class test extends JPanel {
    public test() {
        initComponents();
    }

    private void initComponents() {
        layeredPane1 = new JLayeredPane();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        button5 = new JButton();
        button7 = new JButton();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button6 = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
        .EmptyBorder(0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder.CENTER,javax
        .swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,
        12),java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans
        .PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.
        getPropertyName()))throw new RuntimeException();}});

        //======== layeredPane1 ========
        {
            layeredPane1.setBackground(Color.white);
            layeredPane1.setOpaque(true);
            layeredPane1.setBorder(null);
            layeredPane1.setForeground(Color.white);
            layeredPane1.setFont(new Font("Arial", Font.PLAIN, 7));

            //---- textField1 ----
            textField1.setText("Stringer");
            textField1.setFont(new Font("Arial Black", textField1.getFont().getStyle() | Font.BOLD, textField1.getFont().getSize() + 4));
            textField1.setBackground(Color.white);
            textField1.setBorder(new MatteBorder(0, 0, 1, 0, Color.black));
            textField1.setHorizontalAlignment(SwingConstants.CENTER);
            layeredPane1.add(textField1, JLayeredPane.DEFAULT_LAYER);
            textField1.setBounds(85, 35, 165, textField1.getPreferredSize().height);

            //---- textField2 ----
            textField2.setText("2013");
            textField2.setFont(new Font("Arial Black", textField2.getFont().getStyle() | Font.BOLD, textField2.getFont().getSize() + 4));
            textField2.setBackground(Color.white);
            textField2.setBorder(new MatteBorder(0, 0, 1, 0, Color.black));
            textField2.setHorizontalAlignment(SwingConstants.CENTER);
            layeredPane1.add(textField2, JLayeredPane.DEFAULT_LAYER);
            textField2.setBounds(290, 70, 165, 25);

            //---- textField3 ----
            textField3.setText(" \u0442\u0440\u0438\u043b\u043b\u0435\u0440");
            textField3.setFont(new Font("Arial Black", textField3.getFont().getStyle() | Font.BOLD, textField3.getFont().getSize() + 4));
            textField3.setBackground(Color.white);
            textField3.setBorder(new MatteBorder(0, 0, 1, 0, Color.black));
            textField3.setHorizontalAlignment(SwingConstants.CENTER);
            layeredPane1.add(textField3, JLayeredPane.DEFAULT_LAYER);
            textField3.setBounds(290, 105, 165, 25);

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setFont(table1.getFont().deriveFont(table1.getFont().getSize() + 1f));
                scrollPane1.setViewportView(table1);
            }
            layeredPane1.add(scrollPane1, JLayeredPane.DEFAULT_LAYER);
            scrollPane1.setBounds(35, 95, 245, 160);
        }

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u0424\u0430\u0439\u043b");

                //---- button5 ----
                button5.setText("\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c");
                button5.setAlignmentX(0.5F);
                menu1.add(button5);

                //---- button7 ----
                button7.setText("\u0412\u044b\u0439\u0442\u0438");
                button7.setAlignmentX(0.5F);
                menu1.add(button7);
            }
            menuBar1.add(menu1);
        }

        //---- button1 ----
        button1.setText("\u0424\u0438\u043b\u044c\u043c\u044b");
        button1.setFont(new Font("Arial", button1.getFont().getStyle(), button1.getFont().getSize() + 1));
        button1.setAlignmentX(0.5F);

        //---- button2 ----
        button2.setText("\u0410\u043a\u0442\u0451\u0440\u044b");
        button2.setFont(new Font("Arial", button2.getFont().getStyle(), button2.getFont().getSize() + 1));

        //---- button3 ----
        button3.setText("\u0420\u0435\u0436\u0438\u0441\u0441\u0451\u0440\u044b");
        button3.setFont(new Font("Arial", button3.getFont().getStyle(), button3.getFont().getSize() + 1));

        //---- button4 ----
        button4.setText("\u0421\u0435\u0430\u043d\u0441\u044b");
        button4.setFont(new Font("Arial", button4.getFont().getStyle(), button4.getFont().getSize() + 1));

        //---- button6 ----
        button6.setText("\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c");
        button6.setFont(new Font("Arial", button6.getFont().getStyle(), button6.getFont().getSize() + 1));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addComponent(menuBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup()
                        .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(button6, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addComponent(layeredPane1, GroupLayout.PREFERRED_SIZE, 489, GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                            .addComponent(button1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button4)
                            .addGap(197, 197, 197)
                            .addComponent(button6)
                            .addGap(40, 40, 40))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(layeredPane1, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(10, Short.MAX_VALUE))))
        );
    }


    private JLayeredPane layeredPane1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JButton button5;
    private JButton button7;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button6;

}
