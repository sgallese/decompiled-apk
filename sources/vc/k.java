package vc;

import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Ranges.kt */
/* loaded from: classes4.dex */
public class k {
    public static final void a(boolean z10, Number number) {
        q.i(number, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    public static b<Float> b(float f10, float f11) {
        return new a(f10, f11);
    }
}
