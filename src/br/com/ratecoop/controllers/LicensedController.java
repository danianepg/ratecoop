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

import br.com.ratecoop.domain.Licensed;
import br.com.ratecoop.repositories.LicensedRepository;

@Controller
@RequestMapping("/licensed")
public class LicensedController {
	
	@Autowired
	private LicensedRepository licensedRepository;
		
	@RequestMapping(value = "/addupdate", method = RequestMethod.GET)
	public String addUpdate(Model model, @RequestParam(value = "id", required = false) String id ) {
		
		String route = "licensed.create.tiles";
		
		if(id != null && !id.isEmpty()) {
			
			model.addAttribute("formAction", "/licensed/update");
			model.addAttribute("title", "Alterar Credenciado");
			
			Licensed licensed = licensedRepository.findById(id);
			model.addAttribute("licensed", licensed);	
			route = "licensed.update.tiles";
			
		} else {
		
			model.addAttribute("title", "Adicionar Credenciado");
			model.addAttribute("licensed", new Licensed());		
			model.addAttribute("formAction", "/licensed/add");
			
		}
		
		return route;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("licensed") @Valid Licensed licensed, BindingResult result, Model model){
		
		if(result.hasErrors()) {
			model.addAttribute("title", "Adicionar Credenciado");
			return "licensed.create.tiles";
		}
		
		if(licensed.getId().isEmpty()) {
			licensed.setId(null);
		}
		
		licensedRepository.save(licensed);		
		return "redirect:/licensed/list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("licensed") @Valid Licensed licensed, BindingResult result, Model model){
		
		if(result.hasErrors()) {
			return "licensed.update.tiles";
		}

		licensedRepository.save(licensed);		
		return "redirect:/licensed/list";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		
		List<Licensed> licensedList = licensedRepository.findAll();
		model.addAttribute("licensedList", licensedList);		

		model.addAttribute("actionEdit", "/licensed/addupdate");
		model.addAttribute("actionDelete", "/licensed/delete");
		
		return "licensed.list.tiles";
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") String id) {
		
		Licensed licensed = licensedRepository.findById(id);
		licensedRepository.delete(licensed);
		
		return "redirect:/licensed/list";
	}

}
