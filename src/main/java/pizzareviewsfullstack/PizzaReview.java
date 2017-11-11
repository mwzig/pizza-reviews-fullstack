package pizzareviewsfullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class PizzaReview {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String imageURL;
	@Lob
	private String content;

	private String address;
	private String website;
	private String date;
	private int rating;

	@ManyToOne
	private Category category;

	public PizzaReview() {
	}

	public PizzaReview(String title, String imageURL, String content, String address, String website, String date,
			int rating, Category category) {
		this.title = title;
		this.imageURL = imageURL;
		this.content = content;
		this.address = address;
		this.website = website;
		this.date = date;
		this.rating = rating;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageURL() {
		return imageURL;
	}

	public String getContent() {
		return content;
	}

	public String getAddress() {
		return address;
	}

	public String getWebsite() {
		return website;
	}

	public String getDate() {
		return date;
	}

	public int getRating() {
		return rating;
	}

	public Category getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "PizzaReview [id=" + id + ", title=" + title + ", imageURL=" + imageURL + ", content=" + content
				+ ", address=" + address + ", website=" + website + ", date=" + date + ", rating=" + rating
				+ ", category=" + category + "]";
	}

}
