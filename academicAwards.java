import java.util.Scanner;

public class academicAwards extends Thread {
    public static void main(String[]args) {

        try {
            //code to display program title
            System.out.println("");
            System.out.println("-------------------------");
            System.out.println("ACADEMIC AWARD CALCULATOR");
            System.out.println("-------------------------");
            System.out.println("");
            Thread.sleep(1000);

            //code to recive name of participant
            Scanner nameSc = new Scanner(System.in);
            System.out.println("Hello, please type in your name: ");
            String name = nameSc.next();
            Thread.sleep(1000);

            //gimmick loading code
            System.out.println("");
            System.out.println("Loading");
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");

            Thread.sleep(2000);
            System.out.println("");
            System.out.println("Welcome to the Academic Awards Calculator, " + name);

            //code to receive inputs of details
            Scanner ageSc = new Scanner(System.in);
            Thread.sleep(1000);
            System.out.println("");
            System.out.println("Please input your age:");
            int age = ageSc.nextInt();

            Scanner engSc = new Scanner(System.in);
            Thread.sleep(500);
            System.out.println("");
            System.out.println("Type your marks in English:");
            float marksEng = engSc.nextFloat();

            Scanner mathSc = new Scanner(System.in);
            Thread.sleep(500);
            System.out.println("");
            System.out.println("Type your marks in Maths:");
            float marksMath = mathSc.nextFloat();

            Scanner scienceSc = new Scanner(System.in);
            Thread.sleep(500);
            System.out.println("");
            System.out.println("Type your marks in Science:");
            float marksScience = scienceSc.nextFloat();

            Scanner historySc = new Scanner(System.in);
            Thread.sleep(500);
            System.out.println("");
            System.out.println("Type your marks in History:");
            float marksHistory = historySc.nextFloat();

            Scanner geoSc = new Scanner(System.in);
            Thread.sleep(500);
            System.out.println("");
            System.out.println("Type your marks in Geography:");
            float marksGeo = geoSc.nextFloat();

            Scanner langSc = new Scanner(System.in);
            Thread.sleep(500);
            System.out.println("");
            System.out.println("Type your marks in your Second Language:");
            float marksLang = langSc.nextFloat();

            //calculations for average marks and percentage
            float totalMarks = marksEng + marksMath + marksScience + marksHistory + marksGeo + marksLang;
            double averageMarks = totalMarks / 6.0;
            double averagePercentqd = averageMarks/80.0;
            double averagePercent = averagePercentqd*100.0;

            //defines temporary eligibility variables
            int overallexEligibility;
            int engEligibility;
            int mathEligibility;
            int scienceEligibility;
            int historyEligibility;
            int geoEligibility;
            int langEligibility;

            //checks eligibility for overall subjects
            if (averageMarks >= 72.0) {
                overallexEligibility = 1;
            } else {
                overallexEligibility = 0;
            }

            //checks eligibility for english
            if (marksEng >= 72.0) {
                engEligibility = 1;
            } else {
                engEligibility = 0;
            }

            //checks eligibility for math
            if (marksMath >= 72.0) {
                mathEligibility = 1;
            } else {
                mathEligibility = 0;
            }

            //checks eligibility for science
            if (marksScience >= 72.0) {
                scienceEligibility = 1;
            } else {
                scienceEligibility = 0;
            }

            //checks eligibility for history
            if (marksHistory >= 72.0) {
                historyEligibility = 1;
            } else {
                historyEligibility = 0;
            }

            //checks eligibility for geo
            if (marksGeo >= 72.0) {
                geoEligibility = 1;
            } else {
                geoEligibility = 0;
            }

            //checks eligibility for language
            if (marksLang >= 72.0) {
                langEligibility = 1;
            } else {
                langEligibility = 0;
            }

            //formatting code
            System.out.println("");
            System.out.println("You are eligible for the following:");
            System.out.println("");
            Thread.sleep(1000);

            //prints eng
            if (engEligibility == 1) {
                System.out.println("You are eligible to receive an award in English!");
                System.out.println("You scored: " +marksEng);
                Thread.sleep(1000);
            } else {

            }

            //prints math
            if (mathEligibility == 1) {
                System.out.println("You are eligible to receive an award in Maths!");
                System.out.println("You scored: " +marksMath);
                Thread.sleep(1000);
            } else {

            }

            //prints science
            if (scienceEligibility == 1) {
                System.out.println("You are eligible to receive an award in Science!");
                System.out.println("You scored: " +marksScience);
                Thread.sleep(1000);
            } else {

            }

            //prints history
            if (historyEligibility == 1) {
                System.out.println("You are eligible to receive an award in History!");
                System.out.println("You scored: " +marksHistory);
                Thread.sleep(1000);
            } else {

            }

            //prints geo
            if (geoEligibility == 1) {
                System.out.println("You are eligible to receive an award in Geography!");
                System.out.println("You scored: " +marksGeo);
                Thread.sleep(1000);
            } else {

            }
            //prints lang marks
            if (langEligibility == 1) {
                System.out.println("You are eligible to receive an award in your Second Language!");
                System.out.println("You scored: " +marksLang);
                Thread.sleep(1000);
            } else {

            }

            //prints overall excellence
            if (overallexEligibility == 1) {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("Your average marks were "+averageMarks+"/80");
                System.out.println("Your average percentage was "+averagePercent+"%");
                System.out.println("-------------------------------------------");
                System.out.println("CONGRATULATIONS!");
                System.out.println("You scored more than 90% in all Subjects!");
                System.out.println(name+ " of age " +age+ " is eligible to win:");
                System.out.println("OVERALL ACADEMIC EXCELLENCE AWARD");
                System.out.println("-------------------------------------------");

            }

            else {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("Your average marks were "+averageMarks);
                System.out.println("Your average percentage was "+averagePercent+"%");
                System.out.println("-------------------------------------------");
            }
        }


        catch(InterruptedException ex){
            }
    }
}