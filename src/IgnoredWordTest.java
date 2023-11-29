import org.junit.jupiter.api.Test;

import javax.swing.text.Position;

import static org.junit.jupiter.api.Assertions.*;

class IgnoredWordTest {

    private Position createMockPosition(int offset) {
        return new Position() {
            @Override
            public int getOffset() {
                return offset;
            }
        };
    }

    @Test
    void getAndSetWord() {
        Position position = createMockPosition(0);
        IgnoredWord ignoredWord = new IgnoredWord("test", position);

        assertEquals("test", ignoredWord.getWord(), "getWord should return the word set in constructor");

        ignoredWord.setWord("newTest");
        assertEquals("newTest", ignoredWord.getWord(), "getWord should return the updated word");
    }

    @Test
    void getAndSetPosition() {
        Position position1 = createMockPosition(0);
        Position position2 = createMockPosition(1);
        IgnoredWord ignoredWord = new IgnoredWord("test", position1);

        assertEquals(position1, ignoredWord.getPosition(), "getPosition should return the position set in constructor");

        ignoredWord.setPosition(position2);
        assertEquals(position2, ignoredWord.getPosition(), "getPosition should return the updated position");
    }

    @Test
    void testEquals() {
        Position position = createMockPosition(0);
        IgnoredWord word1 = new IgnoredWord("test", position);
        IgnoredWord word2 = new IgnoredWord("test", position);
        IgnoredWord word3 = new IgnoredWord("different", position);

        assertEquals(word1, word2, "Two IgnoredWord objects with the same word and position should be equal");
        assertNotEquals(word1, word3, "IgnoredWord objects with different words should not be equal");
    }

    @Test
    void testHashCode() {
        Position position = createMockPosition(0);
        IgnoredWord word1 = new IgnoredWord("test", position);
        IgnoredWord word2 = new IgnoredWord("test", position);

        assertEquals(word1.hashCode(), word2.hashCode(), "Hash codes of two identical IgnoredWord objects should be the same");
    }
}