import java.util.Calendar;

public interface PropertyAplicationInterface {
    public boolean checkPropertyAvailability(Calendar startDate, Calendar endDate);
    public float checkPropertyTotalValue(Calendar startDate, Calendar endDate);
}
