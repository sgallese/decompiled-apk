package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    private final c f10654f;

    /* renamed from: m  reason: collision with root package name */
    private final c f10655m;

    /* renamed from: p  reason: collision with root package name */
    final int f10656p;

    /* renamed from: q  reason: collision with root package name */
    int f10657q;

    /* renamed from: r  reason: collision with root package name */
    int f10658r;

    /* renamed from: s  reason: collision with root package name */
    int f10659s;

    /* renamed from: t  reason: collision with root package name */
    int f10660t;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<TimeModel> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i10) {
        if (i10 >= 12) {
            return 1;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.f10657q == timeModel.f10657q && this.f10658r == timeModel.f10658r && this.f10656p == timeModel.f10656p && this.f10659s == timeModel.f10659s) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10656p), Integer.valueOf(this.f10657q), Integer.valueOf(this.f10658r), Integer.valueOf(this.f10659s)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10657q);
        parcel.writeInt(this.f10658r);
        parcel.writeInt(this.f10659s);
        parcel.writeInt(this.f10656p);
    }

    public TimeModel(int i10) {
        this(0, 0, 10, i10);
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f10657q = i10;
        this.f10658r = i11;
        this.f10659s = i12;
        this.f10656p = i13;
        this.f10660t = c(i10);
        this.f10654f = new c(59);
        this.f10655m = new c(i13 == 1 ? 23 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
