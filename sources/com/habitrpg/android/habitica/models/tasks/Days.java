package com.habitrpg.android.habitica.models.tasks;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.habitrpg.android.habitica.R;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.j5;
import java.util.ArrayList;
import java.util.List;
import qc.h;
import qc.q;

/* compiled from: Days.kt */
/* loaded from: classes4.dex */
public class Days extends d1 implements Parcelable, j5 {

    /* renamed from: f  reason: collision with root package name */
    private boolean f12524f;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12525m;

    /* renamed from: s  reason: collision with root package name */
    private boolean f12526s;
    private boolean su;

    /* renamed from: t  reason: collision with root package name */
    private boolean f12527t;
    private boolean th;

    /* renamed from: w  reason: collision with root package name */
    private boolean f12528w;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* compiled from: Days.kt */
    /* loaded from: classes4.dex */
    public static final class CREATOR implements Parcelable.Creator<Days> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(h hVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Days createFromParcel(Parcel parcel) {
            q.i(parcel, "parcel");
            return new Days(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Days[] newArray(int i10) {
            return new Days[i10];
        }
    }

    public Days() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$m(true);
        realmSet$t(true);
        realmSet$w(true);
        realmSet$th(true);
        realmSet$f(true);
        realmSet$s(true);
        realmSet$su(true);
    }

    public final List<String> dayStrings(Context context) {
        q.i(context, "context");
        ArrayList arrayList = new ArrayList();
        if (realmGet$m()) {
            String string = context.getString(R.string.monday);
            q.h(string, "getString(...)");
            arrayList.add(string);
        }
        if (realmGet$t()) {
            String string2 = context.getString(R.string.tuesday);
            q.h(string2, "getString(...)");
            arrayList.add(string2);
        }
        if (realmGet$w()) {
            String string3 = context.getString(R.string.wednesday);
            q.h(string3, "getString(...)");
            arrayList.add(string3);
        }
        if (realmGet$th()) {
            String string4 = context.getString(R.string.thursday);
            q.h(string4, "getString(...)");
            arrayList.add(string4);
        }
        if (realmGet$f()) {
            String string5 = context.getString(R.string.friday);
            q.h(string5, "getString(...)");
            arrayList.add(string5);
        }
        if (realmGet$s()) {
            String string6 = context.getString(R.string.saturday);
            q.h(string6, "getString(...)");
            arrayList.add(string6);
        }
        if (realmGet$su()) {
            String string7 = context.getString(R.string.sunday);
            q.h(string7, "getString(...)");
            arrayList.add(string7);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean getF() {
        return realmGet$f();
    }

    public final boolean getM() {
        return realmGet$m();
    }

    public final boolean getS() {
        return realmGet$s();
    }

    public final boolean getSu() {
        return realmGet$su();
    }

    public final boolean getT() {
        return realmGet$t();
    }

    public final boolean getTh() {
        return realmGet$th();
    }

    public final boolean getW() {
        return realmGet$w();
    }

    public final boolean isEveryDay() {
        if (realmGet$m() && realmGet$t() && realmGet$w() && realmGet$th() && realmGet$f() && realmGet$s() && realmGet$su()) {
            return true;
        }
        return false;
    }

    public final boolean isOnlyWeekdays() {
        if (realmGet$m() && realmGet$t() && realmGet$w() && realmGet$th() && realmGet$f() && !realmGet$s() && !realmGet$su()) {
            return true;
        }
        return false;
    }

    public final boolean isOnlyWeekends() {
        if (!realmGet$m() && !realmGet$t() && !realmGet$w() && !realmGet$th() && !realmGet$f() && realmGet$s() && realmGet$su()) {
            return true;
        }
        return false;
    }

    @Override // io.realm.j5
    public boolean realmGet$f() {
        return this.f12524f;
    }

    @Override // io.realm.j5
    public boolean realmGet$m() {
        return this.f12525m;
    }

    @Override // io.realm.j5
    public boolean realmGet$s() {
        return this.f12526s;
    }

    @Override // io.realm.j5
    public boolean realmGet$su() {
        return this.su;
    }

    @Override // io.realm.j5
    public boolean realmGet$t() {
        return this.f12527t;
    }

    @Override // io.realm.j5
    public boolean realmGet$th() {
        return this.th;
    }

    @Override // io.realm.j5
    public boolean realmGet$w() {
        return this.f12528w;
    }

    @Override // io.realm.j5
    public void realmSet$f(boolean z10) {
        this.f12524f = z10;
    }

    @Override // io.realm.j5
    public void realmSet$m(boolean z10) {
        this.f12525m = z10;
    }

    @Override // io.realm.j5
    public void realmSet$s(boolean z10) {
        this.f12526s = z10;
    }

    @Override // io.realm.j5
    public void realmSet$su(boolean z10) {
        this.su = z10;
    }

    @Override // io.realm.j5
    public void realmSet$t(boolean z10) {
        this.f12527t = z10;
    }

    @Override // io.realm.j5
    public void realmSet$th(boolean z10) {
        this.th = z10;
    }

    @Override // io.realm.j5
    public void realmSet$w(boolean z10) {
        this.f12528w = z10;
    }

    public final void setF(boolean z10) {
        realmSet$f(z10);
    }

    public final void setM(boolean z10) {
        realmSet$m(z10);
    }

    public final void setS(boolean z10) {
        realmSet$s(z10);
    }

    public final void setSu(boolean z10) {
        realmSet$su(z10);
    }

    public final void setT(boolean z10) {
        realmSet$t(z10);
    }

    public final void setTh(boolean z10) {
        realmSet$th(z10);
    }

    public final void setW(boolean z10) {
        realmSet$w(z10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        q.i(parcel, "dest");
        parcel.writeByte(realmGet$m() ? (byte) 1 : (byte) 0);
        parcel.writeByte(realmGet$t() ? (byte) 1 : (byte) 0);
        parcel.writeByte(realmGet$w() ? (byte) 1 : (byte) 0);
        parcel.writeByte(realmGet$th() ? (byte) 1 : (byte) 0);
        parcel.writeByte(realmGet$f() ? (byte) 1 : (byte) 0);
        parcel.writeByte(realmGet$s() ? (byte) 1 : (byte) 0);
        parcel.writeByte(realmGet$su() ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected Days(Parcel parcel) {
        this();
        q.i(parcel, "in");
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$m(parcel.readByte() != 0);
        realmSet$t(parcel.readByte() != 0);
        realmSet$w(parcel.readByte() != 0);
        realmSet$th(parcel.readByte() != 0);
        realmSet$f(parcel.readByte() != 0);
        realmSet$s(parcel.readByte() != 0);
        realmSet$su(parcel.readByte() != 0);
    }
}
