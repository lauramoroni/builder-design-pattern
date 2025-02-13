package computer_building.builders;

import computer_building.components.Processor;
import computer_building.computers.Computer;

// Os ConcreteBuilders implementam a interface Builder e implementam as etapas de construção

public class ComputerBuilder implements Builder {
   private Processor processor;
   private int memory;
   private int storage;
   private boolean hasGraphicsCard;

   public void setProcessor(Processor processor) {
      this.processor = processor;
   }

   @Override
   public void setMemory(int memory) {
      this.memory = memory;
   }

   @Override
   public void setStorage(int storage) {
      this.storage = storage;
   }

   @Override
   public void setGraphicsCard(boolean hasGraphicsCard) {
      this.hasGraphicsCard = hasGraphicsCard;
   }

   public Computer getResult() {
      return new Computer(processor, memory, storage, hasGraphicsCard);
   }
   
}
