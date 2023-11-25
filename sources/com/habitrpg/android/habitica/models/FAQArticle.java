package com.habitrpg.android.habitica.models;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.r1;

/* compiled from: FAQArticle.kt */
/* loaded from: classes4.dex */
public class FAQArticle extends d1 implements BaseObject, r1 {
    public static final int $stable = 8;
    private String answer;
    private Integer position;
    private String question;

    public FAQArticle() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String getAnswer() {
        return realmGet$answer();
    }

    public final Integer getPosition() {
        return realmGet$position();
    }

    public final String getQuestion() {
        return realmGet$question();
    }

    @Override // io.realm.r1
    public String realmGet$answer() {
        return this.answer;
    }

    @Override // io.realm.r1
    public Integer realmGet$position() {
        return this.position;
    }

    @Override // io.realm.r1
    public String realmGet$question() {
        return this.question;
    }

    @Override // io.realm.r1
    public void realmSet$answer(String str) {
        this.answer = str;
    }

    @Override // io.realm.r1
    public void realmSet$position(Integer num) {
        this.position = num;
    }

    @Override // io.realm.r1
    public void realmSet$question(String str) {
        this.question = str;
    }

    public final void setAnswer(String str) {
        realmSet$answer(str);
    }

    public final void setPosition(Integer num) {
        realmSet$position(num);
    }

    public final void setQuestion(String str) {
        realmSet$question(str);
    }
}
