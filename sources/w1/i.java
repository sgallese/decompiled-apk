package w1;

import android.text.Layout;

/* compiled from: LayoutCompat.kt */
/* loaded from: classes.dex */
public final class i {
    public static final int a(Layout layout, int i10, boolean z10) {
        qc.q.i(layout, "<this>");
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i10 && lineEnd != i10) {
            return lineForOffset;
        }
        if (lineStart == i10) {
            if (z10) {
                return lineForOffset - 1;
            }
            return lineForOffset;
        } else if (!z10) {
            return lineForOffset + 1;
        } else {
            return lineForOffset;
        }
    }
}
