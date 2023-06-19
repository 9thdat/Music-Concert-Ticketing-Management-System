/*
 * Created by JFormDesigner on Sun Jun 18 10:46:58 ICT 2023
 */

package View.AnalyticPage.ExportReport;

import java.awt.event.*;
import javax.swing.table.*;
import Controller.AnalyticPage.ExportReport.ExportReportDialogListener;
import Model.BEAN.Analyst.Revenue;
import Model.Database.UserDatabase;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author Dat2
 */
public class ExportReportDialog extends JDialog {
    ActionListener ac = new ExportReportDialogListener(this);
    List<Revenue> listReport = new ArrayList<>();
    public ExportReportDialog() {
        super();
        initComponents();
        initMoreSetting();
    }

    private void initMoreSetting() {
        getOkButton().addActionListener(ac);
        getCancelButton().addActionListener(ac);
        getAddButton().addActionListener(ac);
        getRemoveButton().addActionListener(ac);
        settingEventComboBox();
        eventcbBox.setEnabled(false);
        dayComboBox.setBackground(Color.decode("#92CFAA"));
        eventcbBox.setBackground(Color.decode("#92CFAA"));
        settingEventComboBox();

        // Set size for reportTable
        reportTable.getColumnModel().getColumn(0).setPreferredWidth(175);
        reportTable.getColumnModel().getColumn(1).setPreferredWidth(175);
        reportTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        reportTable.getColumnModel().getColumn(3).setPreferredWidth(50);
        reportTable.getColumnModel().getColumn(4).setPreferredWidth(50);

        // Set text align for reportTable
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        reportTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        reportTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        reportTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        reportTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        reportTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
    }

