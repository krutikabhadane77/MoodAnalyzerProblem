package com.moodanalyzer.test;
import com.moodanalyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturn_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Sad Message");
        Assert.assertEquals("SAD",moodAnalyzer.analyseMood());
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Happy Message");
        Assert.assertEquals("HAPPY",moodAnalyzer.analyseMood());
    }
}
