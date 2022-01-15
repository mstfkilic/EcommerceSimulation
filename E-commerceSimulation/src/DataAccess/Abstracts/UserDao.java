package DataAccess.Abstracts;

import Entities.Concretes.User;
import java.util.List;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	void signup(User user,String email,String password);
	boolean checker(String email,String password);
	List<User>getAll();
}
