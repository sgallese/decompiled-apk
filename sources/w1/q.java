package w1;

import android.text.Spanned;

/* compiled from: SpannedExtensions.kt */
/* loaded from: classes.dex */
public final class q {
    public static final boolean a(Spanned spanned, Class<?> cls) {
        qc.q.i(spanned, "<this>");
        qc.q.i(cls, "clazz");
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    public static final boolean b(Spanned spanned, Class<?> cls, int i10, int i11) {
        qc.q.i(spanned, "<this>");
        qc.q.i(cls, "clazz");
        if (spanned.nextSpanTransition(i10 - 1, i11, cls) != i11) {
            return true;
        }
        return false;
    }
}
