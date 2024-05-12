package main.java.com.harshwalia;

/* Printer to help in printing the output back to the user */
public class OutputPrinter {
    public void welcome() {
        printWithNewLine("Welcome to the harsh Parking lot");
    }

    public void end() {
        printWithNewLine("Thanks for using harsh Parking lot service.");
      }
    
      public void notFound() {
        printWithNewLine("Not found");
      }
    
      public void statusHeader() {
        printWithNewLine("Slot No.    Registration No    Colour");
      }
    
      public void parkingLotFull() {
        printWithNewLine("Sorry, parking lot is full");
      }
    
      public void parkingLotEmpty() {
        printWithNewLine("Parking lot is empty");
      }
    
      public void invalidFile() {
        printWithNewLine("Invalid file given.");
      }

    public void printWithNewLine(final String msg) { System.out.println(msg);}
}
