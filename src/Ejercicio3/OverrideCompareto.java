package Ejercicio3;

import java.util.Comparator;
import java.util.Map;

class OverrideCompareto implements Comparator {
        Map map;

        public OverrideCompareto(Map map) {
            this.map = map;
        }

    public int compare(Object keyA, Object keyB) {
        Comparable valueA = (Comparable) map.get(keyA);
        Comparable valueB = (Comparable) map.get(keyB);
        return valueB.compareTo(valueA);
    }
}
