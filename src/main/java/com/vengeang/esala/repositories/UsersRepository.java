package com.vengeang.esala.repositories;

import java.util.ArrayList;
import java.util.List;
// import java.util.function.Consumer;

import org.springframework.stereotype.Repository;

import com.vengeang.esala.models.User;

@Repository
public class UsersRepository {
	List<User> userList=new ArrayList<>();
	{
		userList.add(new User(1, "Dara", "Male"));
		userList.add(new User(2, "Khi Hort", "Male"));
		userList.add(new User(3, "Sothy", "Male"));
		userList.add(new User(4, "Ty Ty", "Female"));												
	}
	public List<User> getAll(){
		return this.userList;
	}
	public User getOne(Integer id) {
		User userOne = userList.stream()
				.filter(user->user.getId().equals(id))
				.findFirst()
				.get();
		return userOne;
	}
	public boolean saveUser(User user) {
		return userList.add(user);
	}
	public boolean updateUser(User user) {
//		use normal for loop
//		for(int i=0;i<userList.size();i++) {
//			if(userList.get(i).getId().equals(user.getId())) {
//				userList.set(i, user);
//			}
//		}
//		use foreach
		userList.forEach(u->{
			if(u.getId().equals(user.getId()))
				u.setName(user.getName());
				u.setGender(user.getGender());
		});
		
//		use stream 
//		Consumer<User> update=u->{
//			u.setName(user.getName());
//			u.setGender(user.getGender());
//		};
//		update.accept(userList.stream()
//					  .filter(u->u.getId().equals(user.getId()))
//					  .findFirst()
//					  .get()
//					);
		return true;
	}
	public boolean delete(Integer id){
		for(int i=0;i<userList.size();i++){
			if(userList.get(i).getId().equals(id)){
				userList.remove(i);
			}
		}
		return true;
	}
}
