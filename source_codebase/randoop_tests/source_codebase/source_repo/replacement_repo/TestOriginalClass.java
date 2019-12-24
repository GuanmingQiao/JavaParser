package replacement_repo;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import replacement_repo.BConverter;
import replacement_repo.EMConverter;
import replacement_repo.IORecord;
import replacement_repo.Reporter;
import replacement_repo.XMLParser;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOriginalClass {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        int int27 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList25);
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int36 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        int int41 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList39);
        replacement_repo.OriginalClass originalClass42 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass43 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        int int49 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList47);
        int int50 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList47);
        replacement_repo.OriginalClass originalClass51 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass52 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList56 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        int int58 = originalClass52.originalMethod((java.util.List<java.lang.Integer>) intList56);
        int int59 = originalClass51.originalMethod((java.util.List<java.lang.Integer>) intList56);
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        int int69 = originalClass51.originalMethod((java.util.List<java.lang.Integer>) intList67);
        replacement_repo.OriginalClass originalClass70 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList74 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        int int76 = originalClass70.originalMethod((java.util.List<java.lang.Integer>) intList74);
        int int77 = originalClass51.originalMethod((java.util.List<java.lang.Integer>) intList74);
        int int78 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList74);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList81 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        int int83 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList81);
        int int84 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 322 + "'", int27 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 200 + "'", int49 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 200 + "'", int50 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 200 + "'", int58 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 200 + "'", int59 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 322 + "'", int69 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 200 + "'", int76 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 200 + "'", int77 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 200 + "'", int78 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.util.List<java.lang.Integer> intList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = originalClass0.originalMethod(intList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        int int15 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList13);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList19 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList19, intArray18);
        int int21 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList19);
        replacement_repo.OriginalClass originalClass22 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass23 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        int int29 = originalClass23.originalMethod((java.util.List<java.lang.Integer>) intList27);
        int int30 = originalClass22.originalMethod((java.util.List<java.lang.Integer>) intList27);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        int int40 = originalClass22.originalMethod((java.util.List<java.lang.Integer>) intList38);
        int int41 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList38);
        replacement_repo.OriginalClass originalClass42 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList46 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        int int48 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList46);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        int int54 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList52);
        replacement_repo.OriginalClass originalClass55 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass56 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        int int62 = originalClass56.originalMethod((java.util.List<java.lang.Integer>) intList60);
        int int63 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList60);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        int int73 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int74 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int75 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList71);
        replacement_repo.OriginalClass originalClass76 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass77 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList81 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        int int83 = originalClass77.originalMethod((java.util.List<java.lang.Integer>) intList81);
        int int84 = originalClass76.originalMethod((java.util.List<java.lang.Integer>) intList81);
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList92 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        int int94 = originalClass76.originalMethod((java.util.List<java.lang.Integer>) intList92);
        int int95 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList92);
        int int96 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 199 + "'", int21 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 200 + "'", int30 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 322 + "'", int40 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 322 + "'", int41 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 200 + "'", int48 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 199 + "'", int54 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 200 + "'", int62 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 200 + "'", int63 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 322 + "'", int73 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 322 + "'", int74 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 322 + "'", int75 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 200 + "'", int83 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 200 + "'", int84 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 322 + "'", int94 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 322 + "'", int95 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 322 + "'", int96 == 322);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        int int18 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList16);
        replacement_repo.OriginalClass originalClass19 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList32);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        int int45 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList43);
        replacement_repo.OriginalClass originalClass46 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        int int52 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList50);
        replacement_repo.OriginalClass originalClass53 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass54 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList58 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        int int60 = originalClass54.originalMethod((java.util.List<java.lang.Integer>) intList58);
        int int61 = originalClass53.originalMethod((java.util.List<java.lang.Integer>) intList58);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList69 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        int int71 = originalClass53.originalMethod((java.util.List<java.lang.Integer>) intList69);
        int int72 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList69);
        int int73 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList69);
        int int74 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 322 + "'", int18 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 322 + "'", int45 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 200 + "'", int52 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 200 + "'", int60 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 200 + "'", int61 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 322 + "'", int71 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 322 + "'", int72 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 322 + "'", int73 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 322 + "'", int74 == 322);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        int int27 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList25);
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList32);
        replacement_repo.OriginalClass originalClass36 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray39 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList40 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList40, intArray39);
        int int42 = originalClass36.originalMethod((java.util.List<java.lang.Integer>) intList40);
        replacement_repo.OriginalClass originalClass43 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass44 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        int int50 = originalClass44.originalMethod((java.util.List<java.lang.Integer>) intList48);
        int int51 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList48);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        int int61 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList59);
        int int62 = originalClass36.originalMethod((java.util.List<java.lang.Integer>) intList59);
        replacement_repo.OriginalClass originalClass63 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass64 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList68 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        int int70 = originalClass64.originalMethod((java.util.List<java.lang.Integer>) intList68);
        int int71 = originalClass63.originalMethod((java.util.List<java.lang.Integer>) intList68);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList79 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        int int81 = originalClass63.originalMethod((java.util.List<java.lang.Integer>) intList79);
        replacement_repo.OriginalClass originalClass82 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList86 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        int int88 = originalClass82.originalMethod((java.util.List<java.lang.Integer>) intList86);
        int int89 = originalClass63.originalMethod((java.util.List<java.lang.Integer>) intList86);
        int int90 = originalClass36.originalMethod((java.util.List<java.lang.Integer>) intList86);
        int int91 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList86);
        int int92 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 322 + "'", int27 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 200 + "'", int42 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 200 + "'", int50 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 200 + "'", int51 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 322 + "'", int61 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 322 + "'", int62 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 200 + "'", int70 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 200 + "'", int71 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 322 + "'", int81 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 200 + "'", int88 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 200 + "'", int89 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 200 + "'", int90 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 200 + "'", int91 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 200 + "'", int92 == 200);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        int int12 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList10);
        replacement_repo.OriginalClass originalClass13 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        int int19 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList17);
        replacement_repo.OriginalClass originalClass20 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass21 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        int int27 = originalClass21.originalMethod((java.util.List<java.lang.Integer>) intList25);
        int int28 = originalClass20.originalMethod((java.util.List<java.lang.Integer>) intList25);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        int int38 = originalClass20.originalMethod((java.util.List<java.lang.Integer>) intList36);
        int int39 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList36);
        int int40 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList36);
        replacement_repo.OriginalClass originalClass41 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        int int47 = originalClass41.originalMethod((java.util.List<java.lang.Integer>) intList45);
        replacement_repo.OriginalClass originalClass48 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        int int54 = originalClass48.originalMethod((java.util.List<java.lang.Integer>) intList52);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList58 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        int int60 = originalClass48.originalMethod((java.util.List<java.lang.Integer>) intList58);
        replacement_repo.OriginalClass originalClass61 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass62 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        int int68 = originalClass62.originalMethod((java.util.List<java.lang.Integer>) intList66);
        int int69 = originalClass61.originalMethod((java.util.List<java.lang.Integer>) intList66);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList77 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        int int79 = originalClass61.originalMethod((java.util.List<java.lang.Integer>) intList77);
        int int80 = originalClass48.originalMethod((java.util.List<java.lang.Integer>) intList77);
        replacement_repo.OriginalClass originalClass81 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass82 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList86 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        int int88 = originalClass82.originalMethod((java.util.List<java.lang.Integer>) intList86);
        int int89 = originalClass81.originalMethod((java.util.List<java.lang.Integer>) intList86);
        int int90 = originalClass48.originalMethod((java.util.List<java.lang.Integer>) intList86);
        int int91 = originalClass41.originalMethod((java.util.List<java.lang.Integer>) intList86);
        int int92 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 199 + "'", int12 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 322 + "'", int38 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 322 + "'", int39 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 322 + "'", int40 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 200 + "'", int47 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 199 + "'", int60 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 200 + "'", int68 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 200 + "'", int69 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 322 + "'", int79 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 322 + "'", int80 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 200 + "'", int88 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 200 + "'", int89 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 200 + "'", int90 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 200 + "'", int91 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 200 + "'", int92 == 200);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        int int27 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList25);
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int36 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList32);
        replacement_repo.OriginalClass originalClass37 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass38 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        int int44 = originalClass38.originalMethod((java.util.List<java.lang.Integer>) intList42);
        int int45 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList42);
        replacement_repo.OriginalClass originalClass46 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass47 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        int int53 = originalClass47.originalMethod((java.util.List<java.lang.Integer>) intList51);
        int int54 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList51);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList62 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        int int64 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList62);
        replacement_repo.OriginalClass originalClass65 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList69 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        int int71 = originalClass65.originalMethod((java.util.List<java.lang.Integer>) intList69);
        int int72 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList69);
        int int73 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList69);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList76 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        int int78 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList76);
        int int79 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 322 + "'", int27 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 200 + "'", int44 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 200 + "'", int45 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 322 + "'", int64 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 200 + "'", int71 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 200 + "'", int72 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 200 + "'", int73 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        replacement_repo.OriginalClass originalClass7 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass8 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        int int14 = originalClass8.originalMethod((java.util.List<java.lang.Integer>) intList12);
        int int15 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList32);
        replacement_repo.OriginalClass originalClass36 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass37 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        int int43 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList41);
        int int44 = originalClass36.originalMethod((java.util.List<java.lang.Integer>) intList41);
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        int int54 = originalClass36.originalMethod((java.util.List<java.lang.Integer>) intList52);
        replacement_repo.OriginalClass originalClass55 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        int int61 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList59);
        int int62 = originalClass36.originalMethod((java.util.List<java.lang.Integer>) intList59);
        int int63 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList59);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        int int68 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList66);
        int int69 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 322 + "'", int25 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 322 + "'", int26 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 200 + "'", int43 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 200 + "'", int44 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 322 + "'", int54 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 200 + "'", int61 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 200 + "'", int62 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 200 + "'", int63 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        replacement_repo.OriginalClass originalClass7 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        int int13 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList11);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        int int19 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList17);
        replacement_repo.OriginalClass originalClass20 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass21 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        int int27 = originalClass21.originalMethod((java.util.List<java.lang.Integer>) intList25);
        int int28 = originalClass20.originalMethod((java.util.List<java.lang.Integer>) intList25);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        int int38 = originalClass20.originalMethod((java.util.List<java.lang.Integer>) intList36);
        int int39 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList36);
        replacement_repo.OriginalClass originalClass40 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        int int46 = originalClass40.originalMethod((java.util.List<java.lang.Integer>) intList44);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        int int52 = originalClass40.originalMethod((java.util.List<java.lang.Integer>) intList50);
        replacement_repo.OriginalClass originalClass53 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass54 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList58 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        int int60 = originalClass54.originalMethod((java.util.List<java.lang.Integer>) intList58);
        int int61 = originalClass53.originalMethod((java.util.List<java.lang.Integer>) intList58);
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList69 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        int int71 = originalClass53.originalMethod((java.util.List<java.lang.Integer>) intList69);
        int int72 = originalClass40.originalMethod((java.util.List<java.lang.Integer>) intList69);
        int int73 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList69);
        replacement_repo.OriginalClass originalClass74 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass75 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList79 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        int int81 = originalClass75.originalMethod((java.util.List<java.lang.Integer>) intList79);
        int int82 = originalClass74.originalMethod((java.util.List<java.lang.Integer>) intList79);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList90 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        int int92 = originalClass74.originalMethod((java.util.List<java.lang.Integer>) intList90);
        int int93 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList90);
        int int94 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 200 + "'", int13 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 199 + "'", int19 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 322 + "'", int38 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 322 + "'", int39 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 200 + "'", int46 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 199 + "'", int52 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 200 + "'", int60 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 200 + "'", int61 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 322 + "'", int71 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 322 + "'", int72 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 322 + "'", int73 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 200 + "'", int81 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 200 + "'", int82 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 322 + "'", int92 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 322 + "'", int93 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 322 + "'", int94 == 322);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        int int18 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList16);
        replacement_repo.OriginalClass originalClass19 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass26 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        int int33 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList31);
        int int34 = originalClass26.originalMethod((java.util.List<java.lang.Integer>) intList31);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        int int44 = originalClass26.originalMethod((java.util.List<java.lang.Integer>) intList42);
        int int45 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList42);
        int int46 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList42);
        replacement_repo.OriginalClass originalClass47 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass48 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        int int54 = originalClass48.originalMethod((java.util.List<java.lang.Integer>) intList52);
        int int55 = originalClass47.originalMethod((java.util.List<java.lang.Integer>) intList52);
        int int56 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 322 + "'", int18 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 200 + "'", int33 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 322 + "'", int44 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 322 + "'", int45 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 322 + "'", int46 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 200 + "'", int55 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 200 + "'", int56 == 200);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        int int12 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList10);
        replacement_repo.OriginalClass originalClass13 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass14 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        int int20 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList18);
        int int21 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList18);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        int int31 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList29);
        int int32 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList29);
        replacement_repo.OriginalClass originalClass33 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        int int39 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList37);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        int int45 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList43);
        replacement_repo.OriginalClass originalClass46 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass47 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        int int53 = originalClass47.originalMethod((java.util.List<java.lang.Integer>) intList51);
        int int54 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList51);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList62 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        int int64 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList62);
        int int65 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList62);
        int int66 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList62);
        replacement_repo.OriginalClass originalClass67 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass68 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        int int74 = originalClass68.originalMethod((java.util.List<java.lang.Integer>) intList72);
        int int75 = originalClass67.originalMethod((java.util.List<java.lang.Integer>) intList72);
        replacement_repo.OriginalClass originalClass76 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass77 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList81 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        int int83 = originalClass77.originalMethod((java.util.List<java.lang.Integer>) intList81);
        int int84 = originalClass76.originalMethod((java.util.List<java.lang.Integer>) intList81);
        int int85 = originalClass67.originalMethod((java.util.List<java.lang.Integer>) intList81);
        int int86 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList81);
        replacement_repo.OriginalClass originalClass87 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass88 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList92 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        int int94 = originalClass88.originalMethod((java.util.List<java.lang.Integer>) intList92);
        int int95 = originalClass87.originalMethod((java.util.List<java.lang.Integer>) intList92);
        int int96 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 199 + "'", int12 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 322 + "'", int31 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 322 + "'", int32 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 200 + "'", int39 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 199 + "'", int45 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 322 + "'", int64 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 322 + "'", int65 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 322 + "'", int66 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 200 + "'", int74 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 200 + "'", int75 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 200 + "'", int83 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 200 + "'", int84 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 200 + "'", int85 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 200 + "'", int86 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 200 + "'", int94 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 200 + "'", int95 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 200 + "'", int96 == 200);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        int int27 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList25);
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int36 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        int int41 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList39);
        replacement_repo.OriginalClass originalClass42 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass43 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        int int49 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList47);
        int int50 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList47);
        replacement_repo.OriginalClass originalClass51 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass52 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList56 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        int int58 = originalClass52.originalMethod((java.util.List<java.lang.Integer>) intList56);
        int int59 = originalClass51.originalMethod((java.util.List<java.lang.Integer>) intList56);
        int int60 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList56);
        int int61 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 322 + "'", int27 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 200 + "'", int49 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 200 + "'", int50 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 200 + "'", int58 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 200 + "'", int59 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 200 + "'", int60 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 200 + "'", int61 == 200);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        int int12 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList10);
        replacement_repo.OriginalClass originalClass13 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass14 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        int int20 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList18);
        int int21 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList18);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        int int31 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList29);
        int int32 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList29);
        replacement_repo.OriginalClass originalClass33 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        int int39 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList37);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        int int45 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList43);
        replacement_repo.OriginalClass originalClass46 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass47 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        int int53 = originalClass47.originalMethod((java.util.List<java.lang.Integer>) intList51);
        int int54 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList51);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList62 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        int int64 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList62);
        int int65 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList62);
        int int66 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList62);
        replacement_repo.OriginalClass originalClass67 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        int int73 = originalClass67.originalMethod((java.util.List<java.lang.Integer>) intList71);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList77 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        int int79 = originalClass67.originalMethod((java.util.List<java.lang.Integer>) intList77);
        replacement_repo.OriginalClass originalClass80 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList84 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        int int86 = originalClass80.originalMethod((java.util.List<java.lang.Integer>) intList84);
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList90 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        int int92 = originalClass80.originalMethod((java.util.List<java.lang.Integer>) intList90);
        int int93 = originalClass67.originalMethod((java.util.List<java.lang.Integer>) intList90);
        int int94 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 199 + "'", int12 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 322 + "'", int31 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 322 + "'", int32 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 200 + "'", int39 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 199 + "'", int45 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 322 + "'", int64 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 322 + "'", int65 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 322 + "'", int66 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 200 + "'", int73 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 199 + "'", int79 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 200 + "'", int86 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 199 + "'", int92 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 199 + "'", int93 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 199 + "'", int94 == 199);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        int int12 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList10);
        replacement_repo.OriginalClass originalClass13 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass14 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        int int20 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList18);
        int int21 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList18);
        int int22 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 199 + "'", int12 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        replacement_repo.OriginalClass originalClass7 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass8 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        int int14 = originalClass8.originalMethod((java.util.List<java.lang.Integer>) intList12);
        int int15 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        int int33 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList31);
        replacement_repo.OriginalClass originalClass34 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass35 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        int int41 = originalClass35.originalMethod((java.util.List<java.lang.Integer>) intList39);
        int int42 = originalClass34.originalMethod((java.util.List<java.lang.Integer>) intList39);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        int int52 = originalClass34.originalMethod((java.util.List<java.lang.Integer>) intList50);
        int int53 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList50);
        replacement_repo.OriginalClass originalClass54 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass55 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        int int61 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList59);
        int int62 = originalClass54.originalMethod((java.util.List<java.lang.Integer>) intList59);
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList70 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        int int72 = originalClass54.originalMethod((java.util.List<java.lang.Integer>) intList70);
        replacement_repo.OriginalClass originalClass73 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList77 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList77, intArray76);
        int int79 = originalClass73.originalMethod((java.util.List<java.lang.Integer>) intList77);
        int int80 = originalClass54.originalMethod((java.util.List<java.lang.Integer>) intList77);
        int int81 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList77);
        replacement_repo.OriginalClass originalClass82 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass83 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray86 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList87 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList87, intArray86);
        int int89 = originalClass83.originalMethod((java.util.List<java.lang.Integer>) intList87);
        int int90 = originalClass82.originalMethod((java.util.List<java.lang.Integer>) intList87);
        int int91 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList87);
        int int92 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 322 + "'", int25 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 322 + "'", int26 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 200 + "'", int33 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 200 + "'", int41 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 200 + "'", int42 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 322 + "'", int52 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 322 + "'", int53 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 200 + "'", int61 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 200 + "'", int62 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 322 + "'", int72 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 200 + "'", int79 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 200 + "'", int80 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 200 + "'", int81 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 200 + "'", int89 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 200 + "'", int90 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 200 + "'", int91 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 200 + "'", int92 == 200);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        replacement_repo.OriginalClass originalClass7 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass8 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        int int14 = originalClass8.originalMethod((java.util.List<java.lang.Integer>) intList12);
        int int15 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList12);
        replacement_repo.OriginalClass originalClass16 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray19 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList20 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList20, intArray19);
        int int22 = originalClass16.originalMethod((java.util.List<java.lang.Integer>) intList20);
        replacement_repo.OriginalClass originalClass23 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass24 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList28 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList28, intArray27);
        int int30 = originalClass24.originalMethod((java.util.List<java.lang.Integer>) intList28);
        int int31 = originalClass23.originalMethod((java.util.List<java.lang.Integer>) intList28);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        int int41 = originalClass23.originalMethod((java.util.List<java.lang.Integer>) intList39);
        int int42 = originalClass16.originalMethod((java.util.List<java.lang.Integer>) intList39);
        replacement_repo.OriginalClass originalClass43 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass44 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        int int50 = originalClass44.originalMethod((java.util.List<java.lang.Integer>) intList48);
        int int51 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList48);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        int int61 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList59);
        replacement_repo.OriginalClass originalClass62 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        int int68 = originalClass62.originalMethod((java.util.List<java.lang.Integer>) intList66);
        int int69 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList66);
        int int70 = originalClass16.originalMethod((java.util.List<java.lang.Integer>) intList66);
        replacement_repo.OriginalClass originalClass71 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass72 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList76 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        int int78 = originalClass72.originalMethod((java.util.List<java.lang.Integer>) intList76);
        int int79 = originalClass71.originalMethod((java.util.List<java.lang.Integer>) intList76);
        int int80 = originalClass16.originalMethod((java.util.List<java.lang.Integer>) intList76);
        int int81 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList76);
        int int82 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 200 + "'", int30 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 200 + "'", int31 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 322 + "'", int41 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 322 + "'", int42 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 200 + "'", int50 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 200 + "'", int51 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 322 + "'", int61 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 200 + "'", int68 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 200 + "'", int69 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 200 + "'", int70 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 200 + "'", int78 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 200 + "'", int79 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 200 + "'", int80 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 200 + "'", int81 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 200 + "'", int82 == 200);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        int int13 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList11);
        replacement_repo.OriginalClass originalClass14 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        int int20 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList18);
        replacement_repo.OriginalClass originalClass21 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass22 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        int int28 = originalClass22.originalMethod((java.util.List<java.lang.Integer>) intList26);
        int int29 = originalClass21.originalMethod((java.util.List<java.lang.Integer>) intList26);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        int int39 = originalClass21.originalMethod((java.util.List<java.lang.Integer>) intList37);
        int int40 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList37);
        int int41 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList37);
        replacement_repo.OriginalClass originalClass42 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList46 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        int int48 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList46);
        replacement_repo.OriginalClass originalClass49 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass50 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList54 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        int int56 = originalClass50.originalMethod((java.util.List<java.lang.Integer>) intList54);
        int int57 = originalClass49.originalMethod((java.util.List<java.lang.Integer>) intList54);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        int int67 = originalClass49.originalMethod((java.util.List<java.lang.Integer>) intList65);
        int int68 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList65);
        replacement_repo.OriginalClass originalClass69 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass70 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList74 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        int int76 = originalClass70.originalMethod((java.util.List<java.lang.Integer>) intList74);
        int int77 = originalClass69.originalMethod((java.util.List<java.lang.Integer>) intList74);
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList85 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        int int87 = originalClass69.originalMethod((java.util.List<java.lang.Integer>) intList85);
        replacement_repo.OriginalClass originalClass88 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray91 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList92 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList92, intArray91);
        int int94 = originalClass88.originalMethod((java.util.List<java.lang.Integer>) intList92);
        int int95 = originalClass69.originalMethod((java.util.List<java.lang.Integer>) intList92);
        int int96 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList92);
        int int97 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList92);
        int int98 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 199 + "'", int13 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 322 + "'", int39 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 322 + "'", int40 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 322 + "'", int41 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 200 + "'", int48 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 200 + "'", int56 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 200 + "'", int57 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 322 + "'", int67 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 322 + "'", int68 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 200 + "'", int76 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 200 + "'", int77 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 322 + "'", int87 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 200 + "'", int94 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 200 + "'", int95 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 200 + "'", int96 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 200 + "'", int97 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 200 + "'", int98 == 200);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        int int13 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList11);
        replacement_repo.OriginalClass originalClass14 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        int int20 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList18);
        replacement_repo.OriginalClass originalClass21 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass22 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        int int28 = originalClass22.originalMethod((java.util.List<java.lang.Integer>) intList26);
        int int29 = originalClass21.originalMethod((java.util.List<java.lang.Integer>) intList26);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        int int39 = originalClass21.originalMethod((java.util.List<java.lang.Integer>) intList37);
        int int40 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList37);
        int int41 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList37);
        int int42 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList37);
        java.util.List<java.lang.Integer> intList43 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int44 = originalClass0.originalMethod(intList43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 199 + "'", int13 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 322 + "'", int39 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 322 + "'", int40 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 322 + "'", int41 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 322 + "'", int42 == 322);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        int int12 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList10);
        replacement_repo.OriginalClass originalClass13 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass14 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        int int20 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList18);
        int int21 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList18);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        int int31 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList29);
        int int32 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList29);
        replacement_repo.OriginalClass originalClass33 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass34 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        int int40 = originalClass34.originalMethod((java.util.List<java.lang.Integer>) intList38);
        int int41 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList38);
        int int42 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList38);
        replacement_repo.OriginalClass originalClass43 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        int int49 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList47);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        int int55 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList53);
        replacement_repo.OriginalClass originalClass56 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass57 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass58 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList62 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        int int64 = originalClass58.originalMethod((java.util.List<java.lang.Integer>) intList62);
        int int65 = originalClass57.originalMethod((java.util.List<java.lang.Integer>) intList62);
        int int66 = originalClass56.originalMethod((java.util.List<java.lang.Integer>) intList62);
        int int67 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList62);
        int int68 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 199 + "'", int12 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 322 + "'", int31 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 322 + "'", int32 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 200 + "'", int40 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 200 + "'", int41 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 200 + "'", int42 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 200 + "'", int49 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 199 + "'", int55 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 200 + "'", int64 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 200 + "'", int65 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 200 + "'", int66 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 200 + "'", int67 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 200 + "'", int68 == 200);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        int int18 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList16);
        replacement_repo.OriginalClass originalClass19 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int36 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList32);
        replacement_repo.OriginalClass originalClass37 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass38 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        int int44 = originalClass38.originalMethod((java.util.List<java.lang.Integer>) intList42);
        int int45 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList42);
        replacement_repo.OriginalClass originalClass46 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass47 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        int int53 = originalClass47.originalMethod((java.util.List<java.lang.Integer>) intList51);
        int int54 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList51);
        int int55 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList51);
        replacement_repo.OriginalClass originalClass56 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass57 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList61 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        int int63 = originalClass57.originalMethod((java.util.List<java.lang.Integer>) intList61);
        int int64 = originalClass56.originalMethod((java.util.List<java.lang.Integer>) intList61);
        int int65 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList61);
        replacement_repo.OriginalClass originalClass66 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList70 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        int int72 = originalClass66.originalMethod((java.util.List<java.lang.Integer>) intList70);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList76 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        int int78 = originalClass66.originalMethod((java.util.List<java.lang.Integer>) intList76);
        int int79 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList76);
        int int80 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 322 + "'", int18 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 200 + "'", int44 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 200 + "'", int45 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 200 + "'", int55 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 200 + "'", int63 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 200 + "'", int64 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 200 + "'", int65 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 200 + "'", int72 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 199 + "'", int78 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 199 + "'", int79 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 199 + "'", int80 == 199);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int18 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList14);
        replacement_repo.OriginalClass originalClass19 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass20 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        int int26 = originalClass20.originalMethod((java.util.List<java.lang.Integer>) intList24);
        int int27 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList24);
        java.lang.Integer[] intArray34 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList35 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList35, intArray34);
        int int37 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList35);
        replacement_repo.OriginalClass originalClass38 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass39 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        int int45 = originalClass39.originalMethod((java.util.List<java.lang.Integer>) intList43);
        int int46 = originalClass38.originalMethod((java.util.List<java.lang.Integer>) intList43);
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList54 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        int int56 = originalClass38.originalMethod((java.util.List<java.lang.Integer>) intList54);
        int int57 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList54);
        replacement_repo.OriginalClass originalClass58 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList62 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        int int64 = originalClass58.originalMethod((java.util.List<java.lang.Integer>) intList62);
        replacement_repo.OriginalClass originalClass65 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass66 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList70 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        int int72 = originalClass66.originalMethod((java.util.List<java.lang.Integer>) intList70);
        int int73 = originalClass65.originalMethod((java.util.List<java.lang.Integer>) intList70);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList81 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        int int83 = originalClass65.originalMethod((java.util.List<java.lang.Integer>) intList81);
        int int84 = originalClass58.originalMethod((java.util.List<java.lang.Integer>) intList81);
        int int85 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList81);
        int int86 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList81);
        replacement_repo.OriginalClass originalClass87 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray90 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList91 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList91, intArray90);
        int int93 = originalClass87.originalMethod((java.util.List<java.lang.Integer>) intList91);
        int int94 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 200 + "'", int18 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 322 + "'", int37 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 200 + "'", int45 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 200 + "'", int46 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 322 + "'", int56 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 322 + "'", int57 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 200 + "'", int64 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 200 + "'", int72 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 200 + "'", int73 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 322 + "'", int83 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 322 + "'", int84 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 322 + "'", int85 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 322 + "'", int86 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 200 + "'", int93 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 200 + "'", int94 == 200);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        int int18 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList16);
        replacement_repo.OriginalClass originalClass19 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass26 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        int int33 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList31);
        int int34 = originalClass26.originalMethod((java.util.List<java.lang.Integer>) intList31);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        int int44 = originalClass26.originalMethod((java.util.List<java.lang.Integer>) intList42);
        int int45 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList42);
        int int46 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList42);
        replacement_repo.OriginalClass originalClass47 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        int int53 = originalClass47.originalMethod((java.util.List<java.lang.Integer>) intList51);
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        int int59 = originalClass47.originalMethod((java.util.List<java.lang.Integer>) intList57);
        int int60 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 322 + "'", int18 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 200 + "'", int33 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 322 + "'", int44 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 322 + "'", int45 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 322 + "'", int46 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 199 + "'", int59 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 199 + "'", int60 == 199);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int18 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList14);
        replacement_repo.OriginalClass originalClass19 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass20 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        int int26 = originalClass20.originalMethod((java.util.List<java.lang.Integer>) intList24);
        int int27 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList24);
        int int28 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList24);
        replacement_repo.OriginalClass originalClass29 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        int int35 = originalClass29.originalMethod((java.util.List<java.lang.Integer>) intList33);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        int int41 = originalClass29.originalMethod((java.util.List<java.lang.Integer>) intList39);
        int int42 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList39);
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 200 };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        int int47 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList45);
        replacement_repo.OriginalClass originalClass48 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass49 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        int int55 = originalClass49.originalMethod((java.util.List<java.lang.Integer>) intList53);
        int int56 = originalClass48.originalMethod((java.util.List<java.lang.Integer>) intList53);
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        int int66 = originalClass48.originalMethod((java.util.List<java.lang.Integer>) intList64);
        replacement_repo.OriginalClass originalClass67 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        int int73 = originalClass67.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int74 = originalClass48.originalMethod((java.util.List<java.lang.Integer>) intList71);
        replacement_repo.OriginalClass originalClass75 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass76 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList80 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        int int82 = originalClass76.originalMethod((java.util.List<java.lang.Integer>) intList80);
        int int83 = originalClass75.originalMethod((java.util.List<java.lang.Integer>) intList80);
        int int84 = originalClass48.originalMethod((java.util.List<java.lang.Integer>) intList80);
        int int85 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 200 + "'", int18 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 199 + "'", int41 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 199 + "'", int42 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 200 + "'", int47 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 200 + "'", int55 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 200 + "'", int56 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 322 + "'", int66 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 200 + "'", int73 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 200 + "'", int74 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 200 + "'", int82 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 200 + "'", int83 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 200 + "'", int84 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 200 + "'", int85 == 200);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        replacement_repo.OriginalClass originalClass7 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass8 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        int int14 = originalClass8.originalMethod((java.util.List<java.lang.Integer>) intList12);
        int int15 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        int int33 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList31);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        int int39 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList37);
        replacement_repo.OriginalClass originalClass40 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        int int46 = originalClass40.originalMethod((java.util.List<java.lang.Integer>) intList44);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        int int52 = originalClass40.originalMethod((java.util.List<java.lang.Integer>) intList50);
        int int53 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList50);
        int int54 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList50);
        replacement_repo.OriginalClass originalClass55 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        int int61 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList59);
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        int int67 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList65);
        replacement_repo.OriginalClass originalClass68 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass69 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass70 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList74 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        int int76 = originalClass70.originalMethod((java.util.List<java.lang.Integer>) intList74);
        int int77 = originalClass69.originalMethod((java.util.List<java.lang.Integer>) intList74);
        int int78 = originalClass68.originalMethod((java.util.List<java.lang.Integer>) intList74);
        int int79 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList74);
        int int80 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 322 + "'", int25 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 322 + "'", int26 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 200 + "'", int33 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 199 + "'", int39 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 200 + "'", int46 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 199 + "'", int52 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 199 + "'", int53 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 199 + "'", int54 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 200 + "'", int61 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 199 + "'", int67 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 200 + "'", int76 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 200 + "'", int77 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 200 + "'", int78 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 200 + "'", int79 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 200 + "'", int80 == 200);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        int int27 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList25);
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int36 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        int int41 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList39);
        replacement_repo.OriginalClass originalClass42 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass43 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        int int49 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList47);
        int int50 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList47);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList58 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        int int60 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList58);
        int int61 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList58);
        replacement_repo.OriginalClass originalClass62 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        int int68 = originalClass62.originalMethod((java.util.List<java.lang.Integer>) intList66);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        int int74 = originalClass62.originalMethod((java.util.List<java.lang.Integer>) intList72);
        replacement_repo.OriginalClass originalClass75 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass76 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass77 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList81 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        int int83 = originalClass77.originalMethod((java.util.List<java.lang.Integer>) intList81);
        int int84 = originalClass76.originalMethod((java.util.List<java.lang.Integer>) intList81);
        int int85 = originalClass75.originalMethod((java.util.List<java.lang.Integer>) intList81);
        int int86 = originalClass62.originalMethod((java.util.List<java.lang.Integer>) intList81);
        int int87 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 322 + "'", int27 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 200 + "'", int49 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 200 + "'", int50 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 322 + "'", int60 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 322 + "'", int61 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 200 + "'", int68 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 199 + "'", int74 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 200 + "'", int83 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 200 + "'", int84 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 200 + "'", int85 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 200 + "'", int86 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 200 + "'", int87 == 200);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        replacement_repo.OriginalClass originalClass7 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass8 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        int int14 = originalClass8.originalMethod((java.util.List<java.lang.Integer>) intList12);
        int int15 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        int int33 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList31);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        int int39 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList37);
        replacement_repo.OriginalClass originalClass40 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        int int46 = originalClass40.originalMethod((java.util.List<java.lang.Integer>) intList44);
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        int int52 = originalClass40.originalMethod((java.util.List<java.lang.Integer>) intList50);
        int int53 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList50);
        int int54 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList50);
        replacement_repo.OriginalClass originalClass55 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass56 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        int int62 = originalClass56.originalMethod((java.util.List<java.lang.Integer>) intList60);
        int int63 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList60);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        int int73 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int74 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 322 + "'", int25 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 322 + "'", int26 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 200 + "'", int33 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 199 + "'", int39 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 200 + "'", int46 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 199 + "'", int52 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 199 + "'", int53 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 199 + "'", int54 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 200 + "'", int62 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 200 + "'", int63 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 322 + "'", int73 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 322 + "'", int74 == 322);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        int int12 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList10);
        replacement_repo.OriginalClass originalClass13 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass14 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        int int20 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList18);
        int int21 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList18);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        int int31 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList29);
        int int32 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList29);
        replacement_repo.OriginalClass originalClass33 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        int int39 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList37);
        replacement_repo.OriginalClass originalClass40 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass41 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        int int47 = originalClass41.originalMethod((java.util.List<java.lang.Integer>) intList45);
        int int48 = originalClass40.originalMethod((java.util.List<java.lang.Integer>) intList45);
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList56 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        int int58 = originalClass40.originalMethod((java.util.List<java.lang.Integer>) intList56);
        int int59 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList56);
        replacement_repo.OriginalClass originalClass60 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass61 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        int int67 = originalClass61.originalMethod((java.util.List<java.lang.Integer>) intList65);
        int int68 = originalClass60.originalMethod((java.util.List<java.lang.Integer>) intList65);
        java.lang.Integer[] intArray75 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList76 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList76, intArray75);
        int int78 = originalClass60.originalMethod((java.util.List<java.lang.Integer>) intList76);
        replacement_repo.OriginalClass originalClass79 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList83 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        int int85 = originalClass79.originalMethod((java.util.List<java.lang.Integer>) intList83);
        int int86 = originalClass60.originalMethod((java.util.List<java.lang.Integer>) intList83);
        int int87 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList83);
        replacement_repo.OriginalClass originalClass88 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass89 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray92 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList93 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList93, intArray92);
        int int95 = originalClass89.originalMethod((java.util.List<java.lang.Integer>) intList93);
        int int96 = originalClass88.originalMethod((java.util.List<java.lang.Integer>) intList93);
        int int97 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList93);
        int int98 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 199 + "'", int12 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 322 + "'", int31 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 322 + "'", int32 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 200 + "'", int39 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 200 + "'", int47 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 200 + "'", int48 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 322 + "'", int58 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 322 + "'", int59 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 200 + "'", int67 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 200 + "'", int68 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 322 + "'", int78 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 200 + "'", int85 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 200 + "'", int86 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 200 + "'", int87 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 200 + "'", int95 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 200 + "'", int96 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 200 + "'", int97 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 200 + "'", int98 == 200);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int18 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList14);
        replacement_repo.OriginalClass originalClass19 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass20 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        int int26 = originalClass20.originalMethod((java.util.List<java.lang.Integer>) intList24);
        int int27 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList24);
        int int28 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList24);
        java.util.List<java.lang.Integer> intList29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = originalClass0.originalMethod(intList29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 200 + "'", int18 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        replacement_repo.OriginalClass originalClass7 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass8 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        int int14 = originalClass8.originalMethod((java.util.List<java.lang.Integer>) intList12);
        int int15 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList32);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        int int45 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList43);
        replacement_repo.OriginalClass originalClass46 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        int int52 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList50);
        int int53 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList50);
        int int54 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList50);
        replacement_repo.OriginalClass originalClass55 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass56 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        int int62 = originalClass56.originalMethod((java.util.List<java.lang.Integer>) intList60);
        int int63 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList60);
        replacement_repo.OriginalClass originalClass64 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass65 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray68 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList69 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList69, intArray68);
        int int71 = originalClass65.originalMethod((java.util.List<java.lang.Integer>) intList69);
        int int72 = originalClass64.originalMethod((java.util.List<java.lang.Integer>) intList69);
        int int73 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList69);
        replacement_repo.OriginalClass originalClass74 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass75 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList79 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        int int81 = originalClass75.originalMethod((java.util.List<java.lang.Integer>) intList79);
        int int82 = originalClass74.originalMethod((java.util.List<java.lang.Integer>) intList79);
        int int83 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList79);
        replacement_repo.OriginalClass originalClass84 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass85 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass86 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList90 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        int int92 = originalClass86.originalMethod((java.util.List<java.lang.Integer>) intList90);
        int int93 = originalClass85.originalMethod((java.util.List<java.lang.Integer>) intList90);
        int int94 = originalClass84.originalMethod((java.util.List<java.lang.Integer>) intList90);
        int int95 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList90);
        int int96 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 322 + "'", int25 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 322 + "'", int26 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 322 + "'", int45 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 200 + "'", int52 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 200 + "'", int62 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 200 + "'", int63 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 200 + "'", int71 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 200 + "'", int72 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 200 + "'", int73 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 200 + "'", int81 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 200 + "'", int82 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 200 + "'", int83 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 200 + "'", int92 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 200 + "'", int93 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 200 + "'", int94 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 200 + "'", int95 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 200 + "'", int96 == 200);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        int int18 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList16);
        replacement_repo.OriginalClass originalClass19 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList23);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        int int31 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList29);
        replacement_repo.OriginalClass originalClass32 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        int int38 = originalClass32.originalMethod((java.util.List<java.lang.Integer>) intList36);
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        int int44 = originalClass32.originalMethod((java.util.List<java.lang.Integer>) intList42);
        int int45 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList42);
        replacement_repo.OriginalClass originalClass46 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass47 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        int int53 = originalClass47.originalMethod((java.util.List<java.lang.Integer>) intList51);
        int int54 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList51);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList62 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        int int64 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList62);
        replacement_repo.OriginalClass originalClass65 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass66 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass67 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        int int73 = originalClass67.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int74 = originalClass66.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int75 = originalClass65.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int76 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int77 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int78 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 322 + "'", int18 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 199 + "'", int31 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 200 + "'", int38 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 199 + "'", int44 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 199 + "'", int45 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 322 + "'", int64 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 200 + "'", int73 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 200 + "'", int74 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 200 + "'", int75 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 200 + "'", int76 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 200 + "'", int77 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 200 + "'", int78 == 200);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        int int12 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList10);
        replacement_repo.OriginalClass originalClass13 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass14 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        int int20 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList18);
        int int21 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList18);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        int int31 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList29);
        int int32 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList29);
        replacement_repo.OriginalClass originalClass33 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass34 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        int int40 = originalClass34.originalMethod((java.util.List<java.lang.Integer>) intList38);
        int int41 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList38);
        int int42 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList38);
        replacement_repo.OriginalClass originalClass43 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass44 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        int int50 = originalClass44.originalMethod((java.util.List<java.lang.Integer>) intList48);
        int int51 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList48);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        int int61 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList59);
        replacement_repo.OriginalClass originalClass62 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        int int68 = originalClass62.originalMethod((java.util.List<java.lang.Integer>) intList66);
        int int69 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList66);
        replacement_repo.OriginalClass originalClass70 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass71 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList75 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        int int77 = originalClass71.originalMethod((java.util.List<java.lang.Integer>) intList75);
        int int78 = originalClass70.originalMethod((java.util.List<java.lang.Integer>) intList75);
        int int79 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList75);
        int int80 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 199 + "'", int12 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 322 + "'", int31 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 322 + "'", int32 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 200 + "'", int40 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 200 + "'", int41 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 200 + "'", int42 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 200 + "'", int50 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 200 + "'", int51 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 322 + "'", int61 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 200 + "'", int68 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 200 + "'", int69 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 200 + "'", int77 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 200 + "'", int78 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 200 + "'", int79 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 200 + "'", int80 == 200);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        int int12 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList10);
        replacement_repo.OriginalClass originalClass13 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        int int19 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList17);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList32);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        int int45 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList43);
        replacement_repo.OriginalClass originalClass46 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        int int52 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList50);
        int int53 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList50);
        int int54 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList50);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 322, (-1), 100, 200 };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        int int62 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 199 + "'", int12 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 199 + "'", int25 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 199 + "'", int26 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 322 + "'", int45 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 200 + "'", int52 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 621 + "'", int62 == 621);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        int int27 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList25);
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int36 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList32);
        replacement_repo.OriginalClass originalClass37 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass38 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        int int44 = originalClass38.originalMethod((java.util.List<java.lang.Integer>) intList42);
        int int45 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList42);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        int int55 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList53);
        replacement_repo.OriginalClass originalClass56 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass57 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray60 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList61 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList61, intArray60);
        int int63 = originalClass57.originalMethod((java.util.List<java.lang.Integer>) intList61);
        int int64 = originalClass56.originalMethod((java.util.List<java.lang.Integer>) intList61);
        java.lang.Integer[] intArray71 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList72 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList72, intArray71);
        int int74 = originalClass56.originalMethod((java.util.List<java.lang.Integer>) intList72);
        int int75 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList72);
        int int76 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 322 + "'", int27 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 200 + "'", int44 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 200 + "'", int45 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 322 + "'", int55 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 200 + "'", int63 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 200 + "'", int64 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 322 + "'", int74 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 322 + "'", int75 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 322 + "'", int76 == 322);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        int int18 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList16);
        replacement_repo.OriginalClass originalClass19 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray30 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList31 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList31, intArray30);
        int int33 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList31);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        int int39 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList37);
        int int40 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList37);
        replacement_repo.OriginalClass originalClass41 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass42 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList46 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        int int48 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList46);
        int int49 = originalClass41.originalMethod((java.util.List<java.lang.Integer>) intList46);
        replacement_repo.OriginalClass originalClass50 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass51 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        int int57 = originalClass51.originalMethod((java.util.List<java.lang.Integer>) intList55);
        int int58 = originalClass50.originalMethod((java.util.List<java.lang.Integer>) intList55);
        int int59 = originalClass41.originalMethod((java.util.List<java.lang.Integer>) intList55);
        replacement_repo.OriginalClass originalClass60 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass61 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        int int67 = originalClass61.originalMethod((java.util.List<java.lang.Integer>) intList65);
        int int68 = originalClass60.originalMethod((java.util.List<java.lang.Integer>) intList65);
        int int69 = originalClass41.originalMethod((java.util.List<java.lang.Integer>) intList65);
        replacement_repo.OriginalClass originalClass70 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray73 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList74 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList74, intArray73);
        int int76 = originalClass70.originalMethod((java.util.List<java.lang.Integer>) intList74);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList80 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList80, intArray79);
        int int82 = originalClass70.originalMethod((java.util.List<java.lang.Integer>) intList80);
        int int83 = originalClass41.originalMethod((java.util.List<java.lang.Integer>) intList80);
        java.lang.Integer[] intArray85 = new java.lang.Integer[] { 200 };
        java.util.ArrayList<java.lang.Integer> intList86 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList86, intArray85);
        int int88 = originalClass41.originalMethod((java.util.List<java.lang.Integer>) intList86);
        int int89 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 322 + "'", int18 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 200 + "'", int33 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 199 + "'", int39 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 199 + "'", int40 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 200 + "'", int48 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 200 + "'", int49 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 200 + "'", int57 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 200 + "'", int58 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 200 + "'", int59 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 200 + "'", int67 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 200 + "'", int68 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 200 + "'", int69 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 200 + "'", int76 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 199 + "'", int82 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 199 + "'", int83 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 200 + "'", int88 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 200 + "'", int89 == 200);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        replacement_repo.OriginalClass originalClass7 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        int int13 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList11);
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        int int19 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList17);
        replacement_repo.OriginalClass originalClass20 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass21 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        int int27 = originalClass21.originalMethod((java.util.List<java.lang.Integer>) intList25);
        int int28 = originalClass20.originalMethod((java.util.List<java.lang.Integer>) intList25);
        java.lang.Integer[] intArray35 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList36 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList36, intArray35);
        int int38 = originalClass20.originalMethod((java.util.List<java.lang.Integer>) intList36);
        int int39 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList36);
        replacement_repo.OriginalClass originalClass40 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass41 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        int int47 = originalClass41.originalMethod((java.util.List<java.lang.Integer>) intList45);
        int int48 = originalClass40.originalMethod((java.util.List<java.lang.Integer>) intList45);
        int int49 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList45);
        int int50 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList45);
        replacement_repo.OriginalClass originalClass51 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass52 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass53 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        int int59 = originalClass53.originalMethod((java.util.List<java.lang.Integer>) intList57);
        int int60 = originalClass52.originalMethod((java.util.List<java.lang.Integer>) intList57);
        int int61 = originalClass51.originalMethod((java.util.List<java.lang.Integer>) intList57);
        int int62 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 200 + "'", int13 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 199 + "'", int19 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 322 + "'", int38 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 322 + "'", int39 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 200 + "'", int47 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 200 + "'", int48 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 200 + "'", int49 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 200 + "'", int50 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 200 + "'", int59 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 200 + "'", int60 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 200 + "'", int61 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 200 + "'", int62 == 200);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        int int12 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList10);
        replacement_repo.OriginalClass originalClass13 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass14 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        int int20 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList18);
        int int21 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList18);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        int int31 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList29);
        int int32 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList29);
        replacement_repo.OriginalClass originalClass33 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        int int39 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList37);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        int int45 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList43);
        replacement_repo.OriginalClass originalClass46 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass47 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        int int53 = originalClass47.originalMethod((java.util.List<java.lang.Integer>) intList51);
        int int54 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList51);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList62 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        int int64 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList62);
        int int65 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList62);
        int int66 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList62);
        replacement_repo.OriginalClass originalClass67 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        int int73 = originalClass67.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int74 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 199 + "'", int12 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 322 + "'", int31 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 322 + "'", int32 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 200 + "'", int39 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 199 + "'", int45 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 322 + "'", int64 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 322 + "'", int65 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 322 + "'", int66 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 200 + "'", int73 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 200 + "'", int74 == 200);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        replacement_repo.OriginalClass originalClass7 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass8 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray11 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList12 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList12, intArray11);
        int int14 = originalClass8.originalMethod((java.util.List<java.lang.Integer>) intList12);
        int int15 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList12);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass7.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList32);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        int int45 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList43);
        replacement_repo.OriginalClass originalClass46 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray49 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList50 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList50, intArray49);
        int int52 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList50);
        int int53 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList50);
        int int54 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList50);
        java.util.List<java.lang.Integer> intList55 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int56 = originalClass0.originalMethod(intList55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 322 + "'", int25 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 322 + "'", int26 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 322 + "'", int45 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 200 + "'", int52 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        int int13 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList11);
        replacement_repo.OriginalClass originalClass14 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        int int20 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList18);
        replacement_repo.OriginalClass originalClass21 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass22 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray25 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList26 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList26, intArray25);
        int int28 = originalClass22.originalMethod((java.util.List<java.lang.Integer>) intList26);
        int int29 = originalClass21.originalMethod((java.util.List<java.lang.Integer>) intList26);
        java.lang.Integer[] intArray36 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList37 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList37, intArray36);
        int int39 = originalClass21.originalMethod((java.util.List<java.lang.Integer>) intList37);
        int int40 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList37);
        int int41 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList37);
        int int42 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList37);
        replacement_repo.OriginalClass originalClass43 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass44 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray47 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList48 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList48, intArray47);
        int int50 = originalClass44.originalMethod((java.util.List<java.lang.Integer>) intList48);
        int int51 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList48);
        replacement_repo.OriginalClass originalClass52 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass53 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray56 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList57 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList57, intArray56);
        int int59 = originalClass53.originalMethod((java.util.List<java.lang.Integer>) intList57);
        int int60 = originalClass52.originalMethod((java.util.List<java.lang.Integer>) intList57);
        int int61 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList57);
        replacement_repo.OriginalClass originalClass62 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass63 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        int int69 = originalClass63.originalMethod((java.util.List<java.lang.Integer>) intList67);
        int int70 = originalClass62.originalMethod((java.util.List<java.lang.Integer>) intList67);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList78 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        int int80 = originalClass62.originalMethod((java.util.List<java.lang.Integer>) intList78);
        replacement_repo.OriginalClass originalClass81 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray84 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList85 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList85, intArray84);
        int int87 = originalClass81.originalMethod((java.util.List<java.lang.Integer>) intList85);
        int int88 = originalClass62.originalMethod((java.util.List<java.lang.Integer>) intList85);
        int int89 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList85);
        int int90 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 199 + "'", int13 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 322 + "'", int39 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 322 + "'", int40 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 322 + "'", int41 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 322 + "'", int42 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 200 + "'", int50 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 200 + "'", int51 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 200 + "'", int59 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 200 + "'", int60 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 200 + "'", int61 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 200 + "'", int69 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 200 + "'", int70 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 322 + "'", int80 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 200 + "'", int87 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 200 + "'", int88 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 200 + "'", int89 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 200 + "'", int90 == 200);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        int int18 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList16);
        replacement_repo.OriginalClass originalClass19 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int36 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList32);
        replacement_repo.OriginalClass originalClass37 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray40 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList41 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList41, intArray40);
        int int43 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList41);
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        int int49 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList47);
        replacement_repo.OriginalClass originalClass50 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass51 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray54 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList55 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList55, intArray54);
        int int57 = originalClass51.originalMethod((java.util.List<java.lang.Integer>) intList55);
        int int58 = originalClass50.originalMethod((java.util.List<java.lang.Integer>) intList55);
        java.lang.Integer[] intArray65 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList66 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList66, intArray65);
        int int68 = originalClass50.originalMethod((java.util.List<java.lang.Integer>) intList66);
        int int69 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList66);
        int int70 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList66);
        replacement_repo.OriginalClass originalClass71 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray74 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList75 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList75, intArray74);
        int int77 = originalClass71.originalMethod((java.util.List<java.lang.Integer>) intList75);
        java.lang.Integer[] intArray80 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList81 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList81, intArray80);
        int int83 = originalClass71.originalMethod((java.util.List<java.lang.Integer>) intList81);
        replacement_repo.OriginalClass originalClass84 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass85 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass86 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray89 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList90 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList90, intArray89);
        int int92 = originalClass86.originalMethod((java.util.List<java.lang.Integer>) intList90);
        int int93 = originalClass85.originalMethod((java.util.List<java.lang.Integer>) intList90);
        int int94 = originalClass84.originalMethod((java.util.List<java.lang.Integer>) intList90);
        int int95 = originalClass71.originalMethod((java.util.List<java.lang.Integer>) intList90);
        int int96 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 322 + "'", int18 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 200 + "'", int43 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 199 + "'", int49 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 200 + "'", int57 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 200 + "'", int58 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 322 + "'", int68 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 322 + "'", int69 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 322 + "'", int70 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 200 + "'", int77 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 199 + "'", int83 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 200 + "'", int92 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 200 + "'", int93 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 200 + "'", int94 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 200 + "'", int95 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 200 + "'", int96 == 200);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        int int27 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList25);
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass29 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        int int35 = originalClass29.originalMethod((java.util.List<java.lang.Integer>) intList33);
        int int36 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList33);
        java.lang.Integer[] intArray43 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList44 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList44, intArray43);
        int int46 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList44);
        int int47 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList44);
        replacement_repo.OriginalClass originalClass48 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        int int54 = originalClass48.originalMethod((java.util.List<java.lang.Integer>) intList52);
        replacement_repo.OriginalClass originalClass55 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass56 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        int int62 = originalClass56.originalMethod((java.util.List<java.lang.Integer>) intList60);
        int int63 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList60);
        java.lang.Integer[] intArray70 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList71 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList71, intArray70);
        int int73 = originalClass55.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int74 = originalClass48.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int75 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList71);
        int int76 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 322 + "'", int27 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 322 + "'", int46 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 322 + "'", int47 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 200 + "'", int62 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 200 + "'", int63 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 322 + "'", int73 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 322 + "'", int74 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 322 + "'", int75 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 322 + "'", int76 == 322);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        java.lang.Integer[] intArray15 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList16 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList16, intArray15);
        int int18 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList16);
        replacement_repo.OriginalClass originalClass19 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int36 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList32);
        replacement_repo.OriginalClass originalClass37 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass38 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray41 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList42 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList42, intArray41);
        int int44 = originalClass38.originalMethod((java.util.List<java.lang.Integer>) intList42);
        int int45 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList42);
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        int int55 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList53);
        replacement_repo.OriginalClass originalClass56 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        int int62 = originalClass56.originalMethod((java.util.List<java.lang.Integer>) intList60);
        replacement_repo.OriginalClass originalClass63 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass64 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList68 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        int int70 = originalClass64.originalMethod((java.util.List<java.lang.Integer>) intList68);
        int int71 = originalClass63.originalMethod((java.util.List<java.lang.Integer>) intList68);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList79 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        int int81 = originalClass63.originalMethod((java.util.List<java.lang.Integer>) intList79);
        int int82 = originalClass56.originalMethod((java.util.List<java.lang.Integer>) intList79);
        int int83 = originalClass37.originalMethod((java.util.List<java.lang.Integer>) intList79);
        int int84 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList79);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { (-1), 199, (-1) };
        java.util.ArrayList<java.lang.Integer> intList89 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        int int91 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList89);
        java.util.List<java.lang.Integer> intList92 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int93 = originalClass0.originalMethod(intList92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 322 + "'", int18 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 200 + "'", int44 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 200 + "'", int45 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 322 + "'", int55 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 200 + "'", int62 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 200 + "'", int70 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 200 + "'", int71 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 322 + "'", int81 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 322 + "'", int82 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 322 + "'", int83 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 322 + "'", int84 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 197 + "'", int91 == 197);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        int int12 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList10);
        replacement_repo.OriginalClass originalClass13 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        int int19 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList17);
        java.lang.Integer[] intArray22 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList23 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList23, intArray22);
        int int25 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList23);
        int int26 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList23);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList32);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        int int45 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList43);
        replacement_repo.OriginalClass originalClass46 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass47 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass48 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray51 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList52 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList52, intArray51);
        int int54 = originalClass48.originalMethod((java.util.List<java.lang.Integer>) intList52);
        int int55 = originalClass47.originalMethod((java.util.List<java.lang.Integer>) intList52);
        int int56 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList52);
        int int57 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList52);
        int int58 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList52);
        replacement_repo.OriginalClass originalClass59 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass60 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray63 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList64 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList64, intArray63);
        int int66 = originalClass60.originalMethod((java.util.List<java.lang.Integer>) intList64);
        int int67 = originalClass59.originalMethod((java.util.List<java.lang.Integer>) intList64);
        replacement_repo.OriginalClass originalClass68 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass69 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList73 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        int int75 = originalClass69.originalMethod((java.util.List<java.lang.Integer>) intList73);
        int int76 = originalClass68.originalMethod((java.util.List<java.lang.Integer>) intList73);
        int int77 = originalClass59.originalMethod((java.util.List<java.lang.Integer>) intList73);
        replacement_repo.OriginalClass originalClass78 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass79 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray82 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList83 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList83, intArray82);
        int int85 = originalClass79.originalMethod((java.util.List<java.lang.Integer>) intList83);
        int int86 = originalClass78.originalMethod((java.util.List<java.lang.Integer>) intList83);
        int int87 = originalClass59.originalMethod((java.util.List<java.lang.Integer>) intList83);
        int int88 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 199 + "'", int12 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 199 + "'", int25 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 199 + "'", int26 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 322 + "'", int45 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 200 + "'", int55 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 200 + "'", int56 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 200 + "'", int57 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 200 + "'", int58 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 200 + "'", int66 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 200 + "'", int67 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 200 + "'", int75 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 200 + "'", int76 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 200 + "'", int77 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 200 + "'", int85 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 200 + "'", int86 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 200 + "'", int87 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 200 + "'", int88 == 200);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        int int27 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList25);
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int36 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        int int41 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList39);
        replacement_repo.OriginalClass originalClass42 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass43 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        int int49 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList47);
        int int50 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList47);
        java.lang.Integer[] intArray57 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList58 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList58, intArray57);
        int int60 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList58);
        replacement_repo.OriginalClass originalClass61 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray64 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList65 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList65, intArray64);
        int int67 = originalClass61.originalMethod((java.util.List<java.lang.Integer>) intList65);
        replacement_repo.OriginalClass originalClass68 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass69 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray72 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList73 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList73, intArray72);
        int int75 = originalClass69.originalMethod((java.util.List<java.lang.Integer>) intList73);
        int int76 = originalClass68.originalMethod((java.util.List<java.lang.Integer>) intList73);
        java.lang.Integer[] intArray83 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList84 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList84, intArray83);
        int int86 = originalClass68.originalMethod((java.util.List<java.lang.Integer>) intList84);
        int int87 = originalClass61.originalMethod((java.util.List<java.lang.Integer>) intList84);
        int int88 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList84);
        int int89 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList84);
        java.util.List<java.lang.Integer> intList90 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int91 = originalClass0.originalMethod(intList90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 322 + "'", int27 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 200 + "'", int49 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 200 + "'", int50 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 322 + "'", int60 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 200 + "'", int67 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 200 + "'", int75 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 200 + "'", int76 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 322 + "'", int86 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 322 + "'", int87 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 322 + "'", int88 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 322 + "'", int89 == 322);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass2 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        int int8 = originalClass2.originalMethod((java.util.List<java.lang.Integer>) intList6);
        int int9 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList6);
        int int10 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList6);
        replacement_repo.OriginalClass originalClass11 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass12 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass13 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray16 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList17 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList17, intArray16);
        int int19 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList17);
        int int20 = originalClass12.originalMethod((java.util.List<java.lang.Integer>) intList17);
        int int21 = originalClass11.originalMethod((java.util.List<java.lang.Integer>) intList17);
        replacement_repo.OriginalClass originalClass22 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass23 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        int int29 = originalClass23.originalMethod((java.util.List<java.lang.Integer>) intList27);
        int int30 = originalClass22.originalMethod((java.util.List<java.lang.Integer>) intList27);
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        int int40 = originalClass22.originalMethod((java.util.List<java.lang.Integer>) intList38);
        replacement_repo.OriginalClass originalClass41 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray44 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList45 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList45, intArray44);
        int int47 = originalClass41.originalMethod((java.util.List<java.lang.Integer>) intList45);
        int int48 = originalClass22.originalMethod((java.util.List<java.lang.Integer>) intList45);
        replacement_repo.OriginalClass originalClass49 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray52 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList53 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList53, intArray52);
        int int55 = originalClass49.originalMethod((java.util.List<java.lang.Integer>) intList53);
        java.lang.Integer[] intArray58 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList59 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList59, intArray58);
        int int61 = originalClass49.originalMethod((java.util.List<java.lang.Integer>) intList59);
        replacement_repo.OriginalClass originalClass62 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass63 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray66 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList67 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList67, intArray66);
        int int69 = originalClass63.originalMethod((java.util.List<java.lang.Integer>) intList67);
        int int70 = originalClass62.originalMethod((java.util.List<java.lang.Integer>) intList67);
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList78 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        int int80 = originalClass62.originalMethod((java.util.List<java.lang.Integer>) intList78);
        int int81 = originalClass49.originalMethod((java.util.List<java.lang.Integer>) intList78);
        int int82 = originalClass22.originalMethod((java.util.List<java.lang.Integer>) intList78);
        int int83 = originalClass11.originalMethod((java.util.List<java.lang.Integer>) intList78);
        int int84 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 200 + "'", int30 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 322 + "'", int40 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 200 + "'", int47 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 200 + "'", int48 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 200 + "'", int55 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 199 + "'", int61 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 200 + "'", int69 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 200 + "'", int70 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 322 + "'", int80 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 322 + "'", int81 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 322 + "'", int82 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 322 + "'", int83 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 322 + "'", int84 == 322);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        java.lang.Integer[] intArray24 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList25 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList25, intArray24);
        int int27 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList25);
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int36 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList32);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        int int41 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList39);
        replacement_repo.OriginalClass originalClass42 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray45 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList46 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList46, intArray45);
        int int48 = originalClass42.originalMethod((java.util.List<java.lang.Integer>) intList46);
        int int49 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList46);
        replacement_repo.OriginalClass originalClass50 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass51 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass52 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray55 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList56 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList56, intArray55);
        int int58 = originalClass52.originalMethod((java.util.List<java.lang.Integer>) intList56);
        int int59 = originalClass51.originalMethod((java.util.List<java.lang.Integer>) intList56);
        int int60 = originalClass50.originalMethod((java.util.List<java.lang.Integer>) intList56);
        int int61 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 322 + "'", int27 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 200 + "'", int48 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 200 + "'", int49 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 200 + "'", int58 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 200 + "'", int59 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 200 + "'", int60 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 200 + "'", int61 == 200);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        int int6 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList4);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList10 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList10, intArray9);
        int int12 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList10);
        replacement_repo.OriginalClass originalClass13 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass14 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        int int20 = originalClass14.originalMethod((java.util.List<java.lang.Integer>) intList18);
        int int21 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList18);
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        int int31 = originalClass13.originalMethod((java.util.List<java.lang.Integer>) intList29);
        int int32 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList29);
        replacement_repo.OriginalClass originalClass33 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass34 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray37 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList38 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList38, intArray37);
        int int40 = originalClass34.originalMethod((java.util.List<java.lang.Integer>) intList38);
        int int41 = originalClass33.originalMethod((java.util.List<java.lang.Integer>) intList38);
        int int42 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList38);
        replacement_repo.OriginalClass originalClass43 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray46 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList47 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList47, intArray46);
        int int49 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList47);
        replacement_repo.OriginalClass originalClass50 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray53 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList54 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList54, intArray53);
        int int56 = originalClass50.originalMethod((java.util.List<java.lang.Integer>) intList54);
        java.lang.Integer[] intArray59 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList60 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList60, intArray59);
        int int62 = originalClass50.originalMethod((java.util.List<java.lang.Integer>) intList60);
        replacement_repo.OriginalClass originalClass63 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass64 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray67 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList68 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList68, intArray67);
        int int70 = originalClass64.originalMethod((java.util.List<java.lang.Integer>) intList68);
        int int71 = originalClass63.originalMethod((java.util.List<java.lang.Integer>) intList68);
        java.lang.Integer[] intArray78 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList79 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList79, intArray78);
        int int81 = originalClass63.originalMethod((java.util.List<java.lang.Integer>) intList79);
        int int82 = originalClass50.originalMethod((java.util.List<java.lang.Integer>) intList79);
        replacement_repo.OriginalClass originalClass83 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass84 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray87 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList88 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList88, intArray87);
        int int90 = originalClass84.originalMethod((java.util.List<java.lang.Integer>) intList88);
        int int91 = originalClass83.originalMethod((java.util.List<java.lang.Integer>) intList88);
        int int92 = originalClass50.originalMethod((java.util.List<java.lang.Integer>) intList88);
        int int93 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList88);
        int int94 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList88);
        java.util.List<java.lang.Integer> intList95 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int96 = originalClass0.originalMethod(intList95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 199 + "'", int12 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 322 + "'", int31 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 322 + "'", int32 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 200 + "'", int40 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 200 + "'", int41 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 200 + "'", int42 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 200 + "'", int49 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 200 + "'", int56 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 199 + "'", int62 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 200 + "'", int70 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 200 + "'", int71 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 322 + "'", int81 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 322 + "'", int82 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 200 + "'", int90 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 200 + "'", int91 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 200 + "'", int92 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 200 + "'", int93 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 200 + "'", int94 == 200);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        int int8 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass10 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList14 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList14, intArray13);
        int int16 = originalClass10.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int17 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList14);
        int int18 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList14);
        replacement_repo.OriginalClass originalClass19 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass20 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray23 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList24 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList24, intArray23);
        int int26 = originalClass20.originalMethod((java.util.List<java.lang.Integer>) intList24);
        int int27 = originalClass19.originalMethod((java.util.List<java.lang.Integer>) intList24);
        int int28 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList24);
        replacement_repo.OriginalClass originalClass29 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray32 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList33 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList33, intArray32);
        int int35 = originalClass29.originalMethod((java.util.List<java.lang.Integer>) intList33);
        java.lang.Integer[] intArray38 = new java.lang.Integer[] { 200, (-1) };
        java.util.ArrayList<java.lang.Integer> intList39 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList39, intArray38);
        int int41 = originalClass29.originalMethod((java.util.List<java.lang.Integer>) intList39);
        int int42 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList39);
        replacement_repo.OriginalClass originalClass43 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass44 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass45 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray48 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList49 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList49, intArray48);
        int int51 = originalClass45.originalMethod((java.util.List<java.lang.Integer>) intList49);
        int int52 = originalClass44.originalMethod((java.util.List<java.lang.Integer>) intList49);
        int int53 = originalClass43.originalMethod((java.util.List<java.lang.Integer>) intList49);
        int int54 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 200 + "'", int18 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 199 + "'", int41 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 199 + "'", int42 == 199);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 200 + "'", int51 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 200 + "'", int52 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        replacement_repo.OriginalClass originalClass0 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass1 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        int int7 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList5);
        replacement_repo.OriginalClass originalClass8 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass9 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray12 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList13 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList13, intArray12);
        int int15 = originalClass9.originalMethod((java.util.List<java.lang.Integer>) intList13);
        int int16 = originalClass8.originalMethod((java.util.List<java.lang.Integer>) intList13);
        replacement_repo.OriginalClass originalClass17 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass18 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        int int24 = originalClass18.originalMethod((java.util.List<java.lang.Integer>) intList22);
        int int25 = originalClass17.originalMethod((java.util.List<java.lang.Integer>) intList22);
        int int26 = originalClass8.originalMethod((java.util.List<java.lang.Integer>) intList22);
        replacement_repo.OriginalClass originalClass27 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass28 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray31 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList32 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList32, intArray31);
        int int34 = originalClass28.originalMethod((java.util.List<java.lang.Integer>) intList32);
        int int35 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList32);
        java.lang.Integer[] intArray42 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList43 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList43, intArray42);
        int int45 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList43);
        replacement_repo.OriginalClass originalClass46 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass47 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray50 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList51 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList51, intArray50);
        int int53 = originalClass47.originalMethod((java.util.List<java.lang.Integer>) intList51);
        int int54 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList51);
        java.lang.Integer[] intArray61 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList62 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList62, intArray61);
        int int64 = originalClass46.originalMethod((java.util.List<java.lang.Integer>) intList62);
        int int65 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList62);
        replacement_repo.OriginalClass originalClass66 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray69 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList70 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList70, intArray69);
        int int72 = originalClass66.originalMethod((java.util.List<java.lang.Integer>) intList70);
        replacement_repo.OriginalClass originalClass73 = new replacement_repo.OriginalClass();
        replacement_repo.OriginalClass originalClass74 = new replacement_repo.OriginalClass();
        java.lang.Integer[] intArray77 = new java.lang.Integer[] { 100, 100 };
        java.util.ArrayList<java.lang.Integer> intList78 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList78, intArray77);
        int int80 = originalClass74.originalMethod((java.util.List<java.lang.Integer>) intList78);
        int int81 = originalClass73.originalMethod((java.util.List<java.lang.Integer>) intList78);
        java.lang.Integer[] intArray88 = new java.lang.Integer[] { 1, 1, 10, 200, 100, 10 };
        java.util.ArrayList<java.lang.Integer> intList89 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList89, intArray88);
        int int91 = originalClass73.originalMethod((java.util.List<java.lang.Integer>) intList89);
        int int92 = originalClass66.originalMethod((java.util.List<java.lang.Integer>) intList89);
        int int93 = originalClass27.originalMethod((java.util.List<java.lang.Integer>) intList89);
        int int94 = originalClass8.originalMethod((java.util.List<java.lang.Integer>) intList89);
        int int95 = originalClass1.originalMethod((java.util.List<java.lang.Integer>) intList89);
        int int96 = originalClass0.originalMethod((java.util.List<java.lang.Integer>) intList89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 200 + "'", int24 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 322 + "'", int45 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 200 + "'", int54 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 322 + "'", int64 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 322 + "'", int65 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 200 + "'", int72 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 200 + "'", int80 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 200 + "'", int81 == 200);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 322 + "'", int91 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 322 + "'", int92 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 322 + "'", int93 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 322 + "'", int94 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 322 + "'", int95 == 322);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 322 + "'", int96 == 322);
    }
}
