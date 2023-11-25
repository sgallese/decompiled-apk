package com.habitrpg.android.habitica.models.inventory;

import android.graphics.Color;
import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.f3;
import io.realm.internal.o;

/* compiled from: QuestColors.kt */
/* loaded from: classes4.dex */
public class QuestColors extends d1 implements BaseObject, f3 {
    public static final int $stable = 8;
    private String dark;
    private String extralight;
    private String key;
    private String light;
    private String medium;

    public QuestColors() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final String getDark() {
        return realmGet$dark();
    }

    public final int getDarkColor() {
        return Color.parseColor(realmGet$dark());
    }

    public final int getExtraLightColor() {
        return Color.parseColor(realmGet$extralight());
    }

    public final String getExtralight() {
        return realmGet$extralight();
    }

    public final String getKey() {
        return realmGet$key();
    }

    public final String getLight() {
        return realmGet$light();
    }

    public final int getLightColor() {
        return Color.parseColor(realmGet$light());
    }

    public final String getMedium() {
        return realmGet$medium();
    }

    public final int getMediumColor() {
        return Color.parseColor(realmGet$medium());
    }

    @Override // io.realm.f3
    public String realmGet$dark() {
        return this.dark;
    }

    @Override // io.realm.f3
    public String realmGet$extralight() {
        return this.extralight;
    }

    @Override // io.realm.f3
    public String realmGet$key() {
        return this.key;
    }

    @Override // io.realm.f3
    public String realmGet$light() {
        return this.light;
    }

    @Override // io.realm.f3
    public String realmGet$medium() {
        return this.medium;
    }

    @Override // io.realm.f3
    public void realmSet$dark(String str) {
        this.dark = str;
    }

    @Override // io.realm.f3
    public void realmSet$extralight(String str) {
        this.extralight = str;
    }

    @Override // io.realm.f3
    public void realmSet$key(String str) {
        this.key = str;
    }

    @Override // io.realm.f3
    public void realmSet$light(String str) {
        this.light = str;
    }

    @Override // io.realm.f3
    public void realmSet$medium(String str) {
        this.medium = str;
    }

    public final void setDark(String str) {
        realmSet$dark(str);
    }

    public final void setExtralight(String str) {
        realmSet$extralight(str);
    }

    public final void setKey(String str) {
        realmSet$key(str);
    }

    public final void setLight(String str) {
        realmSet$light(str);
    }

    public final void setMedium(String str) {
        realmSet$medium(str);
    }
}
