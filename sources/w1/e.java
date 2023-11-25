package w1;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: BoringLayoutFactory.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f25265a = new e();

    private e() {
    }

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z10, boolean z11, TextUtils.TruncateAt truncateAt, int i11) {
        boolean z12;
        qc.q.i(charSequence, "text");
        qc.q.i(textPaint, "paint");
        qc.q.i(metrics, "metrics");
        qc.q.i(alignment, "alignment");
        boolean z13 = true;
        if (i10 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (i11 < 0) {
                z13 = false;
            }
            if (z13) {
                if (Build.VERSION.SDK_INT >= 33) {
                    return d.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, z11, truncateAt, i11);
                }
                return f.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean b(BoringLayout boringLayout) {
        qc.q.i(boringLayout, "layout");
        if (Build.VERSION.SDK_INT >= 33) {
            return d.f25264a.c(boringLayout);
        }
        return false;
    }

    public final BoringLayout.Metrics c(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        qc.q.i(charSequence, "text");
        qc.q.i(textPaint, "paint");
        qc.q.i(textDirectionHeuristic, "textDir");
        if (Build.VERSION.SDK_INT >= 33) {
            return d.b(charSequence, textPaint, textDirectionHeuristic);
        }
        return f.b(charSequence, textPaint, textDirectionHeuristic);
    }
}
