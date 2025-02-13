package country_no_builder;

// Agora, em vez de usar o padrão Builder, os objetos são criados diretamente através de um construtor e modificados com setters, caso necessário. 
// Isso pode tornar o código mais simples, mas pode reduzir a flexibilidade para construir objetos complexos passo a passo.

public class Client {
   public static void main(String[] args) {
       // Criação de objetos diretamente
       Country brazil = new Country("Brazil", "Brasília", 212.6, Continent.AMERICA);
       Country usa = new Country("United States", "Washington, D.C.", 331.0, Continent.AMERICA);
       Country china = new Country("China", "Pequim", 1441.0, Continent.ASIA);
       
       // Exibir os objetos criados
       System.out.println(brazil);
       System.out.println(usa);
       System.out.println(china);
   }
}
