package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;

    /**
     *
     * @param defaultTranslation
     * @param miwokTranslation
     */
    public Word (String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     *  @param defaultTranslation
     * @param miwokTranslation
     * @param ImageResourceId
     */
    public Word (String defaultTranslation, String miwokTranslation, int ImageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
    }

    /**
     *
     * @return És un string
     */
    public String getDefaultTranslation (){
        return mDefaultTranslation;
    }

    /**
     *
     * @return És un string
     */
    public String getMiwokTranslation (){
        return mMiwokTranslation;
    }

    /**
     *
     * @return es un integuer
     */
    public int getImageResourceId (){return  mImageResourceId;}

}
