package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;

public class SurveyForm extends FormLayout {
	
	private TextField question = new TextField("Question");
    private TextField lastName = new TextField("Last name");
    private ComboBox<CustomerStatus> status = new ComboBox<>("Status");
    private CustomerService service = CustomerService.getInstance();
    private Customer customer;
    private MainView mainView;
    private Binder<Customer> binder = new Binder<>(Customer.class);
    private Button save = new Button("Save");
    private Button delete = new Button("Delete");

}
