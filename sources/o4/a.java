package o4;

import androidx.work.impl.WorkDatabase;
import androidx.work.o;
import androidx.work.u;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private final g4.c f20472f = new g4.c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancelWorkRunnable.java */
    /* renamed from: o4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0460a extends a {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g4.j f20473m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ UUID f20474p;

        C0460a(g4.j jVar, UUID uuid) {
            this.f20473m = jVar;
            this.f20474p = uuid;
        }

        @Override // o4.a
        void h() {
            WorkDatabase o10 = this.f20473m.o();
            o10.c();
            try {
                a(this.f20473m, this.f20474p.toString());
                o10.r();
                o10.g();
                g(this.f20473m);
            } catch (Throwable th) {
                o10.g();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancelWorkRunnable.java */
    /* loaded from: classes.dex */
    public class b extends a {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g4.j f20475m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f20476p;

        b(g4.j jVar, String str) {
            this.f20475m = jVar;
            this.f20476p = str;
        }

        @Override // o4.a
        void h() {
            WorkDatabase o10 = this.f20475m.o();
            o10.c();
            try {
                Iterator<String> it = o10.B().p(this.f20476p).iterator();
                while (it.hasNext()) {
                    a(this.f20475m, it.next());
                }
                o10.r();
                o10.g();
                g(this.f20475m);
            } catch (Throwable th) {
                o10.g();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable.java */
    /* loaded from: classes.dex */
    class c extends a {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g4.j f20477m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f20478p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f20479q;

        c(g4.j jVar, String str, boolean z10) {
            this.f20477m = jVar;
            this.f20478p = str;
            this.f20479q = z10;
        }

        @Override // o4.a
        void h() {
            WorkDatabase o10 = this.f20477m.o();
            o10.c();
            try {
                Iterator<String> it = o10.B().l(this.f20478p).iterator();
                while (it.hasNext()) {
                    a(this.f20477m, it.next());
                }
                o10.r();
                o10.g();
                if (this.f20479q) {
                    g(this.f20477m);
                }
            } catch (Throwable th) {
                o10.g();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, g4.j jVar) {
        return new C0460a(jVar, uuid);
    }

    public static a c(String str, g4.j jVar, boolean z10) {
        return new c(jVar, str, z10);
    }

    public static a d(String str, g4.j jVar) {
        return new b(jVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        n4.q B = workDatabase.B();
        n4.b t10 = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            u.a m10 = B.m(str2);
            if (m10 != u.a.SUCCEEDED && m10 != u.a.FAILED) {
                B.b(u.a.CANCELLED, str2);
            }
            linkedList.addAll(t10.a(str2));
        }
    }

    void a(g4.j jVar, String str) {
        f(jVar.o(), str);
        jVar.m().l(str);
        Iterator<g4.e> it = jVar.n().iterator();
        while (it.hasNext()) {
            it.next().e(str);
        }
    }

    public androidx.work.o e() {
        return this.f20472f;
    }

    void g(g4.j jVar) {
        g4.f.b(jVar.i(), jVar.o(), jVar.n());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f20472f.a(androidx.work.o.f7597a);
        } catch (Throwable th) {
            this.f20472f.a(new o.b.a(th));
        }
    }
}
