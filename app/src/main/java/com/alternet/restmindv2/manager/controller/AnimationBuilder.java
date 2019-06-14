package com.alternet.restmindv2.manager.controller;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

import com.alternet.restmindv2.manager.Contextor;

public class AnimationBuilder {

    //init singleton
    private static AnimationBuilder instance;

    public static AnimationBuilder getInstance() {
        if (instance == null){
            instance = new AnimationBuilder();
        }
        return instance;
    }

    private Context mContext;

    private AnimationBuilder(){ mContext = Contextor.getInstance().getContext(); }

    //TODO: class edit

    Animation anim;
    AnimationSet animSet;

    public Animation getAnim_alpha(float from, float to,long duration) {
        anim = new AlphaAnimation(from, to);
        anim.setDuration(duration);
        return anim ;
    }


    public Animation getAnim_rotate(float from, float to, long duration, long widthCenterRotate, long heightCenterRotate) {
        anim = new RotateAnimation(from, to , widthCenterRotate, heightCenterRotate);
        anim.setDuration(duration);
        return anim ;
    }


    public Animation getAnim_scale(float from, float to,long duration, long widthCenterScale, long heightCenterScale) {
        anim = new ScaleAnimation(from, to, widthCenterScale,heightCenterScale);
        anim.setDuration(duration);
        return anim ;
    }


    public Animation getAnim_translate(int scope, float fromX, float toX, float fromY, float toY,
                                       long duration) {
        anim = new TranslateAnimation(scope, fromX, scope, toX, scope, fromY, scope, toY);
//        anim.initialize(view.getWidth(), view.getHeight(), layout.getWidth(), layout.getHeight());
        anim.setDuration(duration);
        return anim ;
    }

    public void setAnim_alpha(Animation anim) {
        this.anim = anim;
    }

    public AnimationSet getAnimSet(long duration) {
        animSet = new AnimationSet(true);
        animSet.setDuration(duration);
        return animSet;
    }

    public void setAnimSet(AnimationSet animSet) {
        this.animSet = animSet;
    }
}
