package easyFunctions;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.lang.Math;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * easyFunctions Library By thatcooldev(Johan SK)
 * 
 * This library provides various utility functions for printing, input handling,
 * mathematical operations, and animations to make life a little more easier for developers.
 *
 *Commands:
 * - print(String text, boolean newLine): Prints text with or without a new line.
 * - getInfo(String infoNeeded): Prompts the user for input and returns it as a String.
 * - delay(int ms): Pauses execution for a specified number of milliseconds.
 * - printWithAnimation(String text, int animationGap): Prints text character by character with a delay.
 * - exit(): Exits the program.
 * - sqrt(int number): Returns the square root of a number.
 * - power(int base, int power): Returns the result of raising a base to a power.
 * - square(int number): Returns the square of a number.
 * - cube(double number): Returns the cube of a number.
 * - add(double a, double b): Returns the sum of two numbers.
 * - subtract(double a, double b): Returns the difference between two numbers.
 * - multiply(double a, double b): Returns the product of two numbers.
 * - divide(double a, double b): Returns the quotient of two numbers.
 * - greet(String user): Prints a greeting message to the user.
 * - leaveLine(int num): Prints a specified number of blank lines.
 * - format(String text, String color, String backColor, boolean bright, String format): Formats text with specified color, background color, brightness, and style.
 * - join(String text1, String text2): Joins two strings together.
 * - join3(String text1, String text2, String text3): Joins three strings together.
 * - timestamp(String message): Appends the current date and time to a message.
 * - date(): Returns the current date in "dd-MM-yyyy" format.
 * - time(): Returns the current time in "HH:mm:ss" format.
 * - java(): Displays Java runtime information and checks if the OpenJDK is being used.
 * - displaySystemProperties(): Displays various system properties related to Java.
 * - checkOpenJDK(): Checks if the current Java runtime is OpenJDK and prints relevant information.
 * - clear(): Clears the console screen.
 * - info(): Displays information about the easyFunctions library, including its version and author.
 * - getYesNo(String action): Prompts the user for a yes/no response to an action.
 * - progressBar(int progress, int total, int barLength): Displays a progress bar in the console.
 * - repeat(String str, int times): Repeats a string a specified number of times.
 * - reverse(String str): Reverses a string.
 * - capitalize(String str): Capitalizes the first letter of a string.
 * - split(String str, String delimiter): Splits a string into an array based on a delimiter.
 * - replace(String str, String oldStr, String newStr): Replaces occurrences of a substring in a string.
 * - printArray(int[] arr): Prints an array of integers.
 * - printArray(String[] arr): Prints an array of strings.
 * - range(int start, int end): Generates an array of integers from start to end.
 * - random(int min, int max): Returns a random integer between min and max.
 * - random(double min, double max): Returns a random double between min and max.
 * - isEven(int number): Checks if a number is even.
 * - isOdd(int number): Checks if a number is odd.
 * - abs(int number): Returns the absolute value of an integer.
 * - abs(double number): Returns the absolute value of a double.
 * - max(int a, int b): Returns the maximum of two integers.
 * - min(int a, int b): Returns the minimum of two integers.
 * - round(double number, int decimals): Rounds a double to a specified number of decimal places.
 * - isNumeric(String str): Checks if a string is numeric.
 * - isValidEmail(String email): Validates an email address format.
 * - isAlphabetic(String str): Checks if a string contains only alphabetic characters.
 * - isAlphanumeric(String str): Checks if a string contains only alphanumeric characters.
 * - getInt(String prompt): Prompts the user for an integer input with validation.
 * - getDouble(String prompt): Prompts the user for a double input with validation.
 * - isEmpty(String str): Checks if a string is empty or null.
 * - fileExists(String filePath): Checks if a file exists at the specified path.
 * - readFile(String filePath): Reads the content of a file and returns it as a String.
 * - writeFile(String filePath, String content): Writes content to a file at the specified path.
 * - appendToFile(String filePath, String content): Appends content to a file at the specified path.
 * - menu(String title, String... options): Displays a menu with options and returns the user's choice.
 * - loadingAnimation(String message, int duration): Displays a loading animation with a message for a specified duration.
 * - typewriterEffect(String text, int speed, boolean sound): Displays a typewriter effect for the given text with a specified delay between characters.
 * - printTable(String[] headers, String[][] data): Prints a formatted table with headers and data.
 * - printTableBorder(int width): Prints a border for a table with the specified width.
 * - printTableRow(String[] row, int width): Prints a row of a table with the specified width.
 * - beep(): Plays a beep sound.
 * - beep(int times): Plays a beep sound a specified number of times.
 * - getMemoryUsage(): Returns the current memory usage of the Java application in bytes.
 * - printMemoryInfo(): Prints the current memory usage of the Java application.
 * - formatBytes(long bytes): Formats bytes into a human-readable string (e.g., KB, MB, GB).
 * - log(String level, String message): Logs a message with a specified log level (INFO, WARNING, ERROR).
 * - info(String message): Logs an informational message.
 * - warning(String message): Logs a warning message.
 * - error(String message): Logs an error message.
 * - success(String message): Logs a success message.
 * - getPassword(String prompt): Prompts the user for a password input without echoing the characters.
 * - generatePassword(int length): Generates a random password of the specified length.
 * - countdown(int seconds): Displays a countdown timer for the specified number of seconds.
 * - calculate(String expression): Evaluates a mathematical expression and returns the result as a double.
 * - Quiz(String question, String[] options, int correctAnswer): Displays a quiz question with options and checks the user's answer.
 * - ask(): Prompts the user for a question and returns the answer.
 * - start(): Starts the stopwatch.
 * - stop(): Stops the stopwatch and returns the elapsed time in milliseconds.
 * - lap(): Records a lap time and returns the elapsed time since the last lap.
 * - formatTime(long milliseconds): Formats the elapsed time in a human-readable format (HH:mm:ss.SSS).
 * 
 * This library is designed to be easy to use and integrate into any Java project.
 * 
 * Please note that some functions are experimental as they are created by Claude AI and may not be fully tested.
 * 
 * @version prototype1.0
 * @since 2025-08-14
 */

