package ed;

import dd.c0;
import dd.l0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes4.dex */
public final class x extends c0<Integer> implements l0<Integer> {
    public x(int i10) {
        super(1, Integer.MAX_VALUE, cd.a.DROP_OLDEST);
        e(Integer.valueOf(i10));
    }

    @Override // dd.l0
    /* renamed from: Z  reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(M().intValue());
        }
        return valueOf;
    }

    public final boolean a0(int i10) {
        boolean e10;
        synchronized (this) {
            e10 = e(Integer.valueOf(M().intValue() + i10));
        }
        return e10;
    }
}
