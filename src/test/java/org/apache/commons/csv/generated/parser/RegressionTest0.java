package org.apache.commons.csv.generated.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 'a', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cSVParser2.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator4 = cSVParser2.spliterator();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream1 = builder0.getOutputStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: origin == null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setFile(file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setOutputStream(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path3 = builder0.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder5 = builder0.setInputStream(inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence1 = builder0.getCharSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: origin == null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        java.lang.String str5 = cSVParser2.getTrailerComment();
        long long6 = cSVParser2.getRecordNumber();
        java.util.List<java.lang.String> strList7 = cSVParser2.getHeaderNames();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setPath(path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder4 = builder0.setOutputStream(outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.File file0 = null;
        org.apache.commons.csv.CSVParser.Builder builder1 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder3 = builder1.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder5 = builder3.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset6 = builder5.getCharsetDefault();
        org.apache.commons.csv.CSVFormat cSVFormat7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(file0, charset6, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        java.lang.String str5 = cSVParser2.getTrailerComment();
        java.lang.Class<?> wildcardClass6 = cSVParser2.getClass();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        org.apache.commons.csv.CSVParser.Builder builder6 = builder4.setPath("");
        // The following exception was thrown during execution in test generation
        try {
            java.io.RandomAccessFile randomAccessFile7 = builder6.getRandomAccessFile();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        org.apache.commons.csv.CSVParser.Builder builder6 = builder4.setPath("");
        org.apache.commons.io.IORandomAccessFile iORandomAccessFile7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder8 = builder6.setRandomAccessFile(iORandomAccessFile7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder6 = builder2.setReader(reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        org.apache.commons.csv.CSVParser.Builder builder6 = builder4.setPath("");
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setReader(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.lang.CharSequence charSequence5 = builder2.getCharSequence();
        org.apache.commons.io.IORandomAccessFile iORandomAccessFile6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setRandomAccessFile(iORandomAccessFile6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + charSequence5 + "' != '" + "" + "'", charSequence5, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        java.lang.Class<?> wildcardClass6 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.csv.CSVParser.Builder builder1 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder3 = builder1.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder5 = builder3.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset6 = builder5.getCharsetDefault();
        org.apache.commons.csv.CSVFormat cSVFormat7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset6, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset5 = builder4.getCharsetDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream6 = builder4.getOutputStream();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        java.nio.file.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setPath(path1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.net.URI uRI5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder6 = builder4.setURI(uRI5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.lang.CharSequence charSequence5 = builder2.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setTrackBytes(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + charSequence5 + "' != '" + "" + "'", charSequence5, "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path6 = builder4.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = builder2.getUnchecked();
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: java.nio.file.AccessDeniedException: ");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset5 = builder4.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setTrackBytes(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Writer writer5 = builder4.getWriter();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        java.io.File file8 = builder7.getFile();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader9 = builder7.getReader();
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder9.getPath();
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder12 = builder9.setInputStream(inputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader5, cSVFormat6, (long) (-1), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: format");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setWriter(writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser2.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser2.spliterator();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader5, cSVFormat6, (long) (byte) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: format");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.io.RandomAccessFile randomAccessFile5 = builder2.getRandomAccessFile();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getFile() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setWriter(writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        java.lang.String str6 = cSVParser5.getTrailerComment();
        java.lang.String str7 = cSVParser5.getHeaderComment();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        java.lang.String str5 = cSVParser2.getTrailerComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser2.spliterator();
        boolean boolean7 = cSVParser2.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser1 = builder0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: origin == null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.io.RandomAccessFile randomAccessFile6 = builder4.getRandomAccessFile();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getFile() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        org.apache.commons.csv.CSVParser.Builder builder6 = builder4.setPath("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence7 = builder6.getCharSequence();
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = builder2.getFile();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getFile() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        boolean boolean3 = cSVParser2.hasHeaderComment();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream5 = cSVParser2.stream();
        java.lang.Class<?> wildcardClass6 = cSVParser2.getClass();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setPath("hi!");
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setOutputStream(outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList3 = cSVParser2.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser2.getHeaderMap();
        boolean boolean5 = cSVParser2.isClosed();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordList3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        java.net.URI uRI6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setURI(uRI6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSize((int) '#');
        int int11 = builder8.getBufferSize();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setRecordNumber((long) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        boolean boolean3 = cSVParser2.hasHeaderComment();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser2.iterator();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder6 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder6.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharacterOffset((long) (short) 100);
        int int11 = builder8.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder8.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder8.setCharacterOffset(0L);
        java.nio.file.Path path16 = builder8.getPath();
        org.apache.commons.csv.CSVParser.Builder builder17 = builder2.setPath(path16);
        java.io.Writer writer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder19 = builder2.setWriter(writer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8192 + "'", int11 == 8192);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder6 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder6.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharacterOffset((long) (short) 100);
        int int11 = builder8.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder8.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder8.setCharacterOffset(0L);
        java.nio.file.Path path16 = builder8.getPath();
        org.apache.commons.csv.CSVParser.Builder builder17 = builder2.setPath(path16);
        java.nio.channels.Channel channel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder19 = builder17.setChannel(channel18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8192 + "'", int11 == 8192);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser5.getHeaderMap();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser2.spliterator();
        long long6 = cSVParser2.getRecordNumber();
        java.lang.String str7 = cSVParser2.getFirstEndOfLine();
        boolean boolean8 = cSVParser2.isClosed();
        boolean boolean9 = cSVParser2.isClosed();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setBufferSize((java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request 35 exceeds maximum 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        java.io.RandomAccessFile randomAccessFile6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setRandomAccessFile(randomAccessFile6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        java.io.File file8 = builder7.getFile();
        org.apache.commons.csv.CSVParser.Builder builder9 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharacterOffset((long) (short) 100);
        int int14 = builder13.getBufferSizeDefault();
        java.nio.charset.Charset charset15 = builder13.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(file8, charset15, cSVFormat16);
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8192 + "'", int14 == 8192);
        org.junit.Assert.assertNotNull(charset15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path5 = builder4.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        java.util.function.IntUnaryOperator intUnaryOperator9 = null;
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSizeChecker(intUnaryOperator9);
        java.io.RandomAccessFile randomAccessFile11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setRandomAccessFile(randomAccessFile11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier5 = builder2.asSupplier();
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream6 = builder2.getOutputStream();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParserSupplier5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String str3 = cSVParser2.getHeaderComment();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cSVParser2.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.nio.charset.Charset charset6 = builder4.getCharset();
        int int7 = builder4.getBufferSize();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8192 + "'", int7 == 8192);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser cSVParser5 = builder2.get();
        org.apache.commons.csv.CSVParser cSVParser6 = builder2.getUnchecked();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream3 = builder0.getOutputStream();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        long long5 = cSVParser2.getCurrentLineNumber();
        long long6 = cSVParser2.getCurrentLineNumber();
        boolean boolean7 = cSVParser2.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setPath("hi!");
        java.net.URI uRI10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setURI(uRI10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader1 = builder0.getReader();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: origin == null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        java.lang.Class<?> wildcardClass4 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.io.RandomAccessFile randomAccessFile14 = builder13.getRandomAccessFile();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getFile() for String origin hi!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader5, cSVFormat6, 10L, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: format");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Writer writer6 = builder4.getWriter();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder9.getPath();
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset16 = builder13.getCharset();
        java.nio.charset.Charset charset17 = builder13.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse(path10, charset17, cSVFormat18);
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(charset17);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Writer writer5 = builder2.getWriter();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser cSVParser5 = builder2.get();
        org.apache.commons.io.IORandomAccessFile iORandomAccessFile6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setRandomAccessFile(iORandomAccessFile6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.io.Reader reader5 = builder2.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader5, cSVFormat6, 100L, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: format");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setOpenOptions(openOptionArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path12 = builder11.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        boolean boolean3 = cSVParser2.hasHeaderComment();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream5 = cSVParser2.stream();
        java.lang.String str6 = cSVParser2.getFirstEndOfLine();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordStream5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder6 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder6.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharacterOffset((long) (short) 100);
        int int11 = builder8.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder8.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder8.setCharacterOffset(0L);
        java.nio.file.Path path16 = builder8.getPath();
        org.apache.commons.csv.CSVParser.Builder builder17 = builder2.setPath(path16);
        org.apache.commons.csv.CSVParser.Builder builder18 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder18.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder22 = builder20.setCharacterOffset((long) (short) 100);
        int int23 = builder22.getBufferSizeDefault();
        java.lang.CharSequence charSequence24 = builder22.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder26 = builder22.setFile("hi!");
        java.nio.file.Path path27 = builder26.getPath();
        java.nio.charset.Charset charset28 = builder26.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser30 = org.apache.commons.csv.CSVParser.parse(path16, charset28, cSVFormat29);
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8192 + "'", int11 == 8192);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8192 + "'", int23 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence24 + "' != '" + "" + "'", charSequence24, "");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(path27);
        org.junit.Assert.assertNotNull(charset28);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset5 = builder2.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path6 = builder4.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.io.Reader reader5 = builder2.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser(reader5, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: format");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        java.io.RandomAccessFile randomAccessFile6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setRandomAccessFile(randomAccessFile6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setBufferSize((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request 8.192 exceeds maximum 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList3 = cSVParser2.getRecords();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream4 = cSVParser2.stream();
        java.util.List<java.lang.String> strList5 = cSVParser2.getHeaderNames();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream6 = cSVParser2.stream();
        java.lang.Class<?> wildcardClass7 = cSVRecordStream6.getClass();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordList3);
        org.junit.Assert.assertNotNull(cSVRecordStream4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(cSVRecordStream6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setPath("hi!");
        java.nio.file.OpenOption[] openOptionArray10 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVFormat cSVFormat11 = null;
        org.apache.commons.csv.CSVParser.Builder builder12 = builder4.setFormat(cSVFormat11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.nio.charset.Charset charset6 = builder4.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setCharset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser cSVParser5 = builder2.get();
        java.util.function.IntUnaryOperator intUnaryOperator6 = null;
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setBufferSizeChecker(intUnaryOperator6);
        java.lang.CharSequence charSequence8 = builder7.getCharSequence();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + charSequence8 + "' != '" + "" + "'", charSequence8, "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        int int7 = builder4.getBufferSizeDefault();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8192 + "'", int7 == 8192);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        java.io.InputStream inputStream11 = builder10.getInputStream();
        org.apache.commons.io.IORandomAccessFile iORandomAccessFile12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder13 = builder10.setRandomAccessFile(iORandomAccessFile12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(inputStream11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        java.io.InputStream inputStream6 = builder4.getInputStream();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(inputStream6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setFormat(cSVFormat6);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream8 = builder4.getOutputStream();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        java.nio.channels.Channel channel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setChannel(channel11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.net.URL uRL0 = null;
        org.apache.commons.csv.CSVParser.Builder builder1 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder3 = builder1.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder5 = builder3.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray6 = builder5.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder5.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset14 = builder13.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder8.setCharset(charset14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(uRL0, charset14, cSVFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(openOptionArray6);
        org.junit.Assert.assertArrayEquals(openOptionArray6, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset16 = builder13.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder17 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder19 = builder17.setCharSequence((java.lang.CharSequence) "");
        int int20 = builder17.getBufferSize();
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder25 = builder17.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder26 = builder13.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder27 = builder2.setByteArray(byteArray24);
        java.io.Writer writer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder29 = builder27.setWriter(writer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8192 + "'", int20 == 8192);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setOpenOptions(openOptionArray10);
        java.lang.CharSequence charSequence12 = builder11.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder17.getBufferSizeDefault();
        java.lang.CharSequence charSequence19 = builder17.getCharSequence();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder23 = builder17.setByteArray(byteArray22);
        java.io.InputStream inputStream24 = builder23.getInputStream();
        java.io.InputStream inputStream25 = builder23.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder26 = builder11.setInputStream(inputStream25);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream27 = builder26.getOutputStream();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: InputStreamOrigin#getPath() for ByteArrayInputStream origin java.io.ByteArrayInputStream@33206390");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        java.lang.String str6 = cSVParser5.getTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream7 = cSVParser5.stream();
        long long8 = cSVParser5.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVRecordStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        java.io.File file8 = builder7.getFile();
        org.apache.commons.csv.CSVParser.Builder builder10 = builder7.setBufferSizeMax((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader11 = builder7.getReader();
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        java.lang.String str5 = cSVParser2.getTrailerComment();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList6 = cSVParser2.getRecords();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVRecordList6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setPath("hi!");
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier12 = builder11.asSupplier();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVParserSupplier12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String str3 = cSVParser2.getHeaderComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream4 = cSVParser2.stream();
        boolean boolean5 = cSVParser2.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVRecordStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder10 = builder0.setCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser(reader5, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: format");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser2.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser2.getHeaderMap();
        boolean boolean7 = cSVParser2.hasHeaderComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser2.spliterator();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "hi!");
        java.nio.file.OpenOption[] openOptionArray14 = builder13.getOpenOptions();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(openOptionArray14);
        org.junit.Assert.assertArrayEquals(openOptionArray14, new java.nio.file.OpenOption[] {});
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder2.setOpenOptions(openOptionArray10);
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharacterOffset(9L);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        long long5 = cSVParser2.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser2.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        java.nio.file.OpenOption[] openOptionArray8 = new java.nio.file.OpenOption[] {};
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setOpenOptions(openOptionArray8);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(openOptionArray8);
        org.junit.Assert.assertArrayEquals(openOptionArray8, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser2.spliterator();
        long long6 = cSVParser2.getRecordNumber();
        java.lang.String str7 = cSVParser2.getFirstEndOfLine();
        boolean boolean8 = cSVParser2.isClosed();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream9 = cSVParser2.stream();
        long long10 = cSVParser2.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVRecordStream9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser.Builder builder9 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setCharSequence((java.lang.CharSequence) "");
        int int12 = builder9.getBufferSize();
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder17 = builder9.setByteArray(byteArray16);
        org.apache.commons.csv.CSVParser.Builder builder18 = builder8.setByteArray(byteArray16);
        java.io.Writer writer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder20 = builder8.setWriter(writer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8192 + "'", int12 == 8192);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder6 = builder2.setCharSequence(charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.net.URL uRL0 = null;
        org.apache.commons.csv.CSVParser.Builder builder1 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder3 = builder1.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder5 = builder3.setCharacterOffset((long) (short) 100);
        int int6 = builder3.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder3.setPath("");
        java.nio.charset.Charset charset9 = builder8.getCharsetDefault();
        org.apache.commons.csv.CSVFormat cSVFormat10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset9, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8192 + "'", int6 == 8192);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setPath("hi!");
        java.nio.channels.Channel channel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setChannel(channel12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        long long4 = cSVParser2.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        java.io.File file8 = builder7.getFile();
        org.apache.commons.csv.CSVParser.Builder builder10 = builder7.setBufferSizeMax((int) (byte) 10);
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        int int14 = builder11.getBufferSize();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder19 = builder11.setByteArray(byteArray18);
        org.apache.commons.csv.CSVParser.Builder builder20 = builder7.setByteArray(byteArray18);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8192 + "'", int14 == 8192);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setOpenOptions(openOptionArray10);
        java.lang.CharSequence charSequence12 = builder11.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder14 = builder11.setPath("hi!");
        org.apache.commons.io.IORandomAccessFile iORandomAccessFile15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder16 = builder11.setRandomAccessFile(iORandomAccessFile15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser2.spliterator();
        long long6 = cSVParser2.getRecordNumber();
        boolean boolean7 = cSVParser2.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = null;
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setFormat(cSVFormat8);
        java.nio.charset.Charset charset10 = builder7.getCharsetDefault();
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder12 = builder7.setWriter(writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(charset10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setWriter(writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setPath("d\001\n");
            org.junit.Assert.fail("Expected exception of type java.nio.file.InvalidPathException; message: Illegal char <?> at index 1: d??");
        } catch (java.nio.file.InvalidPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setPath("hi!");
        java.net.URI uRI12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setURI(uRI12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(reader5, cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = null;
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(reader5, cSVFormat8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser(reader5, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: format");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVParser9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.net.URL uRL0 = null;
        org.apache.commons.csv.CSVParser.Builder builder1 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder3 = builder1.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder5 = builder3.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset6 = builder3.getCharset();
        java.nio.charset.Charset charset7 = builder3.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(uRL0, charset7, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setOpenOptions(openOptionArray10);
        java.lang.CharSequence charSequence12 = builder11.getCharSequence();
        java.nio.file.Path path13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder14 = builder11.setPath(path13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.io.Reader reader5 = builder2.getReader();
        int int6 = builder2.getBufferSize();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8192 + "'", int6 == 8192);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharacterOffset((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path11 = builder8.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ByteArrayOrigin#getPath() for byte[] origin [B@204e30a2");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("d\001\n", cSVFormat1);
        org.junit.Assert.assertNotNull(cSVParser2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setFormat(cSVFormat6);
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setBufferSizeMax((int) (byte) -1);
        java.nio.charset.Charset charset10 = builder7.getCharset();
        org.apache.commons.io.IORandomAccessFile iORandomAccessFile11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder12 = builder7.setRandomAccessFile(iORandomAccessFile11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(charset10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        int int9 = builder8.getBufferSize();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder8.setTrackBytes(false);
        org.apache.commons.csv.CSVParser.Builder builder12 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder14 = builder12.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder16 = builder14.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray17 = builder16.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder19 = builder16.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder21 = builder16.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder23 = builder16.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder25 = builder23.setCharSequence((java.lang.CharSequence) "hi!");
        org.apache.commons.csv.CSVParser.Builder builder26 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder28 = builder26.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder30 = builder28.setCharacterOffset((long) (short) 100);
        int int31 = builder28.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder33 = builder28.setPath("");
        java.io.File file34 = builder33.getFile();
        org.apache.commons.csv.CSVParser.Builder builder35 = builder23.setFile(file34);
        org.apache.commons.csv.CSVParser.Builder builder36 = builder8.setFile(file34);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8192 + "'", int9 == 8192);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(openOptionArray17);
        org.junit.Assert.assertArrayEquals(openOptionArray17, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8192 + "'", int31 == 8192);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(file34);
        org.junit.Assert.assertNull("file34.getParent() == null", file34.getParent());
        org.junit.Assert.assertEquals(file34.toString(), "");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax(8192);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser.Builder builder9 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setCharSequence((java.lang.CharSequence) "");
        int int12 = builder9.getBufferSize();
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder17 = builder9.setByteArray(byteArray16);
        org.apache.commons.csv.CSVParser.Builder builder18 = builder8.setByteArray(byteArray16);
        org.apache.commons.csv.CSVParser.Builder builder20 = builder8.setCharSequence((java.lang.CharSequence) "hi!");
        org.apache.commons.csv.CSVParser.Builder builder22 = builder8.setPath("");
        java.nio.file.OpenOption[] openOptionArray23 = builder8.getOpenOptions();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8192 + "'", int12 == 8192);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(openOptionArray23);
        org.junit.Assert.assertArrayEquals(openOptionArray23, new java.nio.file.OpenOption[] {});
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder12 = builder2.setBufferSizeMax((int) (byte) 0);
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder15.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder15.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder22 = builder15.setCharacterOffset(0L);
        java.nio.file.OpenOption[] openOptionArray23 = builder15.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder24 = builder12.setOpenOptions(openOptionArray23);
        java.io.RandomAccessFile randomAccessFile25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder26 = builder12.setRandomAccessFile(randomAccessFile25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(openOptionArray23);
        org.junit.Assert.assertArrayEquals(openOptionArray23, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.lang.CharSequence charSequence5 = builder2.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder6 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder6.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharacterOffset((long) (short) 100);
        int int11 = builder10.getBufferSizeDefault();
        java.lang.CharSequence charSequence12 = builder10.getCharSequence();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder16 = builder10.setByteArray(byteArray15);
        java.io.InputStream inputStream17 = builder16.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder18 = builder2.setInputStream(inputStream17);
        int int19 = builder2.getBufferSize();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + charSequence5 + "' != '" + "" + "'", charSequence5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8192 + "'", int11 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8192 + "'", int19 == 8192);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSize((java.lang.Integer) 0);
        java.io.RandomAccessFile randomAccessFile11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setRandomAccessFile(randomAccessFile11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        java.util.function.IntUnaryOperator intUnaryOperator9 = null;
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSizeChecker(intUnaryOperator9);
        org.apache.commons.csv.CSVParser cSVParser11 = builder8.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVParser11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        org.apache.commons.csv.CSVParser.Builder builder6 = builder4.setPath("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset16 = builder13.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder17 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder19 = builder17.setCharSequence((java.lang.CharSequence) "");
        int int20 = builder17.getBufferSize();
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder25 = builder17.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder26 = builder13.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder27 = builder2.setByteArray(byteArray24);
        java.net.URI uRI28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder29 = builder27.setURI(uRI28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8192 + "'", int20 == 8192);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = builder2.getUnchecked();
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: java.nio.file.AccessDeniedException: ");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder12 = builder2.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset13 = builder2.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder2.setPath("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence16 = builder2.getCharSequence();
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        boolean boolean5 = cSVParser2.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList3 = cSVParser2.getRecords();
        java.lang.String str4 = cSVParser2.getTrailerComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordList3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        java.nio.file.OpenOption[] openOptionArray8 = builder4.getOpenOptions();
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier9 = builder4.asSupplier();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(openOptionArray8);
        org.junit.Assert.assertArrayEquals(openOptionArray8, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(cSVParserSupplier9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        java.lang.String str5 = cSVParser2.getTrailerComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cSVParser2.getHeaderMap();
        java.lang.String str4 = cSVParser2.getTrailerComment();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser2.iterator();
        long long6 = cSVParser2.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        java.lang.String str5 = cSVParser2.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser2.getHeaderMap();
        boolean boolean7 = cSVParser2.hasTrailerComment();
        java.lang.String str8 = cSVParser2.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.csv.CSVParser.Builder builder1 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder3 = builder1.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder5 = builder3.setRecordNumber(10L);
        java.lang.CharSequence charSequence6 = builder3.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder7 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setCharacterOffset((long) (short) 100);
        int int12 = builder11.getBufferSizeDefault();
        java.lang.CharSequence charSequence13 = builder11.getCharSequence();
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder17 = builder11.setByteArray(byteArray16);
        java.io.InputStream inputStream18 = builder17.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder19 = builder3.setInputStream(inputStream18);
        org.apache.commons.csv.CSVParser.Builder builder20 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder22 = builder20.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder24 = builder22.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray25 = builder24.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder27 = builder24.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder28 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder30 = builder28.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder32 = builder30.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset33 = builder32.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder34 = builder27.setCharset(charset33);
        org.apache.commons.csv.CSVFormat cSVFormat35 = null;
        org.apache.commons.csv.CSVParser cSVParser36 = org.apache.commons.csv.CSVParser.parse(inputStream18, charset33, cSVFormat35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser38 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset33, cSVFormat37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8192 + "'", int12 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(openOptionArray25);
        org.junit.Assert.assertArrayEquals(openOptionArray25, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(cSVParser36);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        boolean boolean3 = cSVParser2.hasHeaderComment();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser2.getRecords();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder8 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder15.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder15.setPath("");
        java.io.File file21 = builder20.getFile();
        org.apache.commons.csv.CSVParser.Builder builder22 = builder10.setFile(file21);
        org.apache.commons.csv.CSVParser.Builder builder23 = builder7.setFile(file21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser24 = builder7.getUnchecked();
            org.junit.Assert.fail("Expected exception of type java.io.UncheckedIOException; message: java.nio.file.AccessDeniedException: ");
        } catch (java.io.UncheckedIOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNull("file21.getParent() == null", file21.getParent());
        org.junit.Assert.assertEquals(file21.toString(), "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSize((int) '#');
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setBufferSize((java.lang.Integer) 35);
        org.apache.commons.csv.CSVParser.Builder builder14 = builder10.setBufferSize((java.lang.Integer) 10);
        java.io.File file15 = builder14.getFile();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setFile("hi!");
        java.lang.CharSequence charSequence5 = null; // flaky "1) test154(org.apache.commons.csv.generated.parser.RegressionTest0)": builder2.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setBufferSize((java.lang.Integer) 0);
        java.io.OutputStream outputStream8 = builder2.getOutputStream();
        org.apache.commons.csv.CSVParser.Builder builder10 = builder2.setCharacterOffset((long) (short) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
// flaky "1) test154(org.apache.commons.csv.generated.parser.RegressionTest0)":         org.junit.Assert.assertEquals("'" + charSequence5 + "' != '" + "" + "'", charSequence5, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(outputStream8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        java.io.InputStream inputStream11 = builder10.getInputStream();
        java.io.InputStream inputStream12 = builder10.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder15.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder15.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder22 = builder15.setCharacterOffset(0L);
        java.nio.file.Path path23 = builder15.getPath();
        org.apache.commons.csv.CSVParser.Builder builder25 = builder15.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset26 = builder15.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat27 = null;
        org.apache.commons.csv.CSVParser cSVParser28 = org.apache.commons.csv.CSVParser.parse(inputStream12, charset26, cSVFormat27);
        org.apache.commons.csv.CSVParser.Builder builder29 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder31 = builder29.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder33 = builder31.setCharacterOffset((long) (short) 100);
        int int34 = builder33.getBufferSizeDefault();
        java.lang.CharSequence charSequence35 = builder33.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder37 = builder33.setFile("hi!");
        java.nio.file.Path path38 = builder37.getPath();
        java.nio.charset.Charset charset39 = builder37.getCharset();
        java.nio.charset.Charset charset40 = builder37.getCharsetDefault();
        org.apache.commons.csv.CSVFormat cSVFormat41 = null;
        org.apache.commons.csv.CSVParser cSVParser42 = org.apache.commons.csv.CSVParser.parse(inputStream12, charset40, cSVFormat41);
        org.apache.commons.csv.CSVParser.Builder builder43 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder45 = builder43.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder47 = builder45.setCharacterOffset((long) (short) 100);
        int int48 = builder45.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder50 = builder45.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder52 = builder50.setPath("hi!");
        java.io.File file53 = builder52.getFile();
        org.apache.commons.csv.CSVParser.Builder builder54 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder56 = builder54.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder58 = builder56.setRecordNumber(10L);
        java.io.Reader reader59 = builder58.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat60 = null;
        org.apache.commons.csv.CSVParser.Builder builder61 = builder58.setFormat(cSVFormat60);
        org.apache.commons.csv.CSVParser.Builder builder63 = builder61.setBufferSizeMax((int) (byte) -1);
        java.nio.charset.Charset charset64 = builder61.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat65 = null;
        org.apache.commons.csv.CSVParser cSVParser66 = null; // flaky "2) test155(org.apache.commons.csv.generated.parser.RegressionTest0)": org.apache.commons.csv.CSVParser.parse(file53, charset64, cSVFormat65);
        org.apache.commons.csv.CSVParser.Builder builder67 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder69 = builder67.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder71 = builder69.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray72 = builder71.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder74 = builder71.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder75 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder77 = builder75.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder79 = builder77.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset80 = builder79.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder81 = builder74.setCharset(charset80);
        org.apache.commons.csv.CSVFormat cSVFormat82 = null;
        org.apache.commons.csv.CSVParser cSVParser83 = org.apache.commons.csv.CSVParser.parse(file53, charset80, cSVFormat82);
        org.apache.commons.csv.CSVFormat cSVFormat84 = null;
        org.apache.commons.csv.CSVParser cSVParser85 = org.apache.commons.csv.CSVParser.parse(inputStream12, charset80, cSVFormat84);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(path23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(cSVParser28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8192 + "'", int34 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence35 + "' != '" + "" + "'", charSequence35, "");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(path38);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(cSVParser42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8192 + "'", int48 == 8192);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(file53);
        org.junit.Assert.assertNull("file53.getParent() == null", file53.getParent());
        org.junit.Assert.assertEquals(file53.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(reader59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(charset64);
// flaky "2) test155(org.apache.commons.csv.generated.parser.RegressionTest0)":         org.junit.Assert.assertNotNull(cSVParser66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(openOptionArray72);
        org.junit.Assert.assertArrayEquals(openOptionArray72, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(charset80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(cSVParser83);
        org.junit.Assert.assertNotNull(cSVParser85);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path5 = builder2.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: CharSequenceOrigin#getPath() for String origin ");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser.Builder builder9 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setCharSequence((java.lang.CharSequence) "");
        int int12 = builder9.getBufferSize();
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder17 = builder9.setByteArray(byteArray16);
        org.apache.commons.csv.CSVParser.Builder builder18 = builder8.setByteArray(byteArray16);
        org.apache.commons.csv.CSVParser.Builder builder20 = builder8.setCharSequence((java.lang.CharSequence) "hi!");
        org.apache.commons.csv.CSVParser.Builder builder22 = builder8.setCharSequence((java.lang.CharSequence) "hi!");
        org.apache.commons.csv.CSVParser.Builder builder23 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder25 = builder23.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder27 = builder25.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder28 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder30 = builder28.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder32 = builder30.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray33 = builder32.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder34 = builder25.setOpenOptions(openOptionArray33);
        org.apache.commons.csv.CSVParser.Builder builder35 = builder8.setOpenOptions(openOptionArray33);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8192 + "'", int12 == 8192);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(openOptionArray33);
        org.junit.Assert.assertArrayEquals(openOptionArray33, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setOpenOptions(openOptionArray10);
        org.apache.commons.csv.CSVParser.Builder builder13 = builder4.setCharSequence((java.lang.CharSequence) "hi!");
        java.nio.file.OpenOption[] openOptionArray14 = builder13.getOpenOptions();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(openOptionArray14);
        org.junit.Assert.assertArrayEquals(openOptionArray14, new java.nio.file.OpenOption[] {});
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        java.io.InputStream inputStream11 = builder10.getInputStream();
        java.io.InputStream inputStream12 = builder10.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder15.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder15.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder22 = builder15.setCharacterOffset(0L);
        java.nio.file.Path path23 = builder15.getPath();
        org.apache.commons.csv.CSVParser.Builder builder25 = builder15.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset26 = builder15.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat27 = null;
        org.apache.commons.csv.CSVParser cSVParser28 = org.apache.commons.csv.CSVParser.parse(inputStream12, charset26, cSVFormat27);
        org.apache.commons.csv.CSVParser.Builder builder29 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder31 = builder29.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder33 = builder31.setCharacterOffset((long) (short) 100);
        int int34 = builder33.getBufferSizeDefault();
        java.lang.CharSequence charSequence35 = builder33.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder37 = builder33.setFile("hi!");
        java.nio.file.Path path38 = builder37.getPath();
        java.nio.charset.Charset charset39 = builder37.getCharset();
        java.nio.charset.Charset charset40 = builder37.getCharsetDefault();
        org.apache.commons.csv.CSVFormat cSVFormat41 = null;
        org.apache.commons.csv.CSVParser cSVParser42 = org.apache.commons.csv.CSVParser.parse(inputStream12, charset40, cSVFormat41);
        cSVParser42.close();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(path23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(cSVParser28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8192 + "'", int34 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence35 + "' != '" + "" + "'", charSequence35, "");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(path38);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(cSVParser42);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        java.util.function.IntUnaryOperator intUnaryOperator7 = null;
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setBufferSizeChecker(intUnaryOperator7);
        java.nio.charset.Charset charset9 = null;
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharset(charset9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        boolean boolean5 = cSVParser2.hasHeaderComment();
        boolean boolean6 = cSVParser2.isClosed();
        java.util.List<java.lang.String> strList7 = cSVParser2.getHeaderNames();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(reader5, cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = null;
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(reader5, cSVFormat8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = null;
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(reader5, cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = new org.apache.commons.csv.CSVParser(reader5, cSVFormat12, (long) 10, (long) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: format");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNotNull(cSVParser11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        java.io.InputStream inputStream11 = builder10.getInputStream();
        java.io.InputStream inputStream12 = builder10.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder14 = builder10.setCharSequence((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence15 = builder14.getCharSequence();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "hi!" + "'", charSequence15, "hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.io.Reader reader5 = builder4.getReader();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        org.apache.commons.csv.CSVParser.Builder builder6 = builder2.setTrackBytes(true);
        org.apache.commons.csv.CSVParser.Builder builder8 = builder6.setCharacterOffset((long) (byte) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = null;
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setFormat(cSVFormat8);
        java.nio.charset.Charset charset10 = builder7.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder12 = builder7.setPath("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        java.lang.String str5 = cSVParser2.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser2.getHeaderMap();
        java.lang.String str7 = cSVParser2.getHeaderComment();
        java.util.List<java.lang.String> strList8 = cSVParser2.getHeaderNames();
        long long9 = cSVParser2.getRecordNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser2.spliterator();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        java.nio.file.OpenOption[] openOptionArray11 = builder4.getOpenOptions();
        org.apache.commons.io.IORandomAccessFile iORandomAccessFile12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder13 = builder4.setRandomAccessFile(iORandomAccessFile12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(openOptionArray11);
        org.junit.Assert.assertArrayEquals(openOptionArray11, new java.nio.file.OpenOption[] {});
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder2.setOpenOptions(openOptionArray10);
        org.apache.commons.io.IORandomAccessFile iORandomAccessFile12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setRandomAccessFile(iORandomAccessFile12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.io.Reader reader5 = builder2.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(reader5, cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser(reader5, cSVFormat8, (long) (byte) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: format");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(cSVParser7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder12 = builder2.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset13 = builder2.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setBufferSize((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream18 = builder15.getOutputStream();
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setCharacterOffset((long) '#');
        java.lang.CharSequence charSequence13 = builder12.getCharSequence();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "\n\001" + "'", charSequence13, "\n\001");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder11 = builder7.setCharset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset16 = builder13.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder17 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder19 = builder17.setCharSequence((java.lang.CharSequence) "");
        int int20 = builder17.getBufferSize();
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder25 = builder17.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder26 = builder13.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder27 = builder2.setByteArray(byteArray24);
        java.lang.CharSequence charSequence28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder29 = builder27.setCharSequence(charSequence28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8192 + "'", int20 == 8192);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList4 = cSVParser2.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser2.spliterator();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNotNull(cSVRecordList4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder6 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder6.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharacterOffset((long) (short) 100);
        int int11 = builder8.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder8.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder8.setCharacterOffset(0L);
        java.nio.file.Path path16 = builder8.getPath();
        org.apache.commons.csv.CSVParser.Builder builder17 = builder2.setPath(path16);
        int int18 = builder2.getBufferSizeDefault();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8192 + "'", int11 == 8192);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder12 = builder2.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset13 = builder2.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder2.setPath("");
        java.nio.channels.Channel channel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setChannel(channel16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder2.setOpenOptions(openOptionArray10);
        java.lang.CharSequence charSequence12 = builder2.getCharSequence();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setPath("hi!");
        java.io.File file10 = builder9.getFile();
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setRecordNumber(10L);
        java.io.Reader reader16 = builder15.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat17 = null;
        org.apache.commons.csv.CSVParser.Builder builder18 = builder15.setFormat(cSVFormat17);
        org.apache.commons.csv.CSVParser.Builder builder20 = builder18.setBufferSizeMax((int) (byte) -1);
        java.nio.charset.Charset charset21 = builder18.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat22 = null;
        org.apache.commons.csv.CSVParser cSVParser23 = null; // flaky "3) test179(org.apache.commons.csv.generated.parser.RegressionTest0)": org.apache.commons.csv.CSVParser.parse(file10, charset21, cSVFormat22);
// flaky "3) test179(org.apache.commons.csv.generated.parser.RegressionTest0)":         cSVParser23.close();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor25 = null; // flaky "1) test179(org.apache.commons.csv.generated.parser.RegressionTest0)": cSVParser23.iterator();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(charset21);
// flaky "1) test179(org.apache.commons.csv.generated.parser.RegressionTest0)":         org.junit.Assert.assertNotNull(cSVParser23);
// flaky "1) test179(org.apache.commons.csv.generated.parser.RegressionTest0)":         org.junit.Assert.assertNotNull(cSVRecordItor25);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cSVParser2.getHeaderMap();
        java.util.List<java.lang.String> strList4 = cSVParser2.getHeaderNames();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        java.io.File file8 = builder7.getFile();
        org.apache.commons.csv.CSVParser.Builder builder10 = builder7.setBufferSizeMax((int) (byte) 10);
        java.util.function.IntUnaryOperator intUnaryOperator11 = null;
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setBufferSizeChecker(intUnaryOperator11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList3 = cSVParser2.getRecords();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream4 = cSVParser2.stream();
        java.util.List<java.lang.String> strList5 = cSVParser2.getHeaderNames();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream6 = cSVParser2.stream();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser2.spliterator();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordList3);
        org.junit.Assert.assertNotNull(cSVRecordStream4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(cSVRecordStream6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList3 = cSVParser2.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cSVParser2.getHeaderMap();
        boolean boolean5 = cSVParser2.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordList3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.lang.Class<?> wildcardClass4 = cSVParser2.getClass();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String str3 = cSVParser2.getHeaderComment();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser2.iterator();
        long long6 = cSVParser2.getCurrentLineNumber();
        cSVParser2.close();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        java.util.function.IntUnaryOperator intUnaryOperator9 = null;
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSizeChecker(intUnaryOperator9);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Writer writer11 = builder8.getWriter();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ByteArrayOrigin#getPath() for byte[] origin [B@19352a14");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset16 = builder13.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder17 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder19 = builder17.setCharSequence((java.lang.CharSequence) "");
        int int20 = builder17.getBufferSize();
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder25 = builder17.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder26 = builder13.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder27 = builder2.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder28 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder30 = builder28.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder32 = builder30.setCharacterOffset((long) (short) 100);
        int int33 = builder32.getBufferSizeDefault();
        java.lang.CharSequence charSequence34 = builder32.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder36 = builder32.setFile("hi!");
        org.apache.commons.csv.CSVParser.Builder builder38 = builder36.setBufferSize((int) '#');
        org.apache.commons.csv.CSVParser.Builder builder40 = builder38.setBufferSize((java.lang.Integer) 35);
        java.io.OutputStream outputStream41 = builder38.getOutputStream();
        org.apache.commons.csv.CSVParser.Builder builder42 = builder2.setOutputStream(outputStream41);
        org.apache.commons.csv.CSVParser.Builder builder44 = builder42.setTrackBytes(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8192 + "'", int20 == 8192);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8192 + "'", int33 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence34 + "' != '" + "" + "'", charSequence34, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(outputStream41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        java.lang.String str6 = cSVParser5.getTrailerComment();
        boolean boolean7 = cSVParser5.hasHeaderComment();
        cSVParser5.close();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSize((int) '#');
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setBufferSize((java.lang.Integer) 35);
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier13 = builder10.asSupplier();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVParserSupplier13);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSize((int) '#');
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setBufferSize((java.lang.Integer) 35);
        org.apache.commons.csv.CSVParser.Builder builder14 = builder10.setBufferSize((java.lang.Integer) 10);
        java.lang.CharSequence charSequence15 = builder14.getCharSequence();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + charSequence15 + "' != '" + "" + "'", charSequence15, "");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser cSVParser5 = builder2.get();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSize((int) '#');
        java.io.InputStream inputStream11 = builder10.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder12 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder14 = builder12.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder16 = builder14.setRecordNumber(10L);
        java.lang.CharSequence charSequence17 = builder14.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder18 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder18.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder22 = builder20.setCharacterOffset((long) (short) 100);
        int int23 = builder22.getBufferSizeDefault();
        java.lang.CharSequence charSequence24 = builder22.getCharSequence();
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder28 = builder22.setByteArray(byteArray27);
        java.io.InputStream inputStream29 = builder28.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder30 = builder14.setInputStream(inputStream29);
        org.apache.commons.csv.CSVParser.Builder builder31 = builder10.setInputStream(inputStream29);
        java.lang.Class<?> wildcardClass32 = inputStream29.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8192 + "'", int23 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence24 + "' != '" + "" + "'", charSequence24, "");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setCharacterOffset((long) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        long long6 = cSVParser5.getRecordNumber();
        boolean boolean7 = cSVParser5.hasHeaderComment();
        java.util.List<java.lang.String> strList8 = cSVParser5.getHeaderNames();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser cSVParser9 = builder0.getUnchecked();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(cSVParser9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.nio.file.Path path0 = null;
        org.apache.commons.csv.CSVParser.Builder builder1 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder3 = builder1.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder5 = builder3.setCharacterOffset((long) (short) 100);
        int int6 = builder5.getBufferSizeDefault();
        java.lang.CharSequence charSequence7 = builder5.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder9 = builder5.setFile("hi!");
        java.nio.file.Path path10 = builder9.getPath();
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset16 = builder13.getCharset();
        java.nio.charset.Charset charset17 = builder13.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat18 = null;
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse(path10, charset17, cSVFormat18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser21 = org.apache.commons.csv.CSVParser.parse(path0, charset17, cSVFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8192 + "'", int6 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "" + "'", charSequence7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(cSVParser19);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        org.apache.commons.io.IORandomAccessFile iORandomAccessFile10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setRandomAccessFile(iORandomAccessFile10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser.Builder builder9 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setCharSequence((java.lang.CharSequence) "");
        int int12 = builder9.getBufferSize();
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder17 = builder9.setByteArray(byteArray16);
        org.apache.commons.csv.CSVParser.Builder builder18 = builder8.setByteArray(byteArray16);
        org.apache.commons.csv.CSVParser.Builder builder20 = builder8.setCharSequence((java.lang.CharSequence) "hi!");
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier21 = builder20.asSupplier();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8192 + "'", int12 == 8192);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(cSVParserSupplier21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        java.util.function.IntUnaryOperator intUnaryOperator9 = null;
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSizeChecker(intUnaryOperator9);
        java.lang.CharSequence charSequence11 = builder10.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder10.setBufferSizeMax(0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "d\001\n" + "'", charSequence11, "d\001\n");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSize((int) ' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        java.io.InputStream inputStream11 = builder10.getInputStream();
        java.io.InputStream inputStream12 = builder10.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder14 = builder10.setCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        boolean boolean3 = cSVParser2.hasHeaderComment();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream5 = cSVParser2.stream();
        long long6 = cSVParser2.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordStream5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        java.io.InputStream inputStream11 = builder10.getInputStream();
        java.io.InputStream inputStream12 = builder10.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder15.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder15.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder22 = builder15.setCharacterOffset(0L);
        java.nio.file.Path path23 = builder15.getPath();
        org.apache.commons.csv.CSVParser.Builder builder25 = builder15.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset26 = builder15.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat27 = null;
        org.apache.commons.csv.CSVParser cSVParser28 = org.apache.commons.csv.CSVParser.parse(inputStream12, charset26, cSVFormat27);
        org.apache.commons.csv.CSVParser.Builder builder29 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder31 = builder29.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder33 = builder31.setCharacterOffset((long) (short) 100);
        int int34 = builder33.getBufferSizeDefault();
        java.lang.CharSequence charSequence35 = builder33.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder37 = builder33.setFile("hi!");
        java.nio.file.Path path38 = builder37.getPath();
        java.nio.charset.Charset charset39 = builder37.getCharset();
        java.nio.charset.Charset charset40 = builder37.getCharsetDefault();
        org.apache.commons.csv.CSVFormat cSVFormat41 = null;
        org.apache.commons.csv.CSVParser cSVParser42 = org.apache.commons.csv.CSVParser.parse(inputStream12, charset40, cSVFormat41);
        boolean boolean43 = cSVParser42.hasTrailerComment();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(path23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(cSVParser28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8192 + "'", int34 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence35 + "' != '" + "" + "'", charSequence35, "");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(path38);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(cSVParser42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.OpenOption[] openOptionArray10 = builder2.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharacterOffset((long) (short) 100);
        int int16 = builder15.getBufferSizeDefault();
        java.lang.CharSequence charSequence17 = builder15.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder19 = builder15.setFile("hi!");
        java.nio.file.Path path20 = builder19.getPath();
        org.apache.commons.csv.CSVParser.Builder builder21 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder23 = builder21.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder25 = builder23.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset26 = builder23.getCharset();
        java.nio.charset.Charset charset27 = builder23.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat28 = null;
        org.apache.commons.csv.CSVParser cSVParser29 = org.apache.commons.csv.CSVParser.parse(path20, charset27, cSVFormat28);
        org.apache.commons.csv.CSVParser.Builder builder30 = builder2.setPath(path20);
        org.apache.commons.csv.CSVParser.Builder builder31 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder33 = builder31.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder35 = builder33.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset36 = builder33.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder37 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder39 = builder37.setCharSequence((java.lang.CharSequence) "");
        int int40 = builder37.getBufferSize();
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder45 = builder37.setByteArray(byteArray44);
        org.apache.commons.csv.CSVParser.Builder builder46 = builder33.setByteArray(byteArray44);
        org.apache.commons.csv.CSVParser.Builder builder47 = builder2.setByteArray(byteArray44);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8192 + "'", int16 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(path20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(cSVParser29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8192 + "'", int40 == 8192);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        java.io.InputStream inputStream11 = builder10.getInputStream();
        java.io.InputStream inputStream12 = builder10.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder15.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder15.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder22 = builder15.setCharacterOffset(0L);
        java.nio.file.Path path23 = builder15.getPath();
        org.apache.commons.csv.CSVParser.Builder builder25 = builder15.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset26 = builder15.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat27 = null;
        org.apache.commons.csv.CSVParser cSVParser28 = org.apache.commons.csv.CSVParser.parse(inputStream12, charset26, cSVFormat27);
        boolean boolean29 = cSVParser28.hasHeaderComment();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(path23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(cSVParser28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        java.nio.file.Path path9 = builder8.getPath();
        org.apache.commons.csv.CSVParser.Builder builder10 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder14 = builder12.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset15 = builder12.getCharset();
        java.nio.charset.Charset charset16 = builder12.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat17 = null;
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse(path9, charset16, cSVFormat17);
        java.lang.String str19 = cSVParser18.getTrailerComment();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        java.lang.String str6 = cSVParser5.getTrailerComment();
        boolean boolean7 = cSVParser5.hasTrailerComment();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        long long5 = cSVParser2.getCurrentLineNumber();
        boolean boolean6 = cSVParser2.isClosed();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String str3 = cSVParser2.getHeaderComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream4 = cSVParser2.stream();
        java.lang.String str5 = cSVParser2.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVRecordStream4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder8 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset13 = builder12.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder14 = builder7.setCharset(charset13);
        java.net.URI uRI15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder16 = builder7.setURI(uRI15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setOpenOptions(openOptionArray10);
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier12 = builder11.asSupplier();
        java.net.URI uRI13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder14 = builder11.setURI(uRI13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVParserSupplier12);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setPath("hi!");
        java.io.InputStream inputStream11 = builder8.getInputStream();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(inputStream11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        java.nio.file.Path path9 = builder8.getPath();
        java.nio.charset.Charset charset10 = builder8.getCharset();
        java.nio.charset.Charset charset11 = builder8.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder8.setTrackBytes(true);
        java.io.Reader reader14 = builder13.getReader();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(reader14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.lang.CharSequence charSequence5 = builder2.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setTrackBytes(false);
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier8 = builder2.asSupplier();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + charSequence5 + "' != '" + "" + "'", charSequence5, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(cSVParserSupplier8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        java.io.InputStream inputStream9 = builder8.getInputStream();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(inputStream9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser2.spliterator();
        long long6 = cSVParser2.getRecordNumber();
        long long7 = cSVParser2.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser2.spliterator();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        int int9 = builder8.getBufferSize();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8192 + "'", int9 == 8192);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder8 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset13 = builder12.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder14 = builder7.setCharset(charset13);
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier15 = builder14.asSupplier();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(cSVParserSupplier15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setFormat(cSVFormat6);
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setFile("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.csv.CSVParser.Builder builder1 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder3 = builder1.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder5 = builder3.setCharacterOffset((long) (short) 100);
        int int6 = builder5.getBufferSizeDefault();
        java.lang.CharSequence charSequence7 = builder5.getCharSequence();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder11 = builder5.setByteArray(byteArray10);
        java.io.InputStream inputStream12 = builder11.getInputStream();
        java.io.InputStream inputStream13 = builder11.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder14 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder16 = builder14.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder18 = builder16.setCharacterOffset((long) (short) 100);
        int int19 = builder16.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder21 = builder16.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder23 = builder16.setCharacterOffset(0L);
        java.nio.file.Path path24 = builder16.getPath();
        org.apache.commons.csv.CSVParser.Builder builder26 = builder16.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset27 = builder16.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat28 = null;
        org.apache.commons.csv.CSVParser cSVParser29 = org.apache.commons.csv.CSVParser.parse(inputStream13, charset27, cSVFormat28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser31 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset27, cSVFormat30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8192 + "'", int6 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence7 + "' != '" + "" + "'", charSequence7, "");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8192 + "'", int19 == 8192);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(path24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(cSVParser29);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList3 = cSVParser2.getRecords();
        long long4 = cSVParser2.getCurrentLineNumber();
        java.lang.String str5 = cSVParser2.getHeaderComment();
        boolean boolean6 = cSVParser2.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordList3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        boolean boolean5 = cSVParser2.hasHeaderComment();
        boolean boolean6 = cSVParser2.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        java.nio.file.Path path9 = builder8.getPath();
        java.nio.charset.Charset charset10 = builder8.getCharset();
        java.nio.charset.Charset charset11 = builder8.getCharsetDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder13 = builder8.setCharset("\n\001");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(charset11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder8 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setCharacterOffset((long) (short) 100);
        int int13 = builder12.getBufferSizeDefault();
        java.lang.CharSequence charSequence14 = builder12.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder16 = builder12.setFile("hi!");
        org.apache.commons.csv.CSVParser.Builder builder18 = builder16.setBufferSize((int) '#');
        org.apache.commons.csv.CSVParser.Builder builder20 = builder18.setBufferSize((java.lang.Integer) 35);
        java.io.OutputStream outputStream21 = builder18.getOutputStream();
        org.apache.commons.csv.CSVParser.Builder builder22 = builder7.setOutputStream(outputStream21);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8192 + "'", int13 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(outputStream21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setOpenOptions(openOptionArray10);
        java.lang.CharSequence charSequence12 = builder11.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder14 = builder11.setPath("hi!");
        java.io.Writer writer15 = builder14.getWriter();
        org.apache.commons.csv.CSVParser cSVParser16 = builder14.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(writer15);
        org.junit.Assert.assertNotNull(cSVParser16);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.lang.CharSequence charSequence5 = builder2.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder6 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder6.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharacterOffset((long) (short) 100);
        int int11 = builder10.getBufferSizeDefault();
        java.lang.CharSequence charSequence12 = builder10.getCharSequence();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder16 = builder10.setByteArray(byteArray15);
        java.io.InputStream inputStream17 = builder16.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder18 = builder2.setInputStream(inputStream17);
        org.apache.commons.csv.CSVParser.Builder builder20 = builder18.setFile("\n\001");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + charSequence5 + "' != '" + "" + "'", charSequence5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8192 + "'", int11 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        java.util.function.IntUnaryOperator intUnaryOperator9 = null;
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSizeChecker(intUnaryOperator9);
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharacterOffset((long) (short) 100);
        java.io.Reader reader16 = builder13.getReader();
        org.apache.commons.csv.CSVParser.Builder builder17 = builder10.setReader(reader16);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder9.getPath();
        java.net.URI uRI11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder12 = builder9.setURI(uRI11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSize((int) '#');
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setBufferSize((java.lang.Integer) 35);
        org.apache.commons.csv.CSVParser cSVParser13 = builder10.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVParser13);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setTrackBytes(true);
        org.apache.commons.csv.CSVParser.Builder builder8 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setRecordNumber(10L);
        java.lang.CharSequence charSequence13 = builder10.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder14 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder16 = builder14.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder18 = builder16.setCharacterOffset((long) (short) 100);
        int int19 = builder18.getBufferSizeDefault();
        java.lang.CharSequence charSequence20 = builder18.getCharSequence();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder24 = builder18.setByteArray(byteArray23);
        java.io.InputStream inputStream25 = builder24.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder26 = builder10.setInputStream(inputStream25);
        org.apache.commons.csv.CSVParser.Builder builder27 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder29 = builder27.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder31 = builder29.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray32 = builder31.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder34 = builder31.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder35 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder37 = builder35.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder39 = builder37.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset40 = builder39.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder41 = builder34.setCharset(charset40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = null;
        org.apache.commons.csv.CSVParser cSVParser43 = org.apache.commons.csv.CSVParser.parse(inputStream25, charset40, cSVFormat42);
        org.apache.commons.csv.CSVParser.Builder builder44 = builder7.setInputStream(inputStream25);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "" + "'", charSequence13, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8192 + "'", int19 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence20 + "' != '" + "" + "'", charSequence20, "");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(openOptionArray32);
        org.junit.Assert.assertArrayEquals(openOptionArray32, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(cSVParser43);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        long long6 = cSVParser5.getRecordNumber();
        java.util.List<java.lang.String> strList7 = cSVParser5.getHeaderNames();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream8 = cSVParser5.stream();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(cSVRecordStream8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(reader5, cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = null;
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(reader5, cSVFormat8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = null;
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(reader5, cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = null;
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(reader5, cSVFormat12);
        long long14 = cSVParser13.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader5, cSVFormat6, (long) (byte) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: format");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder12 = builder2.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset13 = builder2.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setBufferSize((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream18 = builder15.getInputStream();
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder8 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder15.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder15.setPath("");
        java.io.File file21 = builder20.getFile();
        org.apache.commons.csv.CSVParser.Builder builder22 = builder10.setFile(file21);
        org.apache.commons.csv.CSVParser.Builder builder23 = builder7.setFile(file21);
        org.apache.commons.csv.CSVParser.Builder builder24 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder26 = builder24.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder28 = builder26.setRecordNumber(10L);
        java.lang.CharSequence charSequence29 = builder26.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder30 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder32 = builder30.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder34 = builder32.setCharacterOffset((long) (short) 100);
        int int35 = builder34.getBufferSizeDefault();
        java.lang.CharSequence charSequence36 = builder34.getCharSequence();
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder40 = builder34.setByteArray(byteArray39);
        java.io.InputStream inputStream41 = builder40.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder42 = builder26.setInputStream(inputStream41);
        org.apache.commons.csv.CSVParser.Builder builder43 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder45 = builder43.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder47 = builder45.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray48 = builder47.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder50 = builder47.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder51 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder53 = builder51.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder55 = builder53.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset56 = builder55.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder57 = builder50.setCharset(charset56);
        org.apache.commons.csv.CSVFormat cSVFormat58 = null;
        org.apache.commons.csv.CSVParser cSVParser59 = org.apache.commons.csv.CSVParser.parse(inputStream41, charset56, cSVFormat58);
        org.apache.commons.csv.CSVFormat cSVFormat60 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser61 = org.apache.commons.csv.CSVParser.parse(file21, charset56, cSVFormat60);
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNull("file21.getParent() == null", file21.getParent());
        org.junit.Assert.assertEquals(file21.toString(), "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + charSequence29 + "' != '" + "" + "'", charSequence29, "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8192 + "'", int35 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence36 + "' != '" + "" + "'", charSequence36, "");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(openOptionArray48);
        org.junit.Assert.assertArrayEquals(openOptionArray48, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(charset56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(cSVParser59);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        java.lang.String str5 = cSVParser2.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser2.getHeaderMap();
        java.lang.String str7 = cSVParser2.getHeaderComment();
        long long8 = cSVParser2.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset16 = builder13.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder17 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder19 = builder17.setCharSequence((java.lang.CharSequence) "");
        int int20 = builder17.getBufferSize();
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder25 = builder17.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder26 = builder13.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder27 = builder2.setByteArray(byteArray24);
        java.nio.file.OpenOption[] openOptionArray28 = builder2.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder29 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder31 = builder29.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder33 = builder31.setCharacterOffset((long) (short) 100);
        java.io.Reader reader34 = builder31.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat35 = null;
        org.apache.commons.csv.CSVParser cSVParser36 = org.apache.commons.csv.CSVParser.parse(reader34, cSVFormat35);
        org.apache.commons.csv.CSVParser.Builder builder37 = builder2.setReader(reader34);
        org.apache.commons.csv.CSVFormat cSVFormat38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser39 = new org.apache.commons.csv.CSVParser(reader34, cSVFormat38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: format");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8192 + "'", int20 == 8192);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(openOptionArray28);
        org.junit.Assert.assertArrayEquals(openOptionArray28, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(reader34);
        org.junit.Assert.assertNotNull(cSVParser36);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder8 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder15.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder15.setPath("");
        java.io.File file21 = builder20.getFile();
        org.apache.commons.csv.CSVParser.Builder builder22 = builder10.setFile(file21);
        org.apache.commons.csv.CSVParser.Builder builder23 = builder7.setFile(file21);
        java.io.File file24 = builder7.getFile();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNull("file21.getParent() == null", file21.getParent());
        org.junit.Assert.assertEquals(file21.toString(), "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertNull("file24.getParent() == null", file24.getParent());
        org.junit.Assert.assertEquals(file24.toString(), "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        java.util.function.IntUnaryOperator intUnaryOperator9 = null;
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSizeChecker(intUnaryOperator9);
        java.lang.CharSequence charSequence11 = builder10.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder12 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder14 = builder12.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder16 = builder14.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray17 = builder16.getOpenOptions();
        java.nio.file.OpenOption[] openOptionArray18 = builder16.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder19 = builder10.setOpenOptions(openOptionArray18);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + charSequence11 + "' != '" + "d\001\n" + "'", charSequence11, "d\001\n");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(openOptionArray17);
        org.junit.Assert.assertArrayEquals(openOptionArray17, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(openOptionArray18);
        org.junit.Assert.assertArrayEquals(openOptionArray18, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        java.nio.file.Path path9 = builder8.getPath();
        java.nio.charset.Charset charset10 = builder8.getCharset();
        java.nio.charset.Charset charset11 = builder8.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder8.setTrackBytes(true);
        org.apache.commons.csv.CSVParser.Builder builder15 = builder8.setBufferSize((int) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        java.io.InputStream inputStream11 = builder10.getInputStream();
        java.net.URI uRI12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder13 = builder10.setURI(uRI12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(inputStream11);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.OpenOption[] openOptionArray10 = builder2.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharacterOffset((long) (short) 100);
        int int16 = builder15.getBufferSizeDefault();
        java.lang.CharSequence charSequence17 = builder15.getCharSequence();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder21 = builder15.setByteArray(byteArray20);
        java.nio.file.OpenOption[] openOptionArray22 = builder15.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder23 = builder2.setOpenOptions(openOptionArray22);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8192 + "'", int16 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(openOptionArray22);
        org.junit.Assert.assertArrayEquals(openOptionArray22, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser cSVParser5 = builder2.get();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setRecordNumber(1L);
        org.apache.commons.csv.CSVParser.Builder builder8 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setCharacterOffset((long) (short) 100);
        int int13 = builder12.getBufferSizeDefault();
        java.lang.CharSequence charSequence14 = builder12.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder16 = builder12.setFile("hi!");
        java.nio.file.Path path17 = builder16.getPath();
        java.nio.charset.Charset charset18 = builder16.getCharset();
        java.nio.charset.Charset charset19 = builder16.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder7.setCharset(charset19);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8192 + "'", int13 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(path17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        java.lang.String str6 = cSVParser5.getTrailerComment();
        long long7 = cSVParser5.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder6 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder6.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharacterOffset((long) (short) 100);
        int int11 = builder10.getBufferSizeDefault();
        java.lang.CharSequence charSequence12 = builder10.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder14 = builder10.setFile("hi!");
        org.apache.commons.csv.CSVParser.Builder builder16 = builder14.setBufferSize((int) '#');
        org.apache.commons.csv.CSVParser.Builder builder18 = builder16.setBufferSize((java.lang.Integer) 35);
        int int19 = builder16.getBufferSizeDefault();
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier20 = builder16.asSupplier();
        org.apache.commons.csv.CSVParser.Builder builder21 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder23 = builder21.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder25 = builder23.setCharacterOffset((long) (short) 100);
        int int26 = builder23.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder28 = builder23.setPath("");
        org.apache.commons.csv.CSVFormat cSVFormat29 = null;
        org.apache.commons.csv.CSVParser.Builder builder30 = builder28.setFormat(cSVFormat29);
        org.apache.commons.csv.CSVParser.Builder builder31 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder33 = builder31.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder35 = builder33.setCharacterOffset((long) (short) 100);
        int int36 = builder33.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder38 = builder33.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder40 = builder38.setPath("hi!");
        java.io.File file41 = builder40.getFile();
        org.apache.commons.csv.CSVParser.Builder builder42 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder44 = builder42.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder46 = builder44.setRecordNumber(10L);
        java.io.Reader reader47 = builder46.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat48 = null;
        org.apache.commons.csv.CSVParser.Builder builder49 = builder46.setFormat(cSVFormat48);
        org.apache.commons.csv.CSVParser.Builder builder51 = builder49.setBufferSizeMax((int) (byte) -1);
        java.nio.charset.Charset charset52 = builder49.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat53 = null;
        org.apache.commons.csv.CSVParser cSVParser54 = org.apache.commons.csv.CSVParser.parse(file41, charset52, cSVFormat53);
        org.apache.commons.csv.CSVParser.Builder builder55 = builder30.setFile(file41);
        java.io.RandomAccessFile randomAccessFile56 = builder30.getRandomAccessFile();
        org.apache.commons.csv.CSVParser.Builder builder57 = builder16.setRandomAccessFile(randomAccessFile56);
        org.apache.commons.csv.CSVParser.Builder builder58 = builder4.setRandomAccessFile(randomAccessFile56);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8192 + "'", int11 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8192 + "'", int19 == 8192);
        org.junit.Assert.assertNotNull(cSVParserSupplier20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8192 + "'", int26 == 8192);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8192 + "'", int36 == 8192);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(file41);
        org.junit.Assert.assertNull("file41.getParent() == null", file41.getParent());
        org.junit.Assert.assertEquals(file41.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(reader47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertNotNull(cSVParser54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(randomAccessFile56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setPath("hi!");
        java.nio.charset.Charset charset12 = builder11.getCharset();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(charset12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        java.io.Reader reader5 = builder4.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setFormat(cSVFormat6);
        java.nio.channels.Channel channel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setChannel(channel8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat1);
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream3 = cSVParser2.stream();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor4 = cSVParser2.iterator();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordStream3);
        org.junit.Assert.assertNotNull(cSVRecordItor4);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setOpenOptions(openOptionArray10);
        java.lang.CharSequence charSequence12 = builder11.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder17.getBufferSizeDefault();
        java.lang.CharSequence charSequence19 = builder17.getCharSequence();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder23 = builder17.setByteArray(byteArray22);
        java.io.InputStream inputStream24 = builder23.getInputStream();
        java.io.InputStream inputStream25 = builder23.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder26 = builder11.setInputStream(inputStream25);
        org.apache.commons.csv.CSVParser cSVParser27 = builder11.getUnchecked();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(cSVParser27);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        int int9 = builder8.getBufferSize();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder8.setTrackBytes(false);
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setRecordNumber((long) '#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8192 + "'", int9 == 8192);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setTrackBytes(true);
        java.lang.Class<?> wildcardClass13 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        java.lang.String str5 = cSVParser2.getTrailerComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser2.spliterator();
        boolean boolean7 = cSVParser2.hasTrailerComment();
        java.lang.String str8 = cSVParser2.getFirstEndOfLine();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSizeMax((int) (short) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setOpenOptions(openOptionArray10);
        org.apache.commons.csv.CSVParser.Builder builder13 = builder4.setCharSequence((java.lang.CharSequence) "hi!");
        org.apache.commons.csv.CSVParser.Builder builder14 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder16 = builder14.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder18 = builder16.setCharacterOffset((long) (short) 100);
        int int19 = builder16.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder21 = builder16.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder23 = builder16.setCharacterOffset(0L);
        java.nio.file.Path path24 = builder16.getPath();
        org.apache.commons.csv.CSVParser.Builder builder25 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder27 = builder25.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder29 = builder27.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset30 = builder27.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder31 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder33 = builder31.setCharSequence((java.lang.CharSequence) "");
        int int34 = builder31.getBufferSize();
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder39 = builder31.setByteArray(byteArray38);
        org.apache.commons.csv.CSVParser.Builder builder40 = builder27.setByteArray(byteArray38);
        org.apache.commons.csv.CSVParser.Builder builder41 = builder16.setByteArray(byteArray38);
        org.apache.commons.csv.CSVParser.Builder builder42 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder44 = builder42.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder46 = builder44.setCharacterOffset((long) (short) 100);
        int int47 = builder46.getBufferSizeDefault();
        java.lang.CharSequence charSequence48 = builder46.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder50 = builder46.setFile("hi!");
        org.apache.commons.csv.CSVParser.Builder builder52 = builder50.setBufferSize((int) '#');
        org.apache.commons.csv.CSVParser.Builder builder54 = builder52.setBufferSize((java.lang.Integer) 35);
        java.io.OutputStream outputStream55 = builder52.getOutputStream();
        org.apache.commons.csv.CSVParser.Builder builder56 = builder16.setOutputStream(outputStream55);
        org.apache.commons.csv.CSVParser.Builder builder57 = builder4.setOutputStream(outputStream55);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser58 = builder4.get();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OutputStreamOrigin#getPath() for  origin java.nio.channels.Channels$1@c91a954");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8192 + "'", int19 == 8192);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(path24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8192 + "'", int34 == 8192);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 8192 + "'", int47 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence48 + "' != '" + "" + "'", charSequence48, "");
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(outputStream55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder12 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder14 = builder12.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder16 = builder14.setCharacterOffset((long) (short) 100);
        int int17 = builder16.getBufferSizeDefault();
        java.lang.CharSequence charSequence18 = builder16.getCharSequence();
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder22 = builder16.setByteArray(byteArray21);
        org.apache.commons.csv.CSVParser.Builder builder23 = builder4.setByteArray(byteArray21);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8192 + "'", int17 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder12 = builder2.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset13 = builder2.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder2.setCharSequence((java.lang.CharSequence) "\n\001");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder19 = builder17.setCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.OpenOption[] openOptionArray10 = builder2.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharacterOffset((long) (short) 100);
        int int16 = builder15.getBufferSizeDefault();
        java.lang.CharSequence charSequence17 = builder15.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder19 = builder15.setFile("hi!");
        java.nio.file.Path path20 = builder19.getPath();
        org.apache.commons.csv.CSVParser.Builder builder21 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder23 = builder21.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder25 = builder23.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset26 = builder23.getCharset();
        java.nio.charset.Charset charset27 = builder23.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat28 = null;
        org.apache.commons.csv.CSVParser cSVParser29 = org.apache.commons.csv.CSVParser.parse(path20, charset27, cSVFormat28);
        org.apache.commons.csv.CSVParser.Builder builder30 = builder2.setPath(path20);
        org.apache.commons.csv.CSVParser.Builder builder31 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder33 = builder31.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder35 = builder33.setCharacterOffset((long) (short) 100);
        int int36 = builder33.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder38 = builder33.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder40 = builder38.setPath("hi!");
        java.io.File file41 = builder40.getFile();
        org.apache.commons.csv.CSVParser.Builder builder42 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder44 = builder42.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder46 = builder44.setRecordNumber(10L);
        java.io.Reader reader47 = builder46.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat48 = null;
        org.apache.commons.csv.CSVParser.Builder builder49 = builder46.setFormat(cSVFormat48);
        org.apache.commons.csv.CSVParser.Builder builder51 = builder49.setBufferSizeMax((int) (byte) -1);
        java.nio.charset.Charset charset52 = builder49.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat53 = null;
        org.apache.commons.csv.CSVParser cSVParser54 = org.apache.commons.csv.CSVParser.parse(file41, charset52, cSVFormat53);
        org.apache.commons.csv.CSVParser.Builder builder55 = builder30.setFile(file41);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8192 + "'", int16 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence17 + "' != '" + "" + "'", charSequence17, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(path20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(cSVParser29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8192 + "'", int36 == 8192);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(file41);
        org.junit.Assert.assertNull("file41.getParent() == null", file41.getParent());
        org.junit.Assert.assertEquals(file41.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(reader47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertNotNull(cSVParser54);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        java.nio.file.Path path9 = builder8.getPath();
        java.nio.charset.Charset charset10 = builder8.getCharset();
        java.nio.charset.Charset charset11 = builder8.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder8.setTrackBytes(true);
        org.apache.commons.csv.CSVParser cSVParser14 = builder13.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(path9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(cSVParser14);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        java.lang.String str4 = cSVParser2.getHeaderComment();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList5 = cSVParser2.getRecords();
        cSVParser2.close();
        java.lang.String str7 = cSVParser2.getTrailerComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordList5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.io.Reader reader5 = builder2.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = null;
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(reader5, cSVFormat6);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList8 = cSVParser7.getRecords();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVRecordList8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cSVParser2.getHeaderMap();
        java.lang.String str4 = cSVParser2.getTrailerComment();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor5 = cSVParser2.iterator();
        boolean boolean6 = cSVParser2.isClosed();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVRecordItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        int int9 = builder4.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder10 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder14 = builder12.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder15 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder19 = builder17.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray20 = builder19.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder21 = builder14.setOpenOptions(openOptionArray20);
        java.lang.CharSequence charSequence22 = builder21.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder23 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder25 = builder23.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder27 = builder25.setCharacterOffset((long) (short) 100);
        int int28 = builder27.getBufferSizeDefault();
        java.lang.CharSequence charSequence29 = builder27.getCharSequence();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder33 = builder27.setByteArray(byteArray32);
        java.io.InputStream inputStream34 = builder33.getInputStream();
        java.io.InputStream inputStream35 = builder33.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder36 = builder21.setInputStream(inputStream35);
        org.apache.commons.csv.CSVParser.Builder builder37 = builder4.setInputStream(inputStream35);
        java.lang.CharSequence charSequence38 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder39 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder41 = builder39.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder43 = builder41.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder44 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder46 = builder44.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder48 = builder46.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray49 = builder48.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder50 = builder43.setOpenOptions(openOptionArray49);
        java.lang.CharSequence charSequence51 = builder50.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder53 = builder50.setPath("hi!");
        java.io.Writer writer54 = builder53.getWriter();
        org.apache.commons.csv.CSVParser.Builder builder55 = builder4.setWriter(writer54);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8192 + "'", int9 == 8192);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(openOptionArray20);
        org.junit.Assert.assertArrayEquals(openOptionArray20, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + charSequence22 + "' != '" + "" + "'", charSequence22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8192 + "'", int28 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence29 + "' != '" + "" + "'", charSequence29, "");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + charSequence38 + "' != '" + "\n\001" + "'", charSequence38, "\n\001");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(openOptionArray49);
        org.junit.Assert.assertArrayEquals(openOptionArray49, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertEquals("'" + charSequence51 + "' != '" + "" + "'", charSequence51, "");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(writer54);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        java.lang.String str5 = cSVParser2.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cSVParser2.getHeaderMap();
        java.lang.String str7 = cSVParser2.getHeaderComment();
        java.util.List<java.lang.String> strList8 = cSVParser2.getHeaderNames();
        java.lang.String str9 = cSVParser2.getTrailerComment();
        boolean boolean10 = cSVParser2.isClosed();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        org.apache.commons.csv.CSVParser.Builder builder6 = builder4.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder7 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset12 = builder11.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder6.setCharset(charset12);
        org.apache.commons.csv.CSVParser.Builder builder14 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder16 = builder14.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder18 = builder16.setCharacterOffset((long) (short) 100);
        int int19 = builder16.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder21 = builder16.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder23 = builder21.setPath("hi!");
        java.io.File file24 = builder23.getFile();
        org.apache.commons.csv.CSVParser.Builder builder25 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder27 = builder25.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder29 = builder27.setRecordNumber(10L);
        java.io.Reader reader30 = builder29.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = null;
        org.apache.commons.csv.CSVParser.Builder builder32 = builder29.setFormat(cSVFormat31);
        org.apache.commons.csv.CSVParser.Builder builder34 = builder32.setBufferSizeMax((int) (byte) -1);
        java.nio.charset.Charset charset35 = builder32.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat36 = null;
        org.apache.commons.csv.CSVParser cSVParser37 = org.apache.commons.csv.CSVParser.parse(file24, charset35, cSVFormat36);
        org.apache.commons.csv.CSVParser.Builder builder38 = builder13.setFile(file24);
        org.apache.commons.csv.CSVFormat cSVFormat39 = null;
        org.apache.commons.csv.CSVParser.Builder builder40 = builder13.setFormat(cSVFormat39);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8192 + "'", int19 == 8192);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertNull("file24.getParent() == null", file24.getParent());
        org.junit.Assert.assertEquals(file24.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(reader30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(cSVParser37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder12 = builder2.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset13 = builder2.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setBufferSize((java.lang.Integer) 0);
        int int18 = builder15.getBufferSizeDefault();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        java.nio.charset.Charset charset8 = builder7.getCharsetDefault();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder7 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setCharacterOffset((long) (short) 100);
        org.apache.commons.csv.CSVParser.Builder builder13 = builder9.setTrackBytes(true);
        org.apache.commons.csv.CSVParser cSVParser14 = builder13.getUnchecked();
        org.apache.commons.csv.CSVParser.Builder builder16 = builder13.setBufferSizeMax((int) (short) 1);
        org.apache.commons.csv.CSVParser.Builder builder17 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder19 = builder17.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder21 = builder19.setCharacterOffset((long) (short) 100);
        int int22 = builder19.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder24 = builder19.setPath("");
        org.apache.commons.csv.CSVFormat cSVFormat25 = null;
        org.apache.commons.csv.CSVParser.Builder builder26 = builder24.setFormat(cSVFormat25);
        org.apache.commons.csv.CSVParser.Builder builder27 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder29 = builder27.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder31 = builder29.setCharacterOffset((long) (short) 100);
        int int32 = builder29.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder34 = builder29.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder36 = builder34.setPath("hi!");
        java.io.File file37 = builder36.getFile();
        org.apache.commons.csv.CSVParser.Builder builder38 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder40 = builder38.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder42 = builder40.setRecordNumber(10L);
        java.io.Reader reader43 = builder42.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat44 = null;
        org.apache.commons.csv.CSVParser.Builder builder45 = builder42.setFormat(cSVFormat44);
        org.apache.commons.csv.CSVParser.Builder builder47 = builder45.setBufferSizeMax((int) (byte) -1);
        java.nio.charset.Charset charset48 = builder45.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat49 = null;
        org.apache.commons.csv.CSVParser cSVParser50 = org.apache.commons.csv.CSVParser.parse(file37, charset48, cSVFormat49);
        org.apache.commons.csv.CSVParser.Builder builder51 = builder26.setFile(file37);
        java.io.RandomAccessFile randomAccessFile52 = builder26.getRandomAccessFile();
        org.apache.commons.csv.CSVParser.Builder builder53 = builder16.setRandomAccessFile(randomAccessFile52);
        org.apache.commons.csv.CSVParser.Builder builder54 = builder4.setRandomAccessFile(randomAccessFile52);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8192 + "'", int22 == 8192);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8192 + "'", int32 == 8192);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(file37);
        org.junit.Assert.assertNull("file37.getParent() == null", file37.getParent());
        org.junit.Assert.assertEquals(file37.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(reader43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(cSVParser50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(randomAccessFile52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "hi!");
        org.apache.commons.csv.CSVParser.Builder builder14 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder16 = builder14.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder18 = builder16.setCharacterOffset((long) (short) 100);
        int int19 = builder16.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder21 = builder16.setPath("");
        java.io.File file22 = builder21.getFile();
        org.apache.commons.csv.CSVParser.Builder builder23 = builder11.setFile(file22);
        java.util.function.IntUnaryOperator intUnaryOperator24 = null;
        org.apache.commons.csv.CSVParser.Builder builder25 = builder23.setBufferSizeChecker(intUnaryOperator24);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Writer writer26 = builder25.getWriter();
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8192 + "'", int19 == 8192);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertNull("file22.getParent() == null", file22.getParent());
        org.junit.Assert.assertEquals(file22.toString(), "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset5 = builder2.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder6 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder6.setCharSequence((java.lang.CharSequence) "");
        int int9 = builder6.getBufferSize();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder14 = builder6.setByteArray(byteArray13);
        org.apache.commons.csv.CSVParser.Builder builder15 = builder2.setByteArray(byteArray13);
        org.apache.commons.csv.CSVParser.Builder builder16 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder18 = builder16.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder20 = builder18.setRecordNumber(10L);
        java.io.Reader reader21 = builder20.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat22 = null;
        org.apache.commons.csv.CSVParser.Builder builder23 = builder20.setFormat(cSVFormat22);
        org.apache.commons.csv.CSVParser.Builder builder25 = builder23.setBufferSizeMax((int) (byte) -1);
        java.nio.charset.Charset charset26 = builder23.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder27 = builder2.setCharset(charset26);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8192 + "'", int9 == 8192);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(reader21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        org.apache.commons.csv.CSVParser.Builder builder6 = builder2.setTrackBytes(true);
        org.apache.commons.csv.CSVParser cSVParser7 = builder6.getUnchecked();
        org.apache.commons.csv.CSVParser.Builder builder9 = builder6.setBufferSizeMax((int) (short) 1);
        java.util.function.IntUnaryOperator intUnaryOperator10 = null;
        org.apache.commons.csv.CSVParser.Builder builder11 = builder6.setBufferSizeChecker(intUnaryOperator10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        java.nio.file.OpenOption[] openOptionArray6 = builder4.getOpenOptions();
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier7 = builder4.asSupplier();
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setBufferSizeMax((int) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(openOptionArray6);
        org.junit.Assert.assertArrayEquals(openOptionArray6, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(cSVParserSupplier7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder4.setFile("hi!");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSize((int) '#');
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setBufferSize((java.lang.Integer) 35);
        int int13 = builder10.getBufferSizeDefault();
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier14 = builder10.asSupplier();
        org.apache.commons.csv.CSVParser.Builder builder15 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder19 = builder17.setCharacterOffset((long) (short) 100);
        int int20 = builder17.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder22 = builder17.setPath("");
        org.apache.commons.csv.CSVFormat cSVFormat23 = null;
        org.apache.commons.csv.CSVParser.Builder builder24 = builder22.setFormat(cSVFormat23);
        org.apache.commons.csv.CSVParser.Builder builder25 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder27 = builder25.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder29 = builder27.setCharacterOffset((long) (short) 100);
        int int30 = builder27.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder32 = builder27.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder34 = builder32.setPath("hi!");
        java.io.File file35 = builder34.getFile();
        org.apache.commons.csv.CSVParser.Builder builder36 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder38 = builder36.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder40 = builder38.setRecordNumber(10L);
        java.io.Reader reader41 = builder40.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat42 = null;
        org.apache.commons.csv.CSVParser.Builder builder43 = builder40.setFormat(cSVFormat42);
        org.apache.commons.csv.CSVParser.Builder builder45 = builder43.setBufferSizeMax((int) (byte) -1);
        java.nio.charset.Charset charset46 = builder43.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat47 = null;
        org.apache.commons.csv.CSVParser cSVParser48 = org.apache.commons.csv.CSVParser.parse(file35, charset46, cSVFormat47);
        org.apache.commons.csv.CSVParser.Builder builder49 = builder24.setFile(file35);
        java.io.RandomAccessFile randomAccessFile50 = builder24.getRandomAccessFile();
        org.apache.commons.csv.CSVParser.Builder builder51 = builder10.setRandomAccessFile(randomAccessFile50);
        java.nio.charset.Charset charset52 = builder51.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder53 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder55 = builder53.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder57 = builder55.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray58 = builder57.getOpenOptions();
        java.nio.file.OpenOption[] openOptionArray59 = builder57.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder60 = builder51.setOpenOptions(openOptionArray59);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8192 + "'", int13 == 8192);
        org.junit.Assert.assertNotNull(cSVParserSupplier14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8192 + "'", int20 == 8192);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8192 + "'", int30 == 8192);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(file35);
        org.junit.Assert.assertNull("file35.getParent() == null", file35.getParent());
        org.junit.Assert.assertEquals(file35.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(reader41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(cSVParser48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(randomAccessFile50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(openOptionArray58);
        org.junit.Assert.assertArrayEquals(openOptionArray58, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(openOptionArray59);
        org.junit.Assert.assertArrayEquals(openOptionArray59, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser cSVParser5 = builder2.get();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setRecordNumber(1L);
        java.lang.Class<?> wildcardClass8 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder11 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset16 = builder13.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder17 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder19 = builder17.setCharSequence((java.lang.CharSequence) "");
        int int20 = builder17.getBufferSize();
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder25 = builder17.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder26 = builder13.setByteArray(byteArray24);
        org.apache.commons.csv.CSVParser.Builder builder27 = builder2.setByteArray(byteArray24);
        java.nio.file.OpenOption[] openOptionArray28 = builder2.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder29 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder31 = builder29.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder33 = builder31.setRecordNumber(10L);
        java.lang.CharSequence charSequence34 = builder31.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder35 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder37 = builder35.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder39 = builder37.setCharacterOffset((long) (short) 100);
        int int40 = builder39.getBufferSizeDefault();
        java.lang.CharSequence charSequence41 = builder39.getCharSequence();
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder45 = builder39.setByteArray(byteArray44);
        java.io.InputStream inputStream46 = builder45.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder47 = builder31.setInputStream(inputStream46);
        org.apache.commons.csv.CSVParser.Builder builder48 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder50 = builder48.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder52 = builder50.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray53 = builder52.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder55 = builder52.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder56 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder58 = builder56.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder60 = builder58.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset61 = builder60.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder62 = builder55.setCharset(charset61);
        org.apache.commons.csv.CSVFormat cSVFormat63 = null;
        org.apache.commons.csv.CSVParser cSVParser64 = org.apache.commons.csv.CSVParser.parse(inputStream46, charset61, cSVFormat63);
        org.apache.commons.csv.CSVParser.Builder builder65 = builder2.setInputStream(inputStream46);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8192 + "'", int20 == 8192);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(openOptionArray28);
        org.junit.Assert.assertArrayEquals(openOptionArray28, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + charSequence34 + "' != '" + "" + "'", charSequence34, "");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8192 + "'", int40 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence41 + "' != '" + "" + "'", charSequence41, "");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(inputStream46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(openOptionArray53);
        org.junit.Assert.assertArrayEquals(openOptionArray53, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(cSVParser64);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        java.util.function.IntUnaryOperator intUnaryOperator9 = null;
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setBufferSizeChecker(intUnaryOperator9);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setWriter(writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        boolean boolean3 = cSVParser2.hasHeaderComment();
        boolean boolean4 = cSVParser2.isClosed();
        cSVParser2.close();
        long long6 = cSVParser2.getRecordNumber();
        boolean boolean7 = cSVParser2.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier5 = builder2.asSupplier();
        org.apache.commons.csv.CSVParser.Builder builder6 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder8 = builder6.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharacterOffset((long) (short) 100);
        int int11 = builder8.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder13 = builder8.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder15 = builder8.setCharacterOffset(0L);
        java.nio.file.Path path16 = builder8.getPath();
        org.apache.commons.csv.CSVParser.Builder builder18 = builder8.setBufferSizeMax((int) (byte) 0);
        java.io.File file19 = builder18.getFile();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder2.setFile(file19);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParserSupplier5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8192 + "'", int11 == 8192);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertNull("file19.getParent() == null", file19.getParent());
        org.junit.Assert.assertEquals(file19.toString(), "");
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharacterOffset((long) (byte) -1);
        java.net.URI uRI11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setURI(uRI11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setBufferSizeMax(100);
        org.apache.commons.csv.CSVParser.Builder builder5 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder5.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray10 = builder9.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setOpenOptions(openOptionArray10);
        java.lang.CharSequence charSequence12 = builder11.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder17.getBufferSizeDefault();
        java.lang.CharSequence charSequence19 = builder17.getCharSequence();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder23 = builder17.setByteArray(byteArray22);
        java.io.InputStream inputStream24 = builder23.getInputStream();
        java.io.InputStream inputStream25 = builder23.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder26 = builder11.setInputStream(inputStream25);
        org.apache.commons.csv.CSVParser.Builder builder27 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder29 = builder27.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder31 = builder29.setCharacterOffset((long) (short) 100);
        int int32 = builder31.getBufferSizeDefault();
        java.lang.CharSequence charSequence33 = builder31.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder35 = builder31.setFile("hi!");
        java.nio.file.Path path36 = builder35.getPath();
        java.nio.charset.Charset charset37 = builder35.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat38 = null;
        org.apache.commons.csv.CSVParser cSVParser39 = org.apache.commons.csv.CSVParser.parse(inputStream25, charset37, cSVFormat38);
        boolean boolean40 = cSVParser39.hasTrailerComment();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(openOptionArray10);
        org.junit.Assert.assertArrayEquals(openOptionArray10, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + charSequence12 + "' != '" + "" + "'", charSequence12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence19 + "' != '" + "" + "'", charSequence19, "");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8192 + "'", int32 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence33 + "' != '" + "" + "'", charSequence33, "");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(path36);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(cSVParser39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder14 = builder12.setCharSequence((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        org.apache.commons.csv.CSVParser.Builder builder6 = builder2.setTrackBytes(true);
        org.apache.commons.csv.CSVParser.Builder builder7 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setCharacterOffset((long) (short) 100);
        int int12 = builder9.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder15.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder15.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder22 = builder15.setCharacterOffset(0L);
        java.nio.file.Path path23 = builder15.getPath();
        org.apache.commons.csv.CSVParser.Builder builder24 = builder9.setPath(path23);
        org.apache.commons.csv.CSVParser.Builder builder25 = builder6.setPath(path23);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8192 + "'", int12 == 8192);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(path23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder2.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder2.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder9 = builder2.setCharacterOffset(0L);
        java.nio.file.Path path10 = builder2.getPath();
        org.apache.commons.csv.CSVParser.Builder builder12 = builder2.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset13 = builder2.getCharset();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder2.setPath("");
        java.util.function.Supplier<org.apache.commons.csv.CSVParser> cSVParserSupplier16 = builder2.asSupplier();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(path10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(cSVParserSupplier16);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        int int3 = builder0.getBufferSize();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        org.apache.commons.csv.CSVParser.Builder builder8 = builder0.setByteArray(byteArray7);
        org.apache.commons.csv.CSVParser.Builder builder10 = builder8.setCharacterOffset((long) (byte) -1);
        org.apache.commons.csv.CSVParser.Builder builder12 = builder10.setBufferSize((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file13 = builder12.getFile();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ByteArrayOrigin#getFile() for byte[] origin [B@368bc443");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8192 + "'", int3 == 8192);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.csv.CSVParser.Builder builder10 = builder4.setByteArray(byteArray9);
        java.io.InputStream inputStream11 = builder10.getInputStream();
        java.io.InputStream inputStream12 = builder10.getInputStream();
        org.apache.commons.csv.CSVParser.Builder builder13 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder15 = builder13.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder17 = builder15.setCharacterOffset((long) (short) 100);
        int int18 = builder15.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder15.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder22 = builder15.setCharacterOffset(0L);
        java.nio.file.Path path23 = builder15.getPath();
        org.apache.commons.csv.CSVParser.Builder builder25 = builder15.setBufferSizeMax((int) (byte) 0);
        java.nio.charset.Charset charset26 = builder15.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat27 = null;
        org.apache.commons.csv.CSVParser cSVParser28 = org.apache.commons.csv.CSVParser.parse(inputStream12, charset26, cSVFormat27);
        org.apache.commons.csv.CSVParser.Builder builder29 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder31 = builder29.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder33 = builder31.setCharacterOffset((long) (short) 100);
        int int34 = builder33.getBufferSizeDefault();
        java.nio.charset.Charset charset35 = builder33.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat36 = null;
        org.apache.commons.csv.CSVParser cSVParser37 = org.apache.commons.csv.CSVParser.parse(inputStream12, charset35, cSVFormat36);
        java.lang.String str38 = cSVParser37.getHeaderComment();
        boolean boolean39 = cSVParser37.hasTrailerComment();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8192 + "'", int18 == 8192);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(path23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(cSVParser28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8192 + "'", int34 == 8192);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(cSVParser37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor3 = cSVParser2.iterator();
        boolean boolean4 = cSVParser2.hasHeaderComment();
        long long5 = cSVParser2.getCurrentLineNumber();
        boolean boolean6 = cSVParser2.hasHeaderComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream7 = cSVParser2.stream();
        long long8 = cSVParser2.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNotNull(cSVRecordItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVRecordStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        int int5 = builder4.getBufferSizeDefault();
        java.lang.CharSequence charSequence6 = builder4.getCharSequence();
        org.apache.commons.csv.CSVParser.Builder builder7 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder9 = builder7.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder9.setCharacterOffset((long) (short) 100);
        int int12 = builder9.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder14 = builder9.setPath("");
        org.apache.commons.csv.CSVParser.Builder builder16 = builder14.setPath("hi!");
        java.io.File file17 = builder16.getFile();
        org.apache.commons.csv.CSVParser.Builder builder18 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder20 = builder18.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder22 = builder20.setRecordNumber(10L);
        java.io.Reader reader23 = builder22.getReader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = null;
        org.apache.commons.csv.CSVParser.Builder builder25 = builder22.setFormat(cSVFormat24);
        org.apache.commons.csv.CSVParser.Builder builder27 = builder25.setBufferSizeMax((int) (byte) -1);
        java.nio.charset.Charset charset28 = builder25.getCharset();
        org.apache.commons.csv.CSVFormat cSVFormat29 = null;
        org.apache.commons.csv.CSVParser cSVParser30 = org.apache.commons.csv.CSVParser.parse(file17, charset28, cSVFormat29);
        org.apache.commons.csv.CSVParser.Builder builder31 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder33 = builder31.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder35 = builder33.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray36 = builder35.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder38 = builder35.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder39 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder41 = builder39.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder43 = builder41.setCharacterOffset((long) (short) 100);
        java.nio.charset.Charset charset44 = builder43.getCharsetDefault();
        org.apache.commons.csv.CSVParser.Builder builder45 = builder38.setCharset(charset44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = null;
        org.apache.commons.csv.CSVParser cSVParser47 = org.apache.commons.csv.CSVParser.parse(file17, charset44, cSVFormat46);
        org.apache.commons.csv.CSVParser.Builder builder48 = builder4.setFile(file17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8192 + "'", int5 == 8192);
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "" + "'", charSequence6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8192 + "'", int12 == 8192);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertNull("file17.getParent() == null", file17.getParent());
        org.junit.Assert.assertEquals(file17.toString(), "hi!");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(reader23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(cSVParser30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(openOptionArray36);
        org.junit.Assert.assertArrayEquals(openOptionArray36, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(cSVParser47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
        java.lang.String str3 = cSVParser2.getHeaderComment();
        long long4 = cSVParser2.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cSVParser2.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVParser2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setRecordNumber(10L);
        org.apache.commons.csv.CSVParser cSVParser5 = builder4.getUnchecked();
        long long6 = cSVParser5.getRecordNumber();
        java.util.List<java.lang.String> strList7 = cSVParser5.getHeaderNames();
        boolean boolean8 = cSVParser5.isClosed();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.csv.CSVParser.Builder builder0 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder2 = builder0.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder4 = builder2.setCharacterOffset((long) (short) 100);
        java.nio.file.OpenOption[] openOptionArray5 = builder4.getOpenOptions();
        org.apache.commons.csv.CSVParser.Builder builder7 = builder4.setBufferSizeMax((int) ' ');
        org.apache.commons.csv.CSVParser.Builder builder9 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder11 = builder4.setPath("hi!");
        org.apache.commons.csv.CSVParser.Builder builder13 = builder11.setCharSequence((java.lang.CharSequence) "hi!");
        org.apache.commons.csv.CSVParser.Builder builder14 = org.apache.commons.csv.CSVParser.builder();
        org.apache.commons.csv.CSVParser.Builder builder16 = builder14.setCharSequence((java.lang.CharSequence) "");
        org.apache.commons.csv.CSVParser.Builder builder18 = builder16.setCharacterOffset((long) (short) 100);
        int int19 = builder16.getBufferSizeDefault();
        org.apache.commons.csv.CSVParser.Builder builder21 = builder16.setPath("");
        java.io.File file22 = builder21.getFile();
        org.apache.commons.csv.CSVParser.Builder builder23 = builder11.setFile(file22);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream24 = builder11.getInputStream();
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(openOptionArray5);
        org.junit.Assert.assertArrayEquals(openOptionArray5, new java.nio.file.OpenOption[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8192 + "'", int19 == 8192);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertNull("file22.getParent() == null", file22.getParent());
        org.junit.Assert.assertEquals(file22.toString(), "");
        org.junit.Assert.assertNotNull(builder23);
    }
}
