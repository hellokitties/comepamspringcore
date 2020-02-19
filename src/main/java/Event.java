import java.text.DateFormat;
import java.util.Date;


public class Event {
    int id;
    private static int counter = 0;

    String msg;
    Date date;
    DateFormat df;

    Event(Date date, DateFormat df) {
        this.df = df;
        this.date = date;
        this.id = counter++;
    }

    void setMsg(String msg){
        this.msg=msg;
    }

    @Override
    public String toString() {
        return (df.format(date) + "  " + id + " "+ msg);
    }
}
