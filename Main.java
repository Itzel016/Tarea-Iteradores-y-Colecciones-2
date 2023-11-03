import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
     public static void main(String[] args) {
         List<Palette<StrawberryPalette>> palettes = new ArrayList<>();

         // Add palettes to the collection
         palettes.add(new Palette<>("Strawberry", 1.5, new StrawberryPalette()));
         palettes.add(new Palette<>("Strawberry with Cream", 2.0, new StrawberryPalette()));

         // Use an iterator to loop through and display palette information
         Iterator<Palette<StrawberryPalette>> iterator = palettes.iterator();
         while (iterator.hasNext()) {
             Palette<StrawberryPalette> palette = iterator.next();
             palette.showInformation();
         }
     }
}

