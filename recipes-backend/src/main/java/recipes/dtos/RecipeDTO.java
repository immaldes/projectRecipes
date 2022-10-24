package recipes.dtos;

import lombok.*;
import recipes.domain.Recipe;
import recipes.domain.User;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeDTO {
    private String id;
    private String name;
    private String description;
    private List<String> ingredients;
	private List<String> steps;
	private String category;
    private User author;
    private String date;
    private String imagePath;
    private float stars;

	private enum difficulty{
    	Easy,
    	Medium,
    	Advanced,
    	Unrated
    }
	difficulty recipeDifficulty;
    
	 public RecipeDTO(String id, String name, String description,List<String> ingredients, List<String> steps, String category, User author, String date, String imagePath,float stars,String dif) {
			this.id = id;
			this.name = name;
			this.description = description;
			this.ingredients = ingredients;
			this.steps = steps;
			this.category = category;
			this.author = author;
			this.date = date;
			this.stars = stars;
			this.imagePath = imagePath;
			
			switch(dif){
				case "Easy":
					this.recipeDifficulty= difficulty.Easy;
					break;
					
				case "Medium":
					this.recipeDifficulty= difficulty.Medium;
					break;
					
				case "Advanced":
					this.recipeDifficulty= difficulty.Advanced;
					break;
					
				default:
					this.recipeDifficulty= difficulty.Unrated;
					break;
			}
	}
	

	 public RecipeDTO(Recipe res) {
		 this(	res.getId(),
				res.getName(),
				res.getDescription(),
				res.getIngredients(),
				res.getSteps(),
				res.getCategory(),
				res.getAuthor(),
				res.getDate(),
				res.getImagePath(),
				0,
				res.getDifficulty() == null || res.getDifficulty() == "" ? "Unrated" : res.getDifficulty()
			);
	 }
}