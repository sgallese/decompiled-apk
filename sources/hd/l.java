package hd;

import fd.h0;
import fd.j0;
import java.util.concurrent.TimeUnit;

/* compiled from: Tasks.kt */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16640a = h0.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b  reason: collision with root package name */
    public static final long f16641b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f16642c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f16643d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f16644e;

    /* renamed from: f  reason: collision with root package name */
    public static g f16645f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f16646g;

    /* renamed from: h  reason: collision with root package name */
    public static final i f16647h;

    static {
        long f10;
        int d10;
        int e10;
        int e11;
        long f11;
        f10 = j0.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f16641b = f10;
        d10 = vc.l.d(h0.a(), 2);
        e10 = j0.e("kotlinx.coroutines.scheduler.core.pool.size", d10, 1, 0, 8, null);
        f16642c = e10;
        e11 = j0.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f16643d = e11;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f11 = j0.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f16644e = timeUnit.toNanos(f11);
        f16645f = e.f16630a;
        f16646g = new j(0);
        f16647h = new j(1);
    }
}
