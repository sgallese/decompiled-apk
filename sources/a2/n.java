package a2;

import java.util.List;

/* compiled from: FontFamily.kt */
/* loaded from: classes.dex */
public final class n {
    public static final l a(List<? extends k> list) {
        qc.q.i(list, "fonts");
        return new s(list);
    }

    public static final l b(k... kVarArr) {
        List c10;
        qc.q.i(kVarArr, "fonts");
        c10 = ec.o.c(kVarArr);
        return new s(c10);
    }
}
