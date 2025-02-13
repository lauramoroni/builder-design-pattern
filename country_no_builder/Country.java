package country_no_builder;

public class Country {
   private String name;
   private String capital;
   private double population;
   private Continent continent;

   // Construtor padrão
   public Country(String name, String capital, double population, Continent continent) {
       this.name = name;
       this.capital = capital;
       this.population = population;
       this.continent = continent;
   }

   // Getters e Setters
   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getCapital() {
       return capital;
   }

   public void setCapital(String capital) {
       this.capital = capital;
   }

   public double getPopulation() {
       return population;
   }

   public void setPopulation(double population) {
       this.population = population;
   }

   public Continent getContinent() {
       return continent;
   }

   public void setContinent(Continent continent) {
       this.continent = continent;
   }

   @Override
   public String toString() {
       return "Country{" +
               "name='" + name + '\'' +
               ", capital='" + capital + '\'' +
               ", population=" + population +
               ", continent=" + continent +
               '}';
   }
}