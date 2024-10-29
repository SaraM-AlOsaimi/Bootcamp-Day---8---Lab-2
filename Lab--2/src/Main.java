import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                          // Lab 2
        Scanner in = new Scanner(System.in);
        /* 1- .Write a program to find all of the longest word in a given dictionary. */

//        String[] dictionary = {"cat", "dog", "red","is","am"};
//       ArrayList<String> longestWord = longest(dictionary);
//
//        System.out.println(longestWord);
        //--------------------------------------------------
        /*2. Write a program that displays the number of occurrences of an element in the array. */
//        int[] arr1 = {1,1,1,3,3,5};
//
//        System.out.println("Enter the number you want to know the number of times it repeats");
//        int userNumber = in.nextInt();
//
//        int count =0;
//        for(int num : arr1){
//            if(num == userNumber){
//                count++;
//            }
//        }
//        System.out.println(userNumber + " occurs " + count);

       //--------------------------------------------------
       /* 3.Write a program to find the k largest elements in a given array. Elements in the array can be in any order.*/

//        Integer[] arrayNumbers = {1,4,17,7,25,3,100}; //The Arrays.sort() method should be used with Integer[] for sorting in reverse order
//
//        System.out.println("Specify the value of k:");
//        int k = in.nextInt();
//
//        Arrays.sort(arrayNumbers, Collections.reverseOrder());
//
//        System.out.println(k + " largest elements of the said array are:");
//         for (int i = 0; i < k; i++) {
//            System.out.print(arrayNumbers[i]);
//            if (i < k - 1) {
//                System.out.print(", "); // Print comma only if not the last element
//            }
//        }

       //---------------------------------------------------
       /*4. Create a method to reverse an array of integers. Implement the method without creating a new array. */

//        int[] array = {5,4,3,2,1};
//
//        reverseIntegers(array);
//        System.out.println(Arrays.toString(array));

        //-------------------------------------------------
        /*5. Write a menu driven Java program with following option:
          1. Accept elements of an array
          2. Display elements of an array
          3. Search the element within array
          4. Sort the array
          5. To Stop the size of the array should be entered by the user.*/

//        ArrayList<String> options = new ArrayList<String>();
//
//        int userChoice ;
//
//        do {
//            System.out.println("choose from the menu:");
//            System.out.println("1. Accept elements of an array");
//            System.out.println("2. Display elements of an array");
//            System.out.println("3. Search the element within array");
//            System.out.println("4. Sort the array");
//            System.out.println("5. To Stop the size of the array");
//
//
//            userChoice = in.nextInt();
//            in.nextLine();
//
//            switch (userChoice) {
//                case 1:
//                    System.out.println(acceptElement(options,in));
//                    break;
//                case 2:
//                    System.out.println(displayElements(options));
//                    break;
//                case 3:
//                    System.out.println("Enter the element you want to search for:");
//                     String elementToSearch = in.nextLine(); // Get the element to search for
//                    System.out.println(searchElement(options, elementToSearch)); // Call searchElement
//                    break;
//                case 4:
//                    System.out.println(sortArrayElements(options));
//                    break;
//                case 5:
//                    System.out.println("Stopping the program...");
//                    break;
//                default:
//                    System.out.println("Try Again!");
//            }
//
//        } while (userChoice != 5);
        //----------------------------------------------
        /*6. Create a method that generates a random number within a given range. Allow the user to
          specify the range and call the method to display random numbers.
          Hint: use Random class*/

//        System.out.println("Enter the minimum value of the range: ");
//        int minValue = in.nextInt();
//
//        System.out.println("Enter the maximum value of the range: ");
//        int maxValue = in.nextInt();
//
//        System.out.println("Enter the number of random numbers to generate: ");
//        int count = in.nextInt();
//
//
//        ArrayList<Integer> randomNumbers = randomNumberGenerators(minValue, maxValue, count);
//        System.out.println("Numbers within the specified range:");
//        System.out.println(randomNumbers);

        //--------------------------------------------
        /*7. Write a program that checks the strength of a password. Create a method that evaluates a
          password based on criteria like length, inclusion of special characters, and uppercase/lowercase letters.
- We have three methods: checkLength, checkSpecialCharacters, and
checkUpperCaseLowerCase, each of which assigns a score based on specific criteria.
- The totalScore is calculated by adding the scores from these methods.
- Classify the password as strong (8 or more), moderately strong (5 or more), or weak
based on the totalScore. - The criteria for scoring:
• Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
(3 points).
• Special characters: Absence (0 points), Presence (2 points).
• Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
points). */

