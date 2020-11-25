
    import java.time.LocalDateTime;
    import java.time.Month;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.Map;

    public class Main{
        public static void main(String[] args) {
          LinkedHashMap<Integer, Message> map = new LinkedHashMap<>();
          map.put(1, new Message(12, "Hi", "Karl", "Anna", true,  LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2),  LocalDateTime.of(2222, Month.DECEMBER, 2, 2, 2, 2)));
           // LocalDateTime.of(2222, Month.NOVEMBER, 2, 2, 2, 2);

            for(Map.Entry<Integer,Message> i: map.entrySet()){
                Integer key = i.getKey();
                Message value = i.getValue();
                System.out.println("key =" + key + ", Value= " + value);
            }
        }

    }

