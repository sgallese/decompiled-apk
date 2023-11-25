package q8;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import q8.i;
import s.t0;

/* compiled from: UserMetadata.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final d f21602a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.common.i f21603b;

    /* renamed from: c  reason: collision with root package name */
    private final String f21604c;

    /* renamed from: d  reason: collision with root package name */
    private final a f21605d = new a(false);

    /* renamed from: e  reason: collision with root package name */
    private final a f21606e = new a(true);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicMarkableReference<String> f21607f = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UserMetadata.java */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        final AtomicMarkableReference<b> f21608a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicReference<Callable<Void>> f21609b = new AtomicReference<>(null);

        /* renamed from: c  reason: collision with root package name */
        private final boolean f21610c;

        public a(boolean z10) {
            int i10;
            this.f21610c = z10;
            if (z10) {
                i10 = 8192;
            } else {
                i10 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            this.f21608a = new AtomicMarkableReference<>(new b(64, i10), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Void c() throws Exception {
            this.f21609b.set(null);
            e();
            return null;
        }

        private void d() {
            Callable callable = new Callable() { // from class: q8.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void c10;
                    c10 = i.a.this.c();
                    return c10;
                }
            };
            if (t0.a(this.f21609b, null, callable)) {
                i.this.f21603b.h(callable);
            }
        }

        private void e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f21608a.isMarked()) {
                    map = this.f21608a.getReference().a();
                    AtomicMarkableReference<b> atomicMarkableReference = this.f21608a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                i.this.f21602a.l(i.this.f21604c, map, this.f21610c);
            }
        }

        public Map<String, String> b() {
            return this.f21608a.getReference().a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                if (!this.f21608a.getReference().d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<b> atomicMarkableReference = this.f21608a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                d();
                return true;
            }
        }
    }

    public i(String str, u8.f fVar, com.google.firebase.crashlytics.internal.common.i iVar) {
        this.f21604c = str;
        this.f21602a = new d(fVar);
        this.f21603b = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object h() throws Exception {
        k();
        return null;
    }

    public static i i(String str, u8.f fVar, com.google.firebase.crashlytics.internal.common.i iVar) {
        d dVar = new d(fVar);
        i iVar2 = new i(str, fVar, iVar);
        iVar2.f21605d.f21608a.getReference().e(dVar.g(str, false));
        iVar2.f21606e.f21608a.getReference().e(dVar.g(str, true));
        iVar2.f21607f.set(dVar.h(str), false);
        return iVar2;
    }

    public static String j(String str, u8.f fVar) {
        return new d(fVar).h(str);
    }

    private void k() {
        boolean z10;
        String str;
        synchronized (this.f21607f) {
            z10 = false;
            if (this.f21607f.isMarked()) {
                str = g();
                this.f21607f.set(str, false);
                z10 = true;
            } else {
                str = null;
            }
        }
        if (z10) {
            this.f21602a.m(this.f21604c, str);
        }
    }

    public Map<String, String> e() {
        return this.f21605d.b();
    }

    public Map<String, String> f() {
        return this.f21606e.b();
    }

    public String g() {
        return this.f21607f.getReference();
    }

    public boolean l(String str, String str2) {
        return this.f21605d.f(str, str2);
    }

    public void m(String str) {
        String c10 = b.c(str, UserVerificationMethods.USER_VERIFY_ALL);
        synchronized (this.f21607f) {
            if (com.google.firebase.crashlytics.internal.common.h.B(c10, this.f21607f.getReference())) {
                return;
            }
            this.f21607f.set(c10, true);
            this.f21603b.h(new Callable() { // from class: q8.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object h10;
                    h10 = i.this.h();
                    return h10;
                }
            });
        }
    }
}
