package b;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.Date;
import java.util.Calendar;

@WebService(serviceName = "WageCalculatorService")
public class WageCalculatorService {
    private static final double HOURLY_RATE = 500.0;
    private static final int WORK_HOURS_PER_DAY = 8;

    @WebMethod(operationName = "calculateWage")
    public double calculateWage(@WebParam(name = "startDate") String startDate,
                                 @WebParam(name = "endDate") String endDate) {
        Date start = parseDate(startDate);
        Date end = parseDate(endDate);

        if (start.after(end)) {
            throw new IllegalArgumentException("End date must be after start date");
        }

        long workDays = countWorkDays(start, end);
        return workDays * WORK_HOURS_PER_DAY * HOURLY_RATE;
    }

    private Date parseDate(String dateStr) {
        try {
            return new java.text.SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
        } catch (java.text.ParseException e) {
            throw new IllegalArgumentException("Invalid date format. Use yyyy-MM-dd.");
        }
    }

    private long countWorkDays(Date start, Date end) {
        Calendar startCal = Calendar.getInstance();
        Calendar endCal = Calendar.getInstance();
        startCal.setTime(start);
        endCal.setTime(end);

        long workDays = 0;
        while (startCal.before(endCal) || startCal.equals(endCal)) {
            int dayOfWeek = startCal.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
                workDays++;
            }
            startCal.add(Calendar.DAY_OF_MONTH, 1);
        }
        return workDays;
    }
}
