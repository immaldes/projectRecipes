package recipes.domain;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("recipes")
public class Recipe {
	@Id
	private String id;
	private String name;
	private String description;
	private List<String> ingredients;
	private List<String> steps;
	private String difficulty;
	private String category;
	@DBRef
	private User author;
	private String date;
	private String imagePath;


}