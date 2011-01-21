package de.earthdawn.ui2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.xml.bind.JAXBElement;

import de.earthdawn.config.ApplicationProperties;
import de.earthdawn.data.CAPABILITYType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;

public class EDSkillSelectDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;
	private JList list;
	
	
	private TreeMap<String,CAPABILITYType> skillMap = new TreeMap<String,CAPABILITYType>();
	private HashMap<String,CAPABILITYType> selectedSkillMap = new HashMap<String,CAPABILITYType>();

	public HashMap<String, CAPABILITYType> getSelectedSkillMap() {
		return selectedSkillMap;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EDSkillSelectDialog dialog = new EDSkillSelectDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EDSkillSelectDialog() {
		setTitle("Select one or more skills");
		setModalityType(ModalityType.APPLICATION_MODAL);
		setAlwaysOnTop(true);
		selectedSkillMap = new  HashMap<String,CAPABILITYType>();
		initSkillList();
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		
		list = new JList();
		
		list.setModel(new AbstractListModel() {
			Set<String> keys = skillMap.keySet();
			String[] array = keys.toArray(new String[0]);
			public int getSize() {
				return array.length;
			}
			public Object getElementAt(int index) {
				return array[index];
			}
		});
		scrollPane.setViewportView(list);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						do_okButton_actionPerformed(arg0);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						do_cancelButton_actionPerformed(arg0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public void initSkillList(){
		List<JAXBElement<CAPABILITYType>> capabilities = ApplicationProperties.create().getCapabilities().getSKILLOrTALENT();
		for (JAXBElement<CAPABILITYType> element : capabilities) {
			if (element.getName().getLocalPart().equals("SKILL")) {
				CAPABILITYType skill = (CAPABILITYType)element.getValue();
				skillMap.put(skill.getName(),skill);
			}			
		}
	}

	protected void do_okButton_actionPerformed(ActionEvent arg0) {
		selectedSkillMap.clear();
		for(Object skillname : list.getSelectedValues()){
			selectedSkillMap.put((String)skillname,skillMap.get((String)skillname));
		}
		this.dispose();	
	}
	protected void do_cancelButton_actionPerformed(ActionEvent arg0) {
		selectedSkillMap.clear();
		this.dispose();
	}
}
