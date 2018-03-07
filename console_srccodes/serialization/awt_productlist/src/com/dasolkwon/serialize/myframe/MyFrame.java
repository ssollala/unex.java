package com.dasolkwon.serialize.myframe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.dasolkwon.serialize.Product;
import com.dasolkwon.serialize.ReadProduct;
import com.dasolkwon.serialize.WriteProduct;


public class MyFrame extends JFrame implements ActionListener {
	
	private JSplitPane splitPane;	// split the window in top and bottom(button)
	private JPanel topPanel;		// container panel for the top
	private JPanel buttonPanel;	// container panel for the buttons
	private JScrollPane scrollPane;	// makes the text output scroll-able
	private JPanel inputPanel;		// under the topPanel, user input area
	private JPanel outputPanel;		// under the topPanel, file output area
	DefaultTableModel model;	
	private JTable table;			// the output table that contains the product information
	// table column header
	private JTextField textFieldID;
	private JTextField textFieldDescription;
	private JTextField textFieldManufacturer;
	private JTextField textFieldPrice;
	private JTextField textFieldCount;
	
	private JButton buttonSave;		// "save" button
	private JButton buttonDisplay;	// "display" button
	private JButton buttonRefresh;	// empty input area

	private WriteProduct wp;
	private ReadProduct rp;
	
	public MyFrame(){
		super("Product Information");

		splitPane = new JSplitPane();		//the splitPane divides the window in two components (here: top and button)
		
		topPanel = new JPanel();
		buttonPanel = new JPanel();
		
		setPreferredSize(new Dimension(550, 600));
		
		getContentPane().setLayout(new GridLayout());
		
		setResizable(false);
		
		// sliptPane:
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);		//split the window vertically
		splitPane.setDividerLocation(530);
		splitPane.setEnabled(false);											// fixed divider location
	
		splitPane.setTopComponent(topPanel);
		splitPane.setBottomComponent(buttonPanel);
		
		topPanel.setLayout(new BorderLayout());
		
		// topPanel-headerPanel1 for input area
		JPanel headerPanel1 = new JPanel();
		JLabel headerLabel1 = new JLabel("Enter Product Information Below:");
		headerLabel1.setHorizontalAlignment(JLabel.CENTER);
		headerPanel1.add(headerLabel1);
		
		topPanel.add(headerPanel1, BorderLayout.NORTH);
		
		// topPanel-inputPanel:
		inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(5,2));	

		// JLables and JTedtFields for user inputs
		JLabel labelID = new JLabel("Product ID:");
		inputPanel.add(labelID);
		textFieldID = new JTextField();
		labelID.setLabelFor(textFieldID);
		inputPanel.add(textFieldID);
		
		JLabel labelDescription = new JLabel("Descriptions:");
		inputPanel.add(labelDescription);
		textFieldDescription = new JTextField();
		labelDescription.setLabelFor(textFieldDescription);
		inputPanel.add(textFieldDescription);
		
		JLabel labelManufacturer = new JLabel("Manufacturer:");
		inputPanel.add(labelManufacturer);
		textFieldManufacturer = new JTextField();
		labelManufacturer.setLabelFor(textFieldManufacturer);
		inputPanel.add(textFieldManufacturer);
		
		JLabel labelPrice = new JLabel("Price:");
		inputPanel.add(labelPrice);
		textFieldPrice = new JTextField();
		labelPrice.setLabelFor(textFieldPrice);
		inputPanel.add(textFieldPrice);
		
		JLabel labelCount = new JLabel("Number of Product:");
		inputPanel.add(labelCount);
		textFieldCount = new JTextField();
		labelCount.setLabelFor(textFieldCount);
		inputPanel.add(textFieldCount);
		
		topPanel.add(inputPanel, BorderLayout.CENTER);
		
		// topPanel-outputPanel:
		// outputPanel header
		setOutputPanel(new JPanel());
		getOutputPanel().setPreferredSize(new Dimension(550, 350));	
		JPanel headerPanel2 = new JPanel();
		JLabel headerLabel2 = new JLabel("Product List (Only for displaying):");
		headerLabel2.setHorizontalAlignment(JLabel.CENTER);
		headerPanel2.add(headerLabel2);
		getOutputPanel().add(headerPanel2);

		// JTabel - shows the product information in the file
		model = new DefaultTableModel();
		table = new JTable(model);

		// table columns
		model.addColumn("Product ID");
		model.addColumn("Description");
		model.addColumn("Manufacturer");
		model.addColumn("Price");
		model.addColumn("Count");

		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(480, 300));
		
		getOutputPanel().add(scrollPane);

		topPanel.add(getOutputPanel(), BorderLayout.SOUTH);
		
		// buttonPanel:
		buttonPanel.setLayout(new FlowLayout());
		
		// Save button - add product info that user entered into the list
		buttonSave = new JButton("Save");
		buttonSave.addActionListener(this);
		buttonPanel.add(buttonSave);
		
		// Display button - display product list stored in the "product.ser" file
		buttonDisplay = new JButton("Display");
		buttonDisplay.addActionListener(this);
		buttonPanel.add(buttonDisplay);
		
		// Refresh button - refresh user input area
		buttonRefresh = new JButton("Refresh");
		buttonRefresh.addActionListener(this);
		buttonPanel.add(buttonRefresh);
		
		getContentPane().add(splitPane);
		
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonSave){
			
			wp = new WriteProduct(Integer.parseInt(textFieldID.getText()), 
						textFieldDescription.getText(), textFieldManufacturer.getText(), 
						Double.parseDouble(textFieldPrice.getText()), Integer.parseInt(textFieldCount.getText()));
			wp.closeFile();
				
			JOptionPane.showMessageDialog(getOutputPanel(), "Product added!");

		}
		else if(e.getSource () == buttonDisplay){
			
			model.setRowCount(0);		// refresh the table contents 
			rp = new ReadProduct();
			
			rp.openFile();
			rp.closeFile();
			
			// add table rows - product information in the file
			for(Product product: rp.getPDetails()){
				int productID = product.getProductID();
				String description = product.getDescription();
				String manufacturer = product.getManufacturer();
				double price = product.getPrice();
				int count = product.getCount();					
					model.addRow(new Object[]{productID, description, manufacturer, price, count});
			}
					
		}
		
		else if(e.getSource() == buttonRefresh){
			// Empty user input areas
			textFieldID.setText("");
			textFieldDescription.setText("");
			textFieldManufacturer.setText("");
			textFieldPrice.setText("");
			textFieldCount.setText("");
		}
		
	}

	// Accessors - accessed from ReadProduct class
	public JPanel getOutputPanel() {
		return outputPanel;
	}

	public void setOutputPanel(JPanel outputPanel) {
		this.outputPanel = outputPanel;
	}	
	
}


