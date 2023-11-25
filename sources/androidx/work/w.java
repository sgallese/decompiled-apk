package androidx.work;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkRequest.java */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private UUID f7607a;

    /* renamed from: b  reason: collision with root package name */
    private n4.p f7608b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f7609c;

    /* compiled from: WorkRequest.java */
    /* loaded from: classes.dex */
    public static abstract class a<B extends a<?, ?>, W extends w> {

        /* renamed from: c  reason: collision with root package name */
        n4.p f7612c;

        /* renamed from: e  reason: collision with root package name */
        Class<? extends ListenableWorker> f7614e;

        /* renamed from: a  reason: collision with root package name */
        boolean f7610a = false;

        /* renamed from: d  reason: collision with root package name */
        Set<String> f7613d = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        UUID f7611b = UUID.randomUUID();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Class<? extends ListenableWorker> cls) {
            this.f7614e = cls;
            this.f7612c = new n4.p(this.f7611b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f7613d.add(str);
            return d();
        }

        public final W b() {
            boolean z10;
            W c10 = c();
            c cVar = this.f7612c.f20201j;
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 < 24 || !cVar.e()) && !cVar.f() && !cVar.g() && (i10 < 23 || !cVar.h())) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.f7612c.f20208q && z10) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f7611b = UUID.randomUUID();
            n4.p pVar = new n4.p(this.f7612c);
            this.f7612c = pVar;
            pVar.f20192a = this.f7611b.toString();
            return c10;
        }

        abstract W c();

        abstract B d();

        public final B e(c cVar) {
            this.f7612c.f20201j = cVar;
            return d();
        }

        public final B f(e eVar) {
            this.f7612c.f20196e = eVar;
            return d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public w(UUID uuid, n4.p pVar, Set<String> set) {
        this.f7607a = uuid;
        this.f7608b = pVar;
        this.f7609c = set;
    }

    public String a() {
        return this.f7607a.toString();
    }

    public Set<String> b() {
        return this.f7609c;
    }

    public n4.p c() {
        return this.f7608b;
    }
}
