package Business.Abstracts;

import Entities.Concretes.User;

public interface UserService {
	
	void signIn(User user);
	void signUp(User user);
}
