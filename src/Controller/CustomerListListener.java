package Controller;

import View.CustomersListPage.CustomersListPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerListListener implements ActionListener {
    private CustomersListPanel customersListPanel;

    public CustomerListListener(CustomersListPanel view) {
        this.customersListPanel = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        System.out.println(src);

        if (src.equals("ADD")){
            this.customersListPanel.addCustomer();
        } else if (src.equals("EDIT")){
            customersListPanel.editCustomer();
        } else if (src.equals("DELETE")){
            customersListPanel.deleteCustomer();
        } else if (src.equals("SEARCH")){
            customersListPanel.searchCustomer();
        }

    }
}
