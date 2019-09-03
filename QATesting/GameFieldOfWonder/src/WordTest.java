import org.junit.Assert;
import org.junit.Test;

public class WordTest {
    Word word = new Word("stars", "some description");

    @Test
    public void testWordWithStars() {
        Assert.assertEquals("*****", word.getWordWithStars());
    }

    @Test
    public void testOpenCorrectLetter() {
        word.openLetter('t');
        Assert.assertEquals("*t***", word.getWordWithStars());

        word.openLetter('p');
        Assert.assertEquals("*t***", word.getWordWithStars());

        word.openLetter('s');
        Assert.assertEquals("st**s", word.getWordWithStars());
    }

    @Test
    public void testOpenIncorrectLetter() {
        word.openLetter('A');
        Assert.assertEquals("*****", word.getWordWithStars());

        word.openLetter('&');
        Assert.assertEquals("*****", word.getWordWithStars());

        word.openLetter('я');
        Assert.assertEquals("*****", word.getWordWithStars());
    }

    @Test
    public void testOpenCorrectWord() {
        word.openLetter('t');
        Assert.assertEquals("*t***", word.getWordWithStars());

        word.openLetter('p');
        Assert.assertEquals("*t***", word.getWordWithStars());

        word.openLetter('s');
        Assert.assertEquals("st**s", word.getWordWithStars());
    }

    @Test
    public void testOpenIncorrectWord() throws WrongWordLengthException {
        word.openWord("stars");
        Assert.assertEquals("stars", word.getWordWithStars());
    }

    @Test(expected = WrongWordLengthException.class)
    public void testOpenWordInvalidLength() throws WrongWordLengthException {
        word.openWord("banana");
    }
}
