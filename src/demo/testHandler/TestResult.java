package demo.testHandler;

import java.util.Date;

public class TestResult {
    private final long allTest;
    private final long successTest;
    private final long failedTest;
    private final Date timeTest;

    public TestResult(long allTest, long successTest, long failedTest, long timeTest) {
        this.allTest = allTest;
        this.successTest = successTest;
        this.failedTest = failedTest;
        this.timeTest = new Date(timeTest);
    }

    public long getAllTest() {
        return allTest;
    }

    public long getSuccessTest() {
        return successTest;
    }

    public long getFailedTest() {
        return failedTest;
    }

    public Date getTimeTest() {
        return timeTest;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "allTest=" + allTest +
                ", successTest=" + successTest +
                ", failedTest=" + failedTest +
                ", timeTest=" + timeTest +
                '}';
    }
}
