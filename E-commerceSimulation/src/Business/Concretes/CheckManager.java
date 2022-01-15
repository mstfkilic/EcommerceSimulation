package Business.Concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import Business.Abstracts.CheckService;
import Entities.Concretes.User;

public class CheckManager implements CheckService {
	
	List<String>listofEmailList = new ArrayList<String>();

	@Override
	public boolean checkFirstName(User user) {
		// TODO Auto-generated method stub
		
		if(user.getFirtsName().isEmpty()==true) {
			System.out.println("Name area is not left blank.");
			return false;
		}else if(user.getFirtsName().length()<2) {
			System.out.println("Name area must be more 2 characters.");
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().isEmpty()==true) {
			System.out.println("Name area is not left blank.");
			return false;
		}else if(user.getLastName().length()<2) {
			System.out.println("Name area must be more 2 characters.");
			return false;
		}else {
			return true;
		}
		
		// TODO Auto-generated method stub
	
	}

	@Override
	public boolean checkEmail(User user) {
		// TODO Auto-generated method stub
		
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		if(user.getEmail().isEmpty()==true) {
			System.out.println("E-mail area must not left blank.");
			return false;
		}else if(pattern.matcher(user.getEmail()).find()==false){
			System.out.println("E-mail address must be proper .Example:example@example.com");
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean checkVerifiedEmail(User user) {
		// TODO Auto-generated method stub
		
		if(listofEmailList.contains(user.getEmail())) {
			System.out.println("This e-mail address have already used.");
			return false;
		}else {
			listofEmailList.add(user.getEmail());
			return true;
		}
		
	}

	@Override
	public boolean checkPassword(User user) {
		
		if(user.getPassword().isEmpty()==true) {
			System.out.println("Password area must not be left blank");
			return false;
		}
		
		else if(user.getPassword().length()<6) {
			System.out.println("Your password must be more 6 characters.");
			
			return false;
		}else {
			return true;
		}
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public boolean checkGoogle(User user) {
		// TODO Auto-generated method stub
		
		String regex = "@gmail.com";
		if(user.getEmail().contains(regex)) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public boolean isValid(User user) {
		// TODO Auto-generated method stub
		
		if(checkFirstName(user)&& checkLastName(user)&& checkEmail(user)&&checkVerifiedEmail(user)&& checkPassword(user)==true) {
			return true;
		}else
		return false;
	}


}
