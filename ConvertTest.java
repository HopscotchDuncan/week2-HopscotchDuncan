package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertTest {

    Convert convert = new Convert();

    @Test
    public void testGrade_topA() {

        Assertions.assertEquals(convert.toGrade(1.0f), Grade.A);
    }

    @Test
    public void testGrade_bottomA() {
        Assertions.assertEquals(convert.toGrade(8f/9f+0.1f), Grade.A);
    }

    @Test
    public void testGrade_topB() {
        Assertions.assertEquals(convert.toGrade(8f/9f), Grade.B);
    }

    @Test
    public void testGrade_bottomB() {
        Assertions.assertEquals(convert.toGrade(13f/18f+0.1f), Grade.B);
    }

    @Test
    public void testGrade_topC() {
        Assertions.assertEquals(convert.toGrade(13f/18f), Grade.C);
    }

    @Test
    public void testGrade_bottomC() {
        Assertions.assertEquals(convert.toGrade(8f/15f+0.1f), Grade.C);
    }

    @Test
    public void testGrade_topD() {
        Assertions.assertEquals(convert.toGrade(8f/15f), Grade.D);
    }

    @Test
    public void testGrade_bottomD() {
        Assertions.assertEquals(convert.toGrade(1f/3f + 0.1f), Grade.D);
    }

    @Test
    public void testGrade_topF() {
        Assertions.assertEquals(convert.toGrade(1f/3f), Grade.F);
    }
}
