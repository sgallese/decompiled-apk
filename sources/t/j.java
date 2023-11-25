package t;

/* compiled from: CheckScrollableContainerConstraints.kt */
/* loaded from: classes.dex */
public final class j {
    public static final void a(long j10, u.o oVar) {
        qc.q.i(oVar, "orientation");
        boolean z10 = true;
        if (oVar == u.o.Vertical) {
            if (j2.b.m(j10) == Integer.MAX_VALUE) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
            return;
        }
        if (j2.b.n(j10) == Integer.MAX_VALUE) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
    }
}
