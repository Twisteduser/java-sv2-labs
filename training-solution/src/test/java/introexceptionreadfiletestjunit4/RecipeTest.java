package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecipeTest {

    private Recipe recipe = new Recipe();

    @Test
    public void testAddIngredients() {
        Path path = Paths.get("src/test/java/introexceptionreadfiletestjunit5/recipe.txt");
        recipe.addIngredients(path);

        assertEquals(10, recipe.getIngredients().size());
        assertEquals("kristálycukor", recipe.getIngredients().get(2));
    }

    @Test
    public void testAddIngredientsNotExistingFile() {
        Path path = Paths.get("src/test/java/introexceptionreadfiletestjunit5/xyz.txt");

        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(path));
        assertEquals("Can not read file.", exception.getMessage());
    }
}