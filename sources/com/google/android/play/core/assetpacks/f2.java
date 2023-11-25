package com.google.android.play.core.assetpacks;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class f2 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f10804a = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: b  reason: collision with root package name */
    private int f10805b;

    /* renamed from: c  reason: collision with root package name */
    private long f10806c;

    /* renamed from: d  reason: collision with root package name */
    private long f10807d;

    /* renamed from: e  reason: collision with root package name */
    private int f10808e;

    /* renamed from: f  reason: collision with root package name */
    private int f10809f;

    /* renamed from: g  reason: collision with root package name */
    private int f10810g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10811h;

    /* renamed from: i  reason: collision with root package name */
    private String f10812i;

    public f2() {
        d();
    }

    private final int e(int i10, byte[] bArr, int i11, int i12) {
        int i13 = this.f10805b;
        if (i13 < i10) {
            int min = Math.min(i12, i10 - i13);
            System.arraycopy(bArr, i11, this.f10804a, this.f10805b, min);
            int i14 = this.f10805b + min;
            this.f10805b = i14;
            if (i14 < i10) {
                return -1;
            }
            return min;
        }
        return 0;
    }

    public final int a() {
        return this.f10809f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        r3 = r3 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        if (r3 >= r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        r9.f10804a = java.util.Arrays.copyOf(r9.f10804a, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        if (r3 < r4) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
            r0 = 30
            int r1 = r9.e(r0, r10, r11, r12)
            r2 = -1
            if (r1 == r2) goto L84
            long r3 = r9.f10806c
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L64
            byte[] r3 = r9.f10804a
            r4 = 0
            long r5 = com.google.android.play.core.assetpacks.m0.b(r3, r4)
            r9.f10806c = r5
            r7 = 67324752(0x4034b50, double:3.3262847E-316)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L61
            r9.f10811h = r4
            byte[] r3 = r9.f10804a
            r4 = 18
            long r3 = com.google.android.play.core.assetpacks.m0.b(r3, r4)
            r9.f10807d = r3
            byte[] r3 = r9.f10804a
            r4 = 8
            int r3 = com.google.android.play.core.assetpacks.m0.a(r3, r4)
            r9.f10810g = r3
            byte[] r3 = r9.f10804a
            r4 = 26
            int r3 = com.google.android.play.core.assetpacks.m0.a(r3, r4)
            r9.f10808e = r3
            byte[] r3 = r9.f10804a
            r4 = 28
            int r3 = com.google.android.play.core.assetpacks.m0.a(r3, r4)
            int r4 = r9.f10808e
            int r4 = r4 + r0
            int r4 = r4 + r3
            r9.f10809f = r4
            byte[] r3 = r9.f10804a
            int r3 = r3.length
            if (r3 >= r4) goto L64
        L54:
            int r3 = r3 + r3
            if (r3 >= r4) goto L58
            goto L54
        L58:
            byte[] r4 = r9.f10804a
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            r9.f10804a = r3
            goto L64
        L61:
            r3 = 1
            r9.f10811h = r3
        L64:
            int r3 = r9.f10809f
            int r11 = r11 + r1
            int r12 = r12 - r1
            int r10 = r9.e(r3, r10, r11, r12)
            if (r10 != r2) goto L6f
            return r2
        L6f:
            int r1 = r1 + r10
            boolean r10 = r9.f10811h
            if (r10 != 0) goto L83
            java.lang.String r10 = r9.f10812i
            if (r10 != 0) goto L83
            java.lang.String r10 = new java.lang.String
            byte[] r11 = r9.f10804a
            int r12 = r9.f10808e
            r10.<init>(r11, r0, r12)
            r9.f10812i = r10
        L83:
            return r1
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.f2.b(byte[], int, int):int");
    }

    public final g3 c() {
        int i10 = this.f10805b;
        int i11 = this.f10809f;
        if (i10 < i11) {
            return new l0(this.f10812i, this.f10807d, this.f10810g, true, this.f10811h, Arrays.copyOf(this.f10804a, i10));
        }
        l0 l0Var = new l0(this.f10812i, this.f10807d, this.f10810g, false, this.f10811h, Arrays.copyOf(this.f10804a, i11));
        d();
        return l0Var;
    }

    public final void d() {
        this.f10805b = 0;
        this.f10808e = -1;
        this.f10806c = -1L;
        this.f10811h = false;
        this.f10809f = 30;
        this.f10807d = -1L;
        this.f10810g = -1;
        this.f10812i = null;
    }
}
