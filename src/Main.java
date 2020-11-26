
    import java.time.LocalDateTime;
    import java.time.Month;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.Map;

    public class Main{
        public static void main(String[] args) {
          LinkedHashMap<Integer, Message> map = new LinkedHashMap<>();
          map.put(1, new Message(12, "Hi", "Karl", "Maddison",  LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map.put(2, new Message(12, "Hi", "Karl", "Elvis", LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map.put(3, new Message(20, "Hello", "Elvis", "Lena",  LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map.put(4, new Message(30, "Hiiiii", "Karlson", "Saadat",  LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map.put(5, new Message(40, "Good", "Karlo", "Karina",  LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map.put(6, new Message(50, "Check", "Kane", "Nastya", LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map.put(7, new Message(60, "Come on", "Karina", "Anna",  LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map.put(8, new Message(70, "Lets go", "Nastya", "Anna",  LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            for(Map.Entry<Integer,Message> i: map.entrySet()){
                Integer key = i.getKey();
                Message value = i.getValue();
                System.out.println("key =" + key + ", Value= " + value);
                System.out.println(map.size());
            }
            
            
            System.out.println("----------------------------------------------------");

            
           LinkedHashMap<Integer, Message> map1 = new LinkedHashMap<>(16, 0.75f, true);
           map1.put(1, new Message(12, "what", "Mad", "Anna", LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map1.put(2, new Message(55, "Yes", "Paul", "Karl", LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map1.put(3, new Message(22, "what", "Mad", "Anna", LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map1.put(4, new Message(152, "Java", "Son", "Paul", LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map1.put(5, new Message(142, "Doll", "Lena", "Nastya", LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map1.put(6, new Message(127, "Okey", "Min", "Idea", LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map1.put(7, new Message(129, "Hey Guys", "Bad", "Aida", LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
            map1.put(8, new Message(121, "Hi", "Karl", "Aiperi", LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));

            for(Map.Entry<Integer,Message> i: map1.entrySet()){
                Integer key = i.getKey();
                Message value = i.getValue();
                System.out.println("key =" + key + ", Value= " + value);
                System.out.println(map1.size());
                System.out.println();
            }

        }

    }