@SuppressWarnings("unused")
public class ecfx{
	public static void print(String text, boolean newLine) {
		if(newLine) {
			System.out.println(text);
		} else {
			System.out.print(text);
		}
	}
	public static String getInfo(String infoNeeded) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + infoNeeded + ": ");
	    return sc.nextLine();
	}
	public static void delay(int ms) {
		try {
			TimeUnit.MILLISECONDS.sleep(ms);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	public static void printWithAnimation(String text, int animationGap) {
		int length = text.length();
		for (int i = 0; i < length; i++) {
			System.out.print(text.charAt(i));
			delay(animationGap);
		}
	}
	public static void exit() {
		System.exit(0);
	}
    public static double sqrt(int number) {
    	return Math.sqrt(number);
    }
    public static double power(int base, int power) {
    	return Math.pow(base, power);
    }
    public static double square(int number) {
    	return number * number;
    }
    public static double cube(double number) {
    	return number * number * number;
    }
    public static double add(double a, double b) {
    	return a + b;
    }
    public static double subtract(double a, double b) {
    	return a - b;
    }
    public static double multiply(double a, double b) {
    	return a * b;
    }
    public static double divide(double a, double b) {
    	return a / b;
    }
    public static void greet(String user) {
    	System.out.println("Hello " + user + "!");
    }
    public static void leaveLine(int num) {
    	for (int i = 0; i < num; i++) {
    		System.out.println();
    	}
    }
    public static String format(String text, String color, String backColor, boolean bright, String format) {
    	String chosenColor = "\u001B[0m"; // Default color
    	String chosenBackColor = "\u001B[0m"; // Default background color
    	String chosenFormat = "\u001B[0m"; // Default format
    	if (bright) {
             	switch (color.toLowerCase()) {
             	case "Black":
             		chosenColor = "\u001B[1;90m";
             		break;
             	case "red":
					chosenColor = "\u001B[1;91m";
					break;
				case "green":
					chosenColor = "\u001B[1;92m";
					break;
				case "yellow":
					chosenColor = "\u001B[1;93m";
					break;
				case "blue":
					chosenColor = "\u001B[1;94m";
					break;
				case "purple":
					chosenColor = "\u001B[1;95m";
					break;
				case "cyan":
					chosenColor = "\u001B[1;96m";
					break;
				case "white":
					chosenColor = "\u001B[1;97m";
					break;
				case "default":
					break;
				default:
					chosenColor = "\u001B[0m"; // Default color
					break;
             	}
				switch (backColor.toLowerCase()) {
					case "black":
					    chosenBackColor = "\u001B[100m";
					    break;
					case "red":
						chosenBackColor = "\u001B[101m";
						break;
					case "green":
						chosenBackColor = "\u001B[102m";
						break;
					case "yellow":
						chosenBackColor = "\u001B[103m";
						break;
					case "blue":
						chosenBackColor = "\u001B[104m";
						break;
					case "purple":
						chosenBackColor = "\u001B[105m";
						break;
					case "cyan":
						chosenBackColor = "\u001B[106m";
						break;
					case "white":
						chosenBackColor = "\u001B[107m";
						break;
					case "default":
						break;
					default:
						chosenBackColor = "\u001B[0m"; // Default background color
						break;
			}
		} else {
			switch (color.toLowerCase()) {
			    case "black":
			    	chosenColor = "\u001B[30m";
			    	break;
			    case "red":
					chosenColor = "\u001B[31m";
					break;
				case "green":
					chosenColor = "\u001B[32m";
					break;
				case "yellow":
					chosenColor = "\u001B[33m";
					break;
				case "blue":
					chosenColor = "\u001B[34m";
					break;
				case "purple":
					chosenColor = "\u001B[35m";
					break;
				case "cyan":
					chosenColor = "\u001B[36m";
					break;
				case "white":
					chosenColor = "\u001B[37m";
					break;
				case "default":
					break;
				default:
					chosenColor = "\u001B[0m"; // Default color
			}
			switch (backColor.toLowerCase()) {
				case "black":
					chosenBackColor = "\u001B[40m";
					break;
				case "red":
					chosenBackColor = "\u001B[41m";
					break;
				case "green":
					chosenBackColor = "\u001B[42m";
					break;
				case "yellow":
					chosenBackColor = "\u001B[43m";
					break;
				case "blue":
					chosenBackColor = "\u001B[44m";
					break;
				case "purple":
					chosenBackColor = "\u001B[45m";
					break;
				case "cyan":
					chosenBackColor = "\u001B[46m";
					break;
				case "white":
					chosenBackColor = "\u001B[47m";
					break;
				case "default":
					break;
				default:
					chosenBackColor = "\u001B[0m"; // Default background color
			}
		}
    	switch (format.toLowerCase()) {
    	case "bold":
			chosenFormat = "\u001B[1m";
			break;
    	case "dim":
    		chosenFormat = "\u001B[2m";
    		break;
    	case "italic":
			chosenFormat = "\u001B[3m";
			break;
		case "underline":
			chosenFormat = "\u001B[4m";
			break;
		case "blink":
			chosenFormat = "\u001B[5m";
			break;
		case "inverted":
			chosenFormat = "\u001B[7m";
			break;
		case "hidden":
			chosenFormat = "\u001B[8m";
			break;
		case "strikethrough":
			chosenFormat = "\u001B[9m";
			break;
		case "reset":
			chosenFormat = "\u001B[0m";
			break;
		case "default":
			break;
		default:
			chosenFormat = "\u001B[0m"; // Default format
			break;
			
        }
        return chosenBackColor + chosenFormat + chosenColor + text + "\u001B[0m"; // Reset color	
    }
    public static String join(String text1, String text2) {
    	return text1 + text2;
    }
    public static String join3(String text1, String text2, String text3) {
		return text1 + text2 + text3;
	}
    public static String timestamp(String message) {
    	return message + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }
    public static String date() {
    	return LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    public static String time() {
		return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	}
    public static void java() {
            ecfx retriever = new ecfx();
            leaveLine(1);
            printWithAnimation("=== JAVA RUNTIME INFORMATION ===\n\n      ██╗ █████╗ ██╗   ██╗ █████╗ \n      ██║██╔══██╗██║   ██║██╔══██╗\n      ██║███████║██║   ██║███████║\n ██   ██║██╔══██║╚██╗ ██╔╝██╔══██║\n ╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║\n  ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝\n\n", 5);
            retriever.displaySystemProperties();
            
            printWithAnimation("\n=== OPENJDK ===\n\n   ██████╗ ██████╗ ███████╗███╗   ██╗     ██╗██████╗ ██╗  ██╗\n  ██╔═══██╗██╔══██╗██╔════╝████╗  ██║     ██║██╔══██╗██║ ██╔╝\n  ██║   ██║██████╔╝█████╗  ██╔██╗ ██║     ██║██║  ██║█████╔╝ \n  ██║   ██║██╔═══╝ ██╔══╝  ██║╚██╗██║██   ██║██║  ██║██╔═██╗ \n  ╚██████╔╝██║     ███████╗██║ ╚████║╚█████╔╝██████╔╝██║  ██╗\n   ╚═════╝ ╚═╝     ╚══════╝╚═╝  ╚═══╝ ╚════╝ ╚═════╝ ╚═╝  ╚═╝\n                         \n               \"The open-source Java platform\"\n\n", 5);
            retriever.checkOpenJDK();
        }
        public void displaySystemProperties() {
            Properties props = System.getProperties();
            
            printWithAnimation("Java Version: " + props.getProperty("java.version"), 5);
            leaveLine(1);
            printWithAnimation("Java Runtime Version: " + props.getProperty("java.runtime.version"), 5);
            leaveLine(1);
            printWithAnimation("Java VM Name: " + props.getProperty("java.vm.name"), 5);
            leaveLine(1);
            printWithAnimation("Java VM Version: " + props.getProperty("java.vm.version"), 5);
            leaveLine(1);
            printWithAnimation("Java VM Vendor: " + props.getProperty("java.vm.vendor"), 5);
            leaveLine(1);
            printWithAnimation("Java Vendor: " + props.getProperty("java.vendor"), 5);
            leaveLine(1);
            printWithAnimation("Java Vendor URL: " + props.getProperty("java.vendor.url"), 5);
            leaveLine(1);
            printWithAnimation("Java Home: " + props.getProperty("java.home"), 5);
            leaveLine(1);
            printWithAnimation("Java Specification Version: " + props.getProperty("java.specification.version"), 5);
            leaveLine(1);
            printWithAnimation("Java Specification Vendor: " + props.getProperty("java.specification.vendor"), 5);
            leaveLine(1);
            printWithAnimation("Java Class Version: " + props.getProperty("java.class.version"), 5);
            leaveLine(1);
            printWithAnimation("OS Name: " + props.getProperty("os.name"), 5);
            leaveLine(1);
            printWithAnimation("OS Version: " + props.getProperty("os.version"), 5);
            leaveLine(1);
            printWithAnimation("OS Architecture: " + props.getProperty("os.arch"), 5);
            leaveLine(1);
        }
        public void checkOpenJDK() {
        	String vmName = System.getProperty("java.vm.name");
            String vendor = System.getProperty("java.vendor");
            String vendorUrl = System.getProperty("java.vendor.url");
        	boolean isOpenJDK = vmName.contains("OpenJDK") || 
                               vendor.contains("OpenJDK") ||
                               (vendorUrl != null && vendorUrl.contains("openjdk"));
        	if (isOpenJDK) {
                print(format("✓ Running on OpenJDK", "green", "default", false, "bold"), true);
                printWithAnimation("Is OpenJDK: " + isOpenJDK, 5);
                leaveLine(1);
                printWithAnimation("VM Name: " + vmName, 5);
                leaveLine(1);
                printWithAnimation("Vendor: " + vendor, 5);
                leaveLine(1);
            } else {
                print(format("✗ Not running on OpenJDK (possibly Oracle JDK or other vendor)", "red", "default", false, "bold"), true);
            }
        	
        }
        @SuppressWarnings("deprecation")
		public static void clear() {
            try {
                if (System.getProperty("os.name").contains("Windows")) {
                    Runtime.getRuntime().exec("cls");
                } else {
                    Runtime.getRuntime().exec("clear");
                }
            } catch (Exception e) {
                System.out.println("Screen clearing not supported");
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }
            }
        }
        public static void info() {
        	print("\033[94m", false);
        	printWithAnimation("\n███████╗ ██████╗███████╗██╗  ██╗\n██╔════╝██╔════╝██╔════╝╚██╗██╔╝\n█████╗  ██║     █████╗   ╚███╔╝ \n██╔══╝  ██║     ██╔══╝   ██╔██╗ \n███████╗╚██████╗██║     ██╔╝ ██╗\n╚══════╝ ╚═════╝╚═╝     ╚═╝  ╚═╝\n\n", 5);
            print("\033[0m", false);			
        	printWithAnimation("easyFunctions Library By ", 5);
        	print("\u001B[1;93mthatcooldev(Johan SK)\u001B[0m\n", false);
            			printWithAnimation("This library provides various utility functions for printing, input handling,\n" +
            			"mathematical operations, and animations to make life a little more easier for developers.\n", 5);	
            			printWithAnimation("Commands:\n", 5);
            			printWithAnimation(" - print(String text, boolean newLine): Prints text with or without a new line.\n", 5);
            			printWithAnimation(" - getInfo(String infoNeeded): Prompts the user for input and returns it as a String.\n", 5);
            			printWithAnimation(" - delay(int ms): Pauses execution for a specified number of milliseconds.\n", 5);
            			printWithAnimation(" - printWithAnimation(String text, int animationGap): Prints text character by character with a delay.\n", 5);
            			printWithAnimation(" - exit(): Exits the program.\n", 5);
            			printWithAnimation(" - sqrt(int number): Returns the square root of a number.\n", 5);
            			printWithAnimation(" - power(int base, int power): Returns the result of raising a base to a power.\n", 5);
            			printWithAnimation(" - square(int number): Returns the square of a number.\n", 5);
            			printWithAnimation(" - cube(double number): Returns the cube of a number.\n", 5);
            			printWithAnimation(" - add(double a, double b): Returns the sum of two numbers.\n", 5);
            			printWithAnimation(" - subtract(double a, double b): Returns the difference between two numbers.\n", 5);
            			printWithAnimation(" - multiply(double a, double b): Returns the product of two numbers.\n", 5);
            			printWithAnimation(" - divide(double a, double b): Returns the quotient of two numbers.\n", 5);
            			printWithAnimation(" - greet(String user): Prints a greeting message to the user.\n", 5);
            			printWithAnimation(" - leaveLine(int num): Prints a specified number of blank lines.\n", 5);
            			printWithAnimation(" - format(String text, String color, String backColor, boolean bright, String format): Formats text with specified color, background color, brightness, and style.\n", 5);
            			printWithAnimation(" - join(String text1, String text2): Joins two strings together.\n", 5);
            			printWithAnimation(" - join3(String text1, String text2, String text3): Joins three strings together.\n", 5);
            			printWithAnimation(" - timestamp(String message): Appends the current date and time to a message.\n", 5);
            			printWithAnimation(" - date(): Returns the current date in \"dd-MM-yyyy\" format.\n", 5);
            			printWithAnimation(" - time(): Returns the current time in \"HH:mm:ss\" format.\n", 5);
            			printWithAnimation(" - java(): Displays Java runtime information and checks if the OpenJDK is being used.\n", 5);
            			printWithAnimation(" - displaySystemProperties(): Displays various system properties related to Java.\n", 5);
            			printWithAnimation(" - checkOpenJDK(): Checks if the current Java runtime is OpenJDK and prints relevant information.\n", 5);
            			printWithAnimation(" - clear(): Clears the console screen.\n", 5);
            			printWithAnimation(" - info(): Displays information about the easyFunctions library, including its version and author.\n", 5);
            			printWithAnimation(" - getYesNo(String action): Prompts the user for a yes/no response to an action.\n", 5);
            			printWithAnimation(" - progressBar(int progress, int total, int barLength): Displays a progress bar in the console.\n", 5);
            			printWithAnimation(" - repeat(String str, int times): Repeats a string a specified number of times.\n", 5);
            			printWithAnimation(" - reverse(String str): Reverses a string.\n", 5);
            			printWithAnimation(" - capitalize(String str): Capitalizes the first letter of a string.\n", 5);
            			printWithAnimation(" - split(String str, String delimiter): Splits a string into an array based on a delimiter.\n", 5);
            			printWithAnimation(" - replace(String str, String oldStr, String newStr): Replaces occurrences of a substring in a string.\n", 5);
            			printWithAnimation(" - printArray(int[] arr): Prints an array of integers.\n", 5);
            			printWithAnimation(" - printArray(String[] arr): Prints an array of strings.\n", 5);
            			printWithAnimation(" - range(int start, int end): Generates an array of integers from start to end.\n", 5);
            			printWithAnimation(" - random(int min, int max): Returns a random integer between min and max.\n", 5);
            			printWithAnimation(" - random(double min, double max): Returns a random double between min and max.\n", 5);
            			printWithAnimation(" - isEven(int number): Checks if a number is even.\n", 5);
            			printWithAnimation(" - isOdd(int number): Checks if a number is odd.\n", 5);
            			printWithAnimation(" - abs(int number): Returns the absolute value of an integer.\n", 5);
            			printWithAnimation(" - abs(double number): Returns the absolute value of a double.\n", 5);
            			printWithAnimation(" - max(int a, int b): Returns the maximum of two integers.\n", 5);
            			printWithAnimation(" - min(int a, int b): Returns the minimum of two integers.\n", 5);
            			printWithAnimation(" - round(double number, int decimals): Rounds a double to a specified number of decimal places.\n", 5);
            			printWithAnimation(" - isNumeric(String str): Checks if a string is numeric.\n", 5);
            			printWithAnimation(" - isValidEmail(String email): Validates an email address format.\n", 5);
            			printWithAnimation(" - isAlphabetic(String str): Checks if a string contains only alphabetic characters.\n", 5);
            			printWithAnimation(" - isAlphanumeric(String str): Checks if a string contains only alphanumeric characters.\n", 5);
            			printWithAnimation(" - getInt(String prompt): Prompts the user for an integer input with validation.\n", 5);
            			printWithAnimation(" - getDouble(String prompt): Prompts the user for a double input with validation.\n", 5);
            			printWithAnimation(" - isEmpty(String str): Checks if a string is empty or null.\n", 5);
            			printWithAnimation(" - fileExists(String filePath): Checks if a file exists at the specified path.\n", 5);
            			printWithAnimation(" - readFile(String filePath): Reads the content of a file and returns it as a String.\n", 5);
            			printWithAnimation(" - writeFile(String filePath, String content): Writes content to a file at the specified path.\n", 5);
            			printWithAnimation(" - appendToFile(String filePath, String content): Appends content to a file at the specified path.\n", 5);
            			printWithAnimation(" - menu(String title, String... options): Displays a menu with options and returns the user's choice.\n", 5);
            			printWithAnimation(" - loadingAnimation(String message, int duration): Displays a loading animation with a message for a specified duration.\n", 5);
            			printWithAnimation(" - typewriterEffect(String text, int speed, boolean sound): Displays a typewriter effect for the given text with a specified delay between characters.\n", 5);
            			printWithAnimation(" - printTable(String[] headers, String[][] data): Prints a formatted table with headers and data.\n", 5);
            			printWithAnimation(" - printTableBorder(int width): Prints a border for a table with the specified width.\n", 5);
            			printWithAnimation(" - printTableRow(String[] row, int width): Prints a row of a table with the specified width.\n", 5);
            			printWithAnimation(" - beep(): Plays a beep sound.\n", 5);
            			printWithAnimation(" - beep(int times): Plays a beep sound a specified number of times.\n", 5);
            			printWithAnimation(" - getMemoryUsage(): Returns the current memory usage of the Java application in bytes.\n", 5);
            			printWithAnimation(" - printMemoryInfo(): Prints the current memory usage of the Java application.\n", 5);
            			printWithAnimation(" - formatBytes(long bytes): Formats bytes into a human-readable string (e.g., KB, MB, GB).\n", 5);
            			printWithAnimation(" - log(String level, String message): Logs a message with a specified log level (INFO, WARNING, ERROR).\n", 5);
            			printWithAnimation(" - info(String message): Logs an informational message.\n", 5);
            			printWithAnimation(" - warning(String message): Logs a warning message.\n", 5);
            			printWithAnimation(" - error(String message): Logs an error message.\n", 5);
            			printWithAnimation(" - success(String message): Logs a success message.\n", 5);
            			printWithAnimation(" - getPassword(String prompt): Prompts the user for a password input without echoing the characters.\n", 5);
            			printWithAnimation(" - generatePassword(int length): Generates a random password of the specified length.\n", 5);
            			printWithAnimation(" - countdown(int seconds): Displays a countdown timer for the specified number of seconds.\n", 5);
            			printWithAnimation(" - calculate(String expression): Evaluates a mathematical expression and returns the result as a double.\n", 5);
            			printWithAnimation(" - Quiz(String question, String[] options, int correctAnswer): Displays a quiz question with options and checks the user's answer.\n", 5);
            			printWithAnimation(" - ask(): Prompts the user for a question and returns the answer.\n", 5);
            			printWithAnimation(" - start(): Starts the stopwatch.\n", 5);
            			printWithAnimation(" - stop(): Stops the stopwatch and returns the elapsed time in milliseconds.\n", 5);
            			printWithAnimation(" - lap(): Records a lap time and returns the elapsed time since the last lap.\n", 5);
            			printWithAnimation(" - formatTime(long milliseconds): Formats the elapsed time in a human-readable format (HH:mm:ss.SSS).\n", 5);
            			leaveLine(1);
            			printWithAnimation("This library is designed to be easy to use and integrate into any Java project.\n\n", 5);
            			print("\u001B[3;97mPlease note that some functions are experimental as they are created by \u001B[3;38;2;255;120;50mClaude AI \u001B[3;97mand may not be fully tested.\u001B[0m", true);
            			printWithAnimation("\nVersion: prototype1.0\n", 5);
            			printWithAnimation("Since: 2025/8/14\n", 5);
            			
        }
        public static boolean getYesNo(String action) {
        	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String response;
			while (true) {
				System.out.print("Do you want to " + action + "? (yes/no): ");
				response = sc.nextLine().trim().toLowerCase();
				if (response.equals("yes") || response.equals("no")) {
					break;
				} else {
					System.out.println("Invalid input. Please enter 'yes' or 'no'.");
				}
			}
			return response.equals("yes");
        }
        public static void progressBar(int progress, int total, int barLength) {
            double percentage = (double) progress / total;
            int filled = (int) (percentage * barLength);
            
            StringBuilder bar = new StringBuilder();
            bar.append("[");
            for (int i = 0; i < barLength; i++) {
                if (i < filled) {
                    bar.append("█");
                } else {
                    bar.append("░");
                }
            }
            bar.append("] ");
            bar.append(String.format("%.2f%%", percentage * 100));
            System.out.print("\r" + bar.toString());
            if (progress == total) {
				System.out.println(); // Move to the next line when complete
			}
        }
        public static String repeat(String str, int times) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < times; i++) {
                sb.append(str);
            }
            return sb.toString();
        }

        public static String reverse(String str) {
            return new StringBuilder(str).reverse().toString();
        }

        public static String capitalize(String str) {
            if (isEmpty(str)) return str;
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }

        public static String[] split(String str, String delimiter) {
            return str.split(Pattern.quote(delimiter));
        }

        public static String replace(String str, String oldStr, String newStr) {
            return str.replace(oldStr, newStr);
        }

        // ==== ARRAY UTILITIES ====
        public static void printArray(int[] arr) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }

        public static void printArray(String[] arr) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print("\"" + arr[i] + "\"");
                if (i < arr.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }

        public static int[] range(int start, int end) {
            int[] result = new int[end - start];
            for (int i = 0; i < result.length; i++) {
                result[i] = start + i;
            }
            return result;
        }

        // ==== MATH UTILITIES ====
        public static int random(int min, int max) {
            return (int) (Math.random() * (max - min + 1)) + min;
        }

        public static double random(double min, double max) {
            return Math.random() * (max - min) + min;
        }

        public static boolean isEven(int number) {
            return number % 2 == 0;
        }

        public static boolean isOdd(int number) {
            return number % 2 != 0;
        }

        public static int abs(int number) {
            return Math.abs(number);
        }

        public static double abs(double number) {
            return Math.abs(number);
        }

        public static int max(int a, int b) {
            return Math.max(a, b);
        }

        public static int min(int a, int b) {
            return Math.min(a, b);
        }

        public static double round(double number, int decimals) {
            double scale = Math.pow(10, decimals);
            return Math.round(number * scale) / scale;
        }

        // ==== VALIDATION UTILITIES ====
        public static boolean isNumeric(String str) {
            if (isEmpty(str)) return false;
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        public static boolean isValidEmail(String email) {
            if (isEmpty(email)) return false;
            String emailRegex = "^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+\\.[A-Za-z]{2,})$";
            Pattern pattern = Pattern.compile(emailRegex);
            return pattern.matcher(email).matches();
        }

        public static boolean isAlphabetic(String str) {
            if (isEmpty(str)) return false;
            return str.matches("[a-zA-Z]+");
        }

        public static boolean isAlphanumeric(String str) {
            if (isEmpty(str)) return false;
            return str.matches("[a-zA-Z0-9]+");
        }

        // ==== INPUT UTILITIES WITH VALIDATION ====
        @SuppressWarnings("resource")
		public static int getInt(String prompt) {
            Scanner sc = new Scanner(System.in);
            int result;
            while (true) {
                System.out.print(prompt + ": ");
                try {
                    result = sc.nextInt();
                    sc.nextLine(); // consume newline
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid integer.");
                    sc.nextLine(); // consume invalid input
                }
            }
            return result;
        }

        @SuppressWarnings("resource")
		public static double getDouble(String prompt) {
            Scanner sc = new Scanner(System.in);
            double result;
            while (true) {
                System.out.print(prompt + ": ");
                try {
                    result = sc.nextDouble();
                    sc.nextLine(); // consume newline
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                    sc.nextLine(); // consume invalid input
                }
            }
            return result;
        }
        public static boolean isEmpty(String str) {
            return str == null || str.trim().isEmpty();
        }
     // ==== FILE OPERATIONS ====
        public static boolean fileExists(String filePath) {
            return new java.io.File(filePath).exists();
        }

        public static String readFile(String filePath) {
            try {
                return new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(filePath)));
            } catch (Exception e) {
                return "Error reading file: " + e.getMessage();
            }
        }

        public static boolean writeFile(String filePath, String content) {
            try {
                java.nio.file.Files.write(java.nio.file.Paths.get(filePath), content.getBytes());
                return true;
            } catch (Exception e) {
                System.out.println("Error writing file: " + e.getMessage());
                return false;
            }
        }

        public static boolean appendToFile(String filePath, String content) {
            try {
                java.nio.file.Files.write(java.nio.file.Paths.get(filePath), content.getBytes(), 
                    java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
                return true;
            } catch (Exception e) {
                System.out.println("Error appending to file: " + e.getMessage());
                return false;
            }
        }

        // ==== MENU SYSTEM ====
        public static int menu(String title, String... options) {
            @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("\n" + format("=== " + title + " ===", "cyan", "default", true, "bold"));
                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + ". " + options[i]);
                }
                System.out.println("0. Exit");
                
                System.out.print("\nEnter your choice: ");
                try {
                    int choice = sc.nextInt();
                    if (choice >= 0 && choice <= options.length) {
                        return choice;
                    } else {
                        System.out.println(format("Invalid choice! Please try again.", "red", "default", false, "default"));
                    }
                } catch (Exception e) {
                    System.out.println(format("Please enter a valid number!", "red", "default", false, "default"));
                    sc.nextLine(); // consume invalid input
                }
            }
        }

        // ==== INTERACTIVE ANIMATIONS ====
        public static void loadingAnimation(String message, int duration) {
            String[] spinner = {"|", "/", "-", "\\"};
            long startTime = System.currentTimeMillis();
            int i = 0;
            
            while (System.currentTimeMillis() - startTime < duration) {
                System.out.print("\r" + message + " " + spinner[i % 4]);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                i++;
            }
            System.out.println("\r" + message + " ✓");
        }

        public static void typewriterEffect(String text, int speed, boolean sound) {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                if (sound && c != ' ') {
                    // Simple beep sound (works on some systems)
                    System.out.print("\007");
                }
                try {
                    Thread.sleep(speed);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
        }

        // ==== TABLE UTILITIES ====
        public static void printTable(String[] headers, String[][] data) {
            // Calculate column widths
            int[] widths = new int[headers.length];
            for (int i = 0; i < headers.length; i++) {
                widths[i] = headers[i].length();
                for (String[] row : data) {
                    if (i < row.length && row[i] != null) {
                        widths[i] = Math.max(widths[i], row[i].length());
                    }
                }
                widths[i] += 2; // padding
            }
            
            // Print table
            printTableBorder(widths);
            printTableRow(headers, widths, true);
            printTableBorder(widths);
            for (String[] row : data) {
                printTableRow(row, widths, false);
            }
            printTableBorder(widths);
        }

        private static void printTableBorder(int[] widths) {
            System.out.print("+");
            for (int width : widths) {
                System.out.print(repeat("-", width) + "+");
            }
            System.out.println();
        }

        private static void printTableRow(String[] row, int[] widths, boolean isHeader) {
            System.out.print("|");
            for (int i = 0; i < widths.length; i++) {
                String cell = (i < row.length && row[i] != null) ? row[i] : "";
                String formatted = String.format(" %-" + (widths[i] - 1) + "s", cell);
                if (isHeader) {
                    formatted = format(formatted, "cyan", "default", true, "bold");
                }
                System.out.print(formatted + "|");
            }
            System.out.println();
        }

        // ==== SYSTEM UTILITIES ====
        public static void beep() {
            System.out.print("\007");
        }

        public static void beep(int times) {
            for (int i = 0; i < times; i++) {
                System.out.print("\007");
                delay(100);
            }
        }

        public static long getMemoryUsage() {
            Runtime runtime = Runtime.getRuntime();
            return runtime.totalMemory() - runtime.freeMemory();
        }

        public static void printMemoryInfo() {
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            long totalMemory = runtime.totalMemory();
            long freeMemory = runtime.freeMemory();
            long usedMemory = totalMemory - freeMemory;
            
            System.out.println("=== MEMORY INFORMATION ===");
            System.out.println("Max Memory: " + formatBytes(maxMemory));
            System.out.println("Total Memory: " + formatBytes(totalMemory));
            System.out.println("Free Memory: " + formatBytes(freeMemory));
            System.out.println("Used Memory: " + formatBytes(usedMemory));
        }

        private static String formatBytes(long bytes) {
            if (bytes < 1024) return bytes + " B";
            if (bytes < 1024 * 1024) return String.format("%.1f KB", bytes / 1024.0);
            if (bytes < 1024 * 1024 * 1024) return String.format("%.1f MB", bytes / (1024.0 * 1024));
            return String.format("%.1f GB", bytes / (1024.0 * 1024 * 1024));
        }

        // ==== LOGGING UTILITIES ====
        public static void log(String level, String message) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            String color = "default";
            
            switch (level.toUpperCase()) {
                case "INFO":
                    color = "blue";
                    break;
                case "WARNING":
                    color = "yellow";
                    break;
                case "ERROR":
                    color = "red";
                    break;
                case "SUCCESS":
                    color = "green";
                    break;
            }
            
            String formatted = String.format("[%s] %s: %s", timestamp, level.toUpperCase(), message);
            System.out.println(format(formatted, color, "default", false, "default"));
        }

        public static void info(String message) {
            log("INFO", message);
        }

        public static void warning(String message) {
            log("WARNING", message);
        }

        public static void error(String message) {
            log("ERROR", message);
        }

        public static void success(String message) {
            log("SUCCESS", message);
        }

        // ==== PASSWORD UTILITIES ====
        @SuppressWarnings("resource")
		public static String getPassword(String prompt) {
            System.out.print(prompt + ": ");
            if (System.console() != null) {
                return new String(System.console().readPassword());
            } else {
                // Fallback for IDEs that don't support console
                Scanner sc = new Scanner(System.in);
                return sc.nextLine();
            }
        }

        public static String generatePassword(int length) {
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
            StringBuilder password = new StringBuilder();
            
            for (int i = 0; i < length; i++) {
                int index = (int) (Math.random() * chars.length());
                password.append(chars.charAt(index));
            }
            
            return password.toString();
        }

        // ==== COUNTDOWN TIMER ====
        public static void countdown(int seconds) {
            for (int i = seconds; i > 0; i--) {
                System.out.print("\rCountdown: " + format(String.valueOf(i), "red", "default", true, "bold") + " ");
                delay(1000);
            }
            System.out.println("\r" + format("TIME'S UP!", "green", "default", true, "bold") + "   ");
            beep(3);
        }

        // ==== SIMPLE CALCULATOR ====
        public static double calculate(String expression) {
            try {
                // Simple calculator - handles +, -, *, /
                expression = expression.replaceAll("\\s", "");
                
                if (expression.contains("+")) {
                    String[] parts = expression.split("\\+");
                    return Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
                } else if (expression.contains("-")) {
                    String[] parts = expression.split("-");
                    return Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
                } else if (expression.contains("*")) {
                    String[] parts = expression.split("\\*");
                    return Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
                } else if (expression.contains("/")) {
                    String[] parts = expression.split("/");
                    double divisor = Double.parseDouble(parts[1]);
                    if (divisor == 0) {
                        System.out.println("Error: Division by zero!");
                        return Double.NaN;
                    }
                    return Double.parseDouble(parts[0]) / divisor;
                }
                
                return Double.parseDouble(expression);
            } catch (Exception e) {
                System.out.println("Error: Invalid expression!");
                return Double.NaN;
            }
        }

        // ==== QUIZ SYSTEM ====
        public static class Quiz {
            private String question;
            private String[] options;
            private int correctAnswer;
            
            public Quiz(String question, String[] options, int correctAnswer) {
                this.question = question;
                this.options = options;
                this.correctAnswer = correctAnswer;
            }
            
            public boolean ask() {
                System.out.println("\n" + question);
                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + ". " + options[i]);
                }
                
                int answer = getInt("Your answer");
                boolean correct = (answer == correctAnswer);
                
                if (correct) {
                    System.out.println(format("✓ Correct!", "green", "default", true, "bold"));
                } else {
                    System.out.println(format("✗ Wrong! The correct answer was: " + options[correctAnswer - 1], "red", "default", false, "default"));
                }
                
                return correct;
            }
        }

        // ==== STOPWATCH ====
        public static class Stopwatch {
            private long startTime;
            private boolean running;
            
            public void start() {
                startTime = System.currentTimeMillis();
                running = true;
                System.out.println("Stopwatch started!");
            }
            
            public void stop() {
                if (running) {
                    long elapsed = System.currentTimeMillis() - startTime;
                    running = false;
                    System.out.println("Stopwatch stopped! Elapsed time: " + formatTime(elapsed));
                }
            }
            
            public void lap() {
                if (running) {
                    long elapsed = System.currentTimeMillis() - startTime;
                    System.out.println("Lap time: " + formatTime(elapsed));
                }
            }
            
            private String formatTime(long milliseconds) {
                long seconds = milliseconds / 1000;
                long minutes = seconds / 60;
                seconds = seconds % 60;
                long millis = milliseconds % 1000;
                
                return String.format("%02d:%02d.%03d", minutes, seconds, millis);
            }
        }



        
        
        
    }//end of class
    


