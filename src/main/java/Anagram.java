import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    private String diaper;

    public Anagram(String diaper) {
        this.diaper = diaper;
    }

    public String getDiaper() {
        return diaper;
    }

    public List<String> match(List<String> input) {
        return input.stream().filter(item -> !item.toLowerCase().equals(getDiaper().toLowerCase()))
                .filter(x -> Arrays.equals(x.toLowerCase().chars().sorted().toArray(), getDiaper().toLowerCase().chars().sorted().toArray()))
                .collect(Collectors.toList());

    }
}
