package computer_building.builders;

import computer_building.components.Processor;

// Define todas as configurações possíveis para a construção do objeto

public interface Builder {
   void setProcessor(Processor processor);
   void setMemory(int memory);
   void setStorage(int storage);
   void setGraphicsCard(boolean hasGraphicsCard);
}
