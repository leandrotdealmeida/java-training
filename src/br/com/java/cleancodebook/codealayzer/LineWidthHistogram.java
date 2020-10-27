package br.com.java.cleancodebook.codealayzer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LineWidthHistogram {
    private Set<Integer> widths;


    public void addLine(int lineSize, int lineCount) {
    }

    public List<Integer> getLinesForWidth(int width) {
        List<Integer> list = new ArrayList<>();
        list.add(width);
        return list;
    }

    public Set<Integer> getWidths() {
        return widths;
    }
}
