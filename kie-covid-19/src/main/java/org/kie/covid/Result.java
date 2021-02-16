package org.kie.covid;

public class Result {
    private long count;

    public Result() {
    }

    public Result(long count) {
        this.setCount(count);
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

}
