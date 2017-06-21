package com.example.android.miwok;

import android.widget.ImageView;

/**
 * Created by owais on 11/06/17.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private int mAudioResourceID;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;

    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public int getmAudioResourceID(){
        return mAudioResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }


//    public boolean hasAudio(){
//        return mAudioResourceID != NO_AUDIO_PROVIDED;
//    }
}
