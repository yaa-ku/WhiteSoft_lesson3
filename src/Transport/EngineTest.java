package Transport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    @Test
    void testWorkEngineIsWorking() {
        Engine engine = new Engine();
        engine.Work();

        assertEquals("i'm working!", engine.Work());
    }

    @Test
    void testWorkEngineIsRuined() {
        Engine engine = new Engine();
        engine.setWorking(false);
        engine.Work();

        assertEquals("i'm not working! repair me!", engine.Work());
    }

    @Test
    void testRuin() {
        Engine engine = new Engine();
        engine.Ruin();

        assertFalse(engine.isWorking());
    }

    @Test
    void testRepair() {
        Engine engine = new Engine();
        engine.setWorking(false);
        engine.Repair();

        assertTrue(engine.isWorking());
    }
}