//        System.out.println("Enter a Password :");
//        String password = in.nextLine();
//
//        int pointsCount = 0;
//
//
//        pointsCount = checkLength(password, pointsCount);
//        pointsCount = checkSpecialCharacters(password, pointsCount);
//        pointsCount = checkUpperCaseLowerCase(password, pointsCount);
//
//        String strength = totalScore(pointsCount);
//        System.out.println("Password is: " + strength);


        //-------------------------------------------
        /*8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
and each subsequent number in the sequence is the sum of the two preceding ones. */

        System.out.println("Enter the number of Fibonacci terms to generate:");
        int numberOfFibonacciSe = in.nextInt();

        generatesFibonacci(numberOfFibonacciSe);


    } // main method parentheses


    //Q-1 //
//    public static ArrayList<String> longest(String[] arr){
//        ArrayList<String> longestWord = new ArrayList<>(); // to store the longest words
//
//        int maxLength =0;
//        for (String le : arr){
//            int wordL = le.length();  // to get the current word length
//            if(wordL>maxLength){
//                maxLength = wordL;
//                longestWord.clear();   // Clear the list to add new longest words
//                longestWord.add(le); // add new word
//            } else if(wordL == maxLength){
//                longestWord.add(le);
//            }
//        } return longestWord;
//    }

//**********************
    //Q4
//    public static void reverseIntegers (int[] array){
//
//        int left = 0;
//        int right = array.length-1;
//
//        while (left<right){
//            int tmp = array[left];
//            array[left] = array[right];
//            array[right] = tmp;
//
//            left++;
//            right--;
//        }
//
//    }
//************************
    //Q5
    // adding element method
//        public static String acceptElement(ArrayList<String> options, Scanner in) {
//            while (true) {
//                System.out.println("Please enter an element to add to the array (or type 'exit' to finish):");
//                String option = in.nextLine();
//
//                // Check if the user wants to exit
//                if (option.equalsIgnoreCase("exit")) {
//                    break; // Exit the loop
//                }
//                // Check for empty input
//                if (!option.trim().isEmpty()) {
//                    options.add(option); // Add the element to the list
//                    System.out.println("Element added: " + option);
//                } else {
//                    System.out.println("Cannot add an empty element.");
//                }
//            }
//            return "Element added";
//        }
//
//        // display elements method
//        public static String displayElements(ArrayList<String> options) {
//            if (options.isEmpty()) {
//                return "No elements in the array.";
//            } else {
//                StringBuilder arrayList = new StringBuilder("Array Elements:\n");
//                for (String op : options) {
//                    arrayList.append(op).append(",");
//                }
//                return arrayList.toString();
//            }
//        }
//
//    public static String searchElement (ArrayList<String> options , String elementToSearch){
//            if (options.contains(elementToSearch)) {
//                return "Element found: " + elementToSearch;
//            } else {
//                return "Element not found: " + elementToSearch;
//            }
//        }
//
//    public static String sortArrayElements(ArrayList<String> options){
//        if (options.isEmpty()) {
//            return "No elements to sort.";
//        } else {
//            Collections.sort(options); // Sorts the list in ascending order
//            return "Elements sorted successfully:\n" + displayElements(options);
//        }
//    }
//*****************************
    //Q6
//    public static ArrayList<Integer> randomNumberGenerators (int minValue , int maxValue , int count){
//        Random random = new Random();
//        ArrayList<Integer> randomNumbers = new ArrayList<>();
//
//        for (int i = 0; i < count; i++) {
//            int randomNum = random.nextInt((maxValue - minValue) + 1) + minValue; // Generate random number in range
//            randomNumbers.add(randomNum);
//        }
//
//        return randomNumbers;
//    }
//************************
    //Q7
//public static int checkLength(String password, int pointsCount) {
//    int passwordLength = password.length();
//    if (passwordLength >= 8) {
//        pointsCount += 3;
//    } else if (passwordLength >= 6) {
//        pointsCount += 2;
//    } else {
//        pointsCount += 0;
//    }
//    return pointsCount;
//}
//
//    public static int checkSpecialCharacters(String password , int pointsCount){
//        if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
//            pointsCount += 2;
//        } else {
//            pointsCount += 0;
//        }
//        return pointsCount;
//    }
//
//    public static int checkUpperCaseLowerCase(String password, int pointsCount) {
//        boolean hasUpperCase = false;
//        boolean hasLowerCase = false;
//
//        for (char c : password.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                hasUpperCase = true;
//            }
//            if (Character.isLowerCase(c)) {
//                hasLowerCase = true;
//            }
//        }
//
//        if (hasUpperCase && hasLowerCase) {
//            pointsCount += 3;
//        } else {
//            pointsCount += 0;
//        }
//        return pointsCount;
//    }
//
//    public static String totalScore(int pointsCount) {
//        if (pointsCount >= 8) {
//            return "Strong";
//        } else if (pointsCount >= 5) {
//            return "Moderately Strong";
//        } else {
//            return "Weak";
//        }
//    }
//*********************************
    //Q8
    public static void generatesFibonacci (int numberOfFibonacciSe){
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci sequence with "+ 10 + " terms:");

        for (int i = 1; i <= numberOfFibonacciSe; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }


}