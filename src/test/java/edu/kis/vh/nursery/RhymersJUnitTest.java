package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void testHanoiCountIn(){
        DefaultCountingOutRhymer hanoiRhymer = new HanoiRhymer();

        int testValue = 10;
        hanoiRhymer.countIn(testValue);
        int result = hanoiRhymer.peekaboo();

        Assert.assertEquals(testValue,result);

        testValue = 9;
        hanoiRhymer.countIn(testValue);
        result = hanoiRhymer.peekaboo();

        Assert.assertEquals(testValue,result);

        testValue = 10;
        hanoiRhymer.countIn(testValue);
        result = hanoiRhymer.peekaboo();

        Assert.assertNotEquals(testValue,result);
    }

    @Test
    public void testHanoiReportRejected(){
        HanoiRhymer hanoiRhymer = new HanoiRhymer();
        final int EXPECT_VALUE = 2;
        int testValue = 10;
        hanoiRhymer.countIn(testValue);

        hanoiRhymer.countIn(testValue+1);
        hanoiRhymer.countIn(testValue+2);
        Assert.assertEquals(hanoiRhymer.reportRejected(),EXPECT_VALUE);
    }

    @Test
    public void testFIFOCountOut(){
        DefaultCountingOutRhymer fifoRhymer = new FIFORhymer();
        final int EXPECT_VALUE = -1;

        int result = fifoRhymer.countOut();
        Assert.assertEquals(result,EXPECT_VALUE);

        int test = 10;
        fifoRhymer.countIn(10);
        result = fifoRhymer.countOut();
        Assert.assertEquals(result,test);
    }
}
