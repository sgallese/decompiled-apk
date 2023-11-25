package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import ba.k;
import ba.l;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    private final String f11844f;

    /* renamed from: m  reason: collision with root package name */
    private final Timer f11845m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11846p;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<PerfSession> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PerfSession createFromParcel(Parcel parcel) {
            return new PerfSession(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public PerfSession[] newArray(int i10) {
            return new PerfSession[i10];
        }
    }

    /* synthetic */ PerfSession(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static k[] b(List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k a10 = list.get(0).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            k a11 = list.get(i10).a();
            if (!z10 && list.get(i10).g()) {
                kVarArr[0] = a11;
                kVarArr[i10] = a10;
                z10 = true;
            } else {
                kVarArr[i10] = a11;
            }
        }
        if (!z10) {
            kVarArr[0] = a10;
        }
        return kVarArr;
    }

    public static PerfSession c() {
        PerfSession perfSession = new PerfSession(UUID.randomUUID().toString().replace("-", ""), new com.google.firebase.perf.util.a());
        perfSession.i(k());
        return perfSession;
    }

    public static boolean k() {
        if (com.google.firebase.perf.config.a.g().K() && Math.random() < r0.D()) {
            return true;
        }
        return false;
    }

    public k a() {
        k.c F = k.X().F(this.f11844f);
        if (this.f11846p) {
            F.E(l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return F.build();
    }

    public Timer d() {
        return this.f11845m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        if (TimeUnit.MICROSECONDS.toMinutes(this.f11845m.c()) > com.google.firebase.perf.config.a.g().A()) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.f11846p;
    }

    public boolean g() {
        return this.f11846p;
    }

    public String h() {
        return this.f11844f;
    }

    public void i(boolean z10) {
        this.f11846p = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11844f);
        parcel.writeByte(this.f11846p ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f11845m, 0);
    }

    public PerfSession(String str, com.google.firebase.perf.util.a aVar) {
        this.f11846p = false;
        this.f11844f = str;
        this.f11845m = aVar.a();
    }

    private PerfSession(Parcel parcel) {
        this.f11846p = false;
        this.f11844f = parcel.readString();
        this.f11846p = parcel.readByte() != 0;
        this.f11845m = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
