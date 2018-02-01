import javax.swing.JOptionPane;


public class Shop{

	/*private String [] description = {"Coke", "Kit Kat", "Bar One", "Fanta"};
    private int [] items = {1,2,3,4};
    private int [] quantities = {0,0,0,0};
    private double [] price = {7.50,9.50,8.50,7.50};
    private double [] total = {0,0,0,0};
	*/
	
	
	public static void main(String[] args)
	{
		
     int [] items = {1,2,3,4};
	 String [] description = {"Coke", "Kit Kat", "Bar One", "Fanta"};
     int [] quantities = {0,0,0,0};
     double [] price = {7.50,9.50,8.50,7.50};
     double [] total = {0,0,0,0};
		
		String itemSelected = JOptionPane.showInputDialog("Please select item to purchase\n1: Coke\n2: Kit Kat\n3: Bar One\n4: Fanta\nTo Exit: press \"99\"");
		
		String item = "";
		
		
		int position = 0;
		
		while(!itemSelected.equals("99"))
		{
					if(itemSelected.equals("1"))
				{
					item = "Coke";
				}
				else if(itemSelected.equals("2"))
				{
					item = "Kit Kat";
				}
				else if(itemSelected.equals("3"))
				{
					item = "Bar One";
				}
				else if(itemSelected.equals("4"))
				{
					item = "Fanta";
				}
				else
				{
					item = "00";
				}
			
			//Get position
			for(int i = 0; i < description.length; i++)
			{
				if(item == description[i])
				{
					position = i;
					quantities[i] += 1;
					total[i] = price[i]*quantities[i];
				}
			}
			
			//Displaying the Cart.
			System.out.println("");
		System.out.println("");
		System.out.println("Items\tDescription\tPrice\tQuanities\tTotal");
			for(int i = 0; i < 4; i++)
			{
				System.out.println(items[i]+"\t"+description[i]+"\t\t"+price[i]+"\t\t"+quantities[i]+"\t"+total[i]);
			}
			 itemSelected = JOptionPane.showInputDialog("Please select item to purchase\n1: Coke\n2: Kit Kat\n3: Bar One\n4: Fanta\nTo Exit: press \"99\"");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Items\tDescription\tPrice\tQuanities\tTotal");
		
		
			
		
		for(int i = 0; i < 4; i++)
		{
			System.out.println(items[i]+"\t"+description[i]+"\t\t"+price[i]+"\t\t"+quantities[i]+"\t"+total[i]);
		}
		
	}
	
	
	
	
	 
}