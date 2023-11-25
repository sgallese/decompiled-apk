package e2;

import android.text.style.TtsSpan;
import kotlin.NoWhenBranchMatchedException;
import qc.q;
import v1.m0;
import v1.o0;

/* compiled from: TtsAnnotationExtensions.android.kt */
/* loaded from: classes.dex */
public final class i {
    public static final TtsSpan a(m0 m0Var) {
        q.i(m0Var, "<this>");
        if (m0Var instanceof o0) {
            return b((o0) m0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan b(o0 o0Var) {
        q.i(o0Var, "<this>");
        TtsSpan build = new TtsSpan.VerbatimBuilder(o0Var.a()).build();
        q.h(build, "builder.build()");
        return build;
    }
}
