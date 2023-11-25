package p1;

import androidx.compose.ui.e;

/* compiled from: InnerNodeCoordinator.kt */
/* loaded from: classes.dex */
public final class v1 extends e.c {
    private boolean A;

    public v1() {
        y1(0);
    }

    public final boolean I1() {
        return this.A;
    }

    @Override // androidx.compose.ui.e.c
    public void s1() {
        this.A = true;
    }

    @Override // androidx.compose.ui.e.c
    public void t1() {
        this.A = false;
    }

    public String toString() {
        return "<tail>";
    }
}
