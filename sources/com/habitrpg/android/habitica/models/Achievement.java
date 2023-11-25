package com.habitrpg.android.habitica.models;

import io.realm.d1;
import io.realm.internal.o;
import io.realm.p1;

/* compiled from: Achievement.kt */
/* loaded from: classes4.dex */
public class Achievement extends d1 implements BaseObject, p1 {
    public static final int $stable = 8;
    private String category;
    private boolean earned;
    private String icon;
    private int index;
    private String key;
    private Integer optionalCount;
    private String text;
    private String title;
    private String type;

    public Achievement() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String getCategory() {
        return realmGet$category();
    }

    public final boolean getEarned() {
        return realmGet$earned();
    }

    public final String getIcon() {
        return realmGet$icon();
    }

    public final int getIndex() {
        return realmGet$index();
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final Integer getOptionalCount() {
        return realmGet$optionalCount();
    }

    public final String getText() {
        return realmGet$text();
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final String getType() {
        return realmGet$type();
    }

    @Override // io.realm.p1
    public String realmGet$category() {
        return this.category;
    }

    @Override // io.realm.p1
    public boolean realmGet$earned() {
        return this.earned;
    }

    @Override // io.realm.p1
    public String realmGet$icon() {
        return this.icon;
    }

    @Override // io.realm.p1
    public int realmGet$index() {
        return this.index;
    }

    @Override // io.realm.p1
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.p1
    public Integer realmGet$optionalCount() {
        return this.optionalCount;
    }

    @Override // io.realm.p1
    public String realmGet$text() {
        return this.text;
    }

    @Override // io.realm.p1
    public String realmGet$title() {
        return this.title;
    }

    @Override // io.realm.p1
    public String realmGet$type() {
        return this.type;
    }

    @Override // io.realm.p1
    public void realmSet$category(String str) {
        this.category = str;
    }

    @Override // io.realm.p1
    public void realmSet$earned(boolean z10) {
        this.earned = z10;
    }

    @Override // io.realm.p1
    public void realmSet$icon(String str) {
        this.icon = str;
    }

    @Override // io.realm.p1
    public void realmSet$index(int i10) {
        this.index = i10;
    }

    @Override // io.realm.p1
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.p1
    public void realmSet$optionalCount(Integer num) {
        this.optionalCount = num;
    }

    @Override // io.realm.p1
    public void realmSet$text(String str) {
        this.text = str;
    }

    @Override // io.realm.p1
    public void realmSet$title(String str) {
        this.title = str;
    }

    @Override // io.realm.p1
    public void realmSet$type(String str) {
        this.type = str;
    }

    public final void setCategory(String str) {
        realmSet$category(str);
    }

    public final void setEarned(boolean z10) {
        realmSet$earned(z10);
    }

    public final void setIcon(String str) {
        realmSet$icon(str);
    }

    public final void setIndex(int i10) {
        realmSet$index(i10);
    }

    public final void setKey(String str) {
        realmSet$key(str);
    }

    public final void setOptionalCount(Integer num) {
        realmSet$optionalCount(num);
    }

    public final void setText(String str) {
        realmSet$text(str);
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final void setType(String str) {
        realmSet$type(str);
    }
}
