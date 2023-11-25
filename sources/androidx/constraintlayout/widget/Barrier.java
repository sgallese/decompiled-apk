package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: v  reason: collision with root package name */
    private int f3204v;

    /* renamed from: w  reason: collision with root package name */
    private int f3205w;

    /* renamed from: x  reason: collision with root package name */
    private o2.a f3206x;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void o(o2.e eVar, int i10, boolean z10) {
        this.f3205w = i10;
        if (z10) {
            int i11 = this.f3204v;
            if (i11 == 5) {
                this.f3205w = 1;
            } else if (i11 == 6) {
                this.f3205w = 0;
            }
        } else {
            int i12 = this.f3204v;
            if (i12 == 5) {
                this.f3205w = 0;
            } else if (i12 == 6) {
                this.f3205w = 1;
            }
        }
        if (eVar instanceof o2.a) {
            ((o2.a) eVar).P0(this.f3205w);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f3206x = new o2.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.f3394a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == j.f3506q1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.f3499p1) {
                    this.f3206x.O0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == j.f3513r1) {
                    this.f3206x.Q0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f3282q = this.f3206x;
        m();
    }

    public int getMargin() {
        return this.f3206x.M0();
    }

    public int getType() {
        return this.f3204v;
    }

    @Override // androidx.constraintlayout.widget.b
    public void h(o2.e eVar, boolean z10) {
        o(eVar, this.f3204v, z10);
    }

    public boolean n() {
        return this.f3206x.K0();
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f3206x.O0(z10);
    }

    public void setDpMargin(int i10) {
        this.f3206x.Q0((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f3206x.Q0(i10);
    }

    public void setType(int i10) {
        this.f3204v = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
