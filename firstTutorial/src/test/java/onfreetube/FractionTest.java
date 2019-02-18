package test.java.onfreetube;

import main.java.onfreetube.Fraction;
import org.junit.Test;

import static org.junit.Assert.*;


public class FractionTest {/*Написать класс FractionTest
    При написание тестов нам нужно предусмотреть 3 сценария
* регулярные входящие значения
* неправильны входящие значения
* пограничные значения*/
    // Написать тесты для конструктора

    /*@Test
    public void creationConstructorWithoutDenominator() {
        Fraction fraction = new Fraction(4);
        assertEquals(4, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }
    @Test
    public void creationConstructorWithNominatorAndDenominator() {
        Fraction fraction = new Fraction(4, 2);
        assertEquals(4, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test //Написать тесты для add метода
    //проверить что сложение работает для целых чисел как ожидается
    public void addWithTheDifferentDenominators() {
        Fraction fraction = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction fraction3 = fraction.add(fraction2);
        assertEquals(10, fraction3.getDenominator());
        assertEquals(8, fraction3.getDenominator());
    }

    @Test //проверить сложение с нулем
    public void addWithNull() {
        Fraction fraction = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(0, 0);
        Fraction fraction3 = fraction.add(fraction2);
        assertEquals(1, fraction3.getDenominator());
        assertEquals(2, fraction3.getDenominator());
    }

    @Test //проверить что a + b = b + a
    public void addWithChangePlacesComponents() {
        Fraction fraction = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 2);
        Fraction result1 = fraction.add(fraction2);
        Fraction result2 = fraction2.add(fraction);
        assertTrue(result1.equals(result2));
    }
    @Test
    public void addWithoutDenominators() {
        Fraction fraction1 = new Fraction(1);
        Fraction fraction2 = new Fraction(3);
        Fraction result1 = fraction1.add(fraction2);
        Fraction result2 = fraction2.add(fraction1);
        assertEquals(result1.getNumerator(), result2.getNumerator());
        assertEquals(result1.getDenominator(), result2.getDenominator());
    }
    @Test
    public void addWithNullAndWithoutDenominators() {
        Fraction fraction1 = new Fraction(5);
        Fraction fraction2 = new Fraction(0);
        Fraction result = fraction1.add(fraction2);
        assertEquals(5, result.getNumerator());
    }
    @Test
    public void addWithTheSimpleValue() {
        Fraction fraction1 = new Fraction(3);
        Fraction fraction2 = new Fraction(4, 5);
        Fraction result = fraction1.add(fraction2);
        assertEquals(19, result.getNumerator());
        assertEquals(5, result.getDenominator());
    }
    //Написать тесты для метода умножения (разработать самостоятельно)
    @Test
    public void multiplyWithTheDifferentDenominators() {
        Fraction fraction = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction fraction3 = fraction.multiply(fraction2);
        assertEquals(10, fraction3.getNumerator());
        assertEquals(8, fraction3.getDenominator());
    }
    @Test
    public void multiplyWithoutDenominators() {
        Fraction fraction1 = new Fraction(2);
        Fraction fraction2 = new Fraction(5);
        Fraction result1 = fraction1.multiply(fraction2);
        Fraction result2 = fraction2.multiply(fraction1);
        assertEquals(result1.getNumerator(), result2.getNumerator());
        assertEquals(result1.getDenominator(), result2.getDenominator());
    }
    @Test
    public void multiplyWithNullAndWithoutDenominators() {
        Fraction fraction1 = new Fraction(5);
        Fraction fraction2 = new Fraction(0);
        Fraction result = fraction1.multiply(fraction2);
        assertEquals(0, result.getNumerator());
    }
    @Test
    public void multiplyWithTheSimpleValue() {
        Fraction fraction1 = new Fraction(3);
        Fraction fraction2 = new Fraction(4, 5);
        Fraction result = fraction1.multiply(fraction2);
        assertEquals(12, result.getNumerator());
        assertEquals(5, result.getDenominator());
    }
    @Test(expected = ArithmeticException.class)
    public void testThrowsOnZeroDenominator() {
        new Fraction(1, 0);
    }
    // Написать тесты для toString
    @Test //для чисел со знаменателем =/= 1 (должно выводиться два числа через "/")
    public void testToString() {
        Fraction fraction = new Fraction(3, 5);
        assertEquals("3/5", fraction.toString());
    }
    @Test //для чисел со знаменателем == 1 (должно выводиться целое число)
    public void toStringDenominatorIsOne() {
        Fraction fraction = new Fraction(3, 1);
        assertEquals("3", String.valueOf(fraction.getNumerator()));
    }
    @Test
    public void toStringNumeratorIsNull() {
        Fraction fraction = new Fraction(0, 3);
        assertEquals("0", String.valueOf(fraction.getNumerator()));
    }


    //* для чисел требующих сокращения


    @Test
    public void toStringWithoutDenominators() {
        Fraction fraction = new Fraction(3);
        assertEquals("3", fraction.toString());
    }
    // Написать тесты для hashCode
    @Test
    public void testHashcode() {
        Fraction fraction = new Fraction(3, 4);
        int result = fraction.hashCode();
        assertEquals(3004, result);
    }
    @Test
    public void hashcodeNullValue() {
        Fraction fraction = new Fraction(0, 6);
        int result = fraction.hashCode();
        assertEquals(0, result);
    }
    //Написать тесты для сравнение на равенство
    @Test
    public void testEqualsTrue() {
        Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(3, 5);
        assertTrue(fraction1.equals(fraction2));
    }
    @Test
    public void testEqualsFalse() {
        Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(3, 8);
        assertFalse(fraction1.equals(fraction2));
    }
    @Test
    public void testEqualsFalseWithoutDenominators() {
        Fraction fraction1 = new Fraction(5);
        Fraction fraction2 = new Fraction(3);
        assertFalse(fraction1.equals(fraction2));
    }
    @Test
    public void testEqualsTrueWithoutDenominators() {
        Fraction fraction1 = new Fraction(6);
        Fraction fraction2 = new Fraction(6);
        assertTrue(fraction1.equals(fraction2));
    }
    //Написать тесты для сравнения дробей (compareTo)
    @Test
    public void compareToTheSameFractions() {
        Fraction fraction1 = new Fraction(4, 5);
        Fraction fraction2 = new Fraction(4, 5);
        assertEquals(0, fraction1.compareTo(fraction2));
        assertEquals(0, fraction2.compareTo(fraction1));
    }
    @Test
    public void compareToTheSameSimpleValues() {
        Fraction fraction1 = new Fraction(4);
        Fraction fraction2 = new Fraction(4);
        assertEquals(0, fraction1.compareTo(fraction2));
        assertEquals(0, fraction2.compareTo(fraction1));
    }
    @Test
    public void compareToTheSameSimpleValueAndFraction() {
        Fraction fraction1 = new Fraction(4);
        Fraction fraction2 = new Fraction(4, 1);
        assertEquals(0, fraction1.compareTo(fraction2));
        assertEquals(0, fraction2.compareTo(fraction1));
    }
    @Test
    public void compareToTheDifferentFraction() {
        Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(4, 5);
        assertEquals(-1, fraction1.compareTo(fraction2));
        assertEquals(1, fraction2.compareTo(fraction1));
    }

    @Test
    public void compareToTheDifferentSimpleValues() {
        Fraction fraction1 = new Fraction(3);
        Fraction fraction2 = new Fraction(4);
        assertEquals(-1, fraction1.compareTo(fraction2));
        assertEquals(1, fraction2.compareTo(fraction1));
    }
    @Test
    public void compareToTheDifferentSimpleValueAndFraction() {
        Fraction fraction1 = new Fraction(3);
        Fraction fraction2 = new Fraction(4, 1);
        assertEquals(-1, fraction1.compareTo(fraction2));
        assertEquals(1, fraction2.compareTo(fraction1));
    }*/
}






















    /*@Test
    public void testReduction(){
        Fraction fraction = Fraction.reduction(15, 20);
        assertEquals(3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }


    public void testReductionNoNeeded(){
        Fraction fraction = Fraction.reduction(19, 23);
        assertEquals(19, fraction.getNumerator());
        assertEquals(23, fraction.getDenominator());
    }*/



















