package dd;

import ed.o;

/* compiled from: Context.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class m {
    public static final <T> g<T> a(g<? extends T> gVar, int i10, cd.a aVar) {
        boolean z10;
        int i11;
        cd.a aVar2;
        boolean z11 = true;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (i10 == -1 && aVar != cd.a.SUSPEND) {
                z11 = false;
            }
            if (z11) {
                if (i10 == -1) {
                    aVar2 = cd.a.DROP_OLDEST;
                    i11 = 0;
                } else {
                    i11 = i10;
                    aVar2 = aVar;
                }
                if (gVar instanceof ed.o) {
                    return o.a.a((ed.o) gVar, null, i11, aVar2, 1, null);
                }
                return new ed.g(gVar, null, i11, aVar2, 2, null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
    }

    public static /* synthetic */ g b(g gVar, int i10, cd.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = cd.a.SUSPEND;
        }
        return i.c(gVar, i10, aVar);
    }

    public static final <T> g<T> c(g<? extends T> gVar) {
        g<T> b10;
        b10 = b(gVar, -1, null, 2, null);
        return b10;
    }
}
