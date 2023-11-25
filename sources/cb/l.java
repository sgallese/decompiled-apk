package cb;

import td.z;

/* compiled from: MarkwonVisitor.java */
/* loaded from: classes4.dex */
public interface l extends z {

    /* compiled from: MarkwonVisitor.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(l lVar, td.s sVar);

        void b(l lVar, td.s sVar);
    }

    /* compiled from: MarkwonVisitor.java */
    /* loaded from: classes4.dex */
    public interface b {
        <N extends td.s> b a(Class<N> cls, c<? super N> cVar);

        l b(g gVar, r rVar);
    }

    /* compiled from: MarkwonVisitor.java */
    /* loaded from: classes4.dex */
    public interface c<N extends td.s> {
        void a(l lVar, N n10);
    }

    void A(td.s sVar);

    boolean a(td.s sVar);

    u builder();

    void d(int i10, Object obj);

    void i(td.s sVar);

    int length();

    void n(td.s sVar);

    g o();

    void p();

    void s();

    <N extends td.s> void w(N n10, int i10);

    r z();
}
