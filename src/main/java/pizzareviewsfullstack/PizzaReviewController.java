package pizzareviewsfullstack;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PizzaReviewController {

	@Resource
	TagRepository tagRepo;

	@Resource
	PizzaReviewRepository reviewRepo;

	@Resource
	CategoryRepository categoryRepo;

	@RequestMapping("/categoryList")
	public String getAllCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		System.out.println("tag repo size" + tagRepo.count());
		model.addAttribute("allTags", tagRepo.findAll());
		return "categories"; // the html page for the list of categories
	}

	@RequestMapping("/singleCategory")
	public String getOneCategory(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("category", categoryRepo.findOne(id));
		return "category"; // the html page for a specific category
	}

	@RequestMapping("/singleTag")
	public String getOneTag(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("tag", tagRepo.findOne(id));
		return "tag"; // the html page for a specific tag
	}

	@RequestMapping("/singleReview")
	public String getOneCourse(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review"; // the html page for the single review
	}

}
