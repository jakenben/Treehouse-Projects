package com.teamtreehouse.pomodoro.model;

/**
 * Created by jaken on 11/25/2018.
 */
public class Attempt {

    private String mMessage;
    private int mRemainingSeconds;
    private AttemptKind mKind;

    public void tick() {
        mRemainingSeconds--;
    }

    public void save() {
        System.out.printf("Saving: %s %n");
    }

    public enum AttemptKind {
        FOCUS(25 * 60, "Focus Time"),
        BREAK(5 * 60, "Break Time");

        private int mTotalSeconds;
        private String mDisplayName;

        AttemptKind(int totalSeconds, String displayName) {
            mTotalSeconds = totalSeconds;
            mDisplayName = displayName;
        }

        public int getTotalSeconds() {
            return mTotalSeconds;
        }

        public String getDisplayName() {
            return mDisplayName;
        }
    }

    public Attempt(AttemptKind kind, String message) {
        mKind = kind;
        mMessage = message;
        mRemainingSeconds = kind.getTotalSeconds();
    }

    public void setMessage(String message) {
        this.mMessage = message;
    }

    public String getMessage() {
        return mMessage;
    }

    public int getRemainingSeconds() {
        return mRemainingSeconds;
    }

    public AttemptKind getKind() {
        return mKind;
    }
}
