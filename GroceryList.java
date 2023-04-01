package dev.lpa;

import java.util.*;

public class GroceryList {
private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while(flag){
            PrintText();
            switch (Integer.parseInt(sc.nextLine())){
                case 1 -> AddItems(groceries);
                case 2 -> RemoveItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);

        }
    }
    public static void AddItems(ArrayList<String> groceries){
        System.out.println("Enter the items to add: Separated by commas.");
        String[] items = sc.nextLine().split(",");
//        groceries.addAll(List.of(items));
        for(String i: items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0){
                   groceries.add(trimmed);
            }
        }
    }
    public static void RemoveItems(ArrayList<String> groceries){
        System.out.println("Enter the items to remove: Separated by commas.");
        String[] items = sc.nextLine().split(",");
//        groceries.addAll(List.of(items));
        for(String i: items){
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }
    public static void PrintText(){
        String text = """
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                 
                Enter a number for which action you want do: 
                """;
        System.out.println(text);
    }

}
