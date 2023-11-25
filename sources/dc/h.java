package dc;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
/* loaded from: classes4.dex */
public class h {

    /* compiled from: LazyJVM.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13250a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13250a = iArr;
        }
    }

    public static <T> f<T> a(j jVar, pc.a<? extends T> aVar) {
        qc.q.i(jVar, "mode");
        qc.q.i(aVar, "initializer");
        int i10 = a.f13250a[jVar.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return new x(aVar);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new o(aVar);
        }
        qc.h hVar = null;
        return new p(aVar, hVar, i11, hVar);
    }

    public static <T> f<T> b(pc.a<? extends T> aVar) {
        qc.q.i(aVar, "initializer");
        qc.h hVar = null;
        return new p(aVar, hVar, 2, hVar);
    }
}
