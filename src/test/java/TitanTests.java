import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import titans.ArmoredTitan;

import java.io.IOException;

public class TitanTests {

    ArmoredTitan titan = ArmoredTitan.create();

    public TitanTests() throws IOException, ParseException {
    }

    @Test
    void armsTests() {

        // left arm tests
        assertFalse(titan.getLeftArmOrgan().takeDamage(60));
        assertEquals(42.5, titan.getLeftArmOrgan().getHp());
        assertFalse(titan.getLeftArmOrgan().getArmor().takeDamage(60));
        assertEquals(57.35, titan.getLeftArmOrgan().getArmor().getDurability());

        assertTrue(titan.getLeftArmOrgan().takeDamage(195));
        assertEquals(0.0, titan.getLeftArmOrgan().getHp());
        assertTrue(titan.getLeftArmOrgan().getArmor().takeDamage(195));
        assertEquals(0.0, titan.getLeftArmOrgan().getArmor().getDurability());

        // right arm tests
        assertFalse(titan.getRightArmOrgan().takeDamage(22.5));
        assertEquals(65.94, titan.getRightArmOrgan().getHp());
        assertFalse(titan.getRightArmOrgan().getArmor().takeDamage(22.5));
        assertEquals(68.38, titan.getRightArmOrgan().getArmor().getDurability());

        assertTrue(titan.getRightArmOrgan().takeDamage(232.5));
        assertEquals(0.0, titan.getRightArmOrgan().getHp());
        assertTrue(titan.getRightArmOrgan().getArmor().takeDamage(232.5));
        assertEquals(0.0, titan.getRightArmOrgan().getArmor().getDurability());

    }

    @Test
    void chestTests() {

        assertFalse(titan.getChestOrgan().takeDamage(85.85));
        assertEquals(173.51, titan.getChestOrgan().getHp());
        assertFalse(titan.getChestOrgan().getArmor().takeDamage(85.85));
        assertEquals(107.96, titan.getChestOrgan().getArmor().getDurability());

        assertFalse(titan.getChestOrgan().takeDamage(105));
        assertEquals(125.19, titan.getChestOrgan().getHp());
        assertFalse(titan.getChestOrgan().getArmor().takeDamage(105));
        assertEquals(99.35, titan.getChestOrgan().getArmor().getDurability());

        assertFalse(titan.getChestOrgan().takeDamage(220));
        assertEquals(14.47, titan.getChestOrgan().getHp());
        assertFalse(titan.getChestOrgan().getArmor().takeDamage(220));
        assertEquals(81.32, titan.getChestOrgan().getArmor().getDurability());

        assertTrue(titan.getChestOrgan().takeDamage(30));
        assertEquals(0.0, titan.getChestOrgan().getHp());
        assertFalse(titan.getChestOrgan().getArmor().takeDamage(30));
        assertEquals(78.86, titan.getChestOrgan().getArmor().getDurability());
    }

    @Test
    void faceTests() {

        assertFalse(titan.getFaceOrgan().takeDamage(25.75));
        assertEquals(11.98, titan.getFaceOrgan().getHp());
        assertFalse(titan.getFaceOrgan().getArmor().takeDamage(25.75));
        assertEquals(45.69, titan.getFaceOrgan().getArmor().getDurability());

        assertFalse(titan.getFaceOrgan().takeDamage(12));
        assertEquals(2.72, titan.getFaceOrgan().getHp());
        assertFalse(titan.getFaceOrgan().getArmor().takeDamage(12));
        assertEquals(39.02, titan.getFaceOrgan().getArmor().getDurability());

        assertTrue(titan.getFaceOrgan().takeDamage(4));
        assertEquals(0.0, titan.getFaceOrgan().getHp());
        assertFalse(titan.getFaceOrgan().getArmor().takeDamage(4));
        assertEquals(36.80, titan.getFaceOrgan().getArmor().getDurability());
    }

