package com.example.miwok_workshop;

public class MiwokModel {
    String miwokWord, miwokTranslation;
    int imageResId = 0;

    public MiwokModel(String mMiwokword, String mMiwokTranslation, int mImageResId) {
        this.miwokWord = mMiwokword;
        this.miwokTranslation = mMiwokTranslation;
        this.imageResId = mImageResId;
    }

    public MiwokModel(String mMiwokWord, String mMiwokTranslation) {
        this.miwokWord = mMiwokWord;
        this.miwokTranslation = mMiwokTranslation;
    }

    public String getMiwokWord() {

        return miwokWord;
    }

    public void setMiwokWord(String miwokWord) {

        this.miwokWord = miwokWord;
    }

    public String getMiwokTranslation() {

        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {

        this.miwokTranslation = miwokTranslation;
    }

    public int getImageResId() {

        return imageResId;
    }

    public void setImageResId(int imageResId) {

        this.imageResId = imageResId;
    }

    public boolean hasImage() {
        return imageResId != 0;
    }

}
