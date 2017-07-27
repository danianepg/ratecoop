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

import br.com.ratecoop.domain.Question;
import br.com.ratecoop.repositories.QuestionRepository;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionRepository questionRepository;
		
	@RequestMapping(value = "/addupdate", method = RequestMethod.GET)
	public String addUpdate(Model model, @RequestParam(value = "id", required = false) String id ) {
		
		String route = "question.create.tiles";
		
		if(id != null && !id.isEmpty()) {
			
			model.addAttribute("formAction", "/question/update");
			model.addAttribute("title", "Alterar Pergunta");
			
			Question question = questionRepository.findById(id);
			model.addAttribute("question", question);	
			route = "question.update.tiles";
			
		} else {
		
			model.addAttribute("title", "Adicionar Pergunta");
			model.addAttribute("question", new Question());		
			model.addAttribute("formAction", "/question/add");
			
		}
		
		return route;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("question") @Valid Question question, BindingResult result, Model model){
		
		if(result.hasErrors()) {
			model.addAttribute("title", "Adicionar Pergunta");
			return "question.create.tiles";
		}
		
		if(question.getId().isEmpty()) {
			question.setId(null);
		}
		
		questionRepository.save(question);		
		return "redirect:/question/list";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("question") @Valid Question question, BindingResult result, Model model){
		
		if(result.hasErrors()) {
			return "question.update.tiles";
		}

		questionRepository.save(question);		
		return "redirect:/question/list";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		
		List<Question> questionList = questionRepository.findAll();
		model.addAttribute("questionList", questionList);		

		model.addAttribute("actionEdit", "/question/addupdate");
		model.addAttribute("actionDelete", "/question/delete");
		
		return "question.list.tiles";
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") String id) {
		
		Question question = questionRepository.findById(id);
		questionRepository.delete(question);
		
		return "redirect:/question/list";
	}

}