    @Test
    void footsTests() {

        // left foot tests
        assertFalse(titan.getLeftFootOrgan().takeDamage(40));
        assertEquals(20.26, titan.getLeftFootOrgan().getHp());
        assertFalse(titan.getLeftFootOrgan().getArmor().takeDamage(40));
        assertEquals(71.42, titan.getLeftFootOrgan().getArmor().getDurability());

        assertTrue(titan.getLeftFootOrgan().takeDamage(40));
        assertEquals(0.0, titan.getLeftFootOrgan().getHp());
        assertFalse(titan.getLeftFootOrgan().getArmor().takeDamage(40));
        assertEquals(66.54, titan.getLeftFootOrgan().getArmor().getDurability());

        // left right tests
        assertTrue(titan.getRightFootOrgan().takeDamage(100));
        assertEquals(0.0, titan.getRightFootOrgan().getHp());
        assertFalse(titan.getRightFootOrgan().getArmor().takeDamage(100));
        assertEquals(64.10, titan.getRightFootOrgan().getArmor().getDurability());
    }

    @Test
    void legsTests() {

        // left leg tests
        assertFalse(titan.getLeftLegOrgan().takeDamage(32.425));
        assertEquals(40.41, titan.getLeftLegOrgan().getHp());
        assertFalse(titan.getLeftLegOrgan().getArmor().takeDamage(32.425));
        assertEquals(107.30, titan.getLeftLegOrgan().getArmor().getDurability());

        assertFalse(titan.getLeftLegOrgan().takeDamage(66.66));
        assertEquals(9.51, titan.getLeftLegOrgan().getHp());
        assertFalse(titan.getLeftLegOrgan().getArmor().takeDamage(66.66));
        assertEquals(101.75, titan.getLeftLegOrgan().getArmor().getDurability());

        assertTrue(titan.getLeftLegOrgan().takeDamage(20));
        assertEquals(0.0, titan.getLeftLegOrgan().getHp());
        assertFalse(titan.getLeftLegOrgan().getArmor().takeDamage(20));
        assertEquals(100.08, titan.getLeftLegOrgan().getArmor().getDurability());

        // right leg tests
        assertFalse(titan.getRightLegOrgan().takeDamage(60));
        assertEquals(28, titan.getRightLegOrgan().getHp());
        assertFalse(titan.getRightLegOrgan().getArmor().takeDamage(60));
        assertEquals(105, titan.getRightLegOrgan().getArmor().getDurability());

        assertTrue(titan.getRightLegOrgan().takeDamage(68));
        assertEquals(0.0, titan.getRightLegOrgan().getHp());
        assertFalse(titan.getRightLegOrgan().getArmor().takeDamage(60));
        assertEquals(100, titan.getRightLegOrgan().getArmor().getDurability());
    }

    @Test
    void neckTests() {

        assertFalse(titan.getNeckOrgan().takeDamage(50.50));
        assertEquals(7.13, titan.getNeckOrgan().getHp());
        assertFalse(titan.getNeckOrgan().getArmor().takeDamage(50.50));
        assertEquals(25.95, titan.getNeckOrgan().getArmor().getDurability());

        assertTrue(titan.getNeckOrgan().takeDamage(17));
        assertEquals(0.0, titan.getNeckOrgan().getHp());
        assertFalse(titan.getNeckOrgan().getArmor().takeDamage(17));
        assertEquals(17.85, titan.getNeckOrgan().getArmor().getDurability());
    }

    @Test
    void stomachTests() {

        assertFalse(titan.getStomachOrgan().takeDamage(80));
        assertEquals(10, titan.getStomachOrgan().getHp());
        assertFalse(titan.getStomachOrgan().getArmor().takeDamage(80));
        assertEquals(92.86, titan.getStomachOrgan().getArmor().getDurability());

        assertTrue(titan.getStomachOrgan().takeDamage(75));
        assertEquals(0.0, titan.getStomachOrgan().getHp());
        assertFalse(titan.getStomachOrgan().getArmor().takeDamage(75));
        assertEquals(86.16, titan.getStomachOrgan().getArmor().getDurability());
    }

