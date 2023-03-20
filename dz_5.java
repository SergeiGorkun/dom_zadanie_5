 //1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


// public Set<String> getContactTwoNumbers(String phone, String name) {
//     TreeSet<String> result = new TreeSet<>();
//     String key = "";
//     String namePlusNumber = "";
//     if (phoneBookTreeMap.containsValue(name)){
//         for(String k : phoneBookTreeMap.keySet())
//         {
//             if (phoneBookTreeMap.get(k).equals(name)){
//                 key = k;
//                 result.add(name + " - " + key + ", " + phone); 
//                 namePlusNumber = key + ", " + phone;
//                 break;
//             }
//         }
//     }
//     phoneBookTreeMap.remove(key); // сюда передаем старый контакт по номеру (key) и удаляем его, чтобы остался в Map только один контакт с двумя номерами
//     phoneBookTreeMap.put(namePlusNumber, name); // сюда добавляем в наш Map "новый" контакт уже с двумя номерами
//     return result;
// }

// 2. Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.


// public class Array {
//     public static int countWords(ArrayList<String> NamesArr, String word) {
//         return Collections.frequency(NamesArr, word);
//     }

//     public static void main(String[] args) {
//         ArrayList<String> NamesArr = new ArrayList<>();
//         NamesArr.add("Иван Иванов");
//         NamesArr.add("Светлана Петрова");
//         NamesArr.add("Кристина Белова");
//         NamesArr.add("Анна Мусина");
//         NamesArr.add("Анна Крутова");
//         NamesArr.add("Иван Юрин");
//         NamesArr.add("Петр Лыков");
//         NamesArr.add("Павел Чернов");
//         NamesArr.add("Петр Чернышов");
//         NamesArr.add("Мария Федорова");
//         NamesArr.add("Марина Светлова");
//         NamesArr.add("Мария Савина");
//         NamesArr.add("Мария Рыкова");
//         NamesArr.add("Марина Лугова");
//         NamesArr.add("Анна Владимирова");
//         NamesArr.add("Иван Мечников");
//         NamesArr.add("Петр Петин");
//         NamesArr.add("Иван Ежов");

//         System.out.println("Наш массив " + NamesArr);

//         for (int i = 0; i < NamesArr.size(); i++) {
//             if (countWords(NamesArr, NamesArr.get(i)) == 1) {
//                 System.out.println(" Уникальные слова " + NamesArr.get(i));
//                 System.out.println("Имя Иван повторяется " +
//                         Collections.frequency(NamesArr, "Иван"));
//             }
//         }
//     }
// }