public class TestArrayList {
    public static void main(String[] args) {
                ArrayList<String> list = new ArrayList<>();
        
               
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After adding elements:");
        list.printList();
        
              
        list.removeLast();
        System.out.println("After removing the last element:");
        list.printList();
        
              
        System.out.println("Contains 'Banana'? " + list.contains("Banana"));
        System.out.println("Contains 'Cherry'? " + list.contains("Cherry"));
        
                
        System.out.println("Final List:");
        list.printList();
            
        
        
    }
}
