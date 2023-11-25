package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.h;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.common.s;
import com.google.firebase.crashlytics.internal.common.u;
import com.google.firebase.crashlytics.internal.common.w;
import com.google.firebase.e;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import n8.d;
import n8.f;

/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    final m f11333a;

    /* compiled from: FirebaseCrashlytics.java */
    /* renamed from: com.google.firebase.crashlytics.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0246a implements Continuation<Void, Object> {
        C0246a() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public Object then(Task<Void> task) throws Exception {
            if (!task.isSuccessful()) {
                f.f().e("Error fetching settings.", task.getException());
                return null;
            }
            return null;
        }
    }

    /* compiled from: FirebaseCrashlytics.java */
    /* loaded from: classes3.dex */
    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f11334a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f11335b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w8.f f11336c;

        b(boolean z10, m mVar, w8.f fVar) {
            this.f11334a = z10;
            this.f11335b = mVar;
            this.f11336c = fVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (this.f11334a) {
                this.f11335b.g(this.f11336c);
                return null;
            }
            return null;
        }
    }

    private a(m mVar) {
        this.f11333a = mVar;
    }

    public static a a() {
        a aVar = (a) e.k().i(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(e eVar, j9.e eVar2, i9.a<n8.a> aVar, i9.a<i8.a> aVar2) {
        Context j10 = eVar.j();
        String packageName = j10.getPackageName();
        f.f().g("Initializing Firebase Crashlytics " + m.i() + " for " + packageName);
        u8.f fVar = new u8.f(j10);
        s sVar = new s(eVar);
        w wVar = new w(j10, packageName, eVar2, sVar);
        d dVar = new d(aVar);
        m8.d dVar2 = new m8.d(aVar2);
        m mVar = new m(eVar, wVar, dVar, sVar, dVar2.e(), dVar2.d(), fVar, u.c("Crashlytics Exception Handler"));
        String c10 = eVar.m().c();
        String o10 = h.o(j10);
        List<com.google.firebase.crashlytics.internal.common.e> l10 = h.l(j10);
        f.f().b("Mapping file ID is: " + o10);
        for (com.google.firebase.crashlytics.internal.common.e eVar3 : l10) {
            f.f().b(String.format("Build id for %s on %s: %s", eVar3.c(), eVar3.a(), eVar3.b()));
        }
        try {
            com.google.firebase.crashlytics.internal.common.a a10 = com.google.firebase.crashlytics.internal.common.a.a(j10, wVar, c10, o10, l10, new n8.e(j10));
            f.f().i("Installer package name is: " + a10.f11340d);
            ExecutorService c11 = u.c("com.google.firebase.crashlytics.startup");
            w8.f l11 = w8.f.l(j10, c10, wVar, new t8.b(), a10.f11342f, a10.f11343g, fVar, sVar);
            l11.o(c11).continueWith(c11, new C0246a());
            Tasks.call(c11, new b(mVar.o(a10, l11), mVar, l11));
            return new a(mVar);
        } catch (PackageManager.NameNotFoundException e10) {
            f.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    public void c(String str) {
        this.f11333a.k(str);
    }

    public void d(Throwable th) {
        if (th == null) {
            f.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f11333a.l(th);
        }
    }

    public void e(String str, int i10) {
        this.f11333a.p(str, Integer.toString(i10));
    }

    public void f(String str, String str2) {
        this.f11333a.p(str, str2);
    }

    public void g(String str) {
        this.f11333a.q(str);
    }
}
