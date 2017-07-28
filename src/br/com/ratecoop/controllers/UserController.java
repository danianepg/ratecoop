package br.com.ratecoop.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.ratecoop.domain.User;
import br.com.ratecoop.enums.UserTypeEnum;
import br.com.ratecoop.repositories.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
		
	@RequestMapping(value = "/addupdate", method = RequestMethod.GET)
	public String addUpdate(Model model, @RequestParam(value = "id", required = false) String id ) {
		
		String route = "user.create.tiles";
		
		if(id != null && !id.isEmpty()) {
			
			model.addAttribute("formAction", "/user/update");
			model.addAttribute("title", "Alterar Usuário");
			
			User user = userRepository.findById(id);
			model.addAttribute("user", user);	
			route = "user.update.tiles";
			
		} else {
		
			model.addAttribute("title", "Adicionar Usuário");
			model.addAttribute("user", new User());		
			model.addAttribute("formAction", "/user/add");
			
		}
		
		model.addAttribute("types", UserTypeEnum.values());
		
		return route;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("user") @Valid User user, BindingResult result, Model model){
		
		model.addAttribute("types", UserTypeEnum.values());
		
		if(result.hasErrors()) {
			model.addAttribute("title", "Adicionar Usuário");
			return "user.create.tiles";
		}
		
		if(user.getId().isEmpty()) {
			user.setId(null);
		}
		
		userRepository.save(user);		
		return "redirect:/user/list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("user") @Valid User user, BindingResult result, Model model){
		
		if(result.hasErrors()) {
			return "user.update.tiles";
		}

		userRepository.save(user);		
		return "redirect:/user/list";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		
		List<User> userList = userRepository.findAll();
		model.addAttribute("userList", userList);		

		model.addAttribute("actionEdit", "/user/addupdate");
		model.addAttribute("actionDelete", "/user/delete");
		
		return "user.list.tiles";
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") String id) {
		
		User user = userRepository.findById(id);
		userRepository.delete(user);
		
		return "redirect:/user/list";
	}

}
