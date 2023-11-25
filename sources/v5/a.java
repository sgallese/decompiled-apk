package v5;

import ec.t;
import java.io.File;
import java.util.List;
import qc.q;

/* compiled from: FileIdentityStorage.kt */
/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: c  reason: collision with root package name */
    public static final C0575a f24592c = new C0575a(null);

    /* renamed from: a  reason: collision with root package name */
    private final d f24593a;

    /* renamed from: b  reason: collision with root package name */
    private final w5.c f24594b;

    /* compiled from: FileIdentityStorage.kt */
    /* renamed from: v5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0575a {
        private C0575a() {
        }

        public /* synthetic */ C0575a(qc.h hVar) {
            this();
        }
    }

    public a(d dVar) {
        q.i(dVar, "configuration");
        this.f24593a = dVar;
        String d10 = dVar.d();
        File f10 = dVar.f();
        f10 = f10 == null ? new File(q.q("/tmp/amplitude-identity/", d10)) : f10;
        w5.a.a(f10);
        w5.c cVar = new w5.c(f10, d10, "amplitude-identity", dVar.e());
        this.f24594b = cVar;
        cVar.e();
        e();
    }

    private final boolean d(String str, String str2) {
        String c10;
        if (str2 == null || (c10 = this.f24594b.c(str, null)) == null) {
            return true;
        }
        return q.d(c10, str2);
    }

    private final void e() {
        List<String> l10;
        if (!d("api_key", this.f24593a.a()) || !d("experiment_api_key", this.f24593a.b())) {
            w5.c cVar = this.f24594b;
            l10 = t.l("user_id", "device_id", "api_key", "experiment_api_key");
            cVar.g(l10);
        }
        String a10 = this.f24593a.a();
        if (a10 != null) {
            this.f24594b.f("api_key", a10);
        }
        String b10 = this.f24593a.b();
        if (b10 != null) {
            this.f24594b.f("experiment_api_key", b10);
        }
    }

    @Override // v5.i
    public void a(String str) {
        w5.c cVar = this.f24594b;
        if (str == null) {
            str = "";
        }
        cVar.f("device_id", str);
    }

    @Override // v5.i
    public c b() {
        return new c(this.f24594b.c("user_id", null), this.f24594b.c("device_id", null));
    }

    @Override // v5.i
    public void c(String str) {
        w5.c cVar = this.f24594b;
        if (str == null) {
            str = "";
        }
        cVar.f("user_id", str);
    }
}
