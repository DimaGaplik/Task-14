package app;

//Что-то типа теста
public class Main {
        public static void main(String[] args) {
        Printer printer = new PrinterImpl();

        Printer.Message message1 = new Printer.Message("Hello, world!", "Dima");
        Printer.Message message2 = new Printer.Message("Anonimus", "");
        Printer.Message message3 = new Printer.Message(null, null);

        printer.print(message1);
        printer.print(message2);
        printer.print(message3);
    }
}
