package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: AndroidViewsHandler.android.kt */
/* loaded from: classes.dex */
public final class r0 extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<androidx.compose.ui.viewinterop.a, p1.j0> f2812f;

    /* renamed from: m  reason: collision with root package name */
    private final HashMap<p1.j0, androidx.compose.ui.viewinterop.a> f2813m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Context context) {
        super(context);
        qc.q.i(context, "context");
        setClipChildren(false);
        this.f2812f = new HashMap<>();
        this.f2813m = new HashMap<>();
    }

    public final void a(androidx.compose.ui.viewinterop.a aVar, Canvas canvas) {
        qc.q.i(aVar, "view");
        qc.q.i(canvas, "canvas");
        aVar.draw(canvas);
    }

    public Void b(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<androidx.compose.ui.viewinterop.a, p1.j0> getHolderToLayoutNode() {
        return this.f2812f;
    }

    public final HashMap<p1.j0, androidx.compose.ui.viewinterop.a> getLayoutNodeToHolder() {
        return this.f2813m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) b(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(View view, View view2) {
        qc.q.i(view, "child");
        qc.q.i(view2, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Set<androidx.compose.ui.viewinterop.a> keySet = this.f2812f.keySet();
        qc.q.h(keySet, "holderToLayoutNode.keys");
        for (androidx.compose.ui.viewinterop.a aVar : keySet) {
            aVar.layout(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (View.MeasureSpec.getMode(i11) != 1073741824) {
                z11 = false;
            }
            if (z11) {
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                Set<androidx.compose.ui.viewinterop.a> keySet = this.f2812f.keySet();
                qc.q.h(keySet, "holderToLayoutNode.keys");
                Iterator<T> it = keySet.iterator();
                while (it.hasNext()) {
                    ((androidx.compose.ui.viewinterop.a) it.next()).j();
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            p1.j0 j0Var = this.f2812f.get(childAt);
            if (childAt.isLayoutRequested() && j0Var != null) {
                p1.j0.j1(j0Var, false, false, 3, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
