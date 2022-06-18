package business;

import entities.User;

public class UserManage{
	UserCheck usercheck;
	public UserManage(UserCheck userCheck) {
		this.usercheck=userCheck;
	}

	public void add(User user) {
		if(usercheck.checkIfRealperson(user))
			System.out.println("reaal");
		else
			System.out.println("not real");
	}
}
