package country_building;

import country_building.builders.CountryBuilder;
import country_building.countries.Country;
import country_building.director.Director;

// Main

public class Client {
   public static void main(String[] args) {
      Director director = new Director();
      CountryBuilder builder = new CountryBuilder();

      // brazil
      director.builderBrazil(builder);
      Country brazil = builder.getResult();
      System.out.println(brazil.toString());

      // japan
      director.builderJapan(builder);
      Country japan = builder.getResult();
      System.out.println(japan.toString());

      // germany
      director.builderGermany(builder);
      Country germany = builder.getResult();
      System.out.println(germany.toString());
      
   }
}
