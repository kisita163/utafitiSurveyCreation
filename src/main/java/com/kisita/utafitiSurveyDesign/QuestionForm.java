package com.kisita.utafitiSurveyDesign;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;

public class QuestionForm extends FormLayout {
	
	private TextField question          = new TextField("Question");
	private Checkbox  required          = new Checkbox("Required");
	private ComboBox<QuestionType> type = new ComboBox<>("Type");
	private Button addChoice            = new Button("Add choice");
    private Button save                 = new Button("Save");
    private Button delete               = new Button("Delete");
    private Grid<Choice> choices        = new Grid<>();
    
    
    private Binder<Question> binder     = new Binder<>(Question.class);
   
    private Question questionInList;
    private MainView mainView;
    

    
    
    public QuestionForm(MainView mainview) {
    	this.mainView = mainview;
    	
    	choices.addColumn(Choice::getValue).setHeader("Choices");
    	choices.addColumn(Choice::getId).setHeader("Id");
    	
    	type.setItems(QuestionType.values());
    	binder.bindInstanceFields(this);
    	
    	add(question,type);
    	
    	//question.setWidth("300px");
    	//type.setWidth("300px");

    	HorizontalLayout buttons = new HorizontalLayout(save, delete);
    	
    	VerticalLayout data      = new VerticalLayout(question,type,required,choices,buttons);
    	
    	add(data);
    	
    	save.getElement().setAttribute("theme", "primary");
        setQuestion(null);
        save.addClickListener(e -> this.save());
        delete.addClickListener(e -> this.delete());
    	
    }




	private void setQuestion(Question question) {
		// TODO Auto-generated method stub
		
	}



	private void delete() {
		// TODO Auto-generated method stub
	}




	private void save() {
		// TODO Auto-generated method stub
	}

}
