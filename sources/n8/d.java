package n8;

import i9.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import r8.b0;
import r8.d0;

/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* loaded from: classes3.dex */
public final class d implements n8.a {

    /* renamed from: c  reason: collision with root package name */
    private static final g f20288c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final i9.a<n8.a> f20289a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<n8.a> f20290b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    /* loaded from: classes3.dex */
    private static final class b implements g {
        private b() {
        }

        @Override // n8.g
        public File a() {
            return null;
        }

        @Override // n8.g
        public File b() {
            return null;
        }

        @Override // n8.g
        public File c() {
            return null;
        }

        @Override // n8.g
        public b0.a d() {
            return null;
        }

        @Override // n8.g
        public File e() {
            return null;
        }

        @Override // n8.g
        public File f() {
            return null;
        }

        @Override // n8.g
        public File g() {
            return null;
        }
    }

    public d(i9.a<n8.a> aVar) {
        this.f20289a = aVar;
        aVar.a(new a.InterfaceC0403a() { // from class: n8.b
            @Override // i9.a.InterfaceC0403a
            public final void a(i9.b bVar) {
                d.this.g(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(i9.b bVar) {
        f.f().b("Crashlytics native component now available.");
        this.f20290b.set((n8.a) bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j10, d0 d0Var, i9.b bVar) {
        ((n8.a) bVar.get()).d(str, str2, j10, d0Var);
    }

    @Override // n8.a
    public g a(String str) {
        n8.a aVar = this.f20290b.get();
        if (aVar == null) {
            return f20288c;
        }
        return aVar.a(str);
    }

    @Override // n8.a
    public boolean b() {
        n8.a aVar = this.f20290b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    @Override // n8.a
    public boolean c(String str) {
        n8.a aVar = this.f20290b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    @Override // n8.a
    public void d(final String str, final String str2, final long j10, final d0 d0Var) {
        f.f().i("Deferring native open session: " + str);
        this.f20289a.a(new a.InterfaceC0403a() { // from class: n8.c
            @Override // i9.a.InterfaceC0403a
            public final void a(i9.b bVar) {
                d.h(str, str2, j10, d0Var, bVar);
            }
        });
    }
}
