package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.j;
import androidx.constraintlayout.widget.k;
import o2.e;
import o2.g;
import o2.l;

/* loaded from: classes.dex */
public class Flow extends k {

    /* renamed from: x  reason: collision with root package name */
    private g f3203x;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.k, androidx.constraintlayout.widget.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f3203x = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.f3394a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == j.f3401b1) {
                    this.f3203x.S1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.f3408c1) {
                    this.f3203x.Y0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.f3478m1) {
                    this.f3203x.d1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.f3485n1) {
                    this.f3203x.a1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.f3415d1) {
                    this.f3203x.b1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.f3422e1) {
                    this.f3203x.e1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.f3429f1) {
                    this.f3203x.c1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.f3436g1) {
                    this.f3203x.Z0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.L1) {
                    this.f3203x.X1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.B1) {
                    this.f3203x.M1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.K1) {
                    this.f3203x.W1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.f3541v1) {
                    this.f3203x.G1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.D1) {
                    this.f3203x.O1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.f3555x1) {
                    this.f3203x.I1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.F1) {
                    this.f3203x.Q1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == j.f3569z1) {
                    this.f3203x.K1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == j.f3534u1) {
                    this.f3203x.F1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == j.C1) {
                    this.f3203x.N1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == j.f3548w1) {
                    this.f3203x.H1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == j.E1) {
                    this.f3203x.P1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == j.I1) {
                    this.f3203x.U1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == j.f3562y1) {
                    this.f3203x.J1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == j.H1) {
                    this.f3203x.T1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == j.A1) {
                    this.f3203x.L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.J1) {
                    this.f3203x.V1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == j.G1) {
                    this.f3203x.R1(obtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f3282q = this.f3203x;
        m();
    }

    @Override // androidx.constraintlayout.widget.b
    public void h(e eVar, boolean z10) {
        this.f3203x.K0(z10);
    }

    @Override // androidx.constraintlayout.widget.k
    public void n(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar != null) {
            lVar.S0(mode, size, mode2, size2);
            setMeasuredDimension(lVar.N0(), lVar.M0());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i10, int i11) {
        n(this.f3203x, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f3203x.F1(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f3203x.G1(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f3203x.H1(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f3203x.I1(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f3203x.J1(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f3203x.K1(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f3203x.L1(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f3203x.M1(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f3203x.R1(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f3203x.S1(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f3203x.Y0(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f3203x.Z0(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f3203x.b1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f3203x.c1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f3203x.e1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f3203x.T1(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f3203x.U1(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f3203x.V1(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f3203x.W1(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f3203x.X1(i10);
        requestLayout();
    }
}
