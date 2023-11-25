package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.p0;
import v6.f;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements b {

    /* renamed from: f  reason: collision with root package name */
    private TextView f10354f;

    /* renamed from: m  reason: collision with root package name */
    private Button f10355m;

    /* renamed from: p  reason: collision with root package name */
    private final TimeInterpolator f10356p;

    /* renamed from: q  reason: collision with root package name */
    private int f10357q;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10356p = j7.a.g(context, v6.b.O, w6.a.f25411b);
    }

    private static void b(View view, int i10, int i11) {
        if (p0.a0(view)) {
            p0.K0(view, p0.J(view), i10, p0.I(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean c(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f10354f.getPaddingTop() == i11 && this.f10354f.getPaddingBottom() == i12) {
            return z10;
        }
        b(this.f10354f, i11, i12);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f10) {
        if (f10 != 1.0f) {
            this.f10355m.setTextColor(d7.a.j(d7.a.d(this, v6.b.f24647q), this.f10355m.getCurrentTextColor(), f10));
        }
    }

    @Override // com.google.android.material.snackbar.b
    public void animateContentIn(int i10, int i11) {
        this.f10354f.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f10354f.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f10356p).setStartDelay(j11).start();
        if (this.f10355m.getVisibility() == 0) {
            this.f10355m.setAlpha(0.0f);
            this.f10355m.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f10356p).setStartDelay(j11).start();
        }
    }

    @Override // com.google.android.material.snackbar.b
    public void animateContentOut(int i10, int i11) {
        this.f10354f.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f10354f.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f10356p).setStartDelay(j11).start();
        if (this.f10355m.getVisibility() == 0) {
            this.f10355m.setAlpha(1.0f);
            this.f10355m.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f10356p).setStartDelay(j11).start();
        }
    }

    public Button getActionView() {
        return this.f10355m;
    }

    public TextView getMessageView() {
        return this.f10354f;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f10354f = (TextView) findViewById(f.N);
        this.f10355m = (Button) findViewById(f.M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (c(1, r0, r0 - r2) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (c(0, r0, r0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = v6.d.f24675g
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = v6.d.f24673f
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f10354f
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L30
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            if (r3 == 0) goto L4a
            int r5 = r7.f10357q
            if (r5 <= 0) goto L4a
            android.widget.Button r5 = r7.f10355m
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f10357q
            if (r5 <= r6) goto L4a
            int r2 = r0 - r2
            boolean r0 = r7.c(r1, r0, r2)
            if (r0 == 0) goto L55
            goto L56
        L4a:
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r2
        L4e:
            boolean r0 = r7.c(r4, r0, r0)
            if (r0 == 0) goto L55
            goto L56
        L55:
            r1 = 0
        L56:
            if (r1 == 0) goto L5b
            super.onMeasure(r8, r9)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f10357q = i10;
    }
}
