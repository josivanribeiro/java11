package collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;


public class Example {

    public static void main(String[] args) {

        // ç©ºåˆ—è¡¨ï¼Œæ•°æ�®ç±»åž‹ä¸º Object
        List immutableList = List.of();

        // åˆ›å»º List<String>
        var foo = List.of("biezhi", "github", "çŽ‹çˆµçš„æŠ€æœ¯å°�é»‘å±‹");

        // ç©º Mapï¼ŒKey å’Œ Value ç±»åž‹éƒ½æ˜¯ Object
        Map emptyImmutableMap = Map.of();

        // å¿«é€Ÿåˆ›å»ºä¸€ä¸ª Map
        var mmp = Map.of(2017, "å…ˆèµšä»–ä¸€ä¸ªäº¿", 2018, "åŽ»å¹´çš„æ¢¦æƒ³å�¯èƒ½æœ‰ç‚¹å„¿å¤¸å¼ ");

        // ä½¿ç”¨ Entries åˆ›å»ºä¸€ä¸ª Map
        Map<Integer, String> emptyEntryMap = Map.ofEntries(
                entry(20, "è£…é€¼"),
                entry(30, "å�•èº«"),
                entry(40, "å›žå®¶ç§�åœ°")
        );

        // åˆ›å»ºä¸€ä¸ª Map.Entry
        Map.Entry<String, String> immutableMapEntry = Map.entry("biezhi", "emmmm");
        // å…¶å®žå’Œä¸Šé�¢çš„ä»£ç �ç‰‡æ®µæ˜¯ä¸€æ ·ä¸€æ ·çš„
        Map.ofEntries(immutableMapEntry);

        // åˆ›å»ºä¸€ä¸ªç©º Set<String>
        Set<String> immutableSet = Set.of();

        // å¿«é€Ÿåˆ›å»ºä¸€ä¸ª Set<String>
        Set<String> bar = Set.of("æˆ‘", "å�¯èƒ½", "æ˜¯ä¸ª", "å�‡çš„", "ç¨‹åº�å‘˜");

    }

}
