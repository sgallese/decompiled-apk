package w1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: BoringLayoutFactory.kt */
/* loaded from: classes.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f25267a = new f();

    private f() {
    }

    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, float f11, BoringLayout.Metrics metrics, boolean z10, TextUtils.TruncateAt truncateAt, int i11) {
        qc.q.i(charSequence, "text");
        qc.q.i(textPaint, "paint");
        qc.q.i(alignment, "alignment");
        qc.q.i(metrics, "metrics");
        return new BoringLayout(charSequence, textPaint, i10, alignment, f10, f11, metrics, z10, truncateAt, i11);
    }

    public static final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        qc.q.i(charSequence, "text");
        qc.q.i(textPaint, "paint");
        qc.q.i(textDirectionHeuristic, "textDir");
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
