import javax.swing.JOptionPane;


public class TestSandwich {

	public static void main(String[] args) {
		//Instantiate a sandwich object
		Sandwich JrSandwich = new Sandwich();
		Sandwich KeithSandwich = new Sandwich();
		
		//Set values of fields in JrSandwich
		JrSandwich.setBreadType(" whole wheat");
		JrSandwich.setIngredient(" tuna");
		JrSandwich.setPrice(5);
		
		//Output the details of JrSandwich
		String customer;
		customer = JOptionPane.showInputDialog("Whose sandwich is this?");
		JOptionPane.showMessageDialog(null, customer + " is getting a " + JrSandwich.getBreadType() 
				+" sandwich with" + JrSandwich.getIngredient() + " it will cost " + JrSandwich.getPrice() +" dollars.");

		//Set values of fields in KeithSandwich
		KeithSandwich.setBreadType(" white");
		KeithSandwich.setIngredient(" chicken");
		KeithSandwich.setPrice(7);
		
		//Output the details of KeithSandwich
		String customer1;
		customer1 = JOptionPane.showInputDialog("Whose sandwich is this?");
		JOptionPane.showMessageDialog(null, customer1 + " is getting a " + KeithSandwich.getBreadType() 
				+" sandwich with" + KeithSandwich.getIngredient() + " it will cost " + KeithSandwich.getPrice() +" dollars.");
	}

}
