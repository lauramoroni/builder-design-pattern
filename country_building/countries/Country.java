package country_building.countries;

import country_building.components.Continent;

// A classe Country é o produto final que será construído
// Atributos e construtor que definem o objeto final

public class Country {
   private String name;
   private double area;
   private String capital;
   private Continent continent;

   public Country(String name, double area, String capital, Continent continent) {
      this.name = name;
      this.area = area;
      this.capital = capital;
      this.continent = continent;
   }

   public String getName() {
      return name;
   }

   public double getArea() {
      return area;
   }

   public String getCapital() {
      return capital;
   }

   public Continent getContinent() {
      return continent;
   }

   @Override
   public String toString() {
      return "Country [name=" + name + ", area=" + area + ", capital=" + capital + ", continent=" + continent + "]";
   }
   
}
