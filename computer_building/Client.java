package computer_building;

import computer_building.builders.ComputerBuilder;
import computer_building.computers.Computer;
import computer_building.director.Director;

// Main

public class Client {

   public static void main(String[] args) {
      Director director = new Director();
      ComputerBuilder builder = new ComputerBuilder();

      // Construir OfficeComputer
      director.constructOfficeComputer(builder);

      // Obter o objeto Computer
      Computer officeComputer = builder.getResult();
      System.out.println(officeComputer);

      // Construir GamingComputer
      director.constructGamingComputer(builder);

      // Obter o objeto Computer
      Computer gamingComputer = builder.getResult();
      System.out.println(gamingComputer);
      
   }

}
