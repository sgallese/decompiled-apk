package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements a {
    private SparseIntArray A;
    private c B;
    private List<b> C;
    private c.b D;

    /* renamed from: f  reason: collision with root package name */
    private int f9317f;

    /* renamed from: m  reason: collision with root package name */
    private int f9318m;

    /* renamed from: p  reason: collision with root package name */
    private int f9319p;

    /* renamed from: q  reason: collision with root package name */
    private int f9320q;

    /* renamed from: r  reason: collision with root package name */
    private int f9321r;

    /* renamed from: s  reason: collision with root package name */
    private int f9322s;

    /* renamed from: t  reason: collision with root package name */
    private Drawable f9323t;

    /* renamed from: u  reason: collision with root package name */
    private Drawable f9324u;

    /* renamed from: v  reason: collision with root package name */
    private int f9325v;

    /* renamed from: w  reason: collision with root package name */
    private int f9326w;

    /* renamed from: x  reason: collision with root package name */
    private int f9327x;

    /* renamed from: y  reason: collision with root package name */
    private int f9328y;

    /* renamed from: z  reason: collision with root package name */
    private int[] f9329z;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A() {
        if (this.f9323t == null && this.f9324u == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean a(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.C.get(i11).c() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean b(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View r10 = r(i10 - i12);
            if (r10 != null && r10.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void h(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.C.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = this.C.get(i12);
            for (int i13 = 0; i13 < bVar.f9382h; i13++) {
                int i14 = bVar.f9389o + i13;
                View r10 = r(i14);
                if (r10 != null && r10.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) r10.getLayoutParams();
                    if (s(i14, i13)) {
                        if (z10) {
                            left = r10.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        } else {
                            left = (r10.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f9328y;
                        }
                        p(canvas, left, bVar.f9376b, bVar.f9381g);
                    }
                    if (i13 == bVar.f9382h - 1 && (this.f9326w & 4) > 0) {
                        if (z10) {
                            right = (r10.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f9328y;
                        } else {
                            right = r10.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                        p(canvas, right, bVar.f9376b, bVar.f9381g);
                    }
                }
            }
            if (t(i12)) {
                if (z11) {
                    i11 = bVar.f9378d;
                } else {
                    i11 = bVar.f9376b - this.f9327x;
                }
                o(canvas, paddingLeft, i11, max);
            }
            if (u(i12) && (this.f9325v & 4) > 0) {
                if (z11) {
                    i10 = bVar.f9376b - this.f9327x;
                } else {
                    i10 = bVar.f9378d;
                }
                o(canvas, paddingLeft, i10, max);
            }
        }
    }

    private void n(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.C.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = this.C.get(i12);
            for (int i13 = 0; i13 < bVar.f9382h; i13++) {
                int i14 = bVar.f9389o + i13;
                View r10 = r(i14);
                if (r10 != null && r10.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) r10.getLayoutParams();
                    if (s(i14, i13)) {
                        if (z11) {
                            top = r10.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        } else {
                            top = (r10.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f9327x;
                        }
                        o(canvas, bVar.f9375a, top, bVar.f9381g);
                    }
                    if (i13 == bVar.f9382h - 1 && (this.f9325v & 4) > 0) {
                        if (z11) {
                            bottom = (r10.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f9327x;
                        } else {
                            bottom = r10.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        o(canvas, bVar.f9375a, bottom, bVar.f9381g);
                    }
                }
            }
            if (t(i12)) {
                if (z10) {
                    i11 = bVar.f9377c;
                } else {
                    i11 = bVar.f9375a - this.f9328y;
                }
                p(canvas, i11, paddingTop, max);
            }
            if (u(i12) && (this.f9326w & 4) > 0) {
                if (z10) {
                    i10 = bVar.f9375a - this.f9328y;
                } else {
                    i10 = bVar.f9377c;
                }
                p(canvas, i10, paddingTop, max);
            }
        }
    }

    private void o(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f9323t;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.f9327x + i11);
        this.f9323t.draw(canvas);
    }

    private void p(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f9324u;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.f9328y + i10, i12 + i11);
        this.f9324u.draw(canvas);
    }

    private boolean s(int i10, int i11) {
        if (b(i10, i11)) {
            if (l()) {
                if ((this.f9326w & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.f9325v & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (l()) {
            if ((this.f9326w & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.f9325v & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean t(int i10) {
        if (i10 < 0 || i10 >= this.C.size()) {
            return false;
        }
        if (a(i10)) {
            if (l()) {
                if ((this.f9325v & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.f9326w & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (l()) {
            if ((this.f9325v & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.f9326w & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean u(int i10) {
        if (i10 < 0 || i10 >= this.C.size()) {
            return false;
        }
        for (int i11 = i10 + 1; i11 < this.C.size(); i11++) {
            if (this.C.get(i11).c() > 0) {
                return false;
            }
        }
        if (l()) {
            if ((this.f9325v & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f9326w & 4) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.v(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.w(boolean, boolean, int, int, int, int):void");
    }

    private void x(int i10, int i11) {
        this.C.clear();
        this.D.a();
        this.B.c(this.D, i10, i11);
        this.C = this.D.f9398a;
        this.B.p(i10, i11);
        if (this.f9320q == 3) {
            for (b bVar : this.C) {
                int i12 = RecyclerView.UNDEFINED_DURATION;
                for (int i13 = 0; i13 < bVar.f9382h; i13++) {
                    View r10 = r(bVar.f9389o + i13);
                    if (r10 != null && r10.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) r10.getLayoutParams();
                        if (this.f9318m != 2) {
                            i12 = Math.max(i12, r10.getMeasuredHeight() + Math.max(bVar.f9386l - r10.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        } else {
                            i12 = Math.max(i12, r10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((bVar.f9386l - r10.getMeasuredHeight()) + r10.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        }
                    }
                }
                bVar.f9381g = i12;
            }
        }
        this.B.o(i10, i11, getPaddingTop() + getPaddingBottom());
        this.B.X();
        z(this.f9317f, i10, i11, this.D.f9399b);
    }

    private void y(int i10, int i11) {
        this.C.clear();
        this.D.a();
        this.B.f(this.D, i10, i11);
        this.C = this.D.f9398a;
        this.B.p(i10, i11);
        this.B.o(i10, i11, getPaddingLeft() + getPaddingRight());
        this.B.X();
        z(this.f9317f, i10, i11, this.D.f9399b);
    }

    private void z(int i10, int i11, int i12, int i13) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i10);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < largestMainSize) {
                        i13 = View.combineMeasuredStates(i13, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                    }
                    resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
                } else {
                    throw new IllegalStateException("Unknown width mode is set: " + mode);
                }
            } else {
                resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
            }
        } else {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < sumOfCrossSize) {
                        i13 = View.combineMeasuredStates(i13, UserVerificationMethods.USER_VERIFY_HANDPRINT);
                    }
                    resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
                } else {
                    throw new IllegalStateException("Unknown height mode is set: " + mode2);
                }
            } else {
                resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i12, i13);
            }
        } else {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, UserVerificationMethods.USER_VERIFY_HANDPRINT);
            } else {
                size2 = sumOfCrossSize;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.A == null) {
            this.A = new SparseIntArray(getChildCount());
        }
        this.f9329z = this.B.n(view, i10, layoutParams, this.A);
        super.addView(view, i10, layoutParams);
    }

    @Override // com.google.android.flexbox.a
    public void c(View view, int i10, int i11, b bVar) {
        if (s(i10, i11)) {
            if (l()) {
                int i12 = bVar.f9379e;
                int i13 = this.f9328y;
                bVar.f9379e = i12 + i13;
                bVar.f9380f += i13;
                return;
            }
            int i14 = bVar.f9379e;
            int i15 = this.f9327x;
            bVar.f9379e = i14 + i15;
            bVar.f9380f += i15;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.a
    public void d(b bVar) {
        if (l()) {
            if ((this.f9326w & 4) > 0) {
                int i10 = bVar.f9379e;
                int i11 = this.f9328y;
                bVar.f9379e = i10 + i11;
                bVar.f9380f += i11;
            }
        } else if ((this.f9325v & 4) > 0) {
            int i12 = bVar.f9379e;
            int i13 = this.f9327x;
            bVar.f9379e = i12 + i13;
            bVar.f9380f += i13;
        }
    }

    @Override // com.google.android.flexbox.a
    public View e(int i10) {
        return r(i10);
    }

    @Override // com.google.android.flexbox.a
    public int f(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return this.f9321r;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f9320q;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f9323t;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f9324u;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.f9317f;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<b> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.C.size());
        for (b bVar : this.C) {
            if (bVar.c() != 0) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public List<b> getFlexLinesInternal() {
        return this.C;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.f9318m;
    }

    public int getJustifyContent() {
        return this.f9319p;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        Iterator<b> it = this.C.iterator();
        int i10 = RecyclerView.UNDEFINED_DURATION;
        while (it.hasNext()) {
            i10 = Math.max(i10, it.next().f9379e);
        }
        return i10;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f9322s;
    }

    public int getShowDividerHorizontal() {
        return this.f9325v;
    }

    public int getShowDividerVertical() {
        return this.f9326w;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int i10;
        int i11;
        int size = this.C.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            b bVar = this.C.get(i13);
            if (t(i13)) {
                if (l()) {
                    i11 = this.f9327x;
                } else {
                    i11 = this.f9328y;
                }
                i12 += i11;
            }
            if (u(i13)) {
                if (l()) {
                    i10 = this.f9327x;
                } else {
                    i10 = this.f9328y;
                }
                i12 += i10;
            }
            i12 += bVar.f9381g;
        }
        return i12;
    }

    @Override // com.google.android.flexbox.a
    public View i(int i10) {
        return getChildAt(i10);
    }

    @Override // com.google.android.flexbox.a
    public int j(View view, int i10, int i11) {
        int i12;
        int i13 = 0;
        if (l()) {
            if (s(i10, i11)) {
                i13 = 0 + this.f9328y;
            }
            if ((this.f9326w & 4) > 0) {
                i12 = this.f9328y;
            } else {
                return i13;
            }
        } else {
            if (s(i10, i11)) {
                i13 = 0 + this.f9327x;
            }
            if ((this.f9325v & 4) > 0) {
                i12 = this.f9327x;
            } else {
                return i13;
            }
        }
        return i13 + i12;
    }

    @Override // com.google.android.flexbox.a
    public int k(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.google.android.flexbox.a
    public boolean l() {
        int i10 = this.f9317f;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.flexbox.a
    public int m(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        if (this.f9324u == null && this.f9323t == null) {
            return;
        }
        if (this.f9325v == 0 && this.f9326w == 0) {
            return;
        }
        int E = p0.E(this);
        int i10 = this.f9317f;
        boolean z12 = false;
        boolean z13 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (E == 1) {
                            z12 = true;
                        }
                        if (this.f9318m == 2) {
                            z12 = !z12;
                        }
                        n(canvas, z12, true);
                        return;
                    }
                    return;
                }
                if (E != 1) {
                    z13 = false;
                }
                if (this.f9318m == 2) {
                    z13 = !z13;
                }
                n(canvas, z13, false);
                return;
            }
            if (E != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f9318m == 2) {
                z12 = true;
            }
            h(canvas, z11, z12);
            return;
        }
        if (E == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9318m == 2) {
            z12 = true;
        }
        h(canvas, z10, z12);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int E = p0.E(this);
        int i14 = this.f9317f;
        boolean z15 = false;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        if (E == 1) {
                            z15 = true;
                        }
                        if (this.f9318m == 2) {
                            z14 = !z15;
                        } else {
                            z14 = z15;
                        }
                        w(z14, true, i10, i11, i12, i13);
                        return;
                    }
                    throw new IllegalStateException("Invalid flex direction is set: " + this.f9317f);
                }
                if (E == 1) {
                    z15 = true;
                }
                if (this.f9318m == 2) {
                    z13 = !z15;
                } else {
                    z13 = z15;
                }
                w(z13, false, i10, i11, i12, i13);
                return;
            }
            if (E != 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            v(z12, i10, i11, i12, i13);
            return;
        }
        if (E == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        v(z11, i10, i11, i12, i13);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.A == null) {
            this.A = new SparseIntArray(getChildCount());
        }
        if (this.B.O(this.A)) {
            this.f9329z = this.B.m(this.A);
        }
        int i12 = this.f9317f;
        if (i12 != 0 && i12 != 1) {
            if (i12 != 2 && i12 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f9317f);
            }
            y(i10, i11);
            return;
        }
        x(i10, i11);
    }

    @Override // android.view.ViewGroup
    /* renamed from: q  reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public View r(int i10) {
        if (i10 >= 0) {
            int[] iArr = this.f9329z;
            if (i10 < iArr.length) {
                return getChildAt(iArr[i10]);
            }
            return null;
        }
        return null;
    }

    public void setAlignContent(int i10) {
        if (this.f9321r != i10) {
            this.f9321r = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.f9320q != i10) {
            this.f9320q = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f9323t) {
            return;
        }
        this.f9323t = drawable;
        if (drawable != null) {
            this.f9327x = drawable.getIntrinsicHeight();
        } else {
            this.f9327x = 0;
        }
        A();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f9324u) {
            return;
        }
        this.f9324u = drawable;
        if (drawable != null) {
            this.f9328y = drawable.getIntrinsicWidth();
        } else {
            this.f9328y = 0;
        }
        A();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.f9317f != i10) {
            this.f9317f = i10;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<b> list) {
        this.C = list;
    }

    public void setFlexWrap(int i10) {
        if (this.f9318m != i10) {
            this.f9318m = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.f9319p != i10) {
            this.f9319p = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.f9322s != i10) {
            this.f9322s = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.f9325v) {
            this.f9325v = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.f9326w) {
            this.f9326w = i10;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9322s = -1;
        this.B = new c(this);
        this.C = new ArrayList();
        this.D = new c.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u6.a.f24168b, i10, 0);
        this.f9317f = obtainStyledAttributes.getInt(u6.a.f24174h, 0);
        this.f9318m = obtainStyledAttributes.getInt(u6.a.f24175i, 0);
        this.f9319p = obtainStyledAttributes.getInt(u6.a.f24176j, 0);
        this.f9320q = obtainStyledAttributes.getInt(u6.a.f24170d, 0);
        this.f9321r = obtainStyledAttributes.getInt(u6.a.f24169c, 0);
        this.f9322s = obtainStyledAttributes.getInt(u6.a.f24177k, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(u6.a.f24171e);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(u6.a.f24172f);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(u6.a.f24173g);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i11 = obtainStyledAttributes.getInt(u6.a.f24178l, 0);
        if (i11 != 0) {
            this.f9326w = i11;
            this.f9325v = i11;
        }
        int i12 = obtainStyledAttributes.getInt(u6.a.f24180n, 0);
        if (i12 != 0) {
            this.f9326w = i12;
        }
        int i13 = obtainStyledAttributes.getInt(u6.a.f24179m, 0);
        if (i13 != 0) {
            this.f9325v = i13;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        private int f9330f;

        /* renamed from: m  reason: collision with root package name */
        private float f9331m;

        /* renamed from: p  reason: collision with root package name */
        private float f9332p;

        /* renamed from: q  reason: collision with root package name */
        private int f9333q;

        /* renamed from: r  reason: collision with root package name */
        private float f9334r;

        /* renamed from: s  reason: collision with root package name */
        private int f9335s;

        /* renamed from: t  reason: collision with root package name */
        private int f9336t;

        /* renamed from: u  reason: collision with root package name */
        private int f9337u;

        /* renamed from: v  reason: collision with root package name */
        private int f9338v;

        /* renamed from: w  reason: collision with root package name */
        private boolean f9339w;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i10) {
                return new LayoutParams[i10];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9330f = 1;
            this.f9331m = 0.0f;
            this.f9332p = 1.0f;
            this.f9333q = -1;
            this.f9334r = -1.0f;
            this.f9335s = -1;
            this.f9336t = -1;
            this.f9337u = 16777215;
            this.f9338v = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u6.a.f24181o);
            this.f9330f = obtainStyledAttributes.getInt(u6.a.f24190x, 1);
            this.f9331m = obtainStyledAttributes.getFloat(u6.a.f24184r, 0.0f);
            this.f9332p = obtainStyledAttributes.getFloat(u6.a.f24185s, 1.0f);
            this.f9333q = obtainStyledAttributes.getInt(u6.a.f24182p, -1);
            this.f9334r = obtainStyledAttributes.getFraction(u6.a.f24183q, 1, 1, -1.0f);
            this.f9335s = obtainStyledAttributes.getDimensionPixelSize(u6.a.f24189w, -1);
            this.f9336t = obtainStyledAttributes.getDimensionPixelSize(u6.a.f24188v, -1);
            this.f9337u = obtainStyledAttributes.getDimensionPixelSize(u6.a.f24187u, 16777215);
            this.f9338v = obtainStyledAttributes.getDimensionPixelSize(u6.a.f24186t, 16777215);
            this.f9339w = obtainStyledAttributes.getBoolean(u6.a.f24191y, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public int A0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int D0() {
            return this.f9336t;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float E() {
            return this.f9332p;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean F0() {
            return this.f9339w;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int I() {
            return this.f9335s;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int I0() {
            return this.f9338v;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void Q(int i10) {
            this.f9335s = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int R() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int T0() {
            return this.f9337u;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int V() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int c0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void f0(int i10) {
            this.f9336t = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.f9330f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float k0() {
            return this.f9331m;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float q0() {
            return this.f9334r;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f9330f);
            parcel.writeFloat(this.f9331m);
            parcel.writeFloat(this.f9332p);
            parcel.writeInt(this.f9333q);
            parcel.writeFloat(this.f9334r);
            parcel.writeInt(this.f9335s);
            parcel.writeInt(this.f9336t);
            parcel.writeInt(this.f9337u);
            parcel.writeInt(this.f9338v);
            parcel.writeByte(this.f9339w ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public int x() {
            return this.f9333q;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f9330f = 1;
            this.f9331m = 0.0f;
            this.f9332p = 1.0f;
            this.f9333q = -1;
            this.f9334r = -1.0f;
            this.f9335s = -1;
            this.f9336t = -1;
            this.f9337u = 16777215;
            this.f9338v = 16777215;
            this.f9330f = layoutParams.f9330f;
            this.f9331m = layoutParams.f9331m;
            this.f9332p = layoutParams.f9332p;
            this.f9333q = layoutParams.f9333q;
            this.f9334r = layoutParams.f9334r;
            this.f9335s = layoutParams.f9335s;
            this.f9336t = layoutParams.f9336t;
            this.f9337u = layoutParams.f9337u;
            this.f9338v = layoutParams.f9338v;
            this.f9339w = layoutParams.f9339w;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9330f = 1;
            this.f9331m = 0.0f;
            this.f9332p = 1.0f;
            this.f9333q = -1;
            this.f9334r = -1.0f;
            this.f9335s = -1;
            this.f9336t = -1;
            this.f9337u = 16777215;
            this.f9338v = 16777215;
        }

        public LayoutParams(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.f9330f = 1;
            this.f9331m = 0.0f;
            this.f9332p = 1.0f;
            this.f9333q = -1;
            this.f9334r = -1.0f;
            this.f9335s = -1;
            this.f9336t = -1;
            this.f9337u = 16777215;
            this.f9338v = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9330f = 1;
            this.f9331m = 0.0f;
            this.f9332p = 1.0f;
            this.f9333q = -1;
            this.f9334r = -1.0f;
            this.f9335s = -1;
            this.f9336t = -1;
            this.f9337u = 16777215;
            this.f9338v = 16777215;
        }

        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            this.f9330f = 1;
            this.f9331m = 0.0f;
            this.f9332p = 1.0f;
            this.f9333q = -1;
            this.f9334r = -1.0f;
            this.f9335s = -1;
            this.f9336t = -1;
            this.f9337u = 16777215;
            this.f9338v = 16777215;
            this.f9330f = parcel.readInt();
            this.f9331m = parcel.readFloat();
            this.f9332p = parcel.readFloat();
            this.f9333q = parcel.readInt();
            this.f9334r = parcel.readFloat();
            this.f9335s = parcel.readInt();
            this.f9336t = parcel.readInt();
            this.f9337u = parcel.readInt();
            this.f9338v = parcel.readInt();
            this.f9339w = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    @Override // com.google.android.flexbox.a
    public void g(int i10, View view) {
    }
}
