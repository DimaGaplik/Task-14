package app;

public class PrinterImpl implements Printer {

    @Override
    public void print(Message message) {
        if ((message.getText() == null || message.getText().isEmpty()) &&
                (message.getSender() == null || message.getSender().isEmpty())) {

            // Анонимный класс для обработки пустого сообщения
            new Object() {
                void processEmptyMessage() {
                    System.out.println("Обрабатывается пустое сообщение от анонимного пользователя...");
                }
            }.processEmptyMessage();
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонимный пользователь отправил сообщение: " + message.getText());
        } else {
            System.out.println("Пользователь " + message.getSender() + " отправил сообщение: " + message.getText());
        }
    }

    // Метод main для тестирования
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();

        // Тестовые сообщения
        Message message1 = new Printer.Message("Привет, мир!", "Иван");
        Message message2 = new Printer.Message("Без имени", "");
        Message message3 = new Printer.Message(null, null);

        printer.print(message1); // Пользователь Иван отправил сообщение: Привет, мир!
        printer.print(message2); // Анонимный пользователь отправил сообщение: Без имени
        printer.print(message3); // Обрабатывается пустое сообщение от анонимного пользователя...
        }
    }
