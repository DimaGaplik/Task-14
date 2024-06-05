package app;

// Интерфейс Printer
public interface Printer {
    void print(Message message);

    // Вложенный статический класс Message
    class Message {
        private String text;
        private String sender;

        // Конструктор для всех параметров
        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        // Геттеры и сеттеры
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }
}
