package com.habitrpg.android.habitica.models;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.v1;
import qc.q;

/* compiled from: Skill.kt */
/* loaded from: classes4.dex */
public class Skill extends d1 implements BaseObject, v1 {
    public static final int $stable = 8;
    private String habitClass;
    private String key;
    private Integer lvl;
    private Integer mana;
    private String notes;
    private String target;
    private String text;

    public Skill() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$key("");
        realmSet$text("");
    }

    public final String getHabitClass() {
        return realmGet$habitClass();
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final Integer getLvl() {
        return realmGet$lvl();
    }

    public final Integer getMana() {
        return realmGet$mana();
    }

    public final String getNotes() {
        return realmGet$notes();
    }

    public final String getTarget() {
        return realmGet$target();
    }

    public final String getText() {
        return realmGet$text();
    }

    @Override // io.realm.v1
    public String realmGet$habitClass() {
        return this.habitClass;
    }

    @Override // io.realm.v1
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.v1
    public Integer realmGet$lvl() {
        return this.lvl;
    }

    @Override // io.realm.v1
    public Integer realmGet$mana() {
        return this.mana;
    }

    @Override // io.realm.v1
    public String realmGet$notes() {
        return this.notes;
    }

    @Override // io.realm.v1
    public String realmGet$target() {
        return this.target;
    }

    @Override // io.realm.v1
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.v1
    public void realmSet$habitClass(String str) {
        this.habitClass = str;
    }

    @Override // io.realm.v1
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.v1
    public void realmSet$lvl(Integer num) {
        this.lvl = num;
    }

    @Override // io.realm.v1
    public void realmSet$mana(Integer num) {
        this.mana = num;
    }

    @Override // io.realm.v1
    public void realmSet$notes(String str) {
        this.notes = str;
    }

    @Override // io.realm.v1
    public void realmSet$target(String str) {
        this.target = str;
    }

    @Override // io.realm.v1
    public void realmSet$text(String str) {
        this.text = str;
    }

    public final void setHabitClass(String str) {
        realmSet$habitClass(str);
    }

    public final void setKey(String str) {
        q.i(str, "<set-?>");
        realmSet$key(str);
    }

    public final void setLvl(Integer num) {
        realmSet$lvl(num);
    }

    public final void setMana(Integer num) {
        realmSet$mana(num);
    }

    public final void setNotes(String str) {
        realmSet$notes(str);
    }

    public final void setTarget(String str) {
        realmSet$target(str);
    }

    public final void setText(String str) {
        q.i(str, "<set-?>");
        realmSet$text(str);
    }
}
