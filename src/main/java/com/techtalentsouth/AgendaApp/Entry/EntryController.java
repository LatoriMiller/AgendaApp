package com.techtalentsouth.AgendaApp.Entry;


//import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EntryController {
	
	@Autowired
	private EntryRepository entryRepository;

	//list all entries
	@GetMapping("/")
	public ModelAndView index(Entry entry) {
		ModelAndView mv = new ModelAndView("/index");
		mv.addObject("entries", entryRepository.findAll());
		return mv;
	}
	
}
