package app;

public class PrinterImpl implements Printer {

    @Override
    public void print(Message message) {
        if ((message.getText() == null || message.getText().isEmpty()) &&
                (message.getSender() == null || message.getSender().isEmpty())) {

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
}
