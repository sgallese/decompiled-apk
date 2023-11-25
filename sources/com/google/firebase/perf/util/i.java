package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* compiled from: Rate.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f11896a;

    /* renamed from: b  reason: collision with root package name */
    private long f11897b;

    /* renamed from: c  reason: collision with root package name */
    private TimeUnit f11898c;

    /* compiled from: Rate.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11899a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f11899a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11899a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11899a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(long j10, long j11, TimeUnit timeUnit) {
        this.f11896a = j10;
        this.f11897b = j11;
        this.f11898c = timeUnit;
    }

    public double a() {
        int i10 = a.f11899a[this.f11898c.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return this.f11896a / this.f11898c.toSeconds(this.f11897b);
                }
                return (this.f11896a / this.f11897b) * TimeUnit.SECONDS.toMillis(1L);
            }
            return (this.f11896a / this.f11897b) * TimeUnit.SECONDS.toMicros(1L);
        }
        return (this.f11896a / this.f11897b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
