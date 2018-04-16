package com.company;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        /**
         *                       List
         *                ArrayList     LinkedList
         *.get()                O(1)       O(n)
         *.set(0, value)        O(n)       O(1)
         *
         *           Set
         * HashSet TreeSet LinkedHasSet
         * - get by value
         *
         *      Map
         * HashMap TreeMap LinkedHashMap
         * - get by key or value
         */
        List<Integer> arrayList = new ArrayList<>();
//        arrayList.add("asd");
        arrayList.add(1);
        arrayList.add(Long.valueOf(1L).intValue());

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.printf("Original HashSet: %s%n", hashSet);

        Set<Integer> hashSet_2 = new HashSet<>();
        hashSet_2.add(2);
        hashSet_2.add(3);
//        hashSet_2.add(4);
        System.out.printf("HashSet 2: %s%n", hashSet_2);


        System.out.printf("Original Hash Set contains all elements of Hash Set 2: %s%n", hashSet.containsAll(hashSet_2));
        hashSet.removeAll(hashSet_2);
        System.out.printf("Original HashSet after removal all element of HashSet 2: %s%n", hashSet);

        System.out.println();



//        stringFormatExample();



        boolean contains = hashSet.contains(1);

        Map<Integer, String> hashMap = new HashMap<>();

//        int counter = 0;
        hashMap.put(1, "Apple");
//        boolean hasApple = hashMap.containsKey(counter);
//        if (hasApple) {
//            ++counter;
//        }
        hashMap.put(2, "Pineapple");
//        hashMap.putIfAbsent(2, "Cherry");
        hashMap.putIfAbsent(3, "Cherry");
        String pineapple = hashMap.get(2);

        System.out.printf("HashMap has value 'Pineapple' on Key = 2: %s%n", pineapple.equalsIgnoreCase("pineapple"));


        System.out.printf("Fruit with keys 2 and 5: [%s], [%s] %n",
                hashMap.get(2),
                hashMap.getOrDefault(5, "No such fruit"));

        System.out.println();

        System.out.printf("HashMap %s%n", hashMap);


    }

    //https://dzone.com/articles/java-string-format-examples
    private static void stringFormatExample() {
        String name = "David";
        int age = 43;

        String result = "His name is " + name + ", and he is " + age + " old";
        System.out.println(result);

        String resultWithFormat = String.format("His name is %s and he is %s years old", name, age);
        System.out.println();

        System.out.print(resultWithFormat);

        //%s - string
        //%d - digit
        System.out.printf("His name is %s and he is %d years old", name, age);

    }
}
