package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import com.habitrpg.shared.habitica.models.AvatarHair;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.p6;
import qc.q;

/* compiled from: Hair.kt */
/* loaded from: classes4.dex */
public class Hair extends d1 implements BaseObject, AvatarHair, p6 {
    public static final int $stable = 8;
    private int bangs;
    private int base;
    private int beard;
    private String color;
    private int flower;
    private int mustache;

    public Hair() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public final int getBangs() {
        return realmGet$bangs();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public final int getBase() {
        return realmGet$base();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public final int getBeard() {
        return realmGet$beard();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public final String getColor() {
        return realmGet$color();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public final int getFlower() {
        return realmGet$flower();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public final int getMustache() {
        return realmGet$mustache();
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public boolean isAvailable(int i10) {
        return AvatarHair.DefaultImpls.isAvailable(this, i10);
    }

    @Override // io.realm.p6
    public int realmGet$bangs() {
        return this.bangs;
    }

    @Override // io.realm.p6
    public int realmGet$base() {
        return this.base;
    }

    @Override // io.realm.p6
    public int realmGet$beard() {
        return this.beard;
    }

    @Override // io.realm.p6
    public String realmGet$color() {
        return this.color;
    }

    @Override // io.realm.p6
    public int realmGet$flower() {
        return this.flower;
    }

    @Override // io.realm.p6
    public int realmGet$mustache() {
        return this.mustache;
    }

    @Override // io.realm.p6
    public void realmSet$bangs(int i10) {
        this.bangs = i10;
    }

    @Override // io.realm.p6
    public void realmSet$base(int i10) {
        this.base = i10;
    }

    @Override // io.realm.p6
    public void realmSet$beard(int i10) {
        this.beard = i10;
    }

    @Override // io.realm.p6
    public void realmSet$color(String str) {
        this.color = str;
    }

    @Override // io.realm.p6
    public void realmSet$flower(int i10) {
        this.flower = i10;
    }

    @Override // io.realm.p6
    public void realmSet$mustache(int i10) {
        this.mustache = i10;
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public final void setBangs(int i10) {
        realmSet$bangs(i10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public final void setBase(int i10) {
        realmSet$base(i10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public final void setBeard(int i10) {
        realmSet$beard(i10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public final void setColor(String str) {
        realmSet$color(str);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public final void setFlower(int i10) {
        realmSet$flower(i10);
    }

    @Override // com.habitrpg.shared.habitica.models.AvatarHair
    public final void setMustache(int i10) {
        realmSet$mustache(i10);
    }

    public Hair(int i10, int i11, int i12, int i13, String str, int i14) {
        q.i(str, "color");
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$mustache(i10);
        realmSet$beard(i11);
        realmSet$bangs(i12);
        realmSet$base(i13);
        realmSet$color(str);
        realmSet$flower(i14);
    }
}
