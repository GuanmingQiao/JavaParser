import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (byte) -1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        int[] intArray4 = new int[] { '4', (short) 1 };
        int int5 = multTester1.add_values(intArray4);
        source_repo.MultTester multTester7 = new source_repo.MultTester((int) (short) 0);
        int[] intArray10 = new int[] { '4', (short) 1 };
        int int11 = multTester7.add_values(intArray10);
        int int12 = multTester1.add_values(intArray10);
        int int13 = multTester1.c;
        source_repo.MultTester multTester15 = new source_repo.MultTester((int) (short) 0);
        int[] intArray20 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int21 = multTester15.add_values(intArray20);
        multTester15.c = (short) 10;
        int[] intArray29 = new int[] { 1, (short) 100, (byte) 10, (byte) 0, (byte) 0 };
        int int30 = multTester15.add_values(intArray29);
        int int31 = multTester1.add_values(intArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 42 + "'", int5 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 42 + "'", int31 == 42);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 100);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) '#');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        source_repo.MultTester multTester1 = new source_repo.MultTester(41);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        int[] intArray6 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int7 = multTester1.add_values(intArray6);
        multTester1.c = (short) 10;
        int[] intArray15 = new int[] { 1, (short) 100, (byte) 10, (byte) 0, (byte) 0 };
        int int16 = multTester1.add_values(intArray15);
        int int17 = multTester1.c;
        multTester1.c = (short) -1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester3 = new source_repo.MultTester((int) (short) 0);
        int[] intArray8 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int9 = multTester3.add_values(intArray8);
        int int10 = multTester1.add_values(intArray8);
        source_repo.MultTester multTester12 = new source_repo.MultTester(1);
        multTester12.c = (byte) -1;
        source_repo.MultTester multTester16 = new source_repo.MultTester((int) (short) 0);
        multTester16.c = (byte) 10;
        multTester16.c = 0;
        source_repo.MultTester multTester22 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester24 = new source_repo.MultTester((int) (short) 0);
        int[] intArray29 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int30 = multTester24.add_values(intArray29);
        int int31 = multTester22.add_values(intArray29);
        int int32 = multTester16.add_values(intArray29);
        int int33 = multTester12.add_values(intArray29);
        int int34 = multTester1.add_values(intArray29);
        int int35 = multTester1.c;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 42 + "'", int30 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 42 + "'", int31 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 42 + "'", int32 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 41 + "'", int33 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 42 + "'", int34 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        multTester1.c = (byte) 10;
        source_repo.MultTester multTester5 = new source_repo.MultTester((int) (short) 0);
        multTester5.c = (byte) 10;
        multTester5.c = 0;
        source_repo.MultTester multTester11 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester13 = new source_repo.MultTester((int) (short) 0);
        int[] intArray18 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int19 = multTester13.add_values(intArray18);
        int int20 = multTester11.add_values(intArray18);
        int int21 = multTester5.add_values(intArray18);
        int int22 = multTester1.add_values(intArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 42 + "'", int19 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 42 + "'", int20 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        int[] intArray4 = new int[] { '4', (short) 1 };
        int int5 = multTester1.add_values(intArray4);
        source_repo.MultTester multTester7 = new source_repo.MultTester((int) (short) 0);
        int[] intArray10 = new int[] { '4', (short) 1 };
        int int11 = multTester7.add_values(intArray10);
        int int12 = multTester1.add_values(intArray10);
        int int13 = multTester1.c;
        multTester1.c = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 42 + "'", int5 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        source_repo.MultTester multTester1 = new source_repo.MultTester(52);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        multTester1.c = (short) 10;
        multTester1.c = (byte) 10;
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        source_repo.MultTester multTester1 = new source_repo.MultTester(100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) 'a');
        int int2 = multTester1.c;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        int[] intArray4 = new int[] { '4', (short) 1 };
        int int5 = multTester1.add_values(intArray4);
        source_repo.MultTester multTester7 = new source_repo.MultTester((int) (short) 0);
        int[] intArray10 = new int[] { '4', (short) 1 };
        int int11 = multTester7.add_values(intArray10);
        int int12 = multTester1.add_values(intArray10);
        multTester1.c = 0;
        int int15 = multTester1.c;
        int int16 = multTester1.c;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 42 + "'", int5 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        multTester1.c = (short) 10;
        multTester1.c = 0;
        multTester1.c = '#';
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        int[] intArray6 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int7 = multTester1.add_values(intArray6);
        multTester1.c = (short) 10;
        int[] intArray15 = new int[] { 1, (short) 100, (byte) 10, (byte) 0, (byte) 0 };
        int int16 = multTester1.add_values(intArray15);
        int int17 = multTester1.c;
        int int18 = multTester1.c;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) ' ');
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        int[] intArray6 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int7 = multTester1.add_values(intArray6);
        multTester1.c = (short) 10;
        source_repo.MultTester multTester11 = new source_repo.MultTester((int) (short) 0);
        multTester11.c = (byte) 10;
        source_repo.MultTester multTester15 = new source_repo.MultTester((int) (short) 0);
        int[] intArray18 = new int[] { '4', (short) 1 };
        int int19 = multTester15.add_values(intArray18);
        source_repo.MultTester multTester21 = new source_repo.MultTester((int) (short) 0);
        int[] intArray24 = new int[] { '4', (short) 1 };
        int int25 = multTester21.add_values(intArray24);
        int int26 = multTester15.add_values(intArray24);
        int int27 = multTester15.c;
        multTester15.c = (byte) 1;
        source_repo.MultTester multTester31 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester33 = new source_repo.MultTester((int) (short) 0);
        int[] intArray36 = new int[] { '4', (short) 1 };
        int int37 = multTester33.add_values(intArray36);
        source_repo.MultTester multTester39 = new source_repo.MultTester((int) (short) 0);
        int[] intArray42 = new int[] { '4', (short) 1 };
        int int43 = multTester39.add_values(intArray42);
        int int44 = multTester33.add_values(intArray42);
        int int45 = multTester31.add_values(intArray42);
        int int46 = multTester15.add_values(intArray42);
        int int47 = multTester11.add_values(intArray42);
        int int48 = multTester1.add_values(intArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 42 + "'", int19 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 42 + "'", int25 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 42 + "'", int26 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 42 + "'", int37 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 42 + "'", int43 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 42 + "'", int44 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 42 + "'", int45 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 43 + "'", int46 == 43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        int[] intArray6 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int7 = multTester1.add_values(intArray6);
        int int8 = multTester1.c;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (byte) 100);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        multTester1.c = (short) 10;
        multTester1.c = (byte) -1;
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester3 = new source_repo.MultTester((int) (short) 0);
        int[] intArray8 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int9 = multTester3.add_values(intArray8);
        int int10 = multTester1.add_values(intArray8);
        int int11 = multTester1.c;
        source_repo.MultTester multTester13 = new source_repo.MultTester(1);
        multTester13.c = (byte) -1;
        source_repo.MultTester multTester17 = new source_repo.MultTester((int) (short) 0);
        int[] intArray22 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int23 = multTester17.add_values(intArray22);
        int int24 = multTester13.add_values(intArray22);
        int int25 = multTester1.add_values(intArray22);
        int int26 = multTester1.c;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 42 + "'", int23 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41 + "'", int24 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 42 + "'", int25 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        int[] intArray4 = new int[] { '4', (short) 1 };
        int int5 = multTester1.add_values(intArray4);
        source_repo.MultTester multTester7 = new source_repo.MultTester((int) (short) 0);
        int[] intArray10 = new int[] { '4', (short) 1 };
        int int11 = multTester7.add_values(intArray10);
        int int12 = multTester1.add_values(intArray10);
        int int13 = multTester1.c;
        multTester1.c = (byte) 1;
        source_repo.MultTester multTester17 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester19 = new source_repo.MultTester((int) (short) 0);
        int[] intArray22 = new int[] { '4', (short) 1 };
        int int23 = multTester19.add_values(intArray22);
        source_repo.MultTester multTester25 = new source_repo.MultTester((int) (short) 0);
        int[] intArray28 = new int[] { '4', (short) 1 };
        int int29 = multTester25.add_values(intArray28);
        int int30 = multTester19.add_values(intArray28);
        int int31 = multTester17.add_values(intArray28);
        int int32 = multTester1.add_values(intArray28);
        int int33 = multTester1.c;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 42 + "'", int5 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 42 + "'", int23 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 42 + "'", int29 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 42 + "'", int30 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 42 + "'", int31 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 43 + "'", int32 == 43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) '4');
        int int2 = multTester1.c;
        source_repo.MultTester multTester4 = new source_repo.MultTester(1);
        multTester4.c = (byte) -1;
        source_repo.MultTester multTester8 = new source_repo.MultTester((int) (short) 0);
        int[] intArray13 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int14 = multTester8.add_values(intArray13);
        int int15 = multTester4.add_values(intArray13);
        int int16 = multTester1.add_values(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 42 + "'", int14 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 41 + "'", int15 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 94 + "'", int16 == 94);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (byte) 1);
        int int2 = multTester1.c;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        source_repo.MultTester multTester1 = new source_repo.MultTester(42);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        multTester1.c = (byte) 10;
        multTester1.c = 0;
        source_repo.MultTester multTester7 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester9 = new source_repo.MultTester((int) (short) 0);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int15 = multTester9.add_values(intArray14);
        int int16 = multTester7.add_values(intArray14);
        int int17 = multTester1.add_values(intArray14);
        int int18 = multTester1.c;
        multTester1.c = (short) 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42 + "'", int15 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 42 + "'", int16 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 42 + "'", int17 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        multTester1.c = (short) 10;
        multTester1.c = (byte) 0;
        int int6 = multTester1.c;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        source_repo.MultTester multTester1 = new source_repo.MultTester(1);
        multTester1.c = (byte) -1;
        multTester1.c = '#';
        source_repo.MultTester multTester7 = new source_repo.MultTester((int) (short) 0);
        int[] intArray12 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int13 = multTester7.add_values(intArray12);
        multTester7.c = (short) 10;
        int[] intArray21 = new int[] { 1, (short) 100, (byte) 10, (byte) 0, (byte) 0 };
        int int22 = multTester7.add_values(intArray21);
        multTester7.c = (byte) -1;
        int[] intArray27 = new int[] { (short) -1, 52 };
        int int28 = multTester7.add_values(intArray27);
        int int29 = multTester1.add_values(intArray27);
        multTester1.c = (byte) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 42 + "'", int13 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 41 + "'", int28 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 77 + "'", int29 == 77);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        int[] intArray6 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int7 = multTester1.add_values(intArray6);
        multTester1.c = (short) 10;
        source_repo.MultTester multTester11 = new source_repo.MultTester((int) (short) 0);
        int[] intArray16 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int17 = multTester11.add_values(intArray16);
        multTester11.c = (short) 10;
        int[] intArray25 = new int[] { 1, (short) 100, (byte) 10, (byte) 0, (byte) 0 };
        int int26 = multTester11.add_values(intArray25);
        int int27 = multTester1.add_values(intArray25);
        multTester1.c = (byte) -1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 42 + "'", int17 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        multTester1.c = (byte) 10;
        multTester1.c = (short) 0;
        int int6 = multTester1.c;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        multTester1.c = (byte) 10;
        multTester1.c = 0;
        source_repo.MultTester multTester7 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester9 = new source_repo.MultTester((int) (short) 0);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int15 = multTester9.add_values(intArray14);
        int int16 = multTester7.add_values(intArray14);
        int int17 = multTester1.add_values(intArray14);
        int int18 = multTester1.c;
        multTester1.c = 100;
        source_repo.MultTester multTester22 = new source_repo.MultTester((int) (short) 0);
        multTester22.c = (short) 10;
        multTester22.c = (byte) 0;
        source_repo.MultTester multTester28 = new source_repo.MultTester((int) (short) 0);
        int[] intArray33 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int34 = multTester28.add_values(intArray33);
        source_repo.MultTester multTester36 = new source_repo.MultTester(1);
        multTester36.c = (byte) -1;
        source_repo.MultTester multTester40 = new source_repo.MultTester((int) (short) 0);
        int[] intArray45 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int46 = multTester40.add_values(intArray45);
        int int47 = multTester36.add_values(intArray45);
        int int48 = multTester28.add_values(intArray45);
        int int49 = multTester22.add_values(intArray45);
        int int50 = multTester1.add_values(intArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42 + "'", int15 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 42 + "'", int16 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 42 + "'", int17 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 42 + "'", int34 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 42 + "'", int46 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 41 + "'", int47 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 42 + "'", int48 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 42 + "'", int49 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 142 + "'", int50 == 142);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        source_repo.MultTester multTester1 = new source_repo.MultTester(97);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        int[] intArray6 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int7 = multTester1.add_values(intArray6);
        multTester1.c = (short) 10;
        int int10 = multTester1.c;
        source_repo.MultTester multTester12 = new source_repo.MultTester(1);
        multTester12.c = (byte) -1;
        source_repo.MultTester multTester16 = new source_repo.MultTester((int) (short) 0);
        multTester16.c = (byte) 10;
        multTester16.c = 0;
        source_repo.MultTester multTester22 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester24 = new source_repo.MultTester((int) (short) 0);
        int[] intArray29 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int30 = multTester24.add_values(intArray29);
        int int31 = multTester22.add_values(intArray29);
        int int32 = multTester16.add_values(intArray29);
        int int33 = multTester12.add_values(intArray29);
        int int34 = multTester1.add_values(intArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 42 + "'", int30 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 42 + "'", int31 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 42 + "'", int32 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 41 + "'", int33 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        source_repo.MultTester multTester1 = new source_repo.MultTester(94);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        int[] intArray4 = new int[] { '4', (short) 1 };
        int int5 = multTester1.add_values(intArray4);
        int int6 = multTester1.c;
        source_repo.MultTester multTester8 = new source_repo.MultTester((int) (short) 0);
        multTester8.c = (byte) 10;
        multTester8.c = 0;
        source_repo.MultTester multTester14 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester16 = new source_repo.MultTester((int) (short) 0);
        int[] intArray21 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int22 = multTester16.add_values(intArray21);
        int int23 = multTester14.add_values(intArray21);
        int int24 = multTester8.add_values(intArray21);
        int int25 = multTester8.c;
        source_repo.MultTester multTester27 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester29 = new source_repo.MultTester((int) (short) 0);
        int[] intArray34 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int35 = multTester29.add_values(intArray34);
        int int36 = multTester27.add_values(intArray34);
        source_repo.MultTester multTester38 = new source_repo.MultTester(1);
        multTester38.c = (byte) -1;
        source_repo.MultTester multTester42 = new source_repo.MultTester((int) (short) 0);
        multTester42.c = (byte) 10;
        multTester42.c = 0;
        source_repo.MultTester multTester48 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester50 = new source_repo.MultTester((int) (short) 0);
        int[] intArray55 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int56 = multTester50.add_values(intArray55);
        int int57 = multTester48.add_values(intArray55);
        int int58 = multTester42.add_values(intArray55);
        int int59 = multTester38.add_values(intArray55);
        int int60 = multTester27.add_values(intArray55);
        source_repo.MultTester multTester62 = new source_repo.MultTester((int) (short) 0);
        int[] intArray67 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int68 = multTester62.add_values(intArray67);
        multTester62.c = (short) 10;
        int[] intArray76 = new int[] { 1, (short) 100, (byte) 10, (byte) 0, (byte) 0 };
        int int77 = multTester62.add_values(intArray76);
        multTester62.c = (byte) -1;
        int[] intArray82 = new int[] { (short) -1, 52 };
        int int83 = multTester62.add_values(intArray82);
        int int84 = multTester27.add_values(intArray82);
        int int85 = multTester8.add_values(intArray82);
        int int86 = multTester1.add_values(intArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 42 + "'", int5 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 42 + "'", int22 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 42 + "'", int23 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42 + "'", int24 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 42 + "'", int35 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 42 + "'", int36 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 42 + "'", int56 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 42 + "'", int57 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 42 + "'", int58 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 41 + "'", int59 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 42 + "'", int60 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 42 + "'", int68 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 52 + "'", int77 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 41 + "'", int83 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 42 + "'", int84 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 42 + "'", int85 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 42 + "'", int86 == 42);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        int[] intArray6 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int7 = multTester1.add_values(intArray6);
        source_repo.MultTester multTester9 = new source_repo.MultTester(1);
        multTester9.c = (byte) -1;
        source_repo.MultTester multTester13 = new source_repo.MultTester((int) (short) 0);
        int[] intArray18 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int19 = multTester13.add_values(intArray18);
        int int20 = multTester9.add_values(intArray18);
        int int21 = multTester1.add_values(intArray18);
        multTester1.c = 42;
        int[] intArray30 = new int[] { (byte) 0, 42, 41, 100, 42, 142 };
        int int31 = multTester1.add_values(intArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 42 + "'", int19 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 41 + "'", int20 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 84 + "'", int31 == 84);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) '4');
        int int2 = multTester1.c;
        int int3 = multTester1.c;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester3 = new source_repo.MultTester((int) (short) 0);
        int[] intArray8 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int9 = multTester3.add_values(intArray8);
        int int10 = multTester1.add_values(intArray8);
        multTester1.c = (short) 0;
        source_repo.MultTester multTester14 = new source_repo.MultTester((int) (short) 0);
        multTester14.c = (byte) 10;
        multTester14.c = 0;
        source_repo.MultTester multTester20 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester22 = new source_repo.MultTester((int) (short) 0);
        int[] intArray27 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int28 = multTester22.add_values(intArray27);
        int int29 = multTester20.add_values(intArray27);
        int int30 = multTester14.add_values(intArray27);
        int int31 = multTester14.c;
        source_repo.MultTester multTester33 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester35 = new source_repo.MultTester((int) (short) 0);
        int[] intArray40 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int41 = multTester35.add_values(intArray40);
        int int42 = multTester33.add_values(intArray40);
        source_repo.MultTester multTester44 = new source_repo.MultTester(1);
        multTester44.c = (byte) -1;
        source_repo.MultTester multTester48 = new source_repo.MultTester((int) (short) 0);
        multTester48.c = (byte) 10;
        multTester48.c = 0;
        source_repo.MultTester multTester54 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester56 = new source_repo.MultTester((int) (short) 0);
        int[] intArray61 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int62 = multTester56.add_values(intArray61);
        int int63 = multTester54.add_values(intArray61);
        int int64 = multTester48.add_values(intArray61);
        int int65 = multTester44.add_values(intArray61);
        int int66 = multTester33.add_values(intArray61);
        source_repo.MultTester multTester68 = new source_repo.MultTester((int) (short) 0);
        int[] intArray73 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int74 = multTester68.add_values(intArray73);
        multTester68.c = (short) 10;
        int[] intArray82 = new int[] { 1, (short) 100, (byte) 10, (byte) 0, (byte) 0 };
        int int83 = multTester68.add_values(intArray82);
        multTester68.c = (byte) -1;
        int[] intArray88 = new int[] { (short) -1, 52 };
        int int89 = multTester68.add_values(intArray88);
        int int90 = multTester33.add_values(intArray88);
        int int91 = multTester14.add_values(intArray88);
        int int92 = multTester1.add_values(intArray88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 42 + "'", int28 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 42 + "'", int29 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 42 + "'", int30 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 42 + "'", int41 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 42 + "'", int42 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 42 + "'", int62 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 42 + "'", int63 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 42 + "'", int64 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 41 + "'", int65 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 42 + "'", int66 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 42 + "'", int74 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 52 + "'", int83 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 41 + "'", int89 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 42 + "'", int90 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 42 + "'", int91 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 42 + "'", int92 == 42);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 10);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        multTester1.c = (byte) 10;
        multTester1.c = 0;
        source_repo.MultTester multTester7 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester9 = new source_repo.MultTester((int) (short) 0);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int15 = multTester9.add_values(intArray14);
        int int16 = multTester7.add_values(intArray14);
        int int17 = multTester1.add_values(intArray14);
        int int18 = multTester1.c;
        int[] intArray23 = new int[] { (-1), 1, '4', 52 };
        int int24 = multTester1.add_values(intArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42 + "'", int15 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 42 + "'", int16 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 42 + "'", int17 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42 + "'", int24 == 42);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester3 = new source_repo.MultTester((int) (short) 0);
        int[] intArray8 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int9 = multTester3.add_values(intArray8);
        int int10 = multTester1.add_values(intArray8);
        multTester1.c = 94;
        multTester1.c = (byte) 100;
        multTester1.c = (short) 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42 + "'", int9 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        source_repo.MultTester multTester1 = new source_repo.MultTester(1);
        multTester1.c = (byte) -1;
        multTester1.c = '#';
        source_repo.MultTester multTester7 = new source_repo.MultTester((int) (short) 0);
        int[] intArray12 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int13 = multTester7.add_values(intArray12);
        multTester7.c = (short) 10;
        int[] intArray21 = new int[] { 1, (short) 100, (byte) 10, (byte) 0, (byte) 0 };
        int int22 = multTester7.add_values(intArray21);
        multTester7.c = (byte) -1;
        int[] intArray27 = new int[] { (short) -1, 52 };
        int int28 = multTester7.add_values(intArray27);
        int int29 = multTester1.add_values(intArray27);
        source_repo.MultTester multTester31 = new source_repo.MultTester((int) (short) 0);
        int[] intArray36 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int37 = multTester31.add_values(intArray36);
        multTester31.c = (short) 10;
        int int40 = multTester31.c;
        source_repo.MultTester multTester42 = new source_repo.MultTester((int) (short) 0);
        int[] intArray47 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int48 = multTester42.add_values(intArray47);
        int int49 = multTester31.add_values(intArray47);
        int int50 = multTester1.add_values(intArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 42 + "'", int13 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 41 + "'", int28 == 41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 77 + "'", int29 == 77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 42 + "'", int37 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 42 + "'", int48 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 77 + "'", int50 == 77);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        source_repo.MultTester multTester1 = new source_repo.MultTester((int) (short) 0);
        multTester1.c = (byte) 10;
        multTester1.c = 0;
        source_repo.MultTester multTester7 = new source_repo.MultTester((int) (short) 0);
        source_repo.MultTester multTester9 = new source_repo.MultTester((int) (short) 0);
        int[] intArray14 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int15 = multTester9.add_values(intArray14);
        int int16 = multTester7.add_values(intArray14);
        int int17 = multTester1.add_values(intArray14);
        int int18 = multTester1.c;
        multTester1.c = 100;
        multTester1.c = (short) 1;
        int int23 = multTester1.c;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42 + "'", int15 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 42 + "'", int16 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 42 + "'", int17 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        source_repo.MultTester multTester1 = new source_repo.MultTester(1);
        multTester1.c = (byte) -1;
        source_repo.MultTester multTester5 = new source_repo.MultTester((int) (short) 0);
        int[] intArray10 = new int[] { (byte) 1, (short) -1, 10, '4' };
        int int11 = multTester5.add_values(intArray10);
        int int12 = multTester1.add_values(intArray10);
        multTester1.c = 52;
        multTester1.c = (byte) 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 41 + "'", int12 == 41);
    }
}

