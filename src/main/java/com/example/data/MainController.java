package com.example.data;
import com.example.data.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.data.UserRepository;

@Controller
@RequestMapping(path="/connectdb")
public @ResponseBody class MainController {
	
		@Autowired
		
		private UserRepository userRepository;
		
		@RequestMapping(path="/hai")
		public @ResponseBody String show()
		{
			return "super great achieved";
		}
		
		@RequestMapping(path="/store")
		public @ResponseBody String addusers (@RequestParam String username,@RequestParam String password)
		{
			login l=new login();
			l.setusername(username);
			l.setpassword(password);
			userRepository.save(l);
			return "Saved";
			
		}
		
		@RequestMapping("/show_all")
		public @ResponseBody Iterable<login> getallusers()
		{
			return userRepository.findAll();
			
		}  
		
}
