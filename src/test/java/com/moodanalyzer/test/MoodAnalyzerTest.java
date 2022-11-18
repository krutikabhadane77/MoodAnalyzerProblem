package com.moodanalyzer.test;
import com.moodanalyzer.MoodAnalyzer;
import com.moodanalyzer.exception.MoodAnalysisException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturn_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Sad Message");
        try {
            Assert.assertEquals("SAD", moodAnalyzer.analyseMood());
        } catch (MoodAnalysisException e) {
        }
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Happy Message");
        try {
            Assert.assertEquals("HAPPY", moodAnalyzer.analyseMood());
        } catch (MoodAnalysisException e) {
        }
    }
    @Test
    public void nullMood_ShouldReturn_Happy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        ExpectedException expectedException = ExpectedException.none();
        expectedException.expect(MoodAnalysisException.class);
        Assert.assertEquals("HAPPY",mood);

    }

    @Test
    public void nullMood_ThrowException(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyseMood(null);
        }
        catch (MoodAnalysisException e){
            Assert.assertEquals(MoodAnalysisException.exceptionType.NULL,e.type);
        }
    }
}
