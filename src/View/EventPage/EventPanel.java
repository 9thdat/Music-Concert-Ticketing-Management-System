/*
 * Created by JFormDesigner on Tue Apr 25 08:30:00 ICT 2023
 */

package View.EventPage;

import java.awt.event.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author Admin
 */
public class EventPanel extends JPanel {
    public EventPanel() {
        initComponents();
        selectedTab(0);
    }
    Border border = BorderFactory.createLineBorder(Color.decode("#61b884"),1);

    private void jlbInfoMouseClicked(MouseEvent e) {
        jtbTabEvent.setSelectedIndex(0);
        selectedTab(0);
    }

    private void TicketFeeTextMouseClicked(MouseEvent e) {
        jtbTabEvent.setSelectedIndex(1);
        selectedTab(1);
    }

    private void jlbSeatMouseClicked(MouseEvent e) {
        jtbTabEvent.setSelectedIndex(2);
        selectedTab(2);
    }

    private void jlbInfoMouseEntered(MouseEvent e) {

    }

    private void jlbInfoMouseExited(MouseEvent e) {

    }

    private void jpnTicketFeeMouseClicked(MouseEvent e) {
        jtbTabEvent.setSelectedIndex(1);
        selectedTab(1);
    }

    private void jpnTicketFeeMouseEntered(MouseEvent e) {

    }

    private void TicketFeeTextMouseEntered(MouseEvent e) {

    }

    private void TicketFeeTextMouseExited(MouseEvent e) {

    }

    private void jlbSeatMouseEntered(MouseEvent e) {

    }

    private void jlbSeatMouseExited(MouseEvent e) {

    }

    private void jpnInfoMouseClicked(MouseEvent e) {
        jtbTabEvent.setSelectedIndex(0);
        selectedTab(0);
    }

    private void SeatPanelMouseClicked(MouseEvent e) {
        jtbTabEvent.setSelectedIndex(2);
        selectedTab(2);
    }

    public void selectedTab(int indexSelected) {
        switch(indexSelected) {
        case 0:
            jpnInfo.setBackground(Color.WHITE);
            jpnInfo.setBorder(border);
            jlbInfo.setForeground(Color.decode("#61b884"));
            //
            jpnTicketFee.setBackground(Color.decode("#61b884"));
            TicketFeeText.setForeground(Color.WHITE);
            //
            SeatPanel.setBackground(Color.decode("#61b884"));
            jlbSeat.setForeground(Color.WHITE);
            break;
        case 1:
            jpnInfo.setBackground(Color.decode("#61b884"));
            jlbInfo.setForeground(Color.WHITE);
            //
            jpnTicketFee.setBackground(Color.WHITE);
            jpnTicketFee.setBorder(border);
            TicketFeeText.setForeground(Color.decode("#61b884"));
            //
            SeatPanel.setBackground(Color.decode("#61b884"));
            jlbSeat.setForeground(Color.WHITE);
            break;
        case 2:
            jpnInfo.setBackground(Color.decode("#61b884"));
            jlbInfo.setForeground(Color.WHITE);
            //
            jpnTicketFee.setBackground(Color.decode("#61b884"));
            TicketFeeText.setForeground(Color.WHITE);
            //
            SeatPanel.setBackground(Color.WHITE);
            SeatPanel.setBorder(border);
            jlbSeat.setForeground(Color.decode("#61b884"));
            break;
        }
    }

    private void jlbBuyNowMouseClicked(MouseEvent e) {
        jpnInfo.setVisible(false);
        jpnTicketFee.setVisible(false);
        SeatPanel.setVisible(false);
        jpnBuyNow.setVisible(false);

        jtbTabEvent.setSelectedIndex(3);
    }

    private void jpnBuyNowMouseClicked(MouseEvent e) {
        jpnInfo.setVisible(false);
        jpnTicketFee.setVisible(false);
        SeatPanel.setVisible(false);
        jpnBuyNow.setVisible(false);

        jtbTabEvent.setSelectedIndex(3);
    }

    private void jlbNextButtonMouseClicked(MouseEvent e) {
        jtbTabEvent.setSelectedIndex(4);
    }

