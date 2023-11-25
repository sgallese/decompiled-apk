package d2;

import androidx.emoji2.text.f;
import j0.d3;
import j0.g3;
import j0.j1;

/* compiled from: EmojiCompatStatus.kt */
/* loaded from: classes.dex */
final class m implements o {

    /* renamed from: a  reason: collision with root package name */
    private g3<Boolean> f13083a;

    /* compiled from: EmojiCompatStatus.kt */
    /* loaded from: classes.dex */
    public static final class a extends f.AbstractC0088f {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j1<Boolean> f13084f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m f13085m;

        a(j1<Boolean> j1Var, m mVar) {
            this.f13084f = j1Var;
            this.f13085m = mVar;
        }

        @Override // androidx.emoji2.text.f.AbstractC0088f
        public void a(Throwable th) {
            q qVar;
            m mVar = this.f13085m;
            qVar = p.f13088a;
            mVar.f13083a = qVar;
        }

        @Override // androidx.emoji2.text.f.AbstractC0088f
        public void b() {
            this.f13084f.setValue(Boolean.TRUE);
            this.f13085m.f13083a = new q(true);
        }
    }

    public m() {
        g3<Boolean> g3Var;
        if (androidx.emoji2.text.f.k()) {
            g3Var = c();
        } else {
            g3Var = null;
        }
        this.f13083a = g3Var;
    }

    private final g3<Boolean> c() {
        j1 e10;
        androidx.emoji2.text.f c10 = androidx.emoji2.text.f.c();
        qc.q.h(c10, "get()");
        if (c10.g() != 1) {
            e10 = d3.e(Boolean.FALSE, null, 2, null);
            c10.v(new a(e10, this));
            return e10;
        }
        return new q(true);
    }

    @Override // d2.o
    public g3<Boolean> a() {
        q qVar;
        g3<Boolean> g3Var = this.f13083a;
        if (g3Var != null) {
            qc.q.f(g3Var);
            return g3Var;
        } else if (!androidx.emoji2.text.f.k()) {
            qVar = p.f13088a;
            return qVar;
        } else {
            g3<Boolean> c10 = c();
            this.f13083a = c10;
            qc.q.f(c10);
            return c10;
        }
    }
}
