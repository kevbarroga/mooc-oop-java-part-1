import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Week_03 {

    public static boolean palindrome(String text) {
        if (text.equals(reverseString(text))) { return true; }
        else { return false; }
    }

    public static boolean moreThanOnce(ArrayList<Integer> list, int num) {
        int cnt = 0;
        for ( int number : list ) {
            if (num == number) { cnt++; }
        }
        if (cnt >= 2) { return true; }
        else { return false; }
    }

    public static double variance(ArrayList<Integer> list) {
        double avg = average(list);
        double var = 0.0;
        for (double num : list) {
            var += Math.pow((num*1.0 - avg), 2);
        }
        var = var / (list.size() - 1);
        return var;
    }

    public static int greatest(ArrayList<Integer> list) {
        int greatest = 0;
        for (int num : list) {
            if (num > greatest) { greatest = num; }
        }
        return greatest;
    }

    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for (String word : list) {
            intList.add(word.length());
        }
        return intList;
    }

    public static double average(ArrayList<Integer> list) {
        return (sum(list)*1.0) / list.size();
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for ( int num : list ) {
            sum += num;
        }
        return sum;
    }

    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);  // removes the first item (indexed 0)
    }

    public static void removeLast(ArrayList<String> list) {
        list.remove(list.size()-1);  // removes the last item (indexed list.length()-1)
    }

    public static int countList(ArrayList<String> list) {
        return list.size();
    }

    public static void printList(ArrayList<String> list) {
        for (String word : list) {
            System.out.println( word );
        }
    }
    
    public static void wordArrayList() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String input = ".";

        while (!input.isEmpty()) {
            System.out.print("Enter a word: ");
            input = reader.nextLine();
            if (words.contains(input)) { 
                System.out.println("Entered duplicate word: " + input);
                break; 
            }
            if (!input.isEmpty()) { words.add(input); }
        }
        System.out.println("List contains: ");
        printList(words);
        Collections.reverse(words);
        System.out.println("List reversed: ");
        printList(words);
        Collections.sort(words);
        System.out.println("List sorted: ");
        printList(words);
        int listCnt = countList(words);
        System.out.println("Size of list: " + listCnt);
        System.out.println(words);
        removeFirst(words);
        System.out.println(words);
        removeLast(words);
        System.out.println(words);
    }

    public static String reverseString(String name) {
        String output = "";
        int x = 0;
        while (x <= name.length()-1) {
            output += name.charAt(name.length()-(x+1));
            x++;
        }
        return output;
    }

    public void separateChars(String name) {
        String output = "";
        int x = 0;
        while (x <= name.length()-1) {
            output = (x+1)+". char: "+name.charAt(x);
            System.out.println(output);
            x++;
        }
    }

    public static char lastChar(String text) {
        return text.charAt(text.length() - 1);
    }

    public static char firstChar(String text) {
        return text.charAt(0);
    }

    public static int calcChars(String text) {
        return text.length();
    }

    public double average(int num1, int num2, int num3, int num4) {
        return (double)sum(num1,num2,num3,num4) / 4;
    }

    public int greatest(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public int least(int num1, int num2) {
        return Math.min(num1, num2);
    }

    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static void main(String[] args) {
        Week_03 test = new Week_03();

        //wordArrayList();
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println(list);
        System.out.println("Sum: " + sum(list));
        System.out.println("Avg: " + average(list));
        System.out.println("Greatest: " +greatest(list));
        System.out.println("Variance: " +variance(list));

        System.out.print("Enter an number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }
        
        System.out.print("Type text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }

        ArrayList<String> words = new ArrayList<String>();
        words.add("Hallo");
        words.add("Moi");
        words.add("Benvenuto!");
        words.add("badger badger badger badger");
        //ArrayList<Integer> lengths = lengths(list);
        System.out.println("Length of words: " + lengths(words));

        
        
        /*
        int answer = test.sum(4,3,6,1);
        System.out.println("Sum: " + answer);
        answer = test.least(2,7);
        System.out.println("Least: " + answer);
        answer = test.greatest(2,7,3);
        System.out.println("Greatest: " + answer);
        double avg = test.average(4,3,6,1);
        System.out.println("Average: " + avg);

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = reader.nextLine();

        System.out.println("Length: " + test.calcChars(input));
        System.out.println("First char: " + test.firstChar(input));
        System.out.println("Last char: " + test.lastChar(input));
        test.separateChars(input);
        System.out.print("Reverse: " + test.reverseString(input));
*/
    }
}
