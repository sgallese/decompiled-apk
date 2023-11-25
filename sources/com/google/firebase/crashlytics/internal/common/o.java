package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import r8.b0;

/* compiled from: CrashlyticsReportDataCapture.java */
/* loaded from: classes3.dex */
public class o {

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, Integer> f11450f;

    /* renamed from: g  reason: collision with root package name */
    static final String f11451g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f11452a;

    /* renamed from: b  reason: collision with root package name */
    private final w f11453b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11454c;

    /* renamed from: d  reason: collision with root package name */
    private final x8.d f11455d;

    /* renamed from: e  reason: collision with root package name */
    private final w8.i f11456e;

    static {
        HashMap hashMap = new HashMap();
        f11450f = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f11451g = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.3.6");
    }

    public o(Context context, w wVar, a aVar, x8.d dVar, w8.i iVar) {
        this.f11452a = context;
        this.f11453b = wVar;
        this.f11454c = aVar;
        this.f11455d = dVar;
        this.f11456e = iVar;
    }

    private b0.a a(b0.a aVar) {
        r8.c0<b0.a.AbstractC0503a> c0Var;
        if (this.f11456e.b().f25445b.f25454c && this.f11454c.f11339c.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (e eVar : this.f11454c.f11339c) {
                arrayList.add(b0.a.AbstractC0503a.a().d(eVar.c()).b(eVar.a()).c(eVar.b()).a());
            }
            c0Var = r8.c0.a(arrayList);
        } else {
            c0Var = null;
        }
        return b0.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(c0Var).a();
    }

    private b0.b b() {
        return r8.b0.b().i("18.3.6").e(this.f11454c.f11337a).f(this.f11453b.a()).c(this.f11454c.f11342f).d(this.f11454c.f11343g).h(4);
    }

    private static int f() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f11450f.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private b0.e.d.a.b.AbstractC0507a g() {
        return b0.e.d.a.b.AbstractC0507a.a().b(0L).d(0L).c(this.f11454c.f11341e).e(this.f11454c.f11338b).a();
    }

    private r8.c0<b0.e.d.a.b.AbstractC0507a> h() {
        return r8.c0.e(g());
    }

    private b0.e.d.a i(int i10, b0.a aVar) {
        boolean z10;
        if (aVar.c() != 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        return b0.e.d.a.a().b(Boolean.valueOf(z10)).f(i10).d(n(aVar)).a();
    }

    private b0.e.d.a j(int i10, x8.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean bool;
        boolean z11;
        ActivityManager.RunningAppProcessInfo j10 = h.j(this.f11454c.f11341e, this.f11452a);
        if (j10 != null) {
            if (j10.importance != 100) {
                z11 = true;
            } else {
                z11 = false;
            }
            bool = Boolean.valueOf(z11);
        } else {
            bool = null;
        }
        return b0.e.d.a.a().b(bool).f(i10).d(o(eVar, thread, i11, i12, z10)).a();
    }

    private b0.e.d.c k(int i10) {
        Double d10;
        d a10 = d.a(this.f11452a);
        Float b10 = a10.b();
        if (b10 != null) {
            d10 = Double.valueOf(b10.doubleValue());
        } else {
            d10 = null;
        }
        int c10 = a10.c();
        boolean p10 = h.p(this.f11452a);
        long t10 = h.t() - h.a(this.f11452a);
        return b0.e.d.c.a().b(d10).c(c10).f(p10).e(i10).g(t10).d(h.b(Environment.getDataDirectory().getPath())).a();
    }

    private b0.e.d.a.b.c l(x8.e eVar, int i10, int i11) {
        return m(eVar, i10, i11, 0);
    }

    private b0.e.d.a.b.c m(x8.e eVar, int i10, int i11, int i12) {
        String str = eVar.f25875b;
        String str2 = eVar.f25874a;
        StackTraceElement[] stackTraceElementArr = eVar.f25876c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        x8.e eVar2 = eVar.f25877d;
        if (i12 >= i11) {
            x8.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f25877d;
                i13++;
            }
        }
        b0.e.d.a.b.c.AbstractC0510a d10 = b0.e.d.a.b.c.a().f(str).e(str2).c(r8.c0.a(q(stackTraceElementArr, i10))).d(i13);
        if (eVar2 != null && i13 == 0) {
            d10.b(m(eVar2, i10, i11, i12 + 1));
        }
        return d10.a();
    }

    private b0.e.d.a.b n(b0.a aVar) {
        return b0.e.d.a.b.a().b(aVar).e(v()).c(h()).a();
    }

    private b0.e.d.a.b o(x8.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return b0.e.d.a.b.a().f(y(eVar, thread, i10, z10)).d(l(eVar, i10, i11)).e(v()).c(h()).a();
    }

    private b0.e.d.a.b.AbstractC0513e.AbstractC0515b p(StackTraceElement stackTraceElement, b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a abstractC0516a) {
        long j10;
        long j11 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j10 = Math.max(stackTraceElement.getLineNumber(), 0L);
        } else {
            j10 = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j11 = stackTraceElement.getLineNumber();
        }
        return abstractC0516a.e(j10).f(str).b(fileName).d(j11).a();
    }

    private r8.c0<b0.e.d.a.b.AbstractC0513e.AbstractC0515b> q(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(p(stackTraceElement, b0.e.d.a.b.AbstractC0513e.AbstractC0515b.a().c(i10)));
        }
        return r8.c0.a(arrayList);
    }

    private b0.e.a r() {
        return b0.e.a.a().e(this.f11453b.f()).g(this.f11454c.f11342f).d(this.f11454c.f11343g).f(this.f11453b.a()).b(this.f11454c.f11344h.d()).c(this.f11454c.f11344h.e()).a();
    }

    private b0.e s(String str, long j10) {
        return b0.e.a().l(j10).i(str).g(f11451g).b(r()).k(u()).d(t()).h(3).a();
    }

    private b0.e.c t() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int f10 = f();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long t10 = h.t();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean z10 = h.z();
        int n10 = h.n();
        return b0.e.c.a().b(f10).f(Build.MODEL).c(availableProcessors).h(t10).d(blockCount).i(z10).j(n10).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private b0.e.AbstractC0518e u() {
        return b0.e.AbstractC0518e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(h.A()).a();
    }

    private b0.e.d.a.b.AbstractC0511d v() {
        return b0.e.d.a.b.AbstractC0511d.a().d("0").c("0").b(0L).a();
    }

    private b0.e.d.a.b.AbstractC0513e w(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return x(thread, stackTraceElementArr, 0);
    }

    private b0.e.d.a.b.AbstractC0513e x(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return b0.e.d.a.b.AbstractC0513e.a().d(thread.getName()).c(i10).b(r8.c0.a(q(stackTraceElementArr, i10))).a();
    }

    private r8.c0<b0.e.d.a.b.AbstractC0513e> y(x8.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(x(thread, eVar.f25876c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(w(key, this.f11455d.a(entry.getValue())));
                }
            }
        }
        return r8.c0.a(arrayList);
    }

    public b0.e.d c(b0.a aVar) {
        int i10 = this.f11452a.getResources().getConfiguration().orientation;
        return b0.e.d.a().f("anr").e(aVar.i()).b(i(i10, a(aVar))).c(k(i10)).a();
    }

    public b0.e.d d(Throwable th, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f11452a.getResources().getConfiguration().orientation;
        return b0.e.d.a().f(str).e(j10).b(j(i12, new x8.e(th, this.f11455d), thread, i10, i11, z10)).c(k(i12)).a();
    }

    public r8.b0 e(String str, long j10) {
        return b().j(s(str, j10)).a();
    }
}
