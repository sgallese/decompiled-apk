package j0;

/* compiled from: Composables.kt */
/* loaded from: classes.dex */
public final class j {
    public static final int a(l lVar, int i10) {
        if (n.K()) {
            n.V(524444915, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int K = lVar.K();
        if (n.K()) {
            n.U();
        }
        return K;
    }

    public static final x1 b(l lVar, int i10) {
        if (n.K()) {
            n.V(394957799, i10, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        x1 b10 = lVar.b();
        if (b10 != null) {
            lVar.A(b10);
            if (n.K()) {
                n.U();
            }
            return b10;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final p d(l lVar, int i10) {
        lVar.e(-1165786124);
        if (n.K()) {
            n.V(-1165786124, i10, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        p L = lVar.L();
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return L;
    }
}
