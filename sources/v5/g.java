package v5;

/* compiled from: IdentityManager.kt */
/* loaded from: classes.dex */
public interface g {

    /* compiled from: IdentityManager.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(g gVar, c cVar, k kVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    kVar = k.Updated;
                }
                gVar.e(cVar, kVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIdentity");
        }
    }

    /* compiled from: IdentityManager.kt */
    /* loaded from: classes.dex */
    public interface b {
        b a(String str);

        b b(String str);

        void c();
    }

    b a();

    boolean b();

    void c(f fVar);

    c d();

    void e(c cVar, k kVar);
}
