package Business.Concretes;

import Business.Abstracts.CheckService;
import Business.Abstracts.UserService;
import Business.Abstracts.VerificationService;
import Core.GoogleService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private CheckService checkService;
	private GoogleService googleService;
	private VerificationService verificationService;
	
	public UserManager(UserDao userDao, CheckService checkService, GoogleService googleService,
			VerificationService verificationService) {
		super();
		this.userDao = userDao;
		this.checkService = checkService;
		this.googleService = googleService;
		this.verificationService = verificationService;
	}

	@Override
	public void signIn(User user) {
		// TODO Auto-generated method stub
		if(checkService.isValid(user)==true) {
			if(verificationService.checkVerifyAccount(user.getEmail())==true) {
				System.out.println(user.getFirtsName() + "Login.");
			}else if(verificationService.checkVerifyAccount(user.getEmail())==false) {
				verificationService.sendVerifyMail(user.getEmail());
			}
		}else if(!checkService.isValid(user)) {
			System.out.println("User not found!");
		}
		
	}

	@Override
	public void signUp(User user) {
		// TODO Auto-generated method stub
		if(checkService.isValid(user)) {
			System.out.println(user.getFirtsName() +" is signed up to system");
			verificationService.sendVerifyMail(user.getEmail());
			this.userDao.add(user);
			
		}else if(!checkService.isValid(user)) {
			System.out.println("User not found.");
		}
		
	}

}
