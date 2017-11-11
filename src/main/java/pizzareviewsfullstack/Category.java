package pizzareviewsfullstack;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@OneToMany(mappedBy = "category")
	Set<PizzaReview> pizzaReviews;

	public Category() {

	}

	public Category(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<PizzaReview> getPizzaReviews() {
		return pizzaReviews;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", pizzaReviews=" + pizzaReviews + "]";
	}

}
