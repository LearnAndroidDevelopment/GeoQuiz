package me.fanbin.android.geoquiz;

/**
 * Created by fanbin on 2017/9/7 0007.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textRestId, boolean answerTrue) {
        mTextResId = textRestId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
