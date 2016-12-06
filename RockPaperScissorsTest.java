package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import fr.p10.miage.rps.model.RockPaperScissors;
import org.testng.annotations.*;

import static org.testng.Assert.*;

/**
 * Created by fodoucou on 27/09/2016.
 */
public class RockPaperScissorsTest {
    RockPaperScissors rps;

    @BeforeClass
    public void setUp() throws Exception {
         rps=new RockPaperScissors();

    }

    @AfterClass
    public void tearDown() throws Exception {
        rps=null;
    }

    @Parameters({"paper","rock"})
    @Test
    public void testWinPlay(String p1,String p2)throws Exception{
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
        rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2));
    }

    @Parameters({"paper","paper"})
    @Test
    public void testTiePlay(String p1, String p2) throws Exception{
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
        rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2));
    }


    @Parameters({"scissors","paper"})
    @Test
    public void testLostPlay(String p1, String p2) throws Exception{
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
        rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2));

    }
}