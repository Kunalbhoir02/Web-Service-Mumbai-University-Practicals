package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "DateWebService")
public class DateWebService {

    @WebMethod(operationName = "getDate")
    public String getDate(@WebParam(name = "day") int day, @WebParam(name = "year") int year) {
        try {
            LocalDate date = LocalDate.ofYearDay(year, day);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
            return date.format(formatter);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
