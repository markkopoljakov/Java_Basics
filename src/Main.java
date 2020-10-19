import java.util.*;

public class Main {

   public static void main(String[] args) {
//       Week 8 Yl15
//       Card first = new Card(2, Card.DIAMONDS);
//       Card second = new Card(14, Card.CLUBS);
//       Card third = new Card(12, Card.HEARTS);
//
//       System.out.println(first);
//       System.out.println(second);
//       System.out.println(third);
//Week 8 Yl 12
//       Storehouse store = new Storehouse();
//       store.addProduct("coffee", 5, 1);
//       store.addProduct("milk", 3, 20);
//       store.addProduct("milkbutter", 2, 55);
//       store.addProduct("bread", 7, 8);
//
//
//       System.out.println("prices:");
//       System.out.println("coffee:  " + store.taken("coffee"));
//       System.out.println("coffee:  " + store.taken("coffee"));
//       System.out.println("coffee:  " + store.taken("coffee"));
//       System.out.println("coffee: " + store.stock("coffee"));
//       System.out.println("Apple: " + store.price("Apple"));
//
//       System.out.println("Products");
//       for (String product : store.products()){
//           System.out.println(product);
//       }
//
//       Purchase buy = new Purchase("Milk", 2, 3);
//       System.out.println( "the total price of a purchase containing four milks is " + buy.price() );
//       System.out.println( buy );
//       buy.increaseAmount();
//       System.out.println( buy );

//       ShoppingBasket basket = new ShoppingBasket();
//       basket.add("milk", 3);
//       basket.print();
//       System.out.println("basket price: " + basket.price() +"\n");
//
//       basket.add("buttermilk", 2);
//       basket.print();
//       System.out.println("basket price: " + basket.price() +"\n");
//
//       basket.add("milk", 3);
//       basket.print();
//       System.out.println("basket price: " + basket.price() +"\n");
//
//       basket.add("milk", 3);
//       basket.print();
//       System.out.println("basket price: " + basket.price() +"\n");
//
//       Storehouse store = new Storehouse();
//       store.addProduct("coffee", 5, 10);
//       store.addProduct("milk", 3, 20);
//       store.addProduct("milkbutter", 2, 55);
//       store.addProduct("bread", 7, 8);
//
//       Shop shop = new Shop(store, new Scanner(System.in));
//       shop.manage("Pekka");

//       Week 8 Yl11
//       Box box = new Box(10);
//       box.add( new Books("Jaanus", "Jussike", 2) ) ;
//       box.add( new Books("Mart", "Kood", 1) );
//       box.add( new Books("Mark", "Punamütsike", 0.5) );
//       box.add( new CD("Terminaator", "Kuutõbine", 1973) );
//       box.add( new CD("Smilers", "Mojito", 1973) );
//       System.out.println( box );
//Week 8 Yl 10
//       MilitaryService civil = new MilitaryService(20);
//       System.out.println(civil.getDaysLeft());

//Week 8 Yl 9
//           RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
//           RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
//           RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");
//
//           List<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
//           finnish.add(reg1);
//           finnish.add(reg2);
//
//           RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
//
//           if (!finnish.contains(newPlate)) {
//               finnish.add(newPlate);
//           }
//
//           System.out.println("Finnish: " + finnish);
//
//           Map<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
//           owners.put(reg1, "Jaanus");
//           owners.put(reg3, "Mart");
//
//           System.out.println("owners:");
//           System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
//           System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
//

//       Yl Week 7
//       Scanner reader = new Scanner(System.in);
//       String input = reader.nextLine();
//
//       Dictionary dict = new Dictionary();
//
//       TextUserInterface ui = new TextUserInterface(reader, dict);
//       ui.start();

//       W7_Yl 5
//       HashMap<String, String> nicknames = new HashMap<String, String>();
//       nicknames.put("Markus", "Maku");
//       nicknames.put("Joosep", "Jossu");
//       nicknames.put("Martin", "Matu");
//
//       String setNick = nicknames.get("Markus");
//       System.out.println(setNick);

//Yl 105
//       GuessingGame game = new GuessingGame();
//       game.play(1,10);
//       Yl 101
//
//       Library Library = new Library();
//
//       Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
//       Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
//       Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
//       Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
//
//       for (Book book: Library.searchByTitle("STINKY")) {
//           System.out.println(book);
//       }
//
//       System.out.println("---");
//       for (Book book: Library.searchByPublisher("PENGUIN  ")) {
//           System.out.println(book);
//       }
//Yl 100
//
//        NightSky NightSky = new NightSky(8, 4);
//        NightSky.print();
//        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
//        System.out.println("");
//
//        NightSky.print();
//        System.out.println("Number of stars: " + NightSky.starsInLastPrint());

//        Yl 98
//        int[] original = {1, 2, 3, 4};
//        int[] copied = copy(original);
//
//        copied[0] = 99;
//
//        // printing both
//        System.out.println("original: " + Arrays.toString(original));
//        System.out.println("copied: " + Arrays.toString(copied));
//
//        System.out.println("");
//
//        int[] reversed = reverseCopy(original);
//
//        // printing both
//        System.out.println("original: " + Arrays.toString(original));
//        System.out.println("reversed: " + Arrays.toString(reversed));
//    }
//
//    public static int[] copy(int[] array) {
//        int[] copy = new int[array.length];
//
//        for (int i = 0; i < copy.length; i++) {
//            copy[i] = array[i];
//        }
//
//        return copy;
//    }
//
//    public static int[] reverseCopy(int[] array) {
//        int[] reversed = new int[array.length];
//
//        for (int i = 0; i < reversed.length; i++) {
//            reversed[i] = array[array.length - 1 - i];
//        }
//
//        return reversed;
//    }
//

//Yl 97
//        int[] array = {5, 1, 3, 4, 2};
//        printElegantly(array);
//    }
//
//    public static void printElegantly(int[] array) {
//        // Write code here
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//            if (i < (array.length - 1)) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println();
//Yl 93
//        Person jaanus = new Person("Jaanus", new MyDate( 14, 4, 1999));
//        Person marttin = new Person("Marttin");
//
//        System.out.println( jaanus );
//        System.out.println( marttin );
//
//        System.out.println(jaanus.getName() + " " + "age " + jaanus.age() + " years");
//
//Yl 89
//            Clock clock = new Clock(23, 59, 50);
//
//            int i = 0;
//            while (i < 20) {
//                System.out.println(clock);
//                clock.tick();
//                i++;
//            }
//   Yl 88
//        ArrayList<Student> list = new ArrayList<Student>();
//        Scanner reader = new Scanner(System.in);
//        while (true) {
//            System.out.println("Name: ");
//            String name = reader.nextLine();
//            if (name.isEmpty()) {
//                break;
//            }
//            System.out.println("Studentnumber: ");
//            String number = reader.nextLine();
//            list.add(new Student(name, number));
//        }
//        for (Student student : list) {
//            System.out.println(student);
//        }
//        System.out.println();
//
//        System.out.println("Give search term: ");
//        String searchTerm = reader.nextLine();
//        System.out.println("Result: ");
//
//        for (Student student : list ){
//            if (student.getName().contains(searchTerm)){
//                System.out.println(student);
//            }
//        }

//Yl 87
//        Apartment studioManhattan = new Apartment(1, 16, 5500);
//        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
//        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);
//
//        System.out.println(studioManhattan.larger(twoRoomsBrooklyn));

//Yl 86
//        CashRegister cashRegister = new CashRegister(1000);
//        System.out.println( cashRegister );
//
//        LyyraCard_1 cardOfJim = new LyyraCard_1(2);
//
//        System.out.println("the card balance " + cardOfJim.balance() + " euros");
//
//        boolean succeeded = cashRegister.payGurmet(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//
//        cashRegister.loadMoneyToCard(cardOfJim, 100);
//
//        succeeded = cashRegister.payGurmet(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//
//        System.out.println("the card balance " + cardOfJim.balance() + " euros");
//
//        System.out.println( cashRegister );
//
//        CashRegister cashRegister = new CashRegister(1000);
//        double theChange = cashRegister.payEconomically(20);
//        System.out.println("the change was " + theChange);
//        theChange = cashRegister.payEconomically(10);
//        System.out.println("the change was " + theChange);
//
//        theChange = cashRegister.payGurmet(4);
//        System.out.println("the change was "  + theChange );
//
//        System.out.println(cashRegister);
//        LyyraCard_1 cardOfKarl = new LyyraCard_1(20);
//
//        System.out.println("Money on the card " + cardOfKarl.balance());
//        boolean suceeded = cardOfKarl.pay(8);
//        System.out.println("Money taken:" + suceeded);
//        System.out.println("Money on the card " + cardOfKarl.balance());
//Yl 84
//        Counter counter = new Counter(2,1);
//        System.out.println("Count " + counter);

//Yl 80
//        Dice rollingDice = new Dice(6);
//        int i = 0;
//        while (i < 10) {
//            System.out.println(rollingDice.roll());
//            i++;
//        }
//Yl 81
//        PasswordRandomizer rand = new PasswordRandomizer(13);
//        System.out.println("Password: " + rand.createPassword());
//        System.out.println("Password: " + rand.createPassword());
// Yl 79
//        Scanner reader = new Scanner(System.in);
//
//        NumberStatistics sum = new NumberStatistics();
//        NumberStatistics even = new NumberStatistics();
//        NumberStatistics odd = new NumberStatistics();
//
//        System.out.println("Type numbers: ");
//
//        while (true){
//            int number = Integer.parseInt(reader.nextLine());
//            if (number == -1) {
//                break;
//            }
//            sum.addNumbers(number);
//
//            if (number % 2 == 0) {
//                even.addNumbers(number);
//            }else {
//                odd.addNumbers(number);
//            }
//        }
//        System.out.println("sum: " + sum.sum());
//        System.out.println("sum of even: " + even.sum());
//        System.out.println("sum of odd " + odd.sum());
// Yl 78
//        Scanner reader = new Scanner(System.in);
//
//        BoundedCounter seconds = new BoundedCounter(59);
//        BoundedCounter minutes = new BoundedCounter(59);
//        BoundedCounter hours = new BoundedCounter(23);
//
//        System.out.println("Seconds ");
//        int sec = Integer.parseInt(reader.nextLine());
//        System.out.println("Minutes ");
//        int min = Integer.parseInt(reader.nextLine());
//        System.out.println("Hours ");
//        int hr = Integer.parseInt(reader.nextLine());
//
//        seconds.setValue(sec);
//        minutes.setValue(min);
//        hours.setValue(hr);
//
//        int i = 0;
//        while (i < 121){
//            System.out.println(hours + ":" + minutes +":"+ seconds);
//            seconds.next();
//            if (seconds.getValue()==0) {
//                minutes.next();
//                if (minutes.getValue()==0){
//                    hours.next();
//                }
//            }
//            i++;
//        }


// Yl 77
//        LyyraCard cardOfMaris = new LyyraCard(20);
//        LyyraCard cardOfHelen = new LyyraCard(30);
//
//        cardOfMaris.payGourmet();
//        cardOfHelen.payEconomical();
//
//        System.out.println("Maris: " + cardOfMaris);
//        System.out.println("Helen: " + cardOfHelen);
//
//        cardOfMaris.loadMoney(20);
//        cardOfHelen.payGourmet();
//
//        System.out.println("Maris: " + cardOfMaris);
//        System.out.println("Maris: " + cardOfHelen);
//
//        cardOfMaris.payEconomical();
//        cardOfMaris.payEconomical();
//        cardOfHelen.loadMoney(50);
//
//        System.out.println("Maris: " + cardOfMaris);
//        System.out.println("Helen: " + cardOfHelen);

// Yl 76
//        Menu exactum = new Menu();
//
//        exactum.addMeals("Viineripraad");
//        exactum.addMeals("Ühekihiline");
//        exactum.addMeals("Kanawrap");
//
//        exactum.printMeals();
// Yl 75
//
//        DecreasingCounter counter = new DecreasingCounter(10);
//
//        counter.printValue();
//        counter.decrease();
//        counter.printValue();
//        counter.decrease();
// Yl 73
//        Product product = new Product("Banana", 1.1, 13);
//
//        product.printProduct();

// Yl 72.3
//        Account tiliA = new Account("tili A", 100.0);
//        Account tiliB = new Account("tili B", 0.0);
//        Account tiliC = new Account("tili C", 0.0);
//
//        transfer(tiliA, tiliB, 50);
//        transfer(tiliB, tiliC, 25);
//        System.out.println(tiliB);
//        System.out.println(tiliC);
//        System.out.println(tiliA);
//    }
//
//    public static void transfer(Account form, Account to, double amount) {
//        form.withdrawal(amount);
//        to.deposit(amount);
//    }
//


// Yl 72.2
//        Account myAccount = new Account("Markko's account",0);
//        myAccount.deposit(100);
//        Account accoutOfMatt = new Account("Matt's account", 1000.0);
//        accoutOfMatt.withdrawal(100);
//        System.out.println("Initial state");
//        System.out.println(myAccount);
//        System.out.println(accoutOfMatt);
//        System.out.println(myAccount);
//
//        System.out.println("Final state");
//        System.out.println(myAccount);
// Yl 72
//        Account bartosAccount = new Account("Barto's account",100.00);
//        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);
//
//        System.out.println("Initial state");
//        System.out.println(bartosAccount);
//        System.out.println(bartosSwissAccount);
//        bartosAccount.withdrawal(20);
//        System.out.println("Barto's account balance is now: "+bartosAccount.balance());
//        bartosSwissAccount.deposit(200);
//        System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());


// YL 56
//    Scanner reader = new Scanner(System.in);
//    System.out.print("Type in your text: ");
//    String text = reader.nextLine();
//    System.out.println("In reverse order: " + yl56(text));

   }
    public static void yl1() {
        String name = "Markko Poljakov";
        System.out.println(name);
    }

