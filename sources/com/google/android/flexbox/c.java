package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.view.s;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FlexboxHelper.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.flexbox.a f9393a;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f9394b;

    /* renamed from: c  reason: collision with root package name */
    int[] f9395c;

    /* renamed from: d  reason: collision with root package name */
    long[] f9396d;

    /* renamed from: e  reason: collision with root package name */
    private long[] f9397e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlexboxHelper.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        List<com.google.android.flexbox.b> f9398a;

        /* renamed from: b  reason: collision with root package name */
        int f9399b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            this.f9398a = null;
            this.f9399b = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FlexboxHelper.java */
    /* renamed from: com.google.android.flexbox.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0229c implements Comparable<C0229c> {

        /* renamed from: f  reason: collision with root package name */
        int f9400f;

        /* renamed from: m  reason: collision with root package name */
        int f9401m;

        private C0229c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public int compareTo(C0229c c0229c) {
            int i10 = this.f9401m;
            int i11 = c0229c.f9401m;
            if (i10 != i11) {
                return i10 - i11;
            }
            return this.f9400f - c0229c.f9400f;
        }

        public String toString() {
            return "Order{order=" + this.f9401m + ", index=" + this.f9400f + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(com.google.android.flexbox.a aVar) {
        this.f9393a = aVar;
    }

    private int A(int i10, FlexItem flexItem, int i11) {
        com.google.android.flexbox.a aVar = this.f9393a;
        int f10 = aVar.f(i10, aVar.getPaddingLeft() + this.f9393a.getPaddingRight() + flexItem.V() + flexItem.A0() + i11, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(f10);
        if (size > flexItem.T0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.T0(), View.MeasureSpec.getMode(f10));
        }
        if (size < flexItem.I()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.I(), View.MeasureSpec.getMode(f10));
        }
        return f10;
    }

    private int B(FlexItem flexItem, boolean z10) {
        if (z10) {
            return flexItem.R();
        }
        return flexItem.A0();
    }

    private int C(FlexItem flexItem, boolean z10) {
        if (z10) {
            return flexItem.A0();
        }
        return flexItem.R();
    }

    private int D(FlexItem flexItem, boolean z10) {
        if (z10) {
            return flexItem.c0();
        }
        return flexItem.V();
    }

    private int E(FlexItem flexItem, boolean z10) {
        if (z10) {
            return flexItem.V();
        }
        return flexItem.c0();
    }

    private int F(FlexItem flexItem, boolean z10) {
        if (z10) {
            return flexItem.getHeight();
        }
        return flexItem.getWidth();
    }

    private int G(FlexItem flexItem, boolean z10) {
        if (z10) {
            return flexItem.getWidth();
        }
        return flexItem.getHeight();
    }

    private int H(boolean z10) {
        if (z10) {
            return this.f9393a.getPaddingBottom();
        }
        return this.f9393a.getPaddingEnd();
    }

    private int I(boolean z10) {
        if (z10) {
            return this.f9393a.getPaddingEnd();
        }
        return this.f9393a.getPaddingBottom();
    }

    private int J(boolean z10) {
        if (z10) {
            return this.f9393a.getPaddingTop();
        }
        return this.f9393a.getPaddingStart();
    }

    private int K(boolean z10) {
        if (z10) {
            return this.f9393a.getPaddingStart();
        }
        return this.f9393a.getPaddingTop();
    }

    private int L(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int M(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private boolean N(int i10, int i11, com.google.android.flexbox.b bVar) {
        if (i10 == i11 - 1 && bVar.c() != 0) {
            return true;
        }
        return false;
    }

    private boolean P(View view, int i10, int i11, int i12, int i13, FlexItem flexItem, int i14, int i15, int i16) {
        if (this.f9393a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.F0()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.f9393a.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int j10 = this.f9393a.j(view, i14, i15);
        if (j10 > 0) {
            i13 += j10;
        }
        if (i11 >= i12 + i13) {
            return false;
        }
        return true;
    }

    private void T(int i10, int i11, com.google.android.flexbox.b bVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        int i17 = bVar.f9379e;
        float f10 = bVar.f9385k;
        float f11 = 0.0f;
        if (f10 > 0.0f && i12 <= i17) {
            float f12 = (i17 - i12) / f10;
            bVar.f9379e = i13 + bVar.f9380f;
            if (!z10) {
                bVar.f9381g = RecyclerView.UNDEFINED_DURATION;
            }
            int i18 = 0;
            boolean z11 = false;
            int i19 = 0;
            float f13 = 0.0f;
            while (i18 < bVar.f9382h) {
                int i20 = bVar.f9389o + i18;
                View e10 = this.f9393a.e(i20);
                if (e10 != null && e10.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) e10.getLayoutParams();
                    int flexDirection = this.f9393a.getFlexDirection();
                    if (flexDirection != 0 && flexDirection != 1) {
                        int measuredHeight = e10.getMeasuredHeight();
                        long[] jArr = this.f9397e;
                        if (jArr != null) {
                            measuredHeight = x(jArr[i20]);
                        }
                        int measuredWidth = e10.getMeasuredWidth();
                        long[] jArr2 = this.f9397e;
                        if (jArr2 != null) {
                            measuredWidth = y(jArr2[i20]);
                        }
                        if (!this.f9394b[i20] && flexItem.E() > f11) {
                            float E = measuredHeight - (flexItem.E() * f12);
                            if (i18 == bVar.f9382h - 1) {
                                E += f13;
                                f13 = 0.0f;
                            }
                            int round = Math.round(E);
                            if (round < flexItem.D0()) {
                                round = flexItem.D0();
                                this.f9394b[i20] = true;
                                bVar.f9385k -= flexItem.E();
                                i14 = i17;
                                i15 = i18;
                                z11 = true;
                            } else {
                                f13 += E - round;
                                i14 = i17;
                                i15 = i18;
                                double d10 = f13;
                                if (d10 > 1.0d) {
                                    round++;
                                    f13 -= 1.0f;
                                } else if (d10 < -1.0d) {
                                    round--;
                                    f13 += 1.0f;
                                }
                            }
                            int A = A(i10, flexItem, bVar.f9387m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            e10.measure(A, makeMeasureSpec);
                            measuredWidth = e10.getMeasuredWidth();
                            int measuredHeight2 = e10.getMeasuredHeight();
                            Z(i20, A, makeMeasureSpec, e10);
                            this.f9393a.g(i20, e10);
                            measuredHeight = measuredHeight2;
                        } else {
                            i14 = i17;
                            i15 = i18;
                        }
                        i16 = Math.max(i19, measuredWidth + flexItem.V() + flexItem.A0() + this.f9393a.m(e10));
                        bVar.f9379e += measuredHeight + flexItem.c0() + flexItem.R();
                    } else {
                        i14 = i17;
                        int i21 = i18;
                        int measuredWidth2 = e10.getMeasuredWidth();
                        long[] jArr3 = this.f9397e;
                        if (jArr3 != null) {
                            measuredWidth2 = y(jArr3[i20]);
                        }
                        int measuredHeight3 = e10.getMeasuredHeight();
                        long[] jArr4 = this.f9397e;
                        if (jArr4 != null) {
                            measuredHeight3 = x(jArr4[i20]);
                        }
                        if (!this.f9394b[i20] && flexItem.E() > 0.0f) {
                            float E2 = measuredWidth2 - (flexItem.E() * f12);
                            i15 = i21;
                            if (i15 == bVar.f9382h - 1) {
                                E2 += f13;
                                f13 = 0.0f;
                            }
                            int round2 = Math.round(E2);
                            if (round2 < flexItem.I()) {
                                round2 = flexItem.I();
                                this.f9394b[i20] = true;
                                bVar.f9385k -= flexItem.E();
                                z11 = true;
                            } else {
                                f13 += E2 - round2;
                                double d11 = f13;
                                if (d11 > 1.0d) {
                                    round2++;
                                    f13 -= 1.0f;
                                } else if (d11 < -1.0d) {
                                    round2--;
                                    f13 += 1.0f;
                                }
                            }
                            int z12 = z(i11, flexItem, bVar.f9387m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            e10.measure(makeMeasureSpec2, z12);
                            int measuredWidth3 = e10.getMeasuredWidth();
                            int measuredHeight4 = e10.getMeasuredHeight();
                            Z(i20, makeMeasureSpec2, z12, e10);
                            this.f9393a.g(i20, e10);
                            measuredWidth2 = measuredWidth3;
                            measuredHeight3 = measuredHeight4;
                        } else {
                            i15 = i21;
                        }
                        int max = Math.max(i19, measuredHeight3 + flexItem.c0() + flexItem.R() + this.f9393a.m(e10));
                        bVar.f9379e += measuredWidth2 + flexItem.V() + flexItem.A0();
                        i16 = max;
                    }
                    bVar.f9381g = Math.max(bVar.f9381g, i16);
                    i19 = i16;
                } else {
                    i14 = i17;
                    i15 = i18;
                }
                i18 = i15 + 1;
                i17 = i14;
                f11 = 0.0f;
            }
            int i22 = i17;
            if (z11 && i22 != bVar.f9379e) {
                T(i10, i11, bVar, i12, i13, true);
            }
        }
    }

    private int[] U(int i10, List<C0229c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (C0229c c0229c : list) {
            int i12 = c0229c.f9400f;
            iArr[i11] = i12;
            sparseIntArray.append(i12, c0229c.f9401m);
            i11++;
        }
        return iArr;
    }

    private void V(View view, int i10, int i11) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - flexItem.V()) - flexItem.A0()) - this.f9393a.m(view), flexItem.I()), flexItem.T0());
        long[] jArr = this.f9397e;
        if (jArr != null) {
            measuredHeight = x(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        Z(i11, makeMeasureSpec2, makeMeasureSpec, view);
        this.f9393a.g(i11, view);
    }

    private void W(View view, int i10, int i11) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - flexItem.c0()) - flexItem.R()) - this.f9393a.m(view), flexItem.D0()), flexItem.I0());
        long[] jArr = this.f9397e;
        if (jArr != null) {
            measuredWidth = y(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        Z(i11, makeMeasureSpec, makeMeasureSpec2, view);
        this.f9393a.g(i11, view);
    }

    private void Z(int i10, int i11, int i12, View view) {
        long[] jArr = this.f9396d;
        if (jArr != null) {
            jArr[i10] = S(i11, i12);
        }
        long[] jArr2 = this.f9397e;
        if (jArr2 != null) {
            jArr2[i10] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void a(List<com.google.android.flexbox.b> list, com.google.android.flexbox.b bVar, int i10, int i11) {
        bVar.f9387m = i11;
        this.f9393a.d(bVar);
        bVar.f9390p = i10;
        list.add(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.I()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.I()
        L19:
            r3 = 1
            goto L27
        L1b:
            int r3 = r0.T0()
            if (r1 <= r3) goto L26
            int r1 = r0.T0()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.D0()
            if (r2 >= r5) goto L32
            int r2 = r0.D0()
            goto L3e
        L32:
            int r5 = r0.I0()
            if (r2 <= r5) goto L3d
            int r2 = r0.I0()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Z(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f9393a
            r0.g(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.c.i(android.view.View, int):void");
    }

    private List<com.google.android.flexbox.b> k(List<com.google.android.flexbox.b> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.b bVar = new com.google.android.flexbox.b();
        bVar.f9381g = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private List<C0229c> l(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            FlexItem flexItem = (FlexItem) this.f9393a.i(i11).getLayoutParams();
            C0229c c0229c = new C0229c();
            c0229c.f9401m = flexItem.getOrder();
            c0229c.f9400f = i11;
            arrayList.add(c0229c);
        }
        return arrayList;
    }

    private void r(int i10) {
        boolean[] zArr = this.f9394b;
        if (zArr == null) {
            this.f9394b = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.f9394b = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void v(CompoundButton compoundButton) {
        int minimumWidth;
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int I = flexItem.I();
        int D0 = flexItem.D0();
        Drawable a10 = androidx.core.widget.c.a(compoundButton);
        int i10 = 0;
        if (a10 == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = a10.getMinimumWidth();
        }
        if (a10 != null) {
            i10 = a10.getMinimumHeight();
        }
        if (I == -1) {
            I = minimumWidth;
        }
        flexItem.Q(I);
        if (D0 == -1) {
            D0 = i10;
        }
        flexItem.f0(D0);
    }

    private void w(int i10, int i11, com.google.android.flexbox.b bVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        double d10;
        int i17;
        double d11;
        float f10 = bVar.f9384j;
        float f11 = 0.0f;
        if (f10 > 0.0f && i12 >= (i14 = bVar.f9379e)) {
            float f12 = (i12 - i14) / f10;
            bVar.f9379e = i13 + bVar.f9380f;
            if (!z10) {
                bVar.f9381g = RecyclerView.UNDEFINED_DURATION;
            }
            int i18 = 0;
            boolean z11 = false;
            int i19 = 0;
            float f13 = 0.0f;
            while (i18 < bVar.f9382h) {
                int i20 = bVar.f9389o + i18;
                View e10 = this.f9393a.e(i20);
                if (e10 != null && e10.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) e10.getLayoutParams();
                    int flexDirection = this.f9393a.getFlexDirection();
                    if (flexDirection != 0 && flexDirection != 1) {
                        int measuredHeight = e10.getMeasuredHeight();
                        long[] jArr = this.f9397e;
                        if (jArr != null) {
                            measuredHeight = x(jArr[i20]);
                        }
                        int measuredWidth = e10.getMeasuredWidth();
                        long[] jArr2 = this.f9397e;
                        if (jArr2 != null) {
                            measuredWidth = y(jArr2[i20]);
                        }
                        if (!this.f9394b[i20] && flexItem.k0() > f11) {
                            float k02 = measuredHeight + (flexItem.k0() * f12);
                            if (i18 == bVar.f9382h - 1) {
                                k02 += f13;
                                f13 = 0.0f;
                            }
                            int round = Math.round(k02);
                            if (round > flexItem.I0()) {
                                round = flexItem.I0();
                                this.f9394b[i20] = true;
                                bVar.f9384j -= flexItem.k0();
                                i17 = i14;
                                z11 = true;
                            } else {
                                f13 += k02 - round;
                                i17 = i14;
                                double d12 = f13;
                                if (d12 > 1.0d) {
                                    round++;
                                    d11 = d12 - 1.0d;
                                } else if (d12 < -1.0d) {
                                    round--;
                                    d11 = d12 + 1.0d;
                                }
                                f13 = (float) d11;
                            }
                            int A = A(i10, flexItem, bVar.f9387m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            e10.measure(A, makeMeasureSpec);
                            measuredWidth = e10.getMeasuredWidth();
                            int measuredHeight2 = e10.getMeasuredHeight();
                            Z(i20, A, makeMeasureSpec, e10);
                            this.f9393a.g(i20, e10);
                            measuredHeight = measuredHeight2;
                        } else {
                            i17 = i14;
                        }
                        i16 = Math.max(i19, measuredWidth + flexItem.V() + flexItem.A0() + this.f9393a.m(e10));
                        bVar.f9379e += measuredHeight + flexItem.c0() + flexItem.R();
                        i15 = i17;
                    } else {
                        int i21 = i14;
                        int measuredWidth2 = e10.getMeasuredWidth();
                        long[] jArr3 = this.f9397e;
                        if (jArr3 != null) {
                            measuredWidth2 = y(jArr3[i20]);
                        }
                        int measuredHeight3 = e10.getMeasuredHeight();
                        long[] jArr4 = this.f9397e;
                        i15 = i21;
                        if (jArr4 != null) {
                            measuredHeight3 = x(jArr4[i20]);
                        }
                        if (!this.f9394b[i20] && flexItem.k0() > 0.0f) {
                            float k03 = measuredWidth2 + (flexItem.k0() * f12);
                            if (i18 == bVar.f9382h - 1) {
                                k03 += f13;
                                f13 = 0.0f;
                            }
                            int round2 = Math.round(k03);
                            if (round2 > flexItem.T0()) {
                                round2 = flexItem.T0();
                                this.f9394b[i20] = true;
                                bVar.f9384j -= flexItem.k0();
                                z11 = true;
                            } else {
                                f13 += k03 - round2;
                                double d13 = f13;
                                if (d13 > 1.0d) {
                                    round2++;
                                    d10 = d13 - 1.0d;
                                } else if (d13 < -1.0d) {
                                    round2--;
                                    d10 = d13 + 1.0d;
                                }
                                f13 = (float) d10;
                            }
                            int z12 = z(i11, flexItem, bVar.f9387m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            e10.measure(makeMeasureSpec2, z12);
                            int measuredWidth3 = e10.getMeasuredWidth();
                            int measuredHeight4 = e10.getMeasuredHeight();
                            Z(i20, makeMeasureSpec2, z12, e10);
                            this.f9393a.g(i20, e10);
                            measuredWidth2 = measuredWidth3;
                            measuredHeight3 = measuredHeight4;
                        }
                        int max = Math.max(i19, measuredHeight3 + flexItem.c0() + flexItem.R() + this.f9393a.m(e10));
                        bVar.f9379e += measuredWidth2 + flexItem.V() + flexItem.A0();
                        i16 = max;
                    }
                    bVar.f9381g = Math.max(bVar.f9381g, i16);
                    i19 = i16;
                } else {
                    i15 = i14;
                }
                i18++;
                i14 = i15;
                f11 = 0.0f;
            }
            int i22 = i14;
            if (z11 && i22 != bVar.f9379e) {
                w(i10, i11, bVar, i12, i13, true);
            }
        }
    }

    private int z(int i10, FlexItem flexItem, int i11) {
        com.google.android.flexbox.a aVar = this.f9393a;
        int k10 = aVar.k(i10, aVar.getPaddingTop() + this.f9393a.getPaddingBottom() + flexItem.c0() + flexItem.R() + i11, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(k10);
        if (size > flexItem.I0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.I0(), View.MeasureSpec.getMode(k10));
        }
        if (size < flexItem.D0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.D0(), View.MeasureSpec.getMode(k10));
        }
        return k10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f9393a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View i11 = this.f9393a.i(i10);
            if (i11 != null && ((FlexItem) i11.getLayoutParams()).getOrder() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(View view, com.google.android.flexbox.b bVar, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f9393a.getAlignItems();
        if (flexItem.x() != -1) {
            alignItems = flexItem.x();
        }
        int i14 = bVar.f9381g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3) {
                        if (alignItems != 4) {
                            return;
                        }
                    } else if (this.f9393a.getFlexWrap() != 2) {
                        int max = Math.max(bVar.f9386l - view.getBaseline(), flexItem.c0());
                        view.layout(i10, i11 + max, i12, i13 + max);
                        return;
                    } else {
                        int max2 = Math.max((bVar.f9386l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.R());
                        view.layout(i10, i11 - max2, i12, i13 - max2);
                        return;
                    }
                } else {
                    int measuredHeight = (((i14 - view.getMeasuredHeight()) + flexItem.c0()) - flexItem.R()) / 2;
                    if (this.f9393a.getFlexWrap() != 2) {
                        int i15 = i11 + measuredHeight;
                        view.layout(i10, i15, i12, view.getMeasuredHeight() + i15);
                        return;
                    }
                    int i16 = i11 - measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                }
            } else if (this.f9393a.getFlexWrap() != 2) {
                int i17 = i11 + i14;
                view.layout(i10, (i17 - view.getMeasuredHeight()) - flexItem.R(), i12, i17 - flexItem.R());
                return;
            } else {
                view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + flexItem.c0(), i12, (i13 - i14) + view.getMeasuredHeight() + flexItem.c0());
                return;
            }
        }
        if (this.f9393a.getFlexWrap() != 2) {
            view.layout(i10, i11 + flexItem.c0(), i12, i13 + flexItem.c0());
        } else {
            view.layout(i10, i11 - flexItem.R(), i12, i13 - flexItem.R());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(View view, com.google.android.flexbox.b bVar, boolean z10, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f9393a.getAlignItems();
        if (flexItem.x() != -1) {
            alignItems = flexItem.x();
        }
        int i14 = bVar.f9381g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i14 - view.getMeasuredWidth()) + s.b(marginLayoutParams)) - s.a(marginLayoutParams)) / 2;
                    if (!z10) {
                        view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                        return;
                    } else {
                        view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                        return;
                    }
                }
            } else if (!z10) {
                view.layout(((i10 + i14) - view.getMeasuredWidth()) - flexItem.A0(), i11, ((i12 + i14) - view.getMeasuredWidth()) - flexItem.A0(), i13);
                return;
            } else {
                view.layout((i10 - i14) + view.getMeasuredWidth() + flexItem.V(), i11, (i12 - i14) + view.getMeasuredWidth() + flexItem.V(), i13);
                return;
            }
        }
        if (!z10) {
            view.layout(i10 + flexItem.V(), i11, i12 + flexItem.V(), i13);
        } else {
            view.layout(i10 - flexItem.A0(), i11, i12 - flexItem.A0(), i13);
        }
    }

    long S(int i10, int i11) {
        return (i10 & 4294967295L) | (i11 << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X() {
        Y(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(int i10) {
        int i11;
        View e10;
        if (i10 >= this.f9393a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f9393a.getFlexDirection();
        if (this.f9393a.getAlignItems() == 4) {
            int[] iArr = this.f9395c;
            if (iArr != null) {
                i11 = iArr[i10];
            } else {
                i11 = 0;
            }
            List<com.google.android.flexbox.b> flexLinesInternal = this.f9393a.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            while (i11 < size) {
                com.google.android.flexbox.b bVar = flexLinesInternal.get(i11);
                int i12 = bVar.f9382h;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = bVar.f9389o + i13;
                    if (i13 < this.f9393a.getFlexItemCount() && (e10 = this.f9393a.e(i14)) != null && e10.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) e10.getLayoutParams();
                        if (flexItem.x() == -1 || flexItem.x() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                                V(e10, bVar.f9381g, i14);
                            } else {
                                W(e10, bVar.f9381g, i14);
                            }
                        }
                    }
                }
                i11++;
            }
            return;
        }
        for (com.google.android.flexbox.b bVar2 : this.f9393a.getFlexLinesInternal()) {
            for (Integer num : bVar2.f9388n) {
                View e11 = this.f9393a.e(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                    }
                    V(e11, bVar2.f9381g, num.intValue());
                } else {
                    W(e11, bVar2.f9381g, num.intValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(b bVar, int i10, int i11, int i12, int i13, int i14, List<com.google.android.flexbox.b> list) {
        ArrayList arrayList;
        boolean z10;
        int i15;
        b bVar2;
        int i16;
        int i17;
        int i18;
        List<com.google.android.flexbox.b> list2;
        int i19;
        View view;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z11;
        boolean z12;
        int i24;
        int i25;
        int i26;
        com.google.android.flexbox.b bVar3;
        int i27;
        int i28 = i10;
        int i29 = i11;
        int i30 = i14;
        boolean l10 = this.f9393a.l();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        bVar.f9398a = arrayList;
        if (i30 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int K = K(l10);
        int I = I(l10);
        int J = J(l10);
        int H = H(l10);
        com.google.android.flexbox.b bVar4 = new com.google.android.flexbox.b();
        int i31 = i13;
        bVar4.f9389o = i31;
        int i32 = I + K;
        bVar4.f9379e = i32;
        int flexItemCount = this.f9393a.getFlexItemCount();
        boolean z13 = z10;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = RecyclerView.UNDEFINED_DURATION;
        while (true) {
            if (i31 < flexItemCount) {
                View e10 = this.f9393a.e(i31);
                if (e10 == null) {
                    if (N(i31, flexItemCount, bVar4)) {
                        a(arrayList, bVar4, i31, i33);
                    }
                } else if (e10.getVisibility() == 8) {
                    bVar4.f9383i++;
                    bVar4.f9382h++;
                    if (N(i31, flexItemCount, bVar4)) {
                        a(arrayList, bVar4, i31, i33);
                    }
                } else {
                    if (e10 instanceof CompoundButton) {
                        v((CompoundButton) e10);
                    }
                    FlexItem flexItem = (FlexItem) e10.getLayoutParams();
                    int i37 = flexItemCount;
                    if (flexItem.x() == 4) {
                        bVar4.f9388n.add(Integer.valueOf(i31));
                    }
                    int G = G(flexItem, l10);
                    if (flexItem.q0() != -1.0f && mode == 1073741824) {
                        G = Math.round(size * flexItem.q0());
                    }
                    if (l10) {
                        int f10 = this.f9393a.f(i28, i32 + E(flexItem, true) + C(flexItem, true), G);
                        i16 = size;
                        i17 = mode;
                        int k10 = this.f9393a.k(i29, J + H + D(flexItem, true) + B(flexItem, true) + i33, F(flexItem, true));
                        e10.measure(f10, k10);
                        Z(i31, f10, k10, e10);
                        i18 = f10;
                    } else {
                        i16 = size;
                        i17 = mode;
                        int f11 = this.f9393a.f(i29, J + H + D(flexItem, false) + B(flexItem, false) + i33, F(flexItem, false));
                        int k11 = this.f9393a.k(i28, E(flexItem, false) + i32 + C(flexItem, false), G);
                        e10.measure(f11, k11);
                        Z(i31, f11, k11, e10);
                        i18 = k11;
                    }
                    this.f9393a.g(i31, e10);
                    i(e10, i31);
                    i34 = View.combineMeasuredStates(i34, e10.getMeasuredState());
                    int i38 = i33;
                    int i39 = i32;
                    com.google.android.flexbox.b bVar5 = bVar4;
                    int i40 = i31;
                    list2 = arrayList;
                    int i41 = i18;
                    if (P(e10, i17, i16, bVar4.f9379e, C(flexItem, l10) + M(e10, l10) + E(flexItem, l10), flexItem, i40, i35, arrayList.size())) {
                        if (bVar5.c() > 0) {
                            if (i40 > 0) {
                                i27 = i40 - 1;
                                bVar3 = bVar5;
                            } else {
                                bVar3 = bVar5;
                                i27 = 0;
                            }
                            a(list2, bVar3, i27, i38);
                            i33 = bVar3.f9381g + i38;
                        } else {
                            i33 = i38;
                        }
                        if (l10) {
                            if (flexItem.getHeight() == -1) {
                                com.google.android.flexbox.a aVar = this.f9393a;
                                i19 = i11;
                                i31 = i40;
                                view = e10;
                                view.measure(i41, aVar.k(i19, aVar.getPaddingTop() + this.f9393a.getPaddingBottom() + flexItem.c0() + flexItem.R() + i33, flexItem.getHeight()));
                                i(view, i31);
                            } else {
                                i19 = i11;
                                view = e10;
                                i31 = i40;
                            }
                        } else {
                            i19 = i11;
                            view = e10;
                            i31 = i40;
                            if (flexItem.getWidth() == -1) {
                                com.google.android.flexbox.a aVar2 = this.f9393a;
                                view.measure(aVar2.f(i19, aVar2.getPaddingLeft() + this.f9393a.getPaddingRight() + flexItem.V() + flexItem.A0() + i33, flexItem.getWidth()), i41);
                                i(view, i31);
                            }
                        }
                        bVar4 = new com.google.android.flexbox.b();
                        i21 = 1;
                        bVar4.f9382h = 1;
                        i20 = i39;
                        bVar4.f9379e = i20;
                        bVar4.f9389o = i31;
                        i22 = 0;
                        i23 = RecyclerView.UNDEFINED_DURATION;
                    } else {
                        i19 = i11;
                        view = e10;
                        i31 = i40;
                        bVar4 = bVar5;
                        i20 = i39;
                        i21 = 1;
                        bVar4.f9382h++;
                        i22 = i35 + 1;
                        i33 = i38;
                        i23 = i36;
                    }
                    boolean z14 = bVar4.f9391q;
                    if (flexItem.k0() != 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar4.f9391q = z14 | z11;
                    boolean z15 = bVar4.f9392r;
                    if (flexItem.E() != 0.0f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bVar4.f9392r = z15 | z12;
                    int[] iArr = this.f9395c;
                    if (iArr != null) {
                        iArr[i31] = list2.size();
                    }
                    bVar4.f9379e += M(view, l10) + E(flexItem, l10) + C(flexItem, l10);
                    bVar4.f9384j += flexItem.k0();
                    bVar4.f9385k += flexItem.E();
                    this.f9393a.c(view, i31, i22, bVar4);
                    int max = Math.max(i23, L(view, l10) + D(flexItem, l10) + B(flexItem, l10) + this.f9393a.m(view));
                    bVar4.f9381g = Math.max(bVar4.f9381g, max);
                    if (l10) {
                        if (this.f9393a.getFlexWrap() != 2) {
                            bVar4.f9386l = Math.max(bVar4.f9386l, view.getBaseline() + flexItem.c0());
                        } else {
                            bVar4.f9386l = Math.max(bVar4.f9386l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.R());
                        }
                    }
                    i24 = i37;
                    if (N(i31, i24, bVar4)) {
                        a(list2, bVar4, i31, i33);
                        i33 += bVar4.f9381g;
                    }
                    i25 = i14;
                    if (i25 != -1 && list2.size() > 0 && list2.get(list2.size() - i21).f9390p >= i25 && i31 >= i25 && !z13) {
                        i33 = -bVar4.a();
                        i26 = i12;
                        z13 = true;
                    } else {
                        i26 = i12;
                    }
                    if (i33 > i26 && z13) {
                        bVar2 = bVar;
                        i15 = i34;
                        break;
                    }
                    i35 = i22;
                    i36 = max;
                    i31++;
                    i28 = i10;
                    flexItemCount = i24;
                    i29 = i19;
                    i32 = i20;
                    arrayList = list2;
                    size = i16;
                    i30 = i25;
                    mode = i17;
                }
                i16 = size;
                i17 = mode;
                i19 = i29;
                i25 = i30;
                list2 = arrayList;
                i20 = i32;
                i24 = flexItemCount;
                i31++;
                i28 = i10;
                flexItemCount = i24;
                i29 = i19;
                i32 = i20;
                arrayList = list2;
                size = i16;
                i30 = i25;
                mode = i17;
            } else {
                i15 = i34;
                bVar2 = bVar;
                break;
            }
        }
        bVar2.f9399b = i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(b bVar, int i10, int i11) {
        b(bVar, i10, i11, Integer.MAX_VALUE, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(b bVar, int i10, int i11, int i12, int i13, List<com.google.android.flexbox.b> list) {
        b(bVar, i10, i11, i12, i13, -1, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(b bVar, int i10, int i11, int i12, int i13, List<com.google.android.flexbox.b> list) {
        b(bVar, i10, i11, i12, 0, i13, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(b bVar, int i10, int i11) {
        b(bVar, i11, i10, Integer.MAX_VALUE, 0, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(b bVar, int i10, int i11, int i12, int i13, List<com.google.android.flexbox.b> list) {
        b(bVar, i11, i10, i12, i13, -1, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(b bVar, int i10, int i11, int i12, int i13, List<com.google.android.flexbox.b> list) {
        b(bVar, i11, i10, i12, 0, i13, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(List<com.google.android.flexbox.b> list, int i10) {
        int i11 = this.f9395c[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        if (list.size() > i11) {
            list.subList(i11, list.size()).clear();
        }
        int[] iArr = this.f9395c;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = this.f9396d;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i10, length2, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f9393a.getFlexItemCount();
        return U(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] n(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f9393a.getFlexItemCount();
        List<C0229c> l10 = l(flexItemCount);
        C0229c c0229c = new C0229c();
        if (view != null && (layoutParams instanceof FlexItem)) {
            c0229c.f9401m = ((FlexItem) layoutParams).getOrder();
        } else {
            c0229c.f9401m = 1;
        }
        if (i10 != -1 && i10 != flexItemCount) {
            if (i10 < this.f9393a.getFlexItemCount()) {
                c0229c.f9400f = i10;
                while (i10 < flexItemCount) {
                    l10.get(i10).f9400f++;
                    i10++;
                }
            } else {
                c0229c.f9400f = flexItemCount;
            }
        } else {
            c0229c.f9400f = flexItemCount;
        }
        l10.add(c0229c);
        return U(flexItemCount + 1, l10, sparseIntArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(int i10, int i11, int i12) {
        int i13;
        int i14;
        int flexDirection = this.f9393a.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            i13 = View.MeasureSpec.getMode(i10);
            i14 = View.MeasureSpec.getSize(i10);
        } else {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            i13 = mode;
            i14 = size;
        }
        List<com.google.android.flexbox.b> flexLinesInternal = this.f9393a.getFlexLinesInternal();
        if (i13 == 1073741824) {
            int sumOfCrossSize = this.f9393a.getSumOfCrossSize() + i12;
            int i15 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f9381g = i14 - i12;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f9393a.getAlignContent();
                if (alignContent != 1) {
                    if (alignContent != 2) {
                        if (alignContent != 3) {
                            if (alignContent != 4) {
                                if (alignContent == 5 && sumOfCrossSize < i14) {
                                    float size2 = (i14 - sumOfCrossSize) / flexLinesInternal.size();
                                    int size3 = flexLinesInternal.size();
                                    float f10 = 0.0f;
                                    while (i15 < size3) {
                                        com.google.android.flexbox.b bVar = flexLinesInternal.get(i15);
                                        float f11 = bVar.f9381g + size2;
                                        if (i15 == flexLinesInternal.size() - 1) {
                                            f11 += f10;
                                            f10 = 0.0f;
                                        }
                                        int round = Math.round(f11);
                                        f10 += f11 - round;
                                        if (f10 > 1.0f) {
                                            round++;
                                            f10 -= 1.0f;
                                        } else if (f10 < -1.0f) {
                                            round--;
                                            f10 += 1.0f;
                                        }
                                        bVar.f9381g = round;
                                        i15++;
                                    }
                                    return;
                                }
                                return;
                            } else if (sumOfCrossSize >= i14) {
                                this.f9393a.setFlexLines(k(flexLinesInternal, i14, sumOfCrossSize));
                                return;
                            } else {
                                int size4 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                                ArrayList arrayList = new ArrayList();
                                com.google.android.flexbox.b bVar2 = new com.google.android.flexbox.b();
                                bVar2.f9381g = size4;
                                for (com.google.android.flexbox.b bVar3 : flexLinesInternal) {
                                    arrayList.add(bVar2);
                                    arrayList.add(bVar3);
                                    arrayList.add(bVar2);
                                }
                                this.f9393a.setFlexLines(arrayList);
                                return;
                            }
                        } else if (sumOfCrossSize < i14) {
                            float size5 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                            ArrayList arrayList2 = new ArrayList();
                            int size6 = flexLinesInternal.size();
                            float f12 = 0.0f;
                            while (i15 < size6) {
                                arrayList2.add(flexLinesInternal.get(i15));
                                if (i15 != flexLinesInternal.size() - 1) {
                                    com.google.android.flexbox.b bVar4 = new com.google.android.flexbox.b();
                                    if (i15 == flexLinesInternal.size() - 2) {
                                        bVar4.f9381g = Math.round(f12 + size5);
                                        f12 = 0.0f;
                                    } else {
                                        bVar4.f9381g = Math.round(size5);
                                    }
                                    int i16 = bVar4.f9381g;
                                    f12 += size5 - i16;
                                    if (f12 > 1.0f) {
                                        bVar4.f9381g = i16 + 1;
                                        f12 -= 1.0f;
                                    } else if (f12 < -1.0f) {
                                        bVar4.f9381g = i16 - 1;
                                        f12 += 1.0f;
                                    }
                                    arrayList2.add(bVar4);
                                }
                                i15++;
                            }
                            this.f9393a.setFlexLines(arrayList2);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.f9393a.setFlexLines(k(flexLinesInternal, i14, sumOfCrossSize));
                    return;
                }
                int i17 = i14 - sumOfCrossSize;
                com.google.android.flexbox.b bVar5 = new com.google.android.flexbox.b();
                bVar5.f9381g = i17;
                flexLinesInternal.add(0, bVar5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(int i10, int i11) {
        q(i10, i11, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i13;
        r(this.f9393a.getFlexItemCount());
        if (i12 >= this.f9393a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f9393a.getFlexDirection();
        int flexDirection2 = this.f9393a.getFlexDirection();
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode != 1073741824) {
                size = this.f9393a.getLargestMainSize();
            }
            paddingLeft = this.f9393a.getPaddingTop();
            paddingRight = this.f9393a.getPaddingBottom();
        } else {
            int mode2 = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.f9393a.getLargestMainSize();
            if (mode2 != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.f9393a.getPaddingLeft();
            paddingRight = this.f9393a.getPaddingRight();
        }
        int i14 = paddingLeft + paddingRight;
        int[] iArr = this.f9395c;
        if (iArr != null) {
            i13 = iArr[i12];
        } else {
            i13 = 0;
        }
        List<com.google.android.flexbox.b> flexLinesInternal = this.f9393a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i13 < size2) {
            com.google.android.flexbox.b bVar = flexLinesInternal.get(i13);
            int i15 = bVar.f9379e;
            if (i15 < size && bVar.f9391q) {
                w(i10, i11, bVar, size, i14, false);
            } else if (i15 > size && bVar.f9392r) {
                T(i10, i11, bVar, size, i14, false);
            }
            i13++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i10) {
        int[] iArr = this.f9395c;
        if (iArr == null) {
            this.f9395c = new int[Math.max(i10, 10)];
        } else if (iArr.length < i10) {
            this.f9395c = Arrays.copyOf(this.f9395c, Math.max(iArr.length * 2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i10) {
        long[] jArr = this.f9396d;
        if (jArr == null) {
            this.f9396d = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f9396d = Arrays.copyOf(this.f9396d, Math.max(jArr.length * 2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i10) {
        long[] jArr = this.f9397e;
        if (jArr == null) {
            this.f9397e = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f9397e = Arrays.copyOf(this.f9397e, Math.max(jArr.length * 2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int x(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int y(long j10) {
        return (int) j10;
    }
}
