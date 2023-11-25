package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Month f9878f;

    /* renamed from: m  reason: collision with root package name */
    private final Month f9879m;

    /* renamed from: p  reason: collision with root package name */
    private final DateValidator f9880p;

    /* renamed from: q  reason: collision with root package name */
    private Month f9881q;

    /* renamed from: r  reason: collision with root package name */
    private final int f9882r;

    /* renamed from: s  reason: collision with root package name */
    private final int f9883s;

    /* renamed from: t  reason: collision with root package name */
    private final int f9884t;

    /* loaded from: classes3.dex */
    public interface DateValidator extends Parcelable {
        boolean p0(long j10);
    }

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<CalendarConstraints> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        static final long f9885f = u.a(Month.d(1900, 0).f9901s);

        /* renamed from: g  reason: collision with root package name */
        static final long f9886g = u.a(Month.d(2100, 11).f9901s);

        /* renamed from: a  reason: collision with root package name */
        private long f9887a;

        /* renamed from: b  reason: collision with root package name */
        private long f9888b;

        /* renamed from: c  reason: collision with root package name */
        private Long f9889c;

        /* renamed from: d  reason: collision with root package name */
        private int f9890d;

        /* renamed from: e  reason: collision with root package name */
        private DateValidator f9891e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(CalendarConstraints calendarConstraints) {
            this.f9887a = f9885f;
            this.f9888b = f9886g;
            this.f9891e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f9887a = calendarConstraints.f9878f.f9901s;
            this.f9888b = calendarConstraints.f9879m.f9901s;
            this.f9889c = Long.valueOf(calendarConstraints.f9881q.f9901s);
            this.f9890d = calendarConstraints.f9882r;
            this.f9891e = calendarConstraints.f9880p;
        }

        public CalendarConstraints a() {
            Month f10;
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f9891e);
            Month f11 = Month.f(this.f9887a);
            Month f12 = Month.f(this.f9888b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f9889c;
            if (l10 == null) {
                f10 = null;
            } else {
                f10 = Month.f(l10.longValue());
            }
            return new CalendarConstraints(f11, f12, dateValidator, f10, this.f9890d, null);
        }

        public b b(long j10) {
            this.f9889c = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10, a aVar) {
        this(month, month2, dateValidator, month3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (this.f9878f.equals(calendarConstraints.f9878f) && this.f9879m.equals(calendarConstraints.f9879m) && androidx.core.util.c.a(this.f9881q, calendarConstraints.f9881q) && this.f9882r == calendarConstraints.f9882r && this.f9880p.equals(calendarConstraints.f9880p)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month f(Month month) {
        if (month.compareTo(this.f9878f) < 0) {
            return this.f9878f;
        }
        if (month.compareTo(this.f9879m) > 0) {
            return this.f9879m;
        }
        return month;
    }

    public DateValidator g() {
        return this.f9880p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month h() {
        return this.f9879m;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9878f, this.f9879m, this.f9881q, Integer.valueOf(this.f9882r), this.f9880p});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f9882r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f9884t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month l() {
        return this.f9881q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month n() {
        return this.f9878f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.f9883s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f9878f, 0);
        parcel.writeParcelable(this.f9879m, 0);
        parcel.writeParcelable(this.f9881q, 0);
        parcel.writeParcelable(this.f9880p, 0);
        parcel.writeInt(this.f9882r);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f9878f = month;
        this.f9879m = month2;
        this.f9881q = month3;
        this.f9882r = i10;
        this.f9880p = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 >= 0 && i10 <= u.k().getMaximum(7)) {
            this.f9884t = month.q(month2) + 1;
            this.f9883s = (month2.f9898p - month.f9898p) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }
}
