package bridge.example_one;

import java.util.List;

public class MovieFormatter implements Formatter{

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(header);
        stringBuilder.append("\n");

        for(Detail detail: details) {
            stringBuilder.append(detail.getKey());
            stringBuilder.append((" : "));
            stringBuilder.append((detail.getValue()));
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
