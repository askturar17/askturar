/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class TicTacTest {
    
    public TicTacTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of board method, of class TicTac.
     */
    @Test
    public void ActiveFields() {
        System.out.println("board");
        int i = 9;
        TicTac instance = new TicTac();
        instance.board(i);
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ChangePlayer method, of class TicTac.
     */
    @Test
    public void testChangePlayer() {
        System.out.println("ChangePlayer");
        TicTac instance = new TicTac();
        instance.ChangePlayer();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CurrentPlayer method, of class TicTac.
     */
    
    @Test
    public void testCurrentPlayer() {
        System.out.println("CurrentPlayer");
        TicTac instance = new TicTac();
        
        String expResult = "player1";
        String result = instance.CurrentPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
  @Test
    public void testCurrentPlayer2() {
        System.out.println("CurrentPlayer");
        TicTac instance = new TicTac();
        instance.ChangePlayer();
        String expResult = "player2";
        String result = instance.CurrentPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    /**
     * Test of MakeMove method, of class TicTac.
     */
    @Test
    public void testMakeMovePlayer1() {
        System.out.println("MakeMove");
        int x = 1;
        TicTac instance = new TicTac();
        instance.board(9);
        instance.MakeMove(x);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
@Test
    public void testMakeMovePlayer2() {
        System.out.println("MakeMove");
        int x = 1;
        TicTac instance = new TicTac();
        instance.board(9);
        instance.ChangePlayer();
        instance.MakeMove(x);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /**
     * Test of SpaceInUse method, of class TicTac.
     */
    @Test
    public void testSpaceInUse() {
        System.out.println("SpaceInUse");
        int x = 2;
        TicTac instance = new TicTac();
        instance.board(9);
      
        String expResult = "Space is not occupied";
        String result = instance.SpaceInUse(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
