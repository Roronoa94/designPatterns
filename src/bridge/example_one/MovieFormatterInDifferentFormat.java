package bridge.example_one;

import java.util.List;

public class MovieFormatterInDifferentFormat implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("Classification of movie : ");
        builder.append(header);
        builder.append("\n");
        builder.append("\n");
        for(Detail detail : details) {
            builder.append(detail.getKey() + " -> " + detail.getValue() + "\n");
        }

        return builder.toString();
    }
}
