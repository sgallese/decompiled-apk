package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Calendar f9896f;

    /* renamed from: m  reason: collision with root package name */
    final int f9897m;

    /* renamed from: p  reason: collision with root package name */
    final int f9898p;

    /* renamed from: q  reason: collision with root package name */
    final int f9899q;

    /* renamed from: r  reason: collision with root package name */
    final int f9900r;

    /* renamed from: s  reason: collision with root package name */
    final long f9901s;

    /* renamed from: t  reason: collision with root package name */
    private String f9902t;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<Month> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.d(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d10 = u.d(calendar);
        this.f9896f = d10;
        this.f9897m = d10.get(2);
        this.f9898p = d10.get(1);
        this.f9899q = d10.getMaximum(7);
        this.f9900r = d10.getActualMaximum(5);
        this.f9901s = d10.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Month d(int i10, int i11) {
        Calendar k10 = u.k();
        k10.set(1, i10);
        k10.set(2, i11);
        return new Month(k10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Month f(long j10) {
        Calendar k10 = u.k();
        k10.setTimeInMillis(j10);
        return new Month(k10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Month g() {
        return new Month(u.i());
    }

    @Override // java.lang.Comparable
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f9896f.compareTo(month.f9896f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f9897m == month.f9897m && this.f9898p == month.f9898p) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9897m), Integer.valueOf(this.f9898p)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i(int i10) {
        int i11 = this.f9896f.get(7);
        if (i10 <= 0) {
            i10 = this.f9896f.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            return i12 + this.f9899q;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long k(int i10) {
        Calendar d10 = u.d(this.f9896f);
        d10.set(5, i10);
        return d10.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l(long j10) {
        Calendar d10 = u.d(this.f9896f);
        d10.setTimeInMillis(j10);
        return d10.get(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String n() {
        if (this.f9902t == null) {
            this.f9902t = d.f(this.f9896f.getTimeInMillis());
        }
        return this.f9902t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long o() {
        return this.f9896f.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month p(int i10) {
        Calendar d10 = u.d(this.f9896f);
        d10.add(2, i10);
        return new Month(d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q(Month month) {
        if (this.f9896f instanceof GregorianCalendar) {
            return ((month.f9898p - this.f9898p) * 12) + (month.f9897m - this.f9897m);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9898p);
        parcel.writeInt(this.f9897m);
    }
}
