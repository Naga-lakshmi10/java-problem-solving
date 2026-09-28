public class FinalVariables
{
    public static void main(String[] args)
    {
        System.out.println("==================================");
        System.out.println("        FIXED INFORMATION         ");
        System.out.println("==================================");
        // final variables cannot be reassigned and represented in uppercase
        final String COLLEGE = "Pragati Engineering College";
        System.out.println("COLLEGE : "+COLLEGE);
        final String COURSE = "computer Science Engineering";
        System.out.println("COURSE : "+COURSE);
        final int GRADUATION_YEAR=2028;
        System.out.println("GRADUATION YEAR : "+GRADUATION_YEAR);
        final int COURSE_DURATION=4;
        System.out.println("COURSE DURATION : "+COURSE_DURATION+"years");
        System.out.println("==================================");
        System.out.println("      CHANGEABLE INFORMATION      ");
        System.out.println("==================================");
        String studentName = "Nagalakshmi";
        System.out.println("Student Name : "+studentName);
        int currentSemester=5;
        System.out.println("Current semester: "+currentSemester);
        System.out.println("==================================");
        System.out.println("         UPDATED INFORMATION     ");
        System.out.println("==================================");
        studentName="Nagalakshmi Karri";
        System.out.println("Student Name : "+studentName);
        currentSemester=6;
        System.out.println("Current semester: "+currentSemester);

    }
}