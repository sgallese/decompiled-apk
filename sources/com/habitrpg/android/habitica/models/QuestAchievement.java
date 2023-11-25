package com.habitrpg.android.habitica.models;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.t1;

/* compiled from: QuestAchievement.kt */
/* loaded from: classes4.dex */
public class QuestAchievement extends d1 implements BaseObject, t1 {
    public static final int $stable = 8;
    private String combinedKey;
    private int count;
    private String questKey;
    private String title;
    private String userID;

    public QuestAchievement() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String getCombinedKey() {
        return realmGet$combinedKey();
    }

    public final int getCount() {
        return realmGet$count();
    }

    public final String getQuestKey() {
        return realmGet$questKey();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUserID() {
        return realmGet$userID();
    }

    @Override // io.realm.t1
    public String realmGet$combinedKey() {
        return this.combinedKey;
    }

    @Override // io.realm.t1
    public int realmGet$count() {
        return this.count;
    }

    @Override // io.realm.t1
    public String realmGet$questKey() {
        return this.questKey;
    }

    @Override // io.realm.t1
    public String realmGet$userID() {
        return this.userID;
    }

    @Override // io.realm.t1
    public void realmSet$combinedKey(String str) {
        this.combinedKey = str;
    }

    @Override // io.realm.t1
    public void realmSet$count(int i10) {
        this.count = i10;
    }

    @Override // io.realm.t1
    public void realmSet$questKey(String str) {
        this.questKey = str;
    }

    @Override // io.realm.t1
    public void realmSet$userID(String str) {
        this.userID = str;
    }

    public final void setCombinedKey(String str) {
        realmSet$combinedKey(str);
    }

    public final void setCount(int i10) {
        realmSet$count(i10);
    }

    public final void setQuestKey(String str) {
        realmSet$questKey(str);
        realmSet$combinedKey(realmGet$userID() + realmGet$questKey());
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUserID(String str) {
        realmSet$userID(str);
        realmSet$combinedKey(realmGet$userID() + realmGet$questKey());
    }
}
