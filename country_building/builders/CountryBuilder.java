package country_building.builders;

import country_building.components.Continent;
import country_building.countries.Country;

// Os ConcreteBuilders implementam a interface Builder e implementam as etapas de construção
// Setters e result

public class CountryBuilder implements Builder {
   private String name;
   private double area;
   private String capital;
   private Continent continent;
   
   @Override
   public void setName(String name) {
       this.name = name;
   }

   @Override
   public void setArea(double area) {
       this.area = area;
   }

   @Override
   public void setCapital(String capital) {
       this.capital = capital;
   }

   @Override
   public void setContinent(Continent continent) {
       this.continent = continent;
   }

   public Country getResult() {
       return new Country(name, area, capital, continent);
   }
}
