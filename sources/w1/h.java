package w1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* compiled from: LayoutCompat.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f25273a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final Layout.Alignment f25274b = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: c  reason: collision with root package name */
    private static final TextDirectionHeuristic f25275c;

    static {
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        qc.q.h(textDirectionHeuristic, "FIRSTSTRONG_LTR");
        f25275c = textDirectionHeuristic;
    }

    private h() {
    }

    public final Layout.Alignment a() {
        return f25274b;
    }

    public final TextDirectionHeuristic b() {
        return f25275c;
    }
}
