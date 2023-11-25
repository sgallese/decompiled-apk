package w1;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: StaticLayoutFactory.kt */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final o0 f25312a = new o0();

    /* renamed from: b  reason: collision with root package name */
    private static final q0 f25313b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f25314c;

    static {
        q0 p0Var;
        if (Build.VERSION.SDK_INT >= 23) {
            p0Var = new c0();
        } else {
            p0Var = new p0();
        }
        f25313b = p0Var;
        f25314c = 8;
    }

    private o0() {
    }

    public final StaticLayout a(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        qc.q.i(charSequence, "text");
        qc.q.i(textPaint, "paint");
        qc.q.i(textDirectionHeuristic, "textDir");
        qc.q.i(alignment, "alignment");
        return f25313b.b(new r0(charSequence, i10, i11, textPaint, i12, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, i18, i19, iArr, iArr2));
    }

    public final boolean c(StaticLayout staticLayout, boolean z10) {
        qc.q.i(staticLayout, "layout");
        return f25313b.a(staticLayout, z10);
    }
}
