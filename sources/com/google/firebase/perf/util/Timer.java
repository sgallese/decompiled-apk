package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    private long f11881f;

    /* renamed from: m  reason: collision with root package name */
    private long f11882m;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<Timer> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public Timer[] newArray(int i10) {
            return new Timer[i10];
        }
    }

    /* synthetic */ Timer(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static Timer f(long j10) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j10);
        return new Timer(h() + (micros - a()), micros);
    }

    private static long h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public long b() {
        return this.f11881f + c();
    }

    public long c() {
        return d(new Timer());
    }

    public long d(Timer timer) {
        return timer.f11882m - this.f11882m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f11881f;
    }

    public void g() {
        this.f11881f = h();
        this.f11882m = a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f11881f);
        parcel.writeLong(this.f11882m);
    }

    public Timer() {
        this(h(), a());
    }

    @VisibleForTesting
    Timer(long j10, long j11) {
        this.f11881f = j10;
        this.f11882m = j11;
    }

    private Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
