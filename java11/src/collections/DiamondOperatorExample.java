package collections;

public class DiamondOperatorExample {

    static abstract class MyHandler<T> {

        private T content;

        public MyHandler(T content) {
            this.content = content;
            System.out.println("æž„é€ å‡½æ•°æ”¶åˆ°äº†ä¸€æ�¡å†…å®¹: " + content.toString());
        }

        public T getContent() {
            return content;
        }

        public void setContent(T content) {
            this.content = content;
        }

        abstract void handle();
    }

    public static void main(String[] args) {
        MyHandler<Integer> intHandler = new MyHandler<>(1) {
            @Override
            public void handle() {
                System.out.println("æ”¶åˆ°çº¢åŒ… > " + getContent() + "å…ƒ");
            }
        };
        intHandler.handle();

        System.out.println("===================ç¥žå¥‡çš„åˆ†å‰²çº¿===================");

        MyHandler<? extends Integer> intHandler1 = new MyHandler<>(10) {
            @Override
            void handle() {
                System.out.println("æ”¶åˆ°çº¢åŒ… > " + getContent() + "å…ƒ");
            }
        };
        intHandler1.handle();

        System.out.println("===================ç¥žå¥‡çš„åˆ†å‰²çº¿===================");

        MyHandler<?> handler = new MyHandler<>("é­”æ³•å¸ˆ") {
            @Override
            void handle() {
                System.out.println("é©¬ä¸ŠæŠŠ [" + getContent() + "] ç»™å¤„ç�†äº†");
            }
        };
        handler.handle();

    }

}
