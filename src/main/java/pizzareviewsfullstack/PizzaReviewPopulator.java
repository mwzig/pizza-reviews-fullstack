package pizzareviewsfullstack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PizzaReviewPopulator implements CommandLineRunner {

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private PizzaReviewRepository reviewRepo;

	@Override
	public void run(String... args) throws Exception {
		Category frozen = new Category("Frozen");
		categoryRepo.save(frozen);
		Category carryOut = new Category("Carry-Out");
		categoryRepo.save(carryOut);
		Category restaurant = new Category("Restaurant");
		categoryRepo.save(restaurant);

		PizzaReview rev1 = new PizzaReview("Digiorno Rising Crust Pizza", "../images/Digiorno.png",
				"Self-rising crust has big, juicy toppings that are paired with a delicious signature sauce", "",
				"http://www.digiorno.com", "10/27/2017", 3, frozen);

		PizzaReview rev2 = new PizzaReview("Freschetta Naturally Rising Crust Pizza", "../images/Freschetta.jpg",
				"The cheesier the better. Mozzarella, cheddar, provolone and parmesan make the 4-Cheese pizza a sure bet on any pizza night.",
				"", "http://www.Freschetta.com", "10/27/2017", 3, frozen);

		PizzaReview rev3 = new PizzaReview("Benny's Pizza", "../images/Bennys.jpg",
				"The best. Always great, dine in or carry out.  Nice crust, tasty sauce, plenty of cheese and good toppings.",
				"Marysville", "http://www.bennyspizza.com", "10/27/2017", 5, restaurant);

		PizzaReview rev4 = new PizzaReview("Dewey's Pizza", "../images/Deweys.jpg",
				"Delicious pizza made from scratch.  Fast, friendly service. Great dine-in experience. (Carry-out has not been good).",
				"Worthington", "http://www.deweyspizza.com", "10/27/2017", 5, restaurant);

		PizzaReview rev5 = new PizzaReview("Panzera's Pizza", "../images/Panzeras.jpg",
				"Great neighborhood pizza maker - consistently delicious pizza.",
				"near Riverside Drive & Fishinger Road, Arlington", "http://uapanzeras-com.webnode.com", "10/27/2017",
				4, carryOut);

		PizzaReview rev6 = new PizzaReview("Rotolo's Pizza", "../images/Rotolos.jpg",
				"No-frills branch of a family-owned chain offering pizza, subs & pasta to carry out.",
				"Grandview - 5th Avenue", "http://www.rotolospizza.com/", "10/27/2017", 4, carryOut);

		reviewRepo.save(rev1);

		System.out.println(rev1.getAddress());
		System.out.println(rev1.getContent());
		System.out.println(rev1.getDate());
		System.out.println(rev1.getImageURL());
		System.out.println(rev1.getRating());
		System.out.println(rev1.getWebsite());
		System.out.println(rev1.getCategory().getName());

		reviewRepo.save(rev2);
		reviewRepo.save(rev3);
		reviewRepo.save(rev4);
		reviewRepo.save(rev5);
		reviewRepo.save(rev6);

	}

}
