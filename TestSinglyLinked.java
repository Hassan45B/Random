import  java.util.Iterator;

public class TestSinglyLinked {
 
        public static void main(String[] args) {
            SinglyLinked<String> list = new SinglyLinked<>();
            
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");
    
            
            System.out.println("List contents:");
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            
        }
    }
}
