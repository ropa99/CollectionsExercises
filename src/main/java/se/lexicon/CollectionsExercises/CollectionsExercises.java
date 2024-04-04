package se.lexicon.CollectionsExercises;
import java.util.*;
/**
 * !
 *
 */
public class CollectionsExercises
{
    public static void main( String[] args )

    {
        String divider ="********************";
        System.out.println( "Collection Exercises" );
        ex1();
        System.out.println(divider);
        ex2();
        System.out.println(divider);
        ex3();
        System.out.println(divider);
        ex4();
        System.out.println(divider);
        ex5();
        System.out.println(divider);
        ex6();
        System.out.println(divider);
        ex7();
        System.out.println(divider);
    }

    public static void ex1(){
        ArrayList<String> strArr = new ArrayList<String>();
        strArr.add("Monday");
        strArr.add("Tuesday");
        strArr.add("Wednesday");
        strArr.add("Thursday");
        strArr.add("Friday");
        strArr.add("Saturday");
        strArr.add("Sunday");
        System.out.println(strArr);

    }
    public static void ex2(){
        ArrayList<String> strArr = new ArrayList<String>();
        strArr.add("Monday");
        strArr.add("Tuesday");
        strArr.add("Wednesday");
        strArr.add("Thursday");
        strArr.add("Friday");
        strArr.add("Saturday");
        strArr.add("Sunday");
        Iterator it = strArr.iterator();

        System.out.println("**while loop**");
        while(it.hasNext()){
            System.out.println(it.next());

        }
        System.out.println("**For loop**");
        for (String str : strArr){
            System.out.println(str);
        }
    }
    public static void ex3(){
        ArrayList<String> strArr = new ArrayList<String>();
        strArr.add("Monday");
        strArr.add("Tuesday");
        strArr.add("Wednesday");
        //strArr.add("Thursday");
        strArr.add("Friday");
        strArr.add("Saturday");
        strArr.add("Sunday");

        strArr.add(3,"Thursday");
        System.out.println(strArr);
    }
    public static void ex4(){
        ArrayList<String> subArr = new java.util.ArrayList<>();
        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("Monday");
        strArr.add("Tuesday");
        strArr.add("Wednesday");
        strArr.add("Thursday");
        strArr.add("Friday");
        strArr.add("Saturday");
        strArr.add("Sunday");

        subArr.add(strArr.subList(0,3).toString());
        System.out.println(subArr);
    }

    public static void ex5(){
        HashSet<String> setArr = new HashSet<>();
        setArr.add("Monday");
        setArr.add("Tuesday");
        setArr.add("Wednesday");
        setArr.add("Thursday");
        setArr.add("Friday");
        setArr.add("Saturday");
        setArr.add("Sunday");
        System.out.println(setArr);
    }
    public static void ex6(){
        HashSet<String> setArr = new HashSet<>();
        setArr.add("Monday");
        setArr.add("Tuesday");
        setArr.add("Wednesday");
        setArr.add("Thursday");
        setArr.add("Friday");
        setArr.add("Saturday");
        setArr.add("Sunday");

        List<String> listArr = new ArrayList<>(setArr);
        //Funkar lika bra
        //ArrayList<String> listArr = new ArrayList<>(setArr);
        System.out.println(listArr);
    }
    public static void ex7(){
        HashSet<String> setArr = new HashSet<>();
        setArr.add("Olle");
        setArr.add("Carin");
        setArr.add("Nisse");
        setArr.add("Bosse");
        setArr.add("Östen");
        setArr.add("Lovisa");
        setArr.add("Eva");

        List<String> listArr = new ArrayList<>(setArr);
        //Funkar lika bra
        //ArrayList<String> listArr = new ArrayList<>(setArr);
        Collections.sort(listArr);
        System.out.println(listArr);
    }

}
