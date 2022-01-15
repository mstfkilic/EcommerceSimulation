package Business.Concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Business.Abstracts.VerificationService;

public class VerificationManager implements VerificationService{
	
	List<String>verificatedEmails = new ArrayList<String>();

	@Override
	public void sendVerifyMail(String email) {
		// TODO Auto-generated method stub
		System.out.println("Verification emails has been sent to your account.Please control account.");
		link();
	}

	private void link() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("This is verification e-mails.Please enter :");
		String code = input.next();
		System.out.println("Code is activated: "+code);
		verifyMail(code);
	}

	@Override
	public void verifyMail(String email) {
		// TODO Auto-generated method stub
		System.out.println(email + " is verificated.");
		verificatedEmails.add(email);
		System.out.println("Logged in: "+ email);
		
		
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		// TODO Auto-generated method stub
		if(verificatedEmails.contains(email)) {
			System.out.println("This e-mail have been verificated.");
			verificatedEmails.add(email);
			return true;
		}else {
			System.out.println("This e-mail is not verificated!");
			link();
			return false;
		}
		
		
	}

}
