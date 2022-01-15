import Business.Abstracts.UserService;
import Business.Concretes.CheckManager;
import Business.Concretes.UserManager;
import Business.Concretes.VerificationManager;
import Core.GoogleManagerAdapters;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.User;
import Google.GoogleManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserManager(new HibernateUserDao(),new CheckManager(),new GoogleManagerAdapters(),new VerificationManager());
		User mustafa = new User(null, null, null, null);
		mustafa.setFirtsName("Mustafa");
		mustafa.setLastName("Kılıç");
		mustafa.setEmail("mstfnurklc13@gmail.com");
		mustafa.setPassword("11111111111");
		
		User çınar = new User(null, null, null, null);
		çınar.setFirtsName("Çınar");
		çınar.setLastName("Kılıç");
		çınar.setEmail("nkilic1313@gmail.com");
		çınar.setPassword("44444444");
		
		User nur = new User(null, null, null, null);
		nur.setFirtsName("Nur");
		nur.setLastName("Kılıç");
		nur.setEmail("nailenur@gmail.com");
		nur.setPassword("5555555");
		
		userService.signIn(mustafa);
		

	}

}
