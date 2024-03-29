package com.github.cc3002.finalreality.model.weapon;

import com.github.francomiranda19.finalreality.model.weapon.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Set of tests for the {@code Axe} class.
 *
 * @author Franco Miranda Oyarzún
 * @see Axe
 */
public class AxeTest {
  private static final String AXE_NAME = "Test Axe";
  private Axe testAxe;
  private static final int DAMAGE = 15;
  private static final int WEIGHT = 10;

  /**
   * Setup method.
   */
  @BeforeEach
  void setUp() { testAxe = new Axe(AXE_NAME, DAMAGE, WEIGHT); }

  /**
   * Checks that the class' constructor and equals method works properly.
   */
  @Test
  void constructorTest() {
    var expectedAxe = new Axe(AXE_NAME, DAMAGE, WEIGHT);
    var notExpectedAxe1 = new Axe("Not Axe", DAMAGE, WEIGHT);
    var notExpectedAxe2 = new Axe(AXE_NAME, 57, WEIGHT);
    var notExpectedAxe3 = new Axe(AXE_NAME, DAMAGE, 9);

    assertEquals(testAxe, testAxe);
    assertEquals(expectedAxe, testAxe);
    assertEquals(expectedAxe.hashCode(), testAxe.hashCode());
    assertNotEquals(notExpectedAxe1, testAxe);
    assertNotEquals(notExpectedAxe1.hashCode(), testAxe.hashCode());
    assertNotEquals(notExpectedAxe2, testAxe);
    assertNotEquals(notExpectedAxe2.hashCode(), testAxe.hashCode());
    assertNotEquals(notExpectedAxe3, testAxe);
    assertNotEquals(notExpectedAxe3.hashCode(), testAxe.hashCode());
    assertNotEquals(testAxe, new Bow("Not Axe", DAMAGE, WEIGHT));
  }
}
