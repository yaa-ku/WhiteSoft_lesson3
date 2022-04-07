package Transport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    @Test
    void testEngineWorkEngineIsWorking() {
        Engine engine = new Engine();
        engine.Work();

        assertEquals("i'm working!", engine.Work());
    }

    @Test
    void testEngineWorkEngineIsRuined() {
        Engine engine = new Engine();
        engine.setWorking(false);
        engine.Work();

        assertEquals("i'm not working! repair me!", engine.Work());
    }

    @Test
    void testEngineRuin() {
        Engine engine = new Engine();
        engine.Ruin();

        assertFalse(engine.isWorking());
    }

    @Test
    void testEngineRepair() {
        Engine engine = new Engine();
        engine.setWorking(false);
        engine.Repair();

        assertTrue(engine.isWorking());
    }
}