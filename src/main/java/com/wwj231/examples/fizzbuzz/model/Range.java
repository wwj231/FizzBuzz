package com.wwj231.examples.fizzbuzz.model;

import java.util.Iterator;
import java.util.Objects;
import java.util.stream.IntStream;

public class Range implements Iterable<Integer>{
    int start;
    int end;

    public Range(final int start, final int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(final int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(final int end) {
        this.end = end;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Range range = (Range) o;
        return getStart() == range.getStart() &&
                getEnd() == range.getEnd();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStart(), getEnd());
    }

    @Override
    public Iterator<Integer> iterator() {
        return IntStream.rangeClosed(start, end).iterator();
    }
}
