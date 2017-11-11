package pizzareviewsfullstack;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PizzaReviewController {

	@Resource
	PizzaReviewRepository reviewRepo;

	@Resource
	CategoryRepository categoryRepo;

	@RequestMapping("/categoryList")
	public String getAllCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories"; // the html page for the list of categories
	}

	@RequestMapping("/singleCategory")
	public String getOneCategories(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("category", categoryRepo.findOne(id));
		return "category"; // the html page for a specific category
	}

	@RequestMapping("/reviewList")
	public String getAllCourses(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews"; // the html page for the list of reviews
	}

	@RequestMapping("/singleReview")
	public String getOneCourse(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review"; // the html page for the single review
	}

}
