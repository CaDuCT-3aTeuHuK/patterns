public class Main {

    public static void main(String[] args) {
        DisplayTimetable displayTimetable = new DisplayTimetable();
//        displayTimetable.printTimetable();
//        displayTimetable.printTimetable();
        TimetableElectricTrains timetableElectricTrains = new TimetableElectricTrains();
        System.out.println(timetableElectricTrains.getTrainDepartureTime("9B-8710"));
    }
}
