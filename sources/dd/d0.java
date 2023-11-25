package dd;

/* compiled from: SharedFlow.kt */
/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a */
    public static final fd.g0 f13307a = new fd.g0("NO_VALUE");

    public static final <T> w<T> a(int i10, int i11, cd.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i10 <= 0 && i11 <= 0 && aVar != cd.a.SUSPEND) {
                    z12 = false;
                }
                if (z12) {
                    int i12 = i11 + i10;
                    if (i12 < 0) {
                        i12 = Integer.MAX_VALUE;
                    }
                    return new c0(i10, i12, aVar);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
    }

    public static /* synthetic */ w b(int i10, int i11, cd.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = cd.a.SUSPEND;
        }
        return a(i10, i11, aVar);
    }

    public static final <T> g<T> e(b0<? extends T> b0Var, hc.f fVar, int i10, cd.a aVar) {
        if ((i10 == 0 || i10 == -3) && aVar == cd.a.SUSPEND) {
            return b0Var;
        }
        return new ed.g(b0Var, fVar, i10, aVar);
    }

    public static final Object f(Object[] objArr, long j10) {
        return objArr[(objArr.length - 1) & ((int) j10)];
    }

    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[(objArr.length - 1) & ((int) j10)] = obj;
    }
}