    private void jpnNextButtonMouseClicked(MouseEvent e) {

    }

    private void jpnBackMouseClicked(MouseEvent e) {
        jpnInfo.setVisible(true);
        jpnTicketFee.setVisible(true);
        SeatPanel.setVisible(true);
        jpnBuyNow.setVisible(true);

        jtbTabEvent.setSelectedIndex(0);
    }

    private void jlbBackMouseClicked(MouseEvent e) {
        jpnInfo.setVisible(true);
        jpnTicketFee.setVisible(true);
        SeatPanel.setVisible(true);
        jpnBuyNow.setVisible(true);

        jtbTabEvent.setSelectedIndex(0);
    }

    private void checkBox1(ActionEvent e) {
        isCheckSelected(1);
    }

    private void isCheckSelected(int index) {
        if(index == 1) {
            checkBox2.setSelected(false);
            checkBox3.setSelected(false);
        } else if (index == 2) {
            checkBox1.setSelected(false);
            checkBox3.setSelected(false);
        } else {
            checkBox1.setSelected(false);
            checkBox2.setSelected(false);
        }
    }

    private void checkBox2(ActionEvent e) {
        isCheckSelected(2);
    }

    private void checkBox3(ActionEvent e) {
        isCheckSelected(3);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Lê Xuân Quỳnh
        jpnEventHeader = new JPanel();
        EventArt = new JLabel();
        EventName = new JLabel();
        EventTime = new JLabel();
        EventPlace = new JLabel();
        jpnInfo = new JPanel();
        jlbInfo = new JLabel();
        jpnTicketFee = new JPanel();
        TicketFeeText = new JLabel();
        SeatPanel = new JPanel();
        jlbSeat = new JLabel();
        jpnBuyNow = new JPanel();
        jlbBuyNow = new JLabel();
        jtbTabEvent = new JTabbedPane();
        jpnEventInformation = new JPanel();
        scrollPane1 = new JScrollPane();
        InformationPanel = new JPanel();
        EventName2 = new JLabel();
        DescriptionText = new JLabel();
        button1 = new JButton();
        jpnEventTicket = new JPanel();
        TicketFee = new JPanel();
        Scroll = new JScrollPane();
        TicketFeeTable = new JTable();
        label1 = new JLabel();
        SeatEvent = new JPanel();
        label2 = new JLabel();
        jlbSeatingChart = new JLabel();
        jpnPickTicket = new JPanel();
        jpnNextButton = new JPanel();
        jlbNextButton = new JLabel();
        table1 = new JTable();
        jlbSeatingChart2 = new JLabel();
        jpnPayment = new JPanel();
        JlbInforCus = new JLabel();
        jlbPayment = new JLabel();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        table7 = new JTable();
        jpnBack = new JPanel();
        jlbBack = new JLabel();
        jpnNext = new JPanel();
        jlbNext = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();

        //======== this ========
        setBackground(Color.white);
        setMinimumSize(new Dimension(1268, 355));
        setPreferredSize(new Dimension(1030, 2000));
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
        . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing
        . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
        Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
        ) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
        public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName (
        ) )) throw new RuntimeException( ); }} );
        setLayout(null);

        //======== jpnEventHeader ========
        {
            jpnEventHeader.setBackground(Color.white);
            jpnEventHeader.setPreferredSize(new Dimension(1030, 355));

            //---- EventArt ----
            EventArt.setText("event art");
            EventArt.setBackground(new Color(0x33ffcc));
            EventArt.setBorder(LineBorder.createBlackLineBorder());

            //---- EventName ----
            EventName.setText("Event Name");
            EventName.setFont(new Font("Lato Black", Font.BOLD, 30));
            EventName.setForeground(new Color(0x61b884));

            //---- EventTime ----
            EventTime.setText("Event Time");
            EventTime.setFont(new Font("Lato", Font.PLAIN, 18));

            //---- EventPlace ----
            EventPlace.setText("Event Place");
            EventPlace.setFont(new Font("Lato", Font.PLAIN, 18));

            //======== jpnInfo ========
            {
                jpnInfo.setBackground(new Color(0x61b884));
                jpnInfo.setPreferredSize(new Dimension(140, 38));
                jpnInfo.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        jpnInfoMouseClicked(e);
                    }
                });

                //---- jlbInfo ----
                jlbInfo.setText("INFORMATION");
                jlbInfo.setForeground(Color.white);
                jlbInfo.setFont(new Font("Lato Black", Font.BOLD, 16));
                jlbInfo.setHorizontalTextPosition(SwingConstants.RIGHT);
                jlbInfo.setHorizontalAlignment(SwingConstants.CENTER);
                jlbInfo.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        jlbInfoMouseClicked(e);
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        jlbInfoMouseEntered(e);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        jlbInfoMouseExited(e);
                    }
                });

                GroupLayout jpnInfoLayout = new GroupLayout(jpnInfo);
                jpnInfo.setLayout(jpnInfoLayout);
                jpnInfoLayout.setHorizontalGroup(
                    jpnInfoLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, jpnInfoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jlbInfo, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                );
                jpnInfoLayout.setVerticalGroup(
                    jpnInfoLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, jpnInfoLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbInfo, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                );
            }

            //======== jpnTicketFee ========
            {
                jpnTicketFee.setBackground(new Color(0x61b884));
                jpnTicketFee.setPreferredSize(new Dimension(121, 38));
                jpnTicketFee.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        jpnTicketFeeMouseClicked(e);
                        jpnTicketFeeMouseClicked(e);
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        jpnTicketFeeMouseEntered(e);
                    }
                });

                //---- TicketFeeText ----
                TicketFeeText.setText("TICKET FEES");
                TicketFeeText.setForeground(Color.white);
                TicketFeeText.setFont(new Font("Lato Black", Font.BOLD, 16));
                TicketFeeText.setHorizontalTextPosition(SwingConstants.RIGHT);
                TicketFeeText.setHorizontalAlignment(SwingConstants.CENTER);
                TicketFeeText.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        TicketFeeTextMouseClicked(e);
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        TicketFeeTextMouseEntered(e);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        TicketFeeTextMouseExited(e);
                    }
                });

                GroupLayout jpnTicketFeeLayout = new GroupLayout(jpnTicketFee);
                jpnTicketFee.setLayout(jpnTicketFeeLayout);
                jpnTicketFeeLayout.setHorizontalGroup(
                    jpnTicketFeeLayout.createParallelGroup()
                        .addComponent(TicketFeeText, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                );
                jpnTicketFeeLayout.setVerticalGroup(
                    jpnTicketFeeLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, jpnTicketFeeLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(TicketFeeText, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
                );
            }

            //======== SeatPanel ========
            {
                SeatPanel.setBackground(new Color(0x61b884));
                SeatPanel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        SeatPanelMouseClicked(e);
                    }
                });

                //---- jlbSeat ----
                jlbSeat.setText("SEAT");
                jlbSeat.setForeground(Color.white);
                jlbSeat.setFont(new Font("Lato Black", Font.BOLD, 16));
                jlbSeat.setHorizontalTextPosition(SwingConstants.RIGHT);
                jlbSeat.setHorizontalAlignment(SwingConstants.CENTER);
                jlbSeat.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        jlbSeatMouseClicked(e);
                    }
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        jlbSeatMouseEntered(e);
                    }
                    @Override
                    public void mouseExited(MouseEvent e) {
                        jlbSeatMouseExited(e);
                    }
                });

                GroupLayout SeatPanelLayout = new GroupLayout(SeatPanel);
                SeatPanel.setLayout(SeatPanelLayout);
                SeatPanelLayout.setHorizontalGroup(
                    SeatPanelLayout.createParallelGroup()
                        .addComponent(jlbSeat, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                );
                SeatPanelLayout.setVerticalGroup(
                    SeatPanelLayout.createParallelGroup()
                        .addComponent(jlbSeat, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
            }

            //======== jpnBuyNow ========
            {
                jpnBuyNow.setBackground(new Color(0x61b884));
                jpnBuyNow.setPreferredSize(new Dimension(140, 38));
                jpnBuyNow.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        jpnBuyNowMouseClicked(e);
                    }
                });

                //---- jlbBuyNow ----
                jlbBuyNow.setText("BUY NOW");
                jlbBuyNow.setForeground(Color.white);
                jlbBuyNow.setFont(new Font("Lato Black", Font.BOLD, 16));
                jlbBuyNow.setHorizontalTextPosition(SwingConstants.RIGHT);
                jlbBuyNow.setHorizontalAlignment(SwingConstants.CENTER);
                jlbBuyNow.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        jlbBuyNowMouseClicked(e);
                    }
                });

                GroupLayout jpnBuyNowLayout = new GroupLayout(jpnBuyNow);
                jpnBuyNow.setLayout(jpnBuyNowLayout);
                jpnBuyNowLayout.setHorizontalGroup(
                    jpnBuyNowLayout.createParallelGroup()
                        .addComponent(jlbBuyNow, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                );
                jpnBuyNowLayout.setVerticalGroup(
                    jpnBuyNowLayout.createParallelGroup()
                        .addComponent(jlbBuyNow, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                );
            }

            GroupLayout jpnEventHeaderLayout = new GroupLayout(jpnEventHeader);
            jpnEventHeader.setLayout(jpnEventHeaderLayout);
            jpnEventHeaderLayout.setHorizontalGroup(
                jpnEventHeaderLayout.createParallelGroup()
                    .addGroup(jpnEventHeaderLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jpnEventHeaderLayout.createParallelGroup()
                            .addGroup(jpnEventHeaderLayout.createSequentialGroup()
                                .addComponent(EventArt, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpnEventHeaderLayout.createParallelGroup()
                                    .addGroup(jpnEventHeaderLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(jpnEventHeaderLayout.createParallelGroup()
                                            .addComponent(EventName, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EventTime, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EventPlace, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(GroupLayout.Alignment.TRAILING, jpnEventHeaderLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jpnBuyNow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jpnEventHeaderLayout.createSequentialGroup()
                                .addComponent(jpnInfo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpnTicketFee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SeatPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(89, Short.MAX_VALUE))
            );
            jpnEventHeaderLayout.setVerticalGroup(
                jpnEventHeaderLayout.createParallelGroup()
                    .addGroup(jpnEventHeaderLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jpnEventHeaderLayout.createParallelGroup()
                            .addComponent(EventArt, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnEventHeaderLayout.createSequentialGroup()
                                .addComponent(EventName, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EventTime, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EventPlace, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpnBuyNow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jpnEventHeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpnInfo, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(jpnTicketFee, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(SeatPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
            );
        }
        add(jpnEventHeader);
        jpnEventHeader.setBounds(0, 0, 1030, 350);

        //======== jtbTabEvent ========
        {
            jtbTabEvent.setPreferredSize(new Dimension(1079, 2000));

            //======== jpnEventInformation ========
            {

                //======== scrollPane1 ========
                {
                    scrollPane1.setPreferredSize(new Dimension(1020, 10021));

                    //======== InformationPanel ========
                    {
                        InformationPanel.setBackground(Color.white);

                        //---- EventName2 ----
                        EventName2.setText("EVENT NAME");
                        EventName2.setFont(new Font("Lato Black", Font.BOLD, 22));
                        EventName2.setForeground(new Color(0x61b884));
                        EventName2.setHorizontalAlignment(SwingConstants.LEFT);

                        //---- DescriptionText ----
                        DescriptionText.setText("Description Event");
                        DescriptionText.setVerticalAlignment(SwingConstants.TOP);
                        DescriptionText.setFont(new Font("Lato", Font.PLAIN, 14));

                        //---- button1 ----
                        button1.setText("EDIT");
                        button1.setForeground(Color.white);
                        button1.setBackground(new Color(0x61b884));
                        button1.setFont(new Font("Lato Black", Font.BOLD, 14));

                        GroupLayout InformationPanelLayout = new GroupLayout(InformationPanel);
                        InformationPanel.setLayout(InformationPanelLayout);
                        InformationPanelLayout.setHorizontalGroup(
                            InformationPanelLayout.createParallelGroup()
                                .addGroup(InformationPanelLayout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(InformationPanelLayout.createParallelGroup()
                                        .addComponent(DescriptionText, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(InformationPanelLayout.createSequentialGroup()
                                            .addComponent(EventName2, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                                            .addGap(549, 549, 549)
                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(59, Short.MAX_VALUE))
                        );
                        InformationPanelLayout.setVerticalGroup(
                            InformationPanelLayout.createParallelGroup()
                                .addGroup(InformationPanelLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(InformationPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EventName2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(DescriptionText, GroupLayout.PREFERRED_SIZE, 531, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(24, Short.MAX_VALUE))
                        );
                    }
                    scrollPane1.setViewportView(InformationPanel);
                }

                GroupLayout jpnEventInformationLayout = new GroupLayout(jpnEventInformation);
                jpnEventInformation.setLayout(jpnEventInformationLayout);
                jpnEventInformationLayout.setHorizontalGroup(
                    jpnEventInformationLayout.createParallelGroup()
                        .addGroup(jpnEventInformationLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jpnEventInformationLayout.setVerticalGroup(
                    jpnEventInformationLayout.createParallelGroup()
                        .addGroup(jpnEventInformationLayout.createSequentialGroup()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 576, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 47, Short.MAX_VALUE))
                );
            }
            jtbTabEvent.addTab("text", jpnEventInformation);

            //======== jpnEventTicket ========
            {

                //======== TicketFee ========
                {
                    TicketFee.setBackground(Color.white);
                    TicketFee.setFont(new Font("Lato Black", Font.BOLD, 18));

                    //======== Scroll ========
                    {

                        //---- TicketFeeTable ----
                        TicketFeeTable.setBorder(LineBorder.createBlackLineBorder());
                        Scroll.setViewportView(TicketFeeTable);
                    }

                    //---- label1 ----
                    label1.setText("TICKET");
                    label1.setForeground(new Color(0x61b884));
                    label1.setFont(new Font("Lato Black", Font.BOLD, 22));
                    label1.setHorizontalAlignment(SwingConstants.LEFT);

                    GroupLayout TicketFeeLayout = new GroupLayout(TicketFee);
                    TicketFee.setLayout(TicketFeeLayout);
                    TicketFeeLayout.setHorizontalGroup(
                        TicketFeeLayout.createParallelGroup()
                            .addGroup(TicketFeeLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(TicketFeeLayout.createParallelGroup()
                                    .addComponent(Scroll, GroupLayout.PREFERRED_SIZE, 509, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(473, Short.MAX_VALUE))
                    );
                    TicketFeeLayout.setVerticalGroup(
                        TicketFeeLayout.createParallelGroup()
                            .addGroup(TicketFeeLayout.createSequentialGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Scroll, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addGap(147, 147, 147))
                    );
                }

                GroupLayout jpnEventTicketLayout = new GroupLayout(jpnEventTicket);
                jpnEventTicket.setLayout(jpnEventTicketLayout);
                jpnEventTicketLayout.setHorizontalGroup(
                    jpnEventTicketLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, jpnEventTicketLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(TicketFee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                );
                jpnEventTicketLayout.setVerticalGroup(
                    jpnEventTicketLayout.createParallelGroup()
                        .addGroup(jpnEventTicketLayout.createSequentialGroup()
                            .addComponent(TicketFee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 48, Short.MAX_VALUE))
                );
            }
            jtbTabEvent.addTab("text", jpnEventTicket);

            //======== SeatEvent ========
            {
                SeatEvent.setBorder(null);
                SeatEvent.setBackground(Color.white);

                //---- label2 ----
                label2.setText("\u1ea2nh s\u01a1 \u0111\u1ed3 gh\u1ebf");
                label2.setBorder(LineBorder.createBlackLineBorder());

                //---- jlbSeatingChart ----
                jlbSeatingChart.setText("SEATING CHART");
                jlbSeatingChart.setForeground(new Color(0x61b884));
                jlbSeatingChart.setFont(new Font("Lato Black", Font.BOLD, 22));
                jlbSeatingChart.setHorizontalAlignment(SwingConstants.LEFT);

                GroupLayout SeatEventLayout = new GroupLayout(SeatEvent);
                SeatEvent.setLayout(SeatEventLayout);
                SeatEventLayout.setHorizontalGroup(
                    SeatEventLayout.createParallelGroup()
                        .addGroup(SeatEventLayout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jlbSeatingChart, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(760, Short.MAX_VALUE))
                );
                SeatEventLayout.setVerticalGroup(
                    SeatEventLayout.createParallelGroup()
                        .addGroup(SeatEventLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jlbSeatingChart, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(531, Short.MAX_VALUE))
                );
            }
            jtbTabEvent.addTab("text", SeatEvent);

            //======== jpnPickTicket ========
            {
                jpnPickTicket.setBackground(Color.white);
                jpnPickTicket.setPreferredSize(new Dimension(1025, 1000));

                //======== jpnNextButton ========
                {
                    jpnNextButton.setBackground(new Color(0x61b884));
                    jpnNextButton.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            jpnNextButtonMouseClicked(e);
                        }
                    });

                    //---- jlbNextButton ----
                    jlbNextButton.setText("NEXT");
                    jlbNextButton.setHorizontalAlignment(SwingConstants.CENTER);
                    jlbNextButton.setBorder(null);
                    jlbNextButton.setFont(new Font("Lato Black", Font.BOLD, 22));
                    jlbNextButton.setBackground(new Color(0x61b884));
                    jlbNextButton.setForeground(Color.white);
                    jlbNextButton.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            jlbNextButtonMouseClicked(e);
                        }
                    });

                    GroupLayout jpnNextButtonLayout = new GroupLayout(jpnNextButton);
                    jpnNextButton.setLayout(jpnNextButtonLayout);
                    jpnNextButtonLayout.setHorizontalGroup(
                        jpnNextButtonLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, jpnNextButtonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlbNextButton, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    jpnNextButtonLayout.setVerticalGroup(
                        jpnNextButtonLayout.createParallelGroup()
                            .addComponent(jlbNextButton, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    );
                }

                //---- jlbSeatingChart2 ----
                jlbSeatingChart2.setText("TICKET INFORMATION");
                jlbSeatingChart2.setForeground(new Color(0x61b884));
                jlbSeatingChart2.setFont(new Font("Lato Black", Font.BOLD, 22));
                jlbSeatingChart2.setHorizontalAlignment(SwingConstants.LEFT);

                GroupLayout jpnPickTicketLayout = new GroupLayout(jpnPickTicket);
                jpnPickTicket.setLayout(jpnPickTicketLayout);
                jpnPickTicketLayout.setHorizontalGroup(
                    jpnPickTicketLayout.createParallelGroup()
                        .addGroup(jpnPickTicketLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(jpnPickTicketLayout.createParallelGroup()
                                .addComponent(table1, GroupLayout.PREFERRED_SIZE, 596, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbSeatingChart2, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
                            .addGap(61, 61, 61)
                            .addComponent(jpnNextButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(138, Short.MAX_VALUE))
                );
                jpnPickTicketLayout.setVerticalGroup(
                    jpnPickTicketLayout.createParallelGroup()
                        .addGroup(jpnPickTicketLayout.createSequentialGroup()
                            .addGroup(jpnPickTicketLayout.createParallelGroup()
                                .addGroup(jpnPickTicketLayout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jlbSeatingChart2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(table1, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnPickTicketLayout.createSequentialGroup()
                                    .addGap(278, 278, 278)
                                    .addComponent(jpnNextButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(168, Short.MAX_VALUE))
                );
            }
            jtbTabEvent.addTab("text", jpnPickTicket);

            //======== jpnPayment ========
            {
                jpnPayment.setBackground(Color.white);
                jpnPayment.setPreferredSize(new Dimension(1079, 1000));

                //---- JlbInforCus ----
                JlbInforCus.setText("CUSTOMER INFORMATION");
                JlbInforCus.setFont(new Font("Lato Black", Font.BOLD, 16));
                JlbInforCus.setForeground(new Color(0x61b884));

                //---- jlbPayment ----
                jlbPayment.setText("PAYMENT METHOD");
                jlbPayment.setForeground(new Color(0x61b884));
                jlbPayment.setFont(new Font("Lato Black", Font.BOLD, 16));

                //---- checkBox1 ----
                checkBox1.setText("Credit card");
                checkBox1.setFont(new Font("Lato Black", Font.PLAIN, 14));
                checkBox1.setForeground(new Color(0x626262));
                checkBox1.addActionListener(e -> {
			checkBox1(e);
			checkBox1(e);
		});

                //---- checkBox2 ----
                checkBox2.setText("Payment using Internet Banking");
                checkBox2.setFont(new Font("Lato Black", Font.BOLD, 14));
                checkBox2.setForeground(new Color(0x626262));
                checkBox2.addActionListener(e -> checkBox2(e));

                //---- checkBox3 ----
                checkBox3.setText("Payment using E-Wallet");
                checkBox3.setForeground(new Color(0x626262));
                checkBox3.setFont(new Font("Lato Black", Font.BOLD, 14));
                checkBox3.addActionListener(e -> checkBox3(e));

                //======== jpnBack ========
                {
                    jpnBack.setBorder(null);
                    jpnBack.setBackground(new Color(0x61b884));
                    jpnBack.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            jpnBackMouseClicked(e);
                        }
                    });

                    //---- jlbBack ----
                    jlbBack.setText("BACK");
                    jlbBack.setHorizontalAlignment(SwingConstants.CENTER);
                    jlbBack.setFont(new Font("Lato Black", Font.BOLD, 19));
                    jlbBack.setForeground(Color.white);
                    jlbBack.setBackground(new Color(0x61b884));
                    jlbBack.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            jlbBackMouseClicked(e);
                        }
                    });

                    GroupLayout jpnBackLayout = new GroupLayout(jpnBack);
                    jpnBack.setLayout(jpnBackLayout);
                    jpnBackLayout.setHorizontalGroup(
                        jpnBackLayout.createParallelGroup()
                            .addComponent(jlbBack, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    );
                    jpnBackLayout.setVerticalGroup(
                        jpnBackLayout.createParallelGroup()
                            .addComponent(jlbBack, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    );
                }

                //======== jpnNext ========
                {
                    jpnNext.setBorder(null);
                    jpnNext.setBackground(new Color(0x61b884));

                    //---- jlbNext ----
                    jlbNext.setText("NEXT");
                    jlbNext.setHorizontalAlignment(SwingConstants.CENTER);
                    jlbNext.setFont(new Font("Lato Black", Font.BOLD, 17));
                    jlbNext.setForeground(Color.white);

                    GroupLayout jpnNextLayout = new GroupLayout(jpnNext);
                    jpnNext.setLayout(jpnNextLayout);
                    jpnNextLayout.setHorizontalGroup(
                        jpnNextLayout.createParallelGroup()
                            .addComponent(jlbNext, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    );
                    jpnNextLayout.setVerticalGroup(
                        jpnNextLayout.createParallelGroup()
                            .addComponent(jlbNext, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    );
                }

                //---- label3 ----
                label3.setText("Full Name");
                label3.setForeground(new Color(0x626262));
                label3.setFont(new Font("Lato Black", Font.BOLD, 16));

                //---- label4 ----
                label4.setText("Address");
                label4.setForeground(new Color(0x626262));
                label4.setFont(new Font("Lato Black", Font.BOLD, 16));

                //---- label5 ----
                label5.setText("Phone Number");
                label5.setForeground(new Color(0x626262));
                label5.setFont(new Font("Lato Black", Font.BOLD, 16));

                //---- textField1 ----
                textField1.setFont(new Font("Lato", Font.PLAIN, 16));
                textField1.setForeground(new Color(0x61b884));

                //---- textField2 ----
                textField2.setFont(new Font("Lato", Font.PLAIN, 16));
                textField2.setForeground(new Color(0x61b884));

                //---- textField3 ----
                textField3.setFont(new Font("Lato", Font.PLAIN, 16));
                textField3.setForeground(new Color(0x61b884));

                GroupLayout jpnPaymentLayout = new GroupLayout(jpnPayment);
                jpnPayment.setLayout(jpnPaymentLayout);
                jpnPaymentLayout.setHorizontalGroup(
                    jpnPaymentLayout.createParallelGroup()
                        .addGroup(jpnPaymentLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(jpnPaymentLayout.createParallelGroup()
                                .addGroup(jpnPaymentLayout.createSequentialGroup()
                                    .addGroup(jpnPaymentLayout.createParallelGroup()
                                        .addComponent(JlbInforCus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jpnPaymentLayout.createSequentialGroup()
                                            .addGroup(jpnPaymentLayout.createParallelGroup()
                                                .addComponent(jlbPayment, GroupLayout.PREFERRED_SIZE, 513, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jpnPaymentLayout.createSequentialGroup()
                                                    .addGroup(jpnPaymentLayout.createParallelGroup()
                                                        .addComponent(label3)
                                                        .addComponent(label4)
                                                        .addComponent(label5))
                                                    .addGap(63, 63, 63)
                                                    .addGroup(jpnPaymentLayout.createParallelGroup()
                                                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(checkBox1)
                                                .addComponent(checkBox2))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jpnPaymentLayout.createParallelGroup()
                                        .addGroup(jpnPaymentLayout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addComponent(jpnBack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jpnNext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jpnPaymentLayout.createSequentialGroup()
                                            .addComponent(table7, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
                                            .addGap(34, 34, 34))))
                                .addGroup(jpnPaymentLayout.createSequentialGroup()
                                    .addComponent(checkBox3)
                                    .addGap(351, 804, Short.MAX_VALUE))))
                );
                jpnPaymentLayout.setVerticalGroup(
                    jpnPaymentLayout.createParallelGroup()
                        .addGroup(jpnPaymentLayout.createSequentialGroup()
                            .addGroup(jpnPaymentLayout.createParallelGroup()
                                .addGroup(jpnPaymentLayout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(table7, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnPaymentLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jpnPaymentLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jpnPaymentLayout.createSequentialGroup()
                                            .addComponent(JlbInforCus, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(label3))
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(jpnPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label4)
                                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(86, 86, 86)
                                    .addComponent(jlbPayment, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpnPaymentLayout.createSequentialGroup()
                                    .addGap(145, 145, 145)
                                    .addGroup(jpnPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label5)
                                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jpnPaymentLayout.createParallelGroup()
                                .addGroup(jpnPaymentLayout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(jpnPaymentLayout.createParallelGroup()
                                        .addComponent(jpnNext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jpnPaymentLayout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(checkBox2))
                                        .addComponent(jpnBack, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(checkBox3))
                                .addGroup(jpnPaymentLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkBox1)))
                            .addContainerGap(269, Short.MAX_VALUE))
                );
            }
            jtbTabEvent.addTab("text", jpnPayment);
        }
        add(jtbTabEvent);
        jtbTabEvent.setBounds(0, 320, 1025, 656);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame("Đồ án bán vé hoà nhạc");
        frame.setContentPane(new EventPanel());
        frame.pack();
        frame.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Lê Xuân Quỳnh
    private JPanel jpnEventHeader;
    private JLabel EventArt;
    private JLabel EventName;
    private JLabel EventTime;
    private JLabel EventPlace;
    private JPanel jpnInfo;
    private JLabel jlbInfo;
    private JPanel jpnTicketFee;
    private JLabel TicketFeeText;
    private JPanel SeatPanel;
    private JLabel jlbSeat;
    private JPanel jpnBuyNow;
    private JLabel jlbBuyNow;
    private JTabbedPane jtbTabEvent;
    private JPanel jpnEventInformation;
    private JScrollPane scrollPane1;
    private JPanel InformationPanel;
    private JLabel EventName2;
    private JLabel DescriptionText;
    private JButton button1;
    private JPanel jpnEventTicket;
    private JPanel TicketFee;
    private JScrollPane Scroll;
    private JTable TicketFeeTable;
    private JLabel label1;
    private JPanel SeatEvent;
    private JLabel label2;
    private JLabel jlbSeatingChart;
    private JPanel jpnPickTicket;
    private JPanel jpnNextButton;
    private JLabel jlbNextButton;
    private JTable table1;
    private JLabel jlbSeatingChart2;
    private JPanel jpnPayment;
    private JLabel JlbInforCus;
    private JLabel jlbPayment;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JTable table7;
    private JPanel jpnBack;
    private JLabel jlbBack;
    private JPanel jpnNext;
    private JLabel jlbNext;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}