    @Test
    void ifArmArmorBreaksTests() {

        // left arm tests
        assertTrue(titan.getLeftArmOrgan().getArmor().takeDamage(255));
        assertEquals(0.0, titan.getLeftArmOrgan().getArmor().getDurability());

        assertFalse(titan.getLeftArmOrgan().takeDamage(60.657));
        assertEquals(19.34, titan.getLeftArmOrgan().getHp());

        // right arm tests
        assertTrue(titan.getRightArmOrgan().getArmor().takeDamage(285));
        assertEquals(0.0, titan.getRightArmOrgan().getArmor().getDurability());

        assertFalse(titan.getRightArmOrgan().takeDamage(45));
        assertEquals(35, titan.getRightArmOrgan().getHp());
    }

    @Test
    void ifChestArmorBreaksTests() {

        assertTrue(titan.getChestOrgan().getArmor().takeDamage(1403));
        assertEquals(0.0, titan.getChestOrgan().getArmor().getDurability());

        assertFalse(titan.getChestOrgan().takeDamage(200));
        assertEquals(10, titan.getChestOrgan().getHp());
    }

    @Test
    void ifFaceArmorBreaksTests() {

        assertTrue(titan.getFaceOrgan().getArmor().takeDamage(108));
        assertEquals(0.0, titan.getFaceOrgan().getArmor().getDurability());

        assertFalse(titan.getFaceOrgan().takeDamage(25));
        assertEquals(5, titan.getFaceOrgan().getHp());
    }

    @Test
    void ifFootArmorBreaksTests() {

        // left foot tests
        assertTrue(titan.getLeftFootOrgan().getArmor().takeDamage(626));
        assertEquals(0.0, titan.getLeftFootOrgan().getArmor().getDurability());

        assertTrue(titan.getLeftFootOrgan().takeDamage(45));
        assertEquals(0.0, titan.getLeftFootOrgan().getHp());


        // left right tests
        assertTrue(titan.getRightFootOrgan().getArmor().takeDamage(700));
        assertEquals(0.0, titan.getRightFootOrgan().getArmor().getDurability());

        assertFalse(titan.getRightFootOrgan().takeDamage(40));
        assertEquals(5, titan.getRightFootOrgan().getHp());
    }

    @Test
    void ifLegArmorBreaksTests() {

        // left leg tests
        assertTrue(titan.getLeftLegOrgan().getArmor().takeDamage(1400));
        assertEquals(0.0, titan.getLeftLegOrgan().getArmor().getDurability());

        assertFalse(titan.getLeftLegOrgan().takeDamage(10));
        assertEquals(45, titan.getLeftLegOrgan().getHp());



        // right leg tests
        assertTrue(titan.getRightLegOrgan().getArmor().takeDamage(1400));
        assertEquals(0.0, titan.getRightLegOrgan().getArmor().getDurability());

        assertTrue(titan.getRightLegOrgan().takeDamage(60));
        assertEquals(0.0, titan.getRightLegOrgan().getHp());
    }

    @Test
    void ifNeckArmorBreaksTests() {

        assertTrue(titan.getNeckOrgan().getArmor().takeDamage(120));
        assertEquals(0.0, titan.getNeckOrgan().getArmor().getDurability());

        assertTrue(titan.getNeckOrgan().takeDamage(45));
        assertEquals(0.0, titan.getNeckOrgan().getHp());
    }

    @Test
    void ifStomachArmorBreaksTests() {

        assertTrue(titan.getStomachOrgan().getArmor().takeDamage(1125));
        assertEquals(0.0, titan.getStomachOrgan().getArmor().getDurability());

        assertFalse(titan.getStomachOrgan().takeDamage(45));
        assertEquals(5, titan.getStomachOrgan().getHp());
    }
}
