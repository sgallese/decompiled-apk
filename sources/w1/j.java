package w1;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LayoutHelper.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final Layout f25276a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Integer> f25277b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Bidi> f25278c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean[] f25279d;

    /* renamed from: e  reason: collision with root package name */
    private char[] f25280e;

    /* renamed from: f  reason: collision with root package name */
    private final int f25281f;

    /* compiled from: LayoutHelper.kt */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f25282a;

        /* renamed from: b  reason: collision with root package name */
        private final int f25283b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f25284c;

        public a(int i10, int i11, boolean z10) {
            this.f25282a = i10;
            this.f25283b = i11;
            this.f25284c = z10;
        }

        public final int a() {
            return this.f25283b;
        }

        public final int b() {
            return this.f25282a;
        }

        public final boolean c() {
            return this.f25284c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25282a == aVar.f25282a && this.f25283b == aVar.f25283b && this.f25284c == aVar.f25284c) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int i10 = ((this.f25282a * 31) + this.f25283b) * 31;
            boolean z10 = this.f25284c;
            int i11 = z10;
            if (z10 != 0) {
                i11 = 1;
            }
            return i10 + i11;
        }

        public String toString() {
            return "BidiRun(start=" + this.f25282a + ", end=" + this.f25283b + ", isRtl=" + this.f25284c + ')';
        }
    }

    public j(Layout layout) {
        int W;
        int i10;
        qc.q.i(layout, "layout");
        this.f25276a = layout;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        do {
            CharSequence text = this.f25276a.getText();
            qc.q.h(text, "layout.text");
            W = yc.w.W(text, '\n', i11, false, 4, null);
            if (W < 0) {
                i10 = this.f25276a.getText().length();
            } else {
                i10 = W + 1;
            }
            i11 = i10;
            arrayList.add(Integer.valueOf(i11));
        } while (i11 < this.f25276a.getText().length());
        this.f25277b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList2.add(null);
        }
        this.f25278c = arrayList2;
        this.f25279d = new boolean[this.f25277b.size()];
        this.f25281f = this.f25277b.size();
    }

    private final float b(int i10, boolean z10) {
        if (z10) {
            return this.f25276a.getPrimaryHorizontal(i10);
        }
        return this.f25276a.getSecondaryHorizontal(i10);
    }

    private final int h(int i10) {
        while (i10 > 0 && f(this.f25276a.getText().charAt(i10 - 1))) {
            i10--;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r0.getRunCount() == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.f25279d
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r11.f25278c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = 0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.f25277b
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.f25277b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.f25280e
            if (r3 == 0) goto L37
            int r4 = r3.length
            if (r4 >= r8) goto L39
        L37:
            char[] r3 = new char[r8]
        L39:
            r10 = r3
            android.text.Layout r3 = r11.f25276a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            boolean r9 = r11.g(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L60
        L5f:
            r0 = r1
        L60:
            java.util.List<java.text.Bidi> r3 = r11.f25278c
            r3.set(r12, r0)
            boolean[] r3 = r11.f25279d
            r3[r12] = r2
            if (r0 == 0) goto L72
            char[] r12 = r11.f25280e
            if (r10 != r12) goto L71
            r10 = r1
            goto L72
        L71:
            r10 = r12
        L72:
            r11.f25280e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.j.a(int):java.text.Bidi");
    }

    public final float c(int i10, boolean z10, boolean z11) {
        Bidi bidi;
        int P;
        boolean z12;
        int P2;
        boolean z13;
        boolean z14;
        int i11 = i10;
        if (!z11) {
            return b(i10, z10);
        }
        int a10 = i.a(this.f25276a, i11, z11);
        int lineStart = this.f25276a.getLineStart(a10);
        int lineEnd = this.f25276a.getLineEnd(a10);
        if (i11 != lineStart && i11 != lineEnd) {
            return b(i10, z10);
        }
        if (i11 != 0 && i11 != this.f25276a.getText().length()) {
            int d10 = d(i11, z11);
            boolean g10 = g(d10);
            int h10 = h(lineEnd);
            int e10 = e(d10);
            int i12 = lineStart - e10;
            int i13 = h10 - e10;
            Bidi a11 = a(d10);
            if (a11 != null) {
                bidi = a11.createLineBidi(i12, i13);
            } else {
                bidi = null;
            }
            boolean z15 = false;
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                a[] aVarArr = new a[runCount];
                for (int i14 = 0; i14 < runCount; i14++) {
                    int runStart = bidi.getRunStart(i14) + lineStart;
                    int runLimit = bidi.getRunLimit(i14) + lineStart;
                    if (bidi.getRunLevel(i14) % 2 == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    aVarArr[i14] = new a(runStart, runLimit, z14);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i15 = 0; i15 < runCount2; i15++) {
                    bArr[i15] = (byte) bidi.getRunLevel(i15);
                }
                Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
                int i16 = -1;
                if (i11 == lineStart) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= runCount) {
                            break;
                        }
                        if (aVarArr[i17].b() == i11) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            i16 = i17;
                            break;
                        }
                        i17++;
                    }
                    a aVar = aVarArr[i16];
                    if (z10 || g10 == aVar.c()) {
                        if (!g10) {
                            g10 = true;
                        } else {
                            g10 = false;
                        }
                    }
                    if (i16 != 0 || !g10) {
                        P2 = ec.p.P(aVarArr);
                        if (i16 == P2 && !g10) {
                            return this.f25276a.getLineRight(a10);
                        }
                        if (g10) {
                            return this.f25276a.getPrimaryHorizontal(aVarArr[i16 - 1].b());
                        }
                        return this.f25276a.getPrimaryHorizontal(aVarArr[i16 + 1].b());
                    }
                    return this.f25276a.getLineLeft(a10);
                }
                if (i11 > h10) {
                    i11 = h(i10);
                }
                int i18 = 0;
                while (true) {
                    if (i18 >= runCount) {
                        break;
                    }
                    if (aVarArr[i18].a() == i11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i16 = i18;
                        break;
                    }
                    i18++;
                }
                a aVar2 = aVarArr[i16];
                if (!z10 && g10 != aVar2.c()) {
                    g10 = !g10;
                }
                if (i16 != 0 || !g10) {
                    P = ec.p.P(aVarArr);
                    if (i16 == P && !g10) {
                        return this.f25276a.getLineRight(a10);
                    }
                    if (g10) {
                        return this.f25276a.getPrimaryHorizontal(aVarArr[i16 - 1].a());
                    }
                    return this.f25276a.getPrimaryHorizontal(aVarArr[i16 + 1].a());
                }
                return this.f25276a.getLineLeft(a10);
            }
            boolean isRtlCharAt = this.f25276a.isRtlCharAt(lineStart);
            if (z10 || g10 == isRtlCharAt) {
                if (!g10) {
                    g10 = true;
                } else {
                    g10 = false;
                }
            }
            if (i11 == lineStart) {
                z15 = g10;
            } else if (!g10) {
                z15 = true;
            }
            Layout layout = this.f25276a;
            if (z15) {
                return layout.getLineLeft(a10);
            }
            return layout.getLineRight(a10);
        }
        return b(i10, z10);
    }

    public final int d(int i10, boolean z10) {
        int h10;
        int i11;
        h10 = ec.t.h(this.f25277b, Integer.valueOf(i10), 0, 0, 6, null);
        if (h10 < 0) {
            i11 = -(h10 + 1);
        } else {
            i11 = h10 + 1;
        }
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == this.f25277b.get(i12).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public final int e(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return this.f25277b.get(i10 - 1).intValue();
    }

    public final boolean f(char c10) {
        boolean z10;
        if (c10 == ' ' || c10 == '\n' || c10 == 5760) {
            return true;
        }
        if (8192 <= c10 && c10 < 8203) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 && c10 != 8199) || c10 == 8287 || c10 == 12288) {
            return true;
        }
        return false;
    }

    public final boolean g(int i10) {
        if (this.f25276a.getParagraphDirection(this.f25276a.getLineForOffset(e(i10))) == -1) {
            return true;
        }
        return false;
    }
}
