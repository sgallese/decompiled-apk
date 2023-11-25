package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import g9.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import k8.u;
import m9.d;
import m9.f;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes3.dex */
public class c implements j9.e {

    /* renamed from: m  reason: collision with root package name */
    private static final Object f11524m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadFactory f11525n = new a();

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.e f11526a;

    /* renamed from: b  reason: collision with root package name */
    private final m9.c f11527b;

    /* renamed from: c  reason: collision with root package name */
    private final l9.c f11528c;

    /* renamed from: d  reason: collision with root package name */
    private final h f11529d;

    /* renamed from: e  reason: collision with root package name */
    private final u<l9.b> f11530e;

    /* renamed from: f  reason: collision with root package name */
    private final j9.g f11531f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f11532g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f11533h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f11534i;

    /* renamed from: j  reason: collision with root package name */
    private String f11535j;

    /* renamed from: k  reason: collision with root package name */
    private Set<k9.a> f11536k;

    /* renamed from: l  reason: collision with root package name */
    private final List<g> f11537l;

    /* compiled from: FirebaseInstallations.java */
    /* loaded from: classes3.dex */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f11538a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f11538a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseInstallations.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11539a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f11540b;

        static {
            int[] iArr = new int[f.b.values().length];
            f11540b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11540b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11540b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f11539a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11539a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public c(final com.google.firebase.e eVar, i9.b<i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, eVar, new m9.c(eVar.j(), bVar), new l9.c(eVar), h.c(), new u(new i9.b() { // from class: j9.b
            @Override // i9.b
            public final Object get() {
                l9.b y10;
                y10 = com.google.firebase.installations.c.y(com.google.firebase.e.this);
                return y10;
            }
        }), new j9.g());
    }

    private String A(l9.d dVar) {
        if ((!this.f11526a.l().equals("CHIME_ANDROID_SDK") && !this.f11526a.t()) || !dVar.m()) {
            return this.f11531f.a();
        }
        String f10 = o().f();
        if (TextUtils.isEmpty(f10)) {
            return this.f11531f.a();
        }
        return f10;
    }

    private l9.d B(l9.d dVar) throws FirebaseInstallationsException {
        String str;
        if (dVar.d() != null && dVar.d().length() == 11) {
            str = o().i();
        } else {
            str = null;
        }
        m9.d d10 = this.f11527b.d(l(), dVar.d(), t(), m(), str);
        int i10 = b.f11539a[d10.e().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return dVar.q("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        return dVar.s(d10.c(), d10.d(), this.f11529d.b(), d10.b().c(), d10.b().d());
    }

    private void C(Exception exc) {
        synchronized (this.f11532g) {
            Iterator<g> it = this.f11537l.iterator();
            while (it.hasNext()) {
                if (it.next().b(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void D(l9.d dVar) {
        synchronized (this.f11532g) {
            Iterator<g> it = this.f11537l.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void E(String str) {
        this.f11535j = str;
    }

    private synchronized void F(l9.d dVar, l9.d dVar2) {
        if (this.f11536k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<k9.a> it = this.f11536k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    private Task<f> f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new d(this.f11529d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new e(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void h(g gVar) {
        synchronized (this.f11532g) {
            this.f11537l.add(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(boolean r3) {
        /*
            r2 = this;
            l9.d r0 = r2.r()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 != 0) goto L22
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.h r3 = r2.f11529d     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            l9.d r3 = r2.k(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            goto L26
        L22:
            l9.d r3 = r2.B(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
        L26:
            r2.u(r3)
            r2.F(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.d()
            r2.E(r0)
        L39:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r0 = com.google.firebase.installations.FirebaseInstallationsException.a.BAD_CONFIG
            r3.<init>(r0)
            r2.C(r3)
            goto L5e
        L4a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.C(r3)
            goto L5e
        L5b:
            r2.D(r3)
        L5e:
            return
        L5f:
            r3 = move-exception
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.v(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public final void x(final boolean z10) {
        l9.d s10 = s();
        if (z10) {
            s10 = s10.p();
        }
        D(s10);
        this.f11534i.execute(new Runnable() { // from class: j9.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.v(z10);
            }
        });
    }

    private l9.d k(l9.d dVar) throws FirebaseInstallationsException {
        m9.f e10 = this.f11527b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.f11540b[e10.b().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    E(null);
                    return dVar.r();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
            }
            return dVar.q("BAD CONFIG");
        }
        return dVar.o(e10.c(), e10.d(), this.f11529d.b());
    }

    private synchronized String n() {
        return this.f11535j;
    }

    private l9.b o() {
        return this.f11530e.get();
    }

    public static c p() {
        return q(com.google.firebase.e.k());
    }

    public static c q(com.google.firebase.e eVar) {
        boolean z10;
        if (eVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "Null is not a valid value of FirebaseApp.");
        return (c) eVar.i(j9.e.class);
    }

    private l9.d r() {
        l9.d d10;
        synchronized (f11524m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f11526a.j(), "generatefid.lock");
            try {
                d10 = this.f11528c.d();
            } finally {
                if (a10 != null) {
                    a10.b();
                }
            }
        }
        return d10;
    }

    private l9.d s() {
        l9.d d10;
        synchronized (f11524m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f11526a.j(), "generatefid.lock");
            try {
                d10 = this.f11528c.d();
                if (d10.j()) {
                    d10 = this.f11528c.b(d10.t(A(d10)));
                }
            } finally {
                if (a10 != null) {
                    a10.b();
                }
            }
        }
        return d10;
    }

    private void u(l9.d dVar) {
        synchronized (f11524m) {
            com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f11526a.j(), "generatefid.lock");
            try {
                this.f11528c.b(dVar);
            } finally {
                if (a10 != null) {
                    a10.b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l9.b y(com.google.firebase.e eVar) {
        return new l9.b(eVar);
    }

    private void z() {
        Preconditions.checkNotEmpty(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // j9.e
    public Task<f> a(final boolean z10) {
        z();
        Task<f> f10 = f();
        this.f11533h.execute(new Runnable() { // from class: j9.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.x(z10);
            }
        });
        return f10;
    }

    @Override // j9.e
    public Task<String> getId() {
        z();
        String n10 = n();
        if (n10 != null) {
            return Tasks.forResult(n10);
        }
        Task<String> g10 = g();
        this.f11533h.execute(new Runnable() { // from class: j9.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.c.this.w();
            }
        });
        return g10;
    }

    String l() {
        return this.f11526a.m().b();
    }

    String m() {
        return this.f11526a.m().c();
    }

    String t() {
        return this.f11526a.m().e();
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(ExecutorService executorService, Executor executor, com.google.firebase.e eVar, m9.c cVar, l9.c cVar2, h hVar, u<l9.b> uVar, j9.g gVar) {
        this.f11532g = new Object();
        this.f11536k = new HashSet();
        this.f11537l = new ArrayList();
        this.f11526a = eVar;
        this.f11527b = cVar;
        this.f11528c = cVar2;
        this.f11529d = hVar;
        this.f11530e = uVar;
        this.f11531f = gVar;
        this.f11533h = executorService;
        this.f11534i = executor;
    }
}
