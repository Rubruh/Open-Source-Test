import javax.swing.JOptionPane;

public class Fragebogen {

    public static void main(String[] a) {

        String[] choices = {"eine Versionshistorie", "eine direkte Codeanalyse", "eine Urkunde (ausgestellt vom Ministerium für technische Entwicklung)"};
        String input = (String) JOptionPane.showInputDialog(null, "Je nach Software und Lizenz erhält man oft nicht nur den Quellcode, sondern auch..",
                "DAS ULTIMATIVE OPEN SOURCE QUIZ", JOptionPane.QUESTION_MESSAGE, null,
                choices,
                choices[0]);

        if (input == choices[0]) {
            System.out.println("Die Antwort ist");
        } else if (input == choices[1]) {
            System.out.println("Die Antwort ist");
        } else if (input == choices[2]) {
            System.out.println("Die Antwort ist");
        }

        String[] choices1 = {"Spendenbutton bei Amazon-Einkäufen", "Partnerprogramme mit z.B Amazon, bei denen ein Anteil des Kaufpreises an das Projekt geht", "Amazon-Werbung auf eigener Website schalten"};
        String input1 = (String) JOptionPane.showInputDialog(null, "Was ist eine profitable Möglichkeit, Geld einzunehmen?",
                "DAS ULTIMATIVE OPEN SOURCE QUIZ", JOptionPane.QUESTION_MESSAGE, null,
                choices1,
                choices1[0]);

        if (input1 == choices1[0]) {
            System.out.println("Die Antwort ist");
        } else if (input1 == choices1[1]) {
            System.out.println("Die Antwort ist");
        } else if (input1 == choices1[2]) {
            System.out.println("Die Antwort ist");
        }

        String[] choices2 = {"GNU GPL v2", "Apache Lizenz", "Mozilla Public License"};
        String input2 = (String) JOptionPane.showInputDialog(null, "Welche ist die meist verwendete Lizenz in der Open-Source Community?",
                "DAS ULTIMATIVE OPEN SOURCE QUIZ", JOptionPane.QUESTION_MESSAGE, null,
                choices2,
                choices2[0]);

        if (input2 == choices2[0]) {
            System.out.println("Die Antwort ist");
        } else if (input2 == choices2[1]) {
            System.out.println("Die Antwort ist");
        } else if (input2 == choices2[2]) {
            System.out.println("Die Antwort ist");
        }

        String[] choices3 = {"README", "Code of Conduct", "License", "Contributing File"};
        String input3 = (String) JOptionPane.showInputDialog(null, "Welcher der Dateien bestimmt eine Art Verhaltenskodex bei der Mitarbeit an einem Open Source Programm?",
                "DAS ULTIMATIVE OPEN SOURCE QUIZ", JOptionPane.QUESTION_MESSAGE, null,
                choices3,
                choices3[0]);

        if (input3 == choices3[0]) {
            System.out.println("Die Antwort ist");
        } else if (input3 == choices3[1]) {
            System.out.println("Die Antwort ist");
        } else if (input3 == choices3[2]) {
            System.out.println("Die Antwort ist");
        }

        String[] choices4 = {"A", "B", "C"};
        String input4 = (String) JOptionPane.showInputDialog(null, "Welche der folgenden Antworten ist richtig?",
                "DAS ULTIMATIVE OPEN SOURCE QUIZ", JOptionPane.QUESTION_MESSAGE, null,
                choices4,
                choices4[0]);

        if (input4 == choices4[0]) {
            System.out.println("Die Antwort ist");
        } else if (input4 == choices4[1]) {
            System.out.println("Die Antwort ist");
        } else if (input4 == choices4[2]) {
            System.out.println("Die Antwort ist");
        }

    }
}
