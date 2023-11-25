package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import o2.l;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public abstract class k extends b {

    /* renamed from: v  reason: collision with root package name */
    private boolean f3574v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f3575w;

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.f3394a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == j.f3443h1) {
                    this.f3574v = true;
                } else if (index == j.f3492o1) {
                    this.f3575w = true;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f3574v || this.f3575w) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f3280m; i10++) {
                View h10 = constraintLayout.h(this.f3279f[i10]);
                if (h10 != null) {
                    if (this.f3574v) {
                        h10.setVisibility(visibility);
                    }
                    if (this.f3575w && elevation > 0.0f) {
                        h10.setTranslationZ(h10.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        c();
    }

    public void n(l lVar, int i10, int i11) {
    }
}
