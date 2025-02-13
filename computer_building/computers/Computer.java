package computer_building.computers;

import computer_building.components.Processor;

// A classe Computer é o produto final que será construído

public class Computer {
      private Processor processor;
      private int memory;
      private int storage;
      private boolean hasGraphicsCard;
   
      public Computer(Processor processor, int memory, int storage, boolean hasGraphicsCard) {
         this.processor = processor;
         this.memory = memory;
         this.storage = storage;
         this.hasGraphicsCard = hasGraphicsCard;
      }
   
      @Override
      public String toString() {
         return "Computer{" +
                  "processor='" + processor + '\'' +
                  ", memory=" + memory +
                  ", storage=" + storage +
                  ", graphicsCard=" + hasGraphicsCard +
                  '}';
      }
}
