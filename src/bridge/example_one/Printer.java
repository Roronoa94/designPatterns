package bridge.example_one;

import java.util.List;

public abstract class Printer {

    public String print (Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();

}