    public static void yl5() {
        int days = 365;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;
        System.out.println("There are " + +days * hours * minutes * seconds + " seconds in a year");
    }

    public static void yl9() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number:");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Type anothere number:");
        int aNumber = Integer.parseInt(reader.nextLine());
        double division = (double) number / aNumber;
        System.out.print("Divison:" + number + "/" + aNumber + "=" + division);
    }

    public static void yl10() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the radius:");
        int radius = Integer.parseInt(input.nextLine());
        double answer = radius * 2 * Math.PI;
        System.out.println("Circumference of the circle " + answer);
    }

    public static void yl14() {
        Scanner number1 = new Scanner(System.in);
        System.out.println("Type a number:");
        int pNumber = Integer.parseInt(number1.nextLine());
        if (pNumber > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }

    public static void yl16() {
        Scanner number2 = new Scanner(System.in);
        System.out.println("Type a number:");
        int eNumber = Integer.parseInt(number2.nextLine());
        if (eNumber % 2 == 0) {
            System.out.println("Number " + eNumber + " is even");
        } else {
            System.out.println("Number " + eNumber + " is odd");
        }
    }

    public static void yl18() {
        Scanner grades = new Scanner(System.in);
        System.out.println("Type the points [0-60]:");
        int points = Integer.parseInt(grades.nextLine());
        if (points < 29) {
            System.out.println("Failed");
        } else if (points > 30 & points < 35) {
            System.out.println("Grade: 1");
        } else if (points > 36 & points < 40) {
            System.out.println("Grade: 2");
        } else if (points > 41 & points < 45) {
            System.out.println("Grade: 3");
        } else if (points > 46 & points < 50) {
            System.out.println("Grade: 4");
        } else if (points > 51 & points < 61) {
            System.out.println("Grade: 5");
        }
    }

    public static void yl19() {
        Scanner age = new Scanner(System.in);
        System.out.println("How old are you?");
        int years = Integer.parseInt(age.nextLine());
        if (years > 0 & years < 120) {
            System.out.println("Ok");
        } else {
            System.out.println("Impossible");
        }
    }

    public static void yl21() {
        Scanner leapYear = new Scanner(System.in);
        System.out.println("Type a year:");
        int year = Integer.parseInt(leapYear.nextLine());
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // year is divisible by 400, hence the year is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }

    public static void yl22() {
        Scanner psw = new Scanner(System.in);
        System.out.println("type the password:");
        String password = String.format(psw.nextLine());
        String psw2 = "Jaanus";
        while (!password.equals("Jaanus")) {
            System.out.println("Wrong");
            password = psw.nextLine();
        }
        System.out.println("Right");
        System.out.println("The Secret is: Tammesoo");
    }

    public static void yl26() {
        Scanner summary = new Scanner(System.in);
        System.out.println("Type a number:");
        int sum = 0;
        while (true) {
            int read = Integer.parseInt(summary.nextLine());
            if (read == 0) {
                break;
            }
            sum = sum + read;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }

    public static void yl29() {
        Scanner evenOdd = new Scanner(System.in);
        System.out.println("Press enter!");
        int limit = 100;
        System.out.println("Print numbers between 1 and" + limit);

        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void yl30() {
        Scanner certainNumbers = new Scanner(System.in);
        System.out.println("Up to what number?");
        int numbers = Integer.parseInt(certainNumbers.nextLine());
        int count = 0;

        while (count < numbers) {
            count++;
            System.out.println(count);
        }
    }

    public static void yl32() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Until what?");
        int n = scanner.nextInt();

        int count1 = 0;
        int sum1 = 0;
        while (count1 <= n) {
            sum1 += count1;
            count1++;
        }
        System.out.println("Sum is " + sum1);
    }

    public static void yl36() {

        // Exercise 36: Loops, ending and remembering

        Scanner reader = new Scanner(System.in);
        System.out.println("Type a numbers:");
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number < 0) {
                System.out.println("Thank you and see you later!");
                break;
            } else {
                System.out.println("Type a numbers:");
            }
        }
    }

    public static void yl36_2() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a numbers:");
        int sum = 0;
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("Sum:" + sum);
                break;
            } else {
                sum += number;

            }
        }
    }

    public static void yl36_3() {
        // Exercise 36.3: Summing and counting the numbers
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a numbers:");
        int i = 0;
        int sum = 0;
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("Sum:" + sum);
                System.out.println("How many numbers:" + i);
                break;
            } else {
                sum += number;
                i++;

            }
        }
    }

    public static void yl36_4() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a numbers:");
        int i = 0;
        int sum = 0;
        int even = 0;
        int odds = 0;

        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("Sum:" + sum);
                System.out.println("How many numbers:" + i);
                double average = sum / i;
                System.out.println("Average: " + average);
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odds);
                break;
            } else {
                sum += number;
                i++;
                if (number % 2 == 0) {
                    even++;
                } else {
                    odds++;
                }

            }
        }
    }

    public static void yl39(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void yl41() {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int i = 0;

        while (true) {
            System.out.print("Guess a number: ");
            int rand = Integer.parseInt(reader.nextLine());
            i++;
            if (rand == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (rand > numberDrawn) {
                System.out.println("The number is lesser, guesses made " + i);
            } else if (rand < numberDrawn) {
                System.out.println("The number is greater, guesses made " + i);
            }
        }

    }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }


    public static int yl44(int number1, int number2) {
        if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static double yl46(int number1, int number2, int number3, int number4) {

        int sum = sum(number1, number2, number3, number4);
        System.out.println();
        double res = sum / 4;
        System.out.println(res);
        return (double) sum / 4;

    }

    public static void yl50() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        if (name.length() < 3) {
            return;
        }

        int i = 0;
        while (i < 3) {
            System.out.println((i + 1) + ". character: " + name.charAt(i));
            i++;

        }
    }

    public static void yl53() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a name:");
        String name = reader.nextLine();
        System.out.println("Length of the name:");

        int length = Integer.parseInt(reader.nextLine());

        System.out.println("Length: " + name.substring(0, length));
    }

    public static String yl56(String text) {
        String result = "";

        int i = text.length() - 1;
        while (i >= 0) {
            result += text.charAt(i);
            i--;
        }

        return result;
    }

    public static void yl57() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word:");
            String word = reader.nextLine();
            if (word.equals("")) {
                break;
            }
            words.add(word);

        }
        System.out.println("You typed following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void yl58() {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word:");
            String word = reader.nextLine();
            if (words.contains(word)) {
                System.out.println("You gave twice the word " + word);
                break;
            }
            words.add(word);

        }


    }
    public static void yl60() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.equals("")) {
                break;
            }
            words.add(word);
        }
        Collections.sort(words);
        System.out.println("You typed the following words:");

        for (String word : words) {
            System.out.println(word);
        }
    }
    public static int sum(ArrayList<Integer> list) {
        // Write your code here
        int sum = 0;
        for (int number : list) {
            sum = sum + number;
        }
        return sum;
    }

    public static void yl61() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items on the list:");
        // You can remove the comment from below when the method is done
        System.out.println(countItems(list));
    }
    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    public static void removeLast(ArrayList<String> list) {
        int indexOfLast = list.size()-1;
        list.remove(indexOfLast);
    }

    public static void yl62() {
        ArrayList<String> persons = new ArrayList<String>();
        persons.add("Pekka");
        persons.add("James");
        persons.add("Liz");
        persons.add("Brian");

        System.out.println("Persons:");
        System.out.println(persons);

        Collections.sort(persons);

        removeLast(persons);

        System.out.println(persons);
    }

    public static void yl64(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));

    }

    public static double average(ArrayList<Integer> list) {
        double sum = (double) sum(list);
        return sum / list.size();
    }
    public static int greatest(ArrayList<Integer> list) {
        int greatestSoFar = list.get(0);

        for (int luku : list) {
            if (luku > greatestSoFar) {
                greatestSoFar = luku;
            }
        }
        return greatestSoFar;
    }

    public static void yl66(){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("The greatest number is: " + greatest(lista));


    }
    public static String reverse(String text) {
        String reversed = "";
        int i = 0;
        while (i < text.length()) {
            char c = text.charAt(i);
            reversed = c + reversed;
            i++;
        }
        return reversed;
    }

    public static boolean palindrome(String text) {
        boolean isPalindrome = text.equals(reverse(text));
        return isPalindrome;
    }

    public static void yl69() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
    public static void yl70() {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4,3);
        Collections.addAll(list2, 5, 10, 7);

        combine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
    public static void combine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
    }




}
