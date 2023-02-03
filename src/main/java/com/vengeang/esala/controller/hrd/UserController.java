package com.vengeang.esala.controller.hrd;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vengeang.esala.models.User;
import com.vengeang.esala.services.UserService;
// import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
	private UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/user/all")
	public String getAll(ModelMap modelMap) {
		List<User> users=userService.getAll();
		modelMap.addAttribute("users",users);
		return "hrd/homepage";
	}
	@GetMapping("/user/one/{user_id}")
	public String getOne(@PathVariable Integer user_id,ModelMap modelMap) {
		User user=userService.getOne(user_id);
		modelMap.addAttribute(user);
		return "hrd/user-one";
	}
	
	@GetMapping("/user/add")
	public String addUser(Model model) {
		model.addAttribute("user",new User());
		return "hrd/user-add";
	}
	@PostMapping("/user/add/submit")
	public String submitUser(@Valid User user, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			System.out.println("Error!!!!");
			return "hrd/user-add";
		}


		System.out.println(user);
		this.userService.saveUser(user);
		return "redirect:/user/all";
	}
	@GetMapping("/user/update/{id}")
	public String updateUser(@PathVariable("id") Integer id,Model model) {
		User user=this.userService.getOne(id);
		model.addAttribute(user);
		return "hrd/update-user";
	}
	
	@PostMapping("/user/update/submit")
	public String updateSubmit(User user) {
		userService.userUpdate(user);
		return "redirect:/user/all";
	}
	@GetMapping("/user/delete/{id}")
	public String getMethodName(@PathVariable Integer id) {
		this.userService.delete(id);
		return "redirect:/user/all";
	}
	
	
}
