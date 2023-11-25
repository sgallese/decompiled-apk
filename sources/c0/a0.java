package c0;

/* compiled from: StringHelpers.kt */
/* loaded from: classes.dex */
public final class a0 {
    public static final int a(CharSequence charSequence, int i10) {
        qc.q.i(charSequence, "<this>");
        int length = charSequence.length();
        for (int i11 = i10 + 1; i11 < length; i11++) {
            if (charSequence.charAt(i11) == '\n') {
                return i11;
            }
        }
        return charSequence.length();
    }

    public static final int b(CharSequence charSequence, int i10) {
        qc.q.i(charSequence, "<this>");
        for (int i11 = i10 - 1; i11 > 0; i11--) {
            if (charSequence.charAt(i11 - 1) == '\n') {
                return i11;
            }
        }
        return 0;
    }

    public static final long c(CharSequence charSequence, int i10) {
        qc.q.i(charSequence, "<this>");
        return v1.j0.b(b(charSequence, i10), a(charSequence, i10));
    }
}
