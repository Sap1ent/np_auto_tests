package utility;

import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;

public class constants {
	
	//Current dateTime
	
	public static final String dateTime() {
	Date dNow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
    String dt = ft.format(dNow);
	return dt;	
	}
		
	//Set the RegistrationNo Variable
	public static String RegNo = dateTime();
	
	//Set the CompName Variable
	public static String CompName = RegNo + " Company";
	
	//Set the Primary Contact variable
	public static String PrimCon = RegNo + "primcon";
	
	//Set the Primary Contact email Variable
	public static String PrimConMail = RegNo + "@primcon.com";	
	
	//Set the Primary Contact Job Variable
	public static String PrimConJob = RegNo + "primconjob";	
	
	//Set the Payroll Contact Variable
	public static String PayCon = RegNo + "paycon";
	
	//Set the Payroll Contact Email Variable
	public static String PayConMail = RegNo + "@paycon.com";
	
	//Set the PDFComms Email Variable
	public static String PDFCommsMail = RegNo + "@pdfcomms.com";
	
	//Set the Payroll name Variable
	public static String PayName = RegNo + " payroll";
	
	//Set the signatory email variable
	public static String SigMail = RegNo + "@signatory.com";
	
	//Generate a random PAYE reference number
	//Get a random number from 0-9
	
	public static final String PAYERefNo() {
		Random rn = new Random();
		int a = rn.nextInt(10);
		String strI = String.valueOf(a);
		return strI;
	}

	//Get a random letter
	
	public static final char PAYERefChar(){
		Random rn7 = new Random();
		char x = (char)(rn7.nextInt(26) + 'a');
		char xupper = Character.toUpperCase(x);
		return xupper;
	}
	
	//Create all the variables
		
	public static String PAYE1 = PAYERefNo(); 
	public static String PAYE2 = PAYERefNo();
	public static String PAYE3 = PAYERefNo(); 
	public static String PAYE4 = PAYERefNo(); 
	public static String PAYE5 = PAYERefNo(); 
	public static String PAYE6 = PAYERefNo();
	public static char PAYEX = PAYERefChar();
	
	//Build the PAYE Ref
	
	public static final String PAYEREF = PAYE1 + PAYE2 + PAYE3 + "/" + PAYEX + PAYE4 + PAYE5 + PAYE6;
	
	//Standard bank account details for GC & Kashflow as variables
	
	public static String AccName = "Succesful Sally";
	public static String SortCode = "20 - 00 - 00";
	public static String AccNo = "55779911";
	
	//Generic phone number
	public static String GenPhone = "07000000000";
	
	
	
}
		
	
	


