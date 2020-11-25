
import java.time.LocalDateTime;

    public class Message {
        private long id; //сообщения
        private String msg; //тело сообщения
        private  LocalDateTime sentDate; // - дата отправки сообщения
        private LocalDateTime readDate; //- дата прочтения сообщения
        private  String sender; // имя отправителя
        private  String receiver; //- имя получателя
        private boolean accessOrder;

        public Message(){

        }

        public Message(long id, String msg, String sender, String receiver, boolean accessOrder, LocalDateTime sentDate, LocalDateTime readDate) {
            this.id = id;
            this.msg = msg;
            this.sender = sender;
            this.receiver = receiver;
            this.accessOrder = accessOrder;
            this.sentDate = sentDate;
            this.readDate = readDate;
        }

        public long getId() {
            return id;
        }


        public void setId(long id) {
            this.id = id;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getReceiver() {
            return receiver;
        }

        public void setReceiver(String receiver) {
            this.receiver = receiver;
        }

        public boolean isAccessOrder() {
            return accessOrder;
        }

        public void setAccessOrder(boolean accessOrder) {
            this.accessOrder = accessOrder;
        }
        public LocalDateTime getSentDate() {
            return sentDate;
        }

        public void setSentDate(LocalDateTime sentDate) {
            this.sentDate = sentDate;
        }

        public LocalDateTime getReadDate() {
            return readDate;
        }

        public void setReadDate(LocalDateTime readDate) {
            this.readDate = readDate;
        }
    }

