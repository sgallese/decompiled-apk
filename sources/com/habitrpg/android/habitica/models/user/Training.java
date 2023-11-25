package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import fa.c;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.x7;

/* compiled from: Training.kt */
/* loaded from: classes4.dex */
public class Training extends d1 implements BaseObject, x7 {
    public static final int $stable = 8;
    @c("int")
    private float _int;
    private float con;
    private float per;
    private float str;

    public Training() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final float getCon() {
        return realmGet$con();
    }

    public final float getPer() {
        return realmGet$per();
    }

    public final float getStr() {
        return realmGet$str();
    }

    public final float get_int() {
        return realmGet$_int();
    }

    public final void merge(Training training) {
        if (training == null) {
            return;
        }
        realmSet$con(training.realmGet$con());
        realmSet$str(training.realmGet$str());
        realmSet$per(training.realmGet$per());
        realmSet$_int(training.realmGet$_int());
    }

    @Override // io.realm.x7
    public float realmGet$_int() {
        return this._int;
    }

    @Override // io.realm.x7
    public float realmGet$con() {
        return this.con;
    }

    @Override // io.realm.x7
    public float realmGet$per() {
        return this.per;
    }

    @Override // io.realm.x7
    public float realmGet$str() {
        return this.str;
    }

    @Override // io.realm.x7
    public void realmSet$_int(float f10) {
        this._int = f10;
    }

    @Override // io.realm.x7
    public void realmSet$con(float f10) {
        this.con = f10;
    }

    @Override // io.realm.x7
    public void realmSet$per(float f10) {
        this.per = f10;
    }

    @Override // io.realm.x7
    public void realmSet$str(float f10) {
        this.str = f10;
    }

    public final void setCon(float f10) {
        realmSet$con(f10);
    }

    public final void setPer(float f10) {
        realmSet$per(f10);
    }

    public final void setStr(float f10) {
        realmSet$str(f10);
    }

    public final void set_int(float f10) {
        realmSet$_int(f10);
    }
}
