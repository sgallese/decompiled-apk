package c0;

import java.text.BreakIterator;

/* compiled from: StringHelpers.android.kt */
/* loaded from: classes.dex */
public final class b0 {
    public static final int a(String str, int i10) {
        boolean z10;
        qc.q.i(str, "<this>");
        androidx.emoji2.text.f c10 = c();
        Integer num = null;
        if (c10 != null) {
            Integer valueOf = Integer.valueOf(c10.d(str, i10));
            if (valueOf.intValue() == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    public static final int b(String str, int i10) {
        qc.q.i(str, "<this>");
        androidx.emoji2.text.f c10 = c();
        Integer num = null;
        if (c10 != null) {
            boolean z10 = false;
            Integer valueOf = Integer.valueOf(c10.f(str, Math.max(0, i10 - 1)));
            if (valueOf.intValue() == -1) {
                z10 = true;
            }
            if (!z10) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    private static final androidx.emoji2.text.f c() {
        if (!androidx.emoji2.text.f.k()) {
            return null;
        }
        androidx.emoji2.text.f c10 = androidx.emoji2.text.f.c();
        boolean z10 = true;
        if (c10.g() != 1) {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        return c10;
    }
}
