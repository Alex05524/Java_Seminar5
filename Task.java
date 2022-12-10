/*Урок 5. Хранение и обработка данных ч2: множество коллекций Map
1. Создать словарь HashMap. Обобщение <Integer, String>.
2. Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
3. Изменить значения дописав восклицательные знаки. *Создать TreeMap, заполнить аналогично. */
package Java_Seminar5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Task {
    static ArrayList<String> colors = new ArrayList<String>(
            Arrays.asList("Красный", "Оранжевый", "Желтый", "Зеленый", "Синий", "Фиолетовый"));

    public static void main(String[] args) {

        // 1. Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer, String> mHashMap = new HashMap<Integer, String>();

        // 2. Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        for (int key = 0; key < 3; key++) {
            mHashMap.put(
                    key,
                    colors.get(key)
            );
        }
        System.out.println(Arrays.toString(mHashMap.entrySet().toArray()));

        // 3. Изменить значения дописав восклицательные знаки. *Создать TreeMap, заполнить аналогично.
        for (int key = 0; key < 3; key++) {
            mHashMap.replace(
                    key,
                    mHashMap.get(key) + "!"
            );
        }
        System.out.println("Добавлены !");
        System.out.println(Arrays.toString(mHashMap.entrySet().toArray()));

        TreeMap<Integer, String> mTreeMap = new TreeMap<Integer, String>();
        for (int key = 0; key < 3; key++) {
            mTreeMap.put(
                    key,
                    colors.get(key)
            );
        }
        System.out.println("TreeMap: ");
        System.out.println(Arrays.toString(mTreeMap.entrySet().toArray()));

        for (int key = 0; key < 3; key++) {
            mTreeMap.replace(
                    key,
                    mTreeMap.get(key) + "!"
            );
        }
        System.out.println("Добавлены !");
        System.out.println(Arrays.toString(mTreeMap.entrySet().toArray()));
    }
}
