package country_building.director;

import country_building.builders.Builder;
import country_building.components.Continent;

// Controla as etapas de construção do objeto
// Define a ordem das etapas de construção do objeto
// Cria os tipos de contrução (builderBrazil, builderJapan, builderGermany)

public class Director {

   public void builderBrazil(Builder builder) {
      builder.setName("Brazil");
      builder.setArea(8.516);
      builder.setCapital("Brasília");
      builder.setContinent(Continent.AMERICA);
   }

   public void builderJapan(Builder builder) {
      builder.setName("Japan");
      builder.setArea(0.377);
      builder.setCapital("Tokyo");
      builder.setContinent(Continent.ASIA);
   }

   public void builderGermany(Builder builder) {
      builder.setName("Germany");
      builder.setArea(0.357);
      builder.setCapital("Berlin");
      builder.setContinent(Continent.EUROPE);
   }

}