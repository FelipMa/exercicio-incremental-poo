import java.util.ArrayList;
import java.util.Calendar;

public class Schedule {
    private ArrayList<Calendar> availableDates;
    private ArrayList<Calendar> unavailableDates;
    private ArrayList<Calendar> reservedDates;

    public Schedule() {
        this.availableDates = new ArrayList<Calendar>();
        this.unavailableDates = new ArrayList<Calendar>();
        this.reservedDates = new ArrayList<Calendar>();
    }

    public ArrayList<Calendar> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(ArrayList<Calendar> availableDates) {
        this.availableDates = availableDates;
    }

    public ArrayList<Calendar> getUnavailableDates() {
        return unavailableDates;
    }

    public void setUnavailableDates(ArrayList<Calendar> unavailableDates) {
        this.unavailableDates = unavailableDates;
    }

    public ArrayList<Calendar> getReservedDates() {
        return reservedDates;
    }

    public void setReservedDates(ArrayList<Calendar> reservedDates) {
        this.reservedDates = reservedDates;
    }

    public void addAvailableDate(Calendar date) {
        this.availableDates.add(date);
    }

    public void addUnavailableDate(Calendar date) {
        this.unavailableDates.add(date);
    }

    public void addReservedDate(Calendar date) {
        this.reservedDates.add(date);
    }

    public void removeAvailableDate(Calendar date) {
        this.availableDates.remove(date);
    }

    public void removeUnavailableDate(Calendar date) {
        this.unavailableDates.remove(date);
    }

    public void removeReservedDate(Calendar date) {
        this.reservedDates.remove(date);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "availableDates=" + availableDates +
                ", unavailableDates=" + unavailableDates +
                ", reservedDates=" + reservedDates +
                '}';
    }
}
