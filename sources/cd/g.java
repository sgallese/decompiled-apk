package cd;

import dc.w;

/* compiled from: Channel.kt */
/* loaded from: classes4.dex */
public final class g {
    public static final <E> d<E> a(int i10, a aVar, pc.l<? super E, w> lVar) {
        d<E> mVar;
        if (i10 != -2) {
            boolean z10 = false;
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != Integer.MAX_VALUE) {
                        if (aVar == a.SUSPEND) {
                            return new b(i10, lVar);
                        }
                        return new m(i10, aVar, lVar);
                    }
                    return new b(Integer.MAX_VALUE, lVar);
                } else if (aVar == a.SUSPEND) {
                    mVar = new b<>(0, lVar);
                } else {
                    mVar = new m<>(1, aVar, lVar);
                }
            } else {
                if (aVar == a.SUSPEND) {
                    z10 = true;
                }
                if (z10) {
                    return new m(1, a.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (aVar == a.SUSPEND) {
            mVar = new b<>(d.f9003h.a(), lVar);
        } else {
            mVar = new m<>(1, aVar, lVar);
        }
        return mVar;
    }

    public static /* synthetic */ d b(int i10, a aVar, pc.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, aVar, lVar);
    }
}
