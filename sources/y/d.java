package y;

import y.c;

/* compiled from: IntervalList.kt */
/* loaded from: classes.dex */
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int b(k0.f<c.a<T>> fVar, int i10) {
        int o10 = fVar.o() - 1;
        int i11 = 0;
        while (i11 < o10) {
            int i12 = ((o10 - i11) / 2) + i11;
            int b10 = fVar.n()[i12].b();
            if (b10 == i10) {
                return i12;
            }
            if (b10 < i10) {
                i11 = i12 + 1;
                if (i10 < fVar.n()[i11].b()) {
                    return i12;
                }
            } else {
                o10 = i12 - 1;
            }
        }
        return i11;
    }
}
