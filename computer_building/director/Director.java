package computer_building.director;

import computer_building.builders.Builder;
import computer_building.components.Processor;

// Controla as etapas de construção do objeto e define a ordem

public class Director {
   public void constructGamingComputer(Builder builder) {
      builder.setProcessor(Processor.INTEL_CORE_I9);
      builder.setMemory(32);
      builder.setStorage(2000);
      builder.setGraphicsCard(true);
   }

   public void constructOfficeComputer(Builder builder) {
      builder.setProcessor(Processor.INTEL_CORE_I3);
      builder.setMemory(8);
      builder.setStorage(500);
      builder.setGraphicsCard(false);
   }

}
