package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public class e extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    d f3377f;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public d getConstraintSet() {
        if (this.f3377f == null) {
            this.f3377f = new d();
        }
        this.f3377f.g(this);
        return this.f3377f;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;

        /* renamed from: p0  reason: collision with root package name */
        public float f3378p0;

        /* renamed from: q0  reason: collision with root package name */
        public boolean f3379q0;

        /* renamed from: r0  reason: collision with root package name */
        public float f3380r0;

        /* renamed from: s0  reason: collision with root package name */
        public float f3381s0;

        /* renamed from: t0  reason: collision with root package name */
        public float f3382t0;

        /* renamed from: u0  reason: collision with root package name */
        public float f3383u0;

        /* renamed from: v0  reason: collision with root package name */
        public float f3384v0;

        /* renamed from: w0  reason: collision with root package name */
        public float f3385w0;

        /* renamed from: x0  reason: collision with root package name */
        public float f3386x0;

        /* renamed from: y0  reason: collision with root package name */
        public float f3387y0;

        /* renamed from: z0  reason: collision with root package name */
        public float f3388z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f3378p0 = 1.0f;
            this.f3379q0 = false;
            this.f3380r0 = 0.0f;
            this.f3381s0 = 0.0f;
            this.f3382t0 = 0.0f;
            this.f3383u0 = 0.0f;
            this.f3384v0 = 1.0f;
            this.f3385w0 = 1.0f;
            this.f3386x0 = 0.0f;
            this.f3387y0 = 0.0f;
            this.f3388z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3378p0 = 1.0f;
            this.f3379q0 = false;
            this.f3380r0 = 0.0f;
            this.f3381s0 = 0.0f;
            this.f3382t0 = 0.0f;
            this.f3383u0 = 0.0f;
            this.f3384v0 = 1.0f;
            this.f3385w0 = 1.0f;
            this.f3386x0 = 0.0f;
            this.f3387y0 = 0.0f;
            this.f3388z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.N2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == j.O2) {
                    this.f3378p0 = obtainStyledAttributes.getFloat(index, this.f3378p0);
                } else if (index == j.Z2) {
                    this.f3380r0 = obtainStyledAttributes.getFloat(index, this.f3380r0);
                    this.f3379q0 = true;
                } else if (index == j.W2) {
                    this.f3382t0 = obtainStyledAttributes.getFloat(index, this.f3382t0);
                } else if (index == j.X2) {
                    this.f3383u0 = obtainStyledAttributes.getFloat(index, this.f3383u0);
                } else if (index == j.V2) {
                    this.f3381s0 = obtainStyledAttributes.getFloat(index, this.f3381s0);
                } else if (index == j.T2) {
                    this.f3384v0 = obtainStyledAttributes.getFloat(index, this.f3384v0);
                } else if (index == j.U2) {
                    this.f3385w0 = obtainStyledAttributes.getFloat(index, this.f3385w0);
                } else if (index == j.P2) {
                    this.f3386x0 = obtainStyledAttributes.getFloat(index, this.f3386x0);
                } else if (index == j.Q2) {
                    this.f3387y0 = obtainStyledAttributes.getFloat(index, this.f3387y0);
                } else if (index == j.R2) {
                    this.f3388z0 = obtainStyledAttributes.getFloat(index, this.f3388z0);
                } else if (index == j.S2) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == j.Y2) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
