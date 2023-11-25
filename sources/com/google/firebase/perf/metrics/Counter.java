package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    private final String f11815f;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicLong f11816m;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<Counter> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public Counter[] newArray(int i10) {
            return new Counter[i10];
        }
    }

    /* synthetic */ Counter(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.f11816m.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f11815f;
    }

    public void c(long j10) {
        this.f11816m.addAndGet(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(long j10) {
        this.f11816m.set(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11815f);
        parcel.writeLong(this.f11816m.get());
    }

    public Counter(String str) {
        this.f11815f = str;
        this.f11816m = new AtomicLong(0L);
    }

    private Counter(Parcel parcel) {
        this.f11815f = parcel.readString();
        this.f11816m = new AtomicLong(parcel.readLong());
    }
}
