package com.github.cc3002.finalreality.model.weapon;

import com.github.francomiranda19.finalreality.model.weapon.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Set of tests for the {@code Staff} class.
 *
 * @author Franco Miranda Oyarzún
 * @see Staff
 */
public class StaffTest {
  private static final String STAFF_NAME = "Test Staff";
  private Staff testStaff;
  protected static final int DAMAGE = 15;
  protected static final int WEIGHT = 10;
  protected static final int MAGIC_DAMAGE = 40;

  /**
   * Setup method.
   */
  @BeforeEach
  void setUp() {
    testStaff = new Staff(STAFF_NAME, DAMAGE, WEIGHT, MAGIC_DAMAGE);
  }

  /**
   * Checks that the class' constructor and equals method works properly.
   */
  @Test
  void constructorTest() {
    var expectedStaff = new Staff(STAFF_NAME, DAMAGE, WEIGHT, MAGIC_DAMAGE);
    var notExpectedStaff1 = new Staff("Not Staff", DAMAGE, WEIGHT, MAGIC_DAMAGE);
    var notExpectedStaff2 = new Staff(STAFF_NAME, 32, WEIGHT, MAGIC_DAMAGE);
    var notExpectedStaff3 = new Staff(STAFF_NAME, DAMAGE, 12, MAGIC_DAMAGE);
    var notExpectedStaff4 = new Staff(STAFF_NAME, DAMAGE, WEIGHT, 5);

    assertEquals(testStaff, testStaff);
    assertEquals(expectedStaff, testStaff);
    assertEquals(expectedStaff.hashCode(), testStaff.hashCode());
    assertNotEquals(notExpectedStaff1, testStaff);
    assertNotEquals(notExpectedStaff1.hashCode(), testStaff.hashCode());
    assertNotEquals(notExpectedStaff2, testStaff);
    assertNotEquals(notExpectedStaff2.hashCode(), testStaff.hashCode());
    assertNotEquals(notExpectedStaff3, testStaff);
    assertNotEquals(notExpectedStaff3.hashCode(), testStaff.hashCode());
    assertNotEquals(notExpectedStaff4, testStaff);
    assertNotEquals(notExpectedStaff4.hashCode(), testStaff.hashCode());
    assertNotEquals(testStaff, new Axe("Not Staff", DAMAGE, WEIGHT));
  }

  /**
   * Checks if the staffs' magicDamage is correct.
   */
  @Test
  void magicDamageTest() {
    assertEquals(MAGIC_DAMAGE, testStaff.getMagicDamage());
    assertNotEquals(MAGIC_DAMAGE + 5, testStaff.getMagicDamage());
  }

}