    private void settingEventComboBox() {
        Connection con = UserDatabase.getConnection();
        String sql = "select EVT_NAME from mctmsys.event";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                eventcbBox.addItem(rs.getString("EVT_NAME"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void OKButton() {
        if (listReport.size() == 0) {
            JOptionPane.showMessageDialog(null, "Please select at least one revenue");
            return;
        }
        else {
            Connection con = UserDatabase.getConnection();

            for (Revenue rev : listReport) {
                int index = listReport.indexOf(rev);

                if (rev.equals("Monthly Ticket Revenue")){
                    rev.setStatisticType("Monthly Ticket Revenue");
                    rev.setMonth(String.valueOf(Integer.parseInt(reportTable.getValueAt(index, 3).toString())));
                    rev.setYear(String.valueOf(Integer.parseInt(reportTable.getValueAt(index, 4).toString())));
                }

                else if (rev.equals("Annual Ticket Revenue")) {
                    rev.setStatisticType("Annual Ticket Revenue");
                    rev.setYear(String.valueOf(Integer.parseInt(reportTable.getValueAt(index, 4).toString())));
                }

                else if (rev.equals("Event-based Ticket Revenue")){
                    rev.setStatisticType("Event-based Ticket Revenue");
                    rev.setEvent(reportTable.getValueAt(index, 2).toString());
                }

                else if (rev.equals("Daily Ticket Sales Statistics")){
                    rev.setStatisticType("Daily Ticket Sales Statistics");
                    rev.setDay(String.valueOf(Integer.parseInt(reportTable.getValueAt(index, 2).toString())));
                    rev.setMonth(String.valueOf(Integer.parseInt(reportTable.getValueAt(index, 3).toString())));
                    rev.setYear(String.valueOf(Integer.parseInt(reportTable.getValueAt(index, 4).toString())));

                }

                else if (rev.equals("Monthly Ticket Sales Statistics")){
                    rev.setStatisticType("Monthly Ticket Sales Statistics");
                    rev.setMonth(String.valueOf(Integer.parseInt(reportTable.getValueAt(index, 3).toString())));
                    rev.setYear(String.valueOf(Integer.parseInt(reportTable.getValueAt(index, 4).toString())));
                }

                else if (rev.equals("Annual Ticket Sales Statistics")){
                    rev.setStatisticType("Annual Ticket Sales Statistics");
                    rev.setYear(String.valueOf(Integer.parseInt(reportTable.getValueAt(index, 4).toString())));
                }
            }
        }
    }

    public void CancelButton() {
        this.dispose();
    }

    public void AddButton() {
        String selectedRevenue = Statistic.getSelectedItem().toString();
        String day = "";
        String month = "";
        String year = "";
        String event = "";
        String statisticType = "";
        if (selectedRevenue.equals("Monthly Ticket Revenue")) {
            statisticType = "Monthly Ticket Revenue";
            month = monthComboBox.getSelectedItem().toString();
            year = yearComboBox.getSelectedItem().toString();
        }

        else if (selectedRevenue.equals("Annual Ticket Revenue")) {
            statisticType = "Annual Ticket Revenue";
            year = yearComboBox.getSelectedItem().toString();
        }

        else if (selectedRevenue.equals("Event-based Ticket Revenue")) {
            statisticType = "Event-based Ticket Revenue";
            event = eventcbBox.getSelectedItem().toString();
        }

        else if (selectedRevenue.equals("Daily Ticket Sales Statistics")) {
            statisticType = "Daily Ticket Sales Statistics";
            day = dayComboBox.getSelectedItem().toString();
            month = monthComboBox.getSelectedItem().toString();
            year = yearComboBox.getSelectedItem().toString();
        }

        else if (selectedRevenue.equals("Monthly Ticket Sales Statistics")) {
            statisticType = "Monthly Ticket Sales Statistics";
            month = monthComboBox.getSelectedItem().toString();
            year = yearComboBox.getSelectedItem().toString();
        }

        else if (selectedRevenue.equals("Annual Ticket Sales Statistics")) {
            statisticType = "Annual Ticket Sales Statistics";
            year = yearComboBox.getSelectedItem().toString();
        }
        System.out.println("day: " + day + ", month: " + month + ", year: " + year + ", event: " + event + ", statisticType: " + statisticType);

        // Validate if selected revenue is already in listReport
        if (listReport.size() > 0) {
            for (Revenue revenue : listReport) {
                System.out.println(revenue.toString());
                if (revenue.getStatisticType().equals("Daily Ticket Sales Statistics")) {
                    System.out.println("Monthly Ticket Revenue");
                    if (revenue.getStatisticType().equals(statisticType) && revenue.getMonth().equals(month) && revenue.getYear().equals(year)) {
                        JOptionPane.showMessageDialog(null, "This statistic is already in the list");
                        return;
                    }
                } else if (revenue.getStatisticType().equals("Monthly Ticket Revenue")) {
                    System.out.println("Annual Ticket Revenue");
                    if (revenue.getStatisticType().equals(statisticType) && revenue.getYear().equals(year)) {
                        JOptionPane.showMessageDialog(null, "This statistic is already in the list");
                        return;
                    }
                } else if (revenue.getStatisticType().equals("Annual Ticket Revenue")) {
                    System.out.println("Event-based Ticket Revenue");
                    if (revenue.getStatisticType().equals(statisticType) && revenue.getEvent().equals(event)) {
                        JOptionPane.showMessageDialog(null, "This statistic is already in the list");
                        return;
                    }
                } else if (revenue.getStatisticType().equals("Event-based Ticket Revenue")) {
                    System.out.println("Daily Ticket Sales Statistics");
                    if (revenue.getStatisticType().equals(statisticType) && revenue.getDay().equals(day) && revenue.getMonth().equals(month) && revenue.getYear().equals(year)) {
                        JOptionPane.showMessageDialog(null, "This statistic is already in the list");
                        return;
                    }
                } else if (revenue.getStatisticType().equals("Daily Ticket Sales Statistics")) {
                    System.out.println("Monthly Ticket Sales Statistics");
                    if (revenue.getStatisticType().equals(statisticType) && revenue.getMonth().equals(month) && revenue.getYear().equals(year)) {
                        JOptionPane.showMessageDialog(null, "This statistic is already in the list");
                        return;
                    }
                } else if (revenue.getStatisticType().equals("Monthly Ticket Sales Statistics")){
                    System.out.println("Annual Ticket Sales Statistics");
                    if (revenue.getStatisticType().equals(statisticType) && revenue.getYear().equals(year)) {
                        JOptionPane.showMessageDialog(null, "This statistic is already in the list");
                        return;
                    }
                }
            }
        }

        listReport.add(new Revenue(day, month, year, event, statisticType));
        DefaultTableModel model = (DefaultTableModel) reportTable.getModel();
        model.addRow(new Object[]{statisticType, event, day, month, year});
    }

    public void RemoveButton() {
        int selectedRow = reportTable.getSelectedRow();
        if (selectedRow != -1) {
            listReport.remove(selectedRow);
            DefaultTableModel model = (DefaultTableModel) reportTable.getModel();
            model.removeRow(selectedRow);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to remove");
        }
    }

    public JDialog getExportReportJDialog() {
        return ExportReportJDialog;
    }

    public JButton getOkButton() {
        return okButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public JLabel getTypeStatistic() {
        return TypeStatistic;
    }

    private void StatisticItemStateChanged(ItemEvent e) {
        if(Statistic.getSelectedItem().toString() == "Monthly Ticket Revenue") {
            dayComboBox.setEnabled(false);
            monthComboBox.setEnabled(true);
            yearComboBox.setEnabled(true);
            eventcbBox.setEnabled(false);
            dayComboBox.setBackground(Color.decode("#92CFAA"));
            eventcbBox.setBackground(Color.decode("#92CFAA"));
            monthComboBox.setBackground(Color.white);
            yearComboBox.setBackground(Color.white);
        } else if (Statistic.getSelectedItem().toString() == "Annual Ticket Revenue") {
            dayComboBox.setEnabled(false);
            monthComboBox.setEnabled(false);
            yearComboBox.setEnabled(true);
            eventcbBox.setEnabled(false);
            dayComboBox.setBackground(Color.decode("#92CFAA"));
            monthComboBox.setBackground(Color.decode("#92CFAA"));
            eventcbBox.setBackground(Color.decode("#92CFAA"));
            yearComboBox.setBackground(Color.white);
        } else if (Statistic.getSelectedItem().toString() == "Event-based Ticket Revenue") {
            dayComboBox.setEnabled(false);
            monthComboBox.setEnabled(false);
            yearComboBox.setEnabled(false);
            eventcbBox.setEnabled(true);
            dayComboBox.setBackground(Color.decode("#92CFAA"));
            monthComboBox.setBackground(Color.decode("#92CFAA"));
            yearComboBox.setBackground(Color.decode("#92CFAA"));
            eventcbBox.setBackground(Color.white);
        } else if (Statistic.getSelectedItem().toString() == "Daily Ticket Sales Statistics") {
            dayComboBox.setEnabled(true);
            monthComboBox.setEnabled(true);
            yearComboBox.setEnabled(true);
            eventcbBox.setEnabled(false);
            eventcbBox.setBackground(Color.decode("#92CFAA"));
            dayComboBox.setBackground(Color.white);
            monthComboBox.setBackground(Color.white);
            yearComboBox.setBackground(Color.white);
        } else if (Statistic.getSelectedItem().toString() == "Monthly Ticket Sales Statistics") {
            dayComboBox.setEnabled(false);
            monthComboBox.setEnabled(true);
            yearComboBox.setEnabled(true);
            eventcbBox.setEnabled(false);
            dayComboBox.setBackground(Color.decode("#92CFAA"));
            eventcbBox.setBackground(Color.decode("#92CFAA"));
            monthComboBox.setBackground(Color.white);
            yearComboBox.setBackground(Color.white);
        } else if (Statistic.getSelectedItem().toString() == "Annual Ticket Sales Statistics") {
            dayComboBox.setEnabled(false);
            monthComboBox.setEnabled(false);
            yearComboBox.setEnabled(true);
            eventcbBox.setEnabled(false);
            dayComboBox.setBackground(Color.decode("#92CFAA"));
            monthComboBox.setBackground(Color.decode("#92CFAA"));
            eventcbBox.setBackground(Color.decode("#92CFAA"));
            yearComboBox.setBackground(Color.white);
        }
    }

    public JComboBox<String> getStatistic() {
        return Statistic;
    }

    private void comboBox2ItemStateChanged(ItemEvent e) {
        if(monthComboBox.getSelectedItem().toString() == "1" || monthComboBox.getSelectedItem().toString() == "3" ||
                monthComboBox.getSelectedItem().toString() == "5" || monthComboBox.getSelectedItem().toString() == "7" ||
                monthComboBox.getSelectedItem().toString() == "8" || monthComboBox.getSelectedItem().toString() == "10" ||
                monthComboBox.getSelectedItem().toString() == "12") {
            dayComboBox.removeAllItems();
            for(int i = 1; i <= 31; i++) {
                dayComboBox.addItem(i);
            }
        } else if(monthComboBox.getSelectedItem().toString() == "4" || monthComboBox.getSelectedItem().toString() == "6" ||
                monthComboBox.getSelectedItem().toString() == "9" || monthComboBox.getSelectedItem().toString() == "11") {
            dayComboBox.removeAllItems();
            for(int i = 1; i <= 30; i++) {
                dayComboBox.addItem(i);
            }
        } else if(monthComboBox.getSelectedItem().toString() == "2") {
            dayComboBox.removeAllItems();
            for(int i = 1; i <= 28; i++) {
                dayComboBox.addItem(i);
            }
        }
    }

    public JLabel getDay() {
        return Day;
    }

    public JLabel getMonth() {
        return Month;
    }

    public JLabel getYear() {
        return Year;
    }

    public JButton getAddButton() {
        return AddButton;
    }

    public JTable getReportTable() {
        return reportTable;
    }

    public JComboBox getEventcbBox() {
        return eventcbBox;
    }

    public JButton getRemoveButton() {
        return RemoveButton;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Dat
        ExportReportJDialog = new JDialog();
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        TypeStatistic = new JLabel();
        title = new JLabel();
        Statistic = new JComboBox<>();
        Day = new JLabel();
        dayComboBox = new JComboBox();
        Month = new JLabel();
        monthComboBox = new JComboBox<>();
        Year = new JLabel();
        yearComboBox = new JComboBox<>();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        scrollPane1 = new JScrollPane();
        reportTable = new JTable();
        eventcbBox = new JComboBox();
        label2 = new JLabel();
        RemoveButton = new JButton();
        AddButton = new JButton();

        //======== this ========
        var ExportReportJDialogContentPane = getContentPane();

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
            swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border
            . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog"
            , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,dialogPane. getBorder
            () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
            . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException
            ( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- TypeStatistic ----
                TypeStatistic.setText("Types of Statistics:");
                TypeStatistic.setFont(new Font("Lato Black", Font.BOLD, 16));
                TypeStatistic.setForeground(new Color(0x61b884));

                //---- title ----
                title.setText("EXPORT REPORT");
                title.setFont(new Font("Lato Black", Font.PLAIN, 25));
                title.setBackground(Color.white);
                title.setForeground(new Color(0x61b884));

                //---- Statistic ----
                Statistic.setFont(new Font("Lato", Font.PLAIN, 16));
                Statistic.setModel(new DefaultComboBoxModel<>(new String[] {
                    "Monthly Ticket Revenue",
                    "Annual Ticket Revenue",
                    "Event-based Ticket Revenue",
                    "Daily Ticket Sales Statistics",
                    "Monthly Ticket Sales Statistics",
                    "Annual Ticket Sales Statistics"
                }));
                Statistic.setBackground(Color.white);
                Statistic.addItemListener(e -> StatisticItemStateChanged(e));

                //---- Day ----
                Day.setText("Day:");
                Day.setFont(new Font("Lato Black", Font.BOLD, 16));
                Day.setForeground(new Color(0x61b884));

                //---- dayComboBox ----
                dayComboBox.setBackground(Color.white);
                dayComboBox.setFont(new Font("Lato", Font.BOLD, 16));

                //---- Month ----
                Month.setText("Month:");
                Month.setFont(new Font("Lato Black", Font.BOLD, 16));
                Month.setForeground(new Color(0x61b884));

                //---- monthComboBox ----
                monthComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12"
                }));
                monthComboBox.setBackground(Color.white);
                monthComboBox.setFont(new Font("Lato", Font.BOLD, 16));
                monthComboBox.addItemListener(e -> comboBox2ItemStateChanged(e));

                //---- Year ----
                Year.setText("Year:");
                Year.setFont(new Font("Lato Black", Font.BOLD, 16));
                Year.setForeground(new Color(0x61b884));

                //---- yearComboBox ----
                yearComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
                    "2013",
                    "2014",
                    "2015",
                    "2016",
                    "2017",
                    "2018",
                    "2019",
                    "2020",
                    "2021",
                    "2022",
                    "2023"
                }));
                yearComboBox.setBackground(Color.white);
                yearComboBox.setFont(new Font("Lato", Font.BOLD, 16));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(285, 285, 285)
                                    .addComponent(title)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                    .addContainerGap(91, Short.MAX_VALUE)
                                    .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                            .addComponent(TypeStatistic)
                                            .addGap(18, 18, 18)
                                            .addComponent(Statistic))
                                        .addGroup(contentPanelLayout.createSequentialGroup()
                                            .addComponent(Day, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(dayComboBox, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Month, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(monthComboBox, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Year)
                                            .addGap(18, 18, 18)
                                            .addComponent(yearComboBox, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))))
                            .addGap(260, 260, 260))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(title)
                            .addGap(20, 20, 20)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(TypeStatistic, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addComponent(Statistic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(Day, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dayComboBox)
                                    .addComponent(Month)
                                    .addComponent(monthComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(yearComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Year, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.NORTH);
        }

        //======== buttonBar ========
        {
            buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
            buttonBar.setLayout(new GridBagLayout());
            ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
            ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

            //---- okButton ----
            okButton.setText("OK");
            buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- cancelButton ----
            cancelButton.setText("Cancel");
            buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));
        }

        //======== scrollPane1 ========
        {

            //---- reportTable ----
            reportTable.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                    "Statitic Type", "Name", "Day", "Month", "Year"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    String.class, String.class, String.class, String.class, String.class
                };
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false, false
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            scrollPane1.setViewportView(reportTable);
        }

        //---- eventcbBox ----
        eventcbBox.setFont(new Font("Lato Black", Font.PLAIN, 14));

        //---- label2 ----
        label2.setText("Event:");
        label2.setFont(new Font("Lato Black", Font.BOLD, 16));
        label2.setForeground(new Color(0x61b884));

        //---- RemoveButton ----
        RemoveButton.setText("REMOVE");

        //---- AddButton ----
        AddButton.setText("ADD");

        GroupLayout ExportReportJDialogContentPaneLayout = new GroupLayout(ExportReportJDialogContentPane);
        ExportReportJDialogContentPane.setLayout(ExportReportJDialogContentPaneLayout);
        ExportReportJDialogContentPaneLayout.setHorizontalGroup(
            ExportReportJDialogContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addGroup(ExportReportJDialogContentPaneLayout.createSequentialGroup()
                    .addGroup(ExportReportJDialogContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(dialogPane, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 808, GroupLayout.PREFERRED_SIZE)
                        .addGroup(GroupLayout.Alignment.LEADING, ExportReportJDialogContentPaneLayout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addGroup(ExportReportJDialogContentPaneLayout.createParallelGroup()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
                                .addGroup(ExportReportJDialogContentPaneLayout.createSequentialGroup()
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(eventcbBox, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)))
                            .addGap(35, 35, 35)
                            .addGroup(ExportReportJDialogContentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(RemoveButton, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddButton, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(ExportReportJDialogContentPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(buttonBar, GroupLayout.PREFERRED_SIZE, 720, GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46))
        );
        ExportReportJDialogContentPaneLayout.setVerticalGroup(
            ExportReportJDialogContentPaneLayout.createParallelGroup()
                .addGroup(ExportReportJDialogContentPaneLayout.createSequentialGroup()
                    .addComponent(dialogPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(ExportReportJDialogContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addComponent(eventcbBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(ExportReportJDialogContentPaneLayout.createParallelGroup()
                        .addGroup(ExportReportJDialogContentPaneLayout.createSequentialGroup()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(GroupLayout.Alignment.TRAILING, ExportReportJDialogContentPaneLayout.createSequentialGroup()
                            .addGap(0, 25, Short.MAX_VALUE)
                            .addComponent(AddButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(RemoveButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)))
                    .addComponent(buttonBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Dat
    private JDialog ExportReportJDialog;
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel TypeStatistic;
    private JLabel title;
    private JComboBox<String> Statistic;
    private JLabel Day;
    private JComboBox dayComboBox;
    private JLabel Month;
    private JComboBox<String> monthComboBox;
    private JLabel Year;
    private JComboBox<String> yearComboBox;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JScrollPane scrollPane1;
    private JTable reportTable;
    private JComboBox eventcbBox;
    private JLabel label2;
    private JButton RemoveButton;
    private JButton AddButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}