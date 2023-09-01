package com.codedifferently.algorithms;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WuTangForeverBuzzTest {

    @Test
    public void wuTangClanTestOne(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();

        String expected = "1\n2\nWu\n4\nTang\nWu\n7\n8\nWu\nTang\n11\nWu\n13\n14\nWuTang Forever\n";
        String actual = wuTangForeverBuzz.wuTangClan(15);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void wuTangClanTestTwo(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();

        String expected = "1\n2\nWu\n4\nTang\nWu\n7\n8\nWu\nTang\n11\nWu\n13\n14\nWuTang Forever\n16\n17\nWu\n19\nTang\nWu\n22\n23\nWu\nTang\n26\nWu\n28\n29\nWuTang Forever\n31\n32\nWu\n34\nTang\nWu\n37\n38\nWu\nTang\n";
        String actual = wuTangForeverBuzz.wuTangClan(40);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void wuTangClanEdgeCaseOne(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();

        String expected = "1\n";
        String actual = wuTangForeverBuzz.wuTangClan(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wuTangClanEdgeCaseTwo(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();

        String expected = "1\n2\n";
        String actual = wuTangForeverBuzz.wuTangClan(2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wuTangClanOnlyWu(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();

        String expected = "1\n2\nWu\n4\n";
        String actual = wuTangForeverBuzz.wuTangClan(4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wuTangClanOnlyTang(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();

        String expected = "1\n2\nWu\n4\nTang\nWu\n";
        String actual = wuTangForeverBuzz.wuTangClan(6);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wuTangClanTestForThirty(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();

        String expected = "1\n2\nWu\n4\nTang\nWu\n7\n8\nWu\nTang\n11\nWu\n13\n14\nWuTang Forever\n16\n17\nWu\n19\nTang\nWu\n22\n23\nWu\nTang\n26\nWu\n28\n29\nWuTang Forever\n";
        String actual = wuTangForeverBuzz.wuTangClan(30);

        Assertions.assertEquals(expected, actual);
    }


}
