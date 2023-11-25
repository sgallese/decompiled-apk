package a1;

import android.graphics.Shader;
import java.util.List;

/* compiled from: Shader.kt */
/* loaded from: classes.dex */
public final class n4 {
    public static final Shader a(t3 t3Var, int i10, int i11) {
        qc.q.i(t3Var, "image");
        return v0.a(t3Var, i10, i11);
    }

    public static final Shader b(long j10, long j11, List<p1> list, List<Float> list2, int i10) {
        qc.q.i(list, "colors");
        return v0.b(j10, j11, list, list2, i10);
    }

    public static final Shader c(long j10, List<p1> list, List<Float> list2) {
        qc.q.i(list, "colors");
        return v0.c(j10, list, list2);
    }
}
