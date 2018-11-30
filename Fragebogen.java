import javax.swing.JOptionPane;

import java.util.Scanner;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fragebogen {

    private static LinkedHashMap<String, String> questionPairs = new LinkedHashMap<>();

    public static void main(String[] args)  {

	// Prelaunch - Ask for name
	Scanner sc = new Scanner(System.in);
	System.out.print("Bitte gib deinen Namen ein, bevor das Quiz startet: ");
	final String name = sc.nextLine();
	// Load questions into Map
	fillQuestionList();
	
        String[] choices = {"eine Versionshistorie",
			    "eine direkte Codeanalyse",
			    "eine Urkunde (ausgestellt vom Ministerium für technische Entwicklung)"};
	
        String input = retrieveUserInput(0, choices, choices[0]);

	/* Decide whether your answer is right or wrong 
	   - print "Falsch" on the Shell for each answer you consider as wrong
	   - repeat the steps above for every if-statement/given question!
	   - you can create a function if you are lazy/smart
	*/
	
	System.out.print("Die Antwort ist: ");
        if (input == choices[0]) {
	    
	} else if (input == choices[1]) {
	    System.out.println("...");
	} else if (input == choices[2]) {
	    
	}

        String[] choices1 = {"Spendenbutton bei Amazon-Einkäufen",
			     "Partnerprogramme mit z.B Amazon, bei denen ein Anteil des Kaufpreises an das Projekt geht",
			     "Amazon-Werbung auf eigener Website schalten"};
	
        String input1 = retrieveUserInput(1, choices1, choices1[0]);

	System.out.print("Die Antwort ist");
        if (input1 == choices1[0]) {

	} else if (input1 == choices1[1]) {

	} else if (input1 == choices1[2]) {
	    
	}

        String[] choices2 = {"GNU GPL v2", "Apache Lizenz", "Mozilla Public License"};

	String input2 = retrieveUserInput(2, choices2, choices2[0]);

	System.out.print("Die Antwort ist");
        if (input2 == choices2[0]) {

	} else if (input2 == choices2[1]) {

	} else if (input2 == choices2[2]) {

	}

        String[] choices3 = {"README", "Code of Conduct", "License", "Contributing File"};
	
	String input3 = retrieveUserInput(3, choices3, choices3[0]);

	System.out.print("Die Antwort ist");
        if (input3 == choices3[0]) {

	} else if (input3 == choices3[1]) {

	} else if (input3 == choices3[2]) {

	}

	// Code-Eigenschaften-Fragebogen
	
	String[] choices4 = {"Man stellt den Anwender möglicherweise vor eine Entscheidung",
			     "Software kann gelegentlich abstürzen, was zu Datenverlusten führt",
			     "Verschiedene Software kann mit verschiedenen Versionen kompatibel sein",
			     "Der Prozess benötigt mehr Arbeitsspeicher",
			     "Die Software springt dir ins Gesicht, wenn du es am wenigsten erwartest"};


	String input4 = retrieveUserInput(4, choices4, choices4[0]);

	System.out.print("Die Antwort ist: ");
	if (input4 == choices4[0]) {
	    
	} else if (input4 == choices4[1]) {

	} else if(input4 == choices4[2]) {

	} else if(input4 == choices4[3]) {

	} else if(input4 == choices4[4]) {

	}
	// Creates a text file containing your given answers
	logIndividualScore(name);
    }

    // IMPLEMENT HERE
    private static int correctAnswerCounter() {
	/*
	  1. Implement a simple counter that counts the correct answers
	  - create a global variable
	  - iterate your global variable every time your answer is correct
	  - print "Richtig" on the Shell
	*/
	return 0;
    }

    private static void fillQuestionList() {
	try (BufferedReader br = new BufferedReader(new FileReader("questions.txt"))) {
	    for(String line; (line = br.readLine()) != null; ) {
		questionPairs.put(line, "");
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    private static String retrieveUserInput(int index, String[] choices, String answer) {
	final String label = "DAS ULTIMATIVE OPEN SOURCE QUIZ";
	final String currentQuestion = (String)questionPairs.keySet().toArray()[index];
	final String clickedInput = ((String) JOptionPane.showInputDialog
				     (null, currentQuestion, label, JOptionPane.QUESTION_MESSAGE, null, choices, answer));
	questionPairs.put(currentQuestion, clickedInput);

	return clickedInput;
    }

    private static void logIndividualScore(String name) {
	FileWriter log = null;
	try {
	    log = new FileWriter(name + ".txt");
	    for(Entry<String, String> entry : questionPairs.entrySet())
		log.write(entry.getKey() + "\n\t Deine Antwort: " + entry.getValue() + "\n\n");

	    log.write(correctAnswerCounter() + " von " + questionPairs.size() + " Fragen richtig beantwortet.\n"); 
	    log.close();
	} catch(IOException e) {
	    e.printStackTrace();
	}
    }
}
