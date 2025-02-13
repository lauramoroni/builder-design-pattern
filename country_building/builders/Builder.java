package country_building.builders;

import country_building.components.Continent;

// Define todas as configurações possíveis para a construção do objeto

public interface Builder {
   void setName(String name);
   void setArea(double area);
   void setCapital(String capital);
   void setContinent(Continent continent);
}
