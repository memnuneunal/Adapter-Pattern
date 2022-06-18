import adapter.MersisAdapter;
import business.UserManage;
import entities.User;

public class Main {

	public static void main(String[] args) {
		User user=new User("ali","ahmet",1234556722L,1995);
		UserManage usermanage=new UserManage(new MersisAdapter());
		usermanage.add(user);
		

	}

}
