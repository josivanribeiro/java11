package interfaces;

public interface Example {

    private static void sayHello() {
        System.out.println("ä½ å·²ç»�æ˜¯å¤§ä½¬äº†ï¼Œå¿«å’Œè�Œæ–°æ‰“ä¸ªæ‹›å‘¼ï¼�");
    }

    // æ™®é€šæ–¹æ³•
    void normalInterfaceMethod();

    // é»˜è®¤æ–¹æ³•
    default void interfaceMethodWithDefault() {
        init();
    }

    // å�¦ä¸€ä¸ªè›‡çš®é»˜è®¤æ–¹æ³•
    default void anotherDefaultMethod() {
        init();
    }

    // è¿™ä¸ªæ–¹æ³•ä¸�æ˜¯å…¬å…± API çš„ä¸€éƒ¨åˆ†
    private void init() {
        System.out.println("æ­£åœ¨ç»™å¤§ä½¬å‡†å¤‡æ´—è„šæ°´...");
    }

}
