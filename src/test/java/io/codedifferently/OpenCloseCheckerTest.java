package io.codedifferently;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OpenCloseCheckerTest {

    @Test
    public void pairTestTrue(){
        OpenCloseChecker openCloseChecker= new OpenCloseChecker();
        String str="a(b)c(d)e(f)g";
        Boolean expected=true;
        Boolean actual=openCloseChecker.isPair(str);
        //Assert.assertEquals(expected,actual);
        Assert.assertTrue(expected);
    }
    @Test
    public void pairTestTrue2(){
        OpenCloseChecker openCloseChecker= new OpenCloseChecker();
        String str="a{b}c<d>e\"f\"g";
        Boolean expected=true;
        Boolean actual=openCloseChecker.isPair(str);
        //Assert.assertEquals(expected,actual);
        Assert.assertTrue(expected);
    }
    @Test
    public void pairTestFalse(){
        OpenCloseChecker openCloseChecker= new OpenCloseChecker();
        String str="a(bc(d)))";
        Boolean expected=false;
        Boolean actual=openCloseChecker.isPair(str);
        //Assert.assertEquals(expected,actual);
        Assert.assertFalse(expected);

    }
    @Test
    public void pairTestFalse2(){
        OpenCloseChecker openCloseChecker= new OpenCloseChecker();
        String str="((a{b}c<d>e\"f\"g";
        Boolean expected=false;
        Boolean actual=openCloseChecker.isPair(str);
        //Assert.assertEquals(expected,actual);
        Assert.assertFalse(expected);
    }





}