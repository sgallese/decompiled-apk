package com.google.android.play.core.assetpacks;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class p0 extends FilterInputStream {

    /* renamed from: f  reason: collision with root package name */
    private final f2 f10938f;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f10939m;

    /* renamed from: p  reason: collision with root package name */
    private long f10940p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10941q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10942r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(InputStream inputStream) {
        super(inputStream);
        this.f10938f = new f2();
        this.f10939m = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f10941q = false;
        this.f10942r = false;
    }

    private final int j(byte[] bArr, int i10, int i11) throws IOException {
        return Math.max(0, super.read(bArr, i10, i11));
    }

    private final boolean m(int i10) throws IOException {
        int j10 = j(this.f10939m, 0, i10);
        if (j10 != i10) {
            int i11 = i10 - j10;
            if (j(this.f10939m, j10, i11) != i11) {
                this.f10938f.b(this.f10939m, 0, j10);
                return false;
            }
        }
        this.f10938f.b(this.f10939m, 0, i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b() {
        return this.f10940p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (m(30) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r10.f10941q = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return r10.f10938f.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r0 = r10.f10938f.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r0.d() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        r10.f10942r = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0.b() == 4294967295L) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r0 = r10.f10938f.a() - 30;
        r2 = r0;
        r4 = r10.f10939m.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r2 <= r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r4 = r4 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r4 < r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        r10.f10939m = java.util.Arrays.copyOf(r10.f10939m, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (m(r0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        r10.f10941q = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        return r10.f10938f.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r0 = r10.f10938f.c();
        r10.f10940p = r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        throw new com.google.android.play.core.assetpacks.c1("Files bigger than 4GiB are not supported.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        return new com.google.android.play.core.assetpacks.l0(null, -1, -1, false, false, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        if (r10.f10940p > 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        r0 = r10.f10939m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (read(r0, 0, r0.length) != (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r10.f10941q != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r10.f10942r == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.play.core.assetpacks.g3 c() throws java.io.IOException {
        /*
            r10 = this;
            long r0 = r10.f10940p
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L13
        L8:
            byte[] r0 = r10.f10939m
            int r1 = r0.length
            r2 = 0
            int r0 = r10.read(r0, r2, r1)
            r1 = -1
            if (r0 != r1) goto L8
        L13:
            boolean r0 = r10.f10941q
            if (r0 != 0) goto L8d
            boolean r0 = r10.f10942r
            if (r0 == 0) goto L1c
            goto L8d
        L1c:
            r0 = 30
            boolean r0 = r10.m(r0)
            r1 = 1
            if (r0 != 0) goto L2e
            r10.f10941q = r1
            com.google.android.play.core.assetpacks.f2 r0 = r10.f10938f
            com.google.android.play.core.assetpacks.g3 r0 = r0.c()
            return r0
        L2e:
            com.google.android.play.core.assetpacks.f2 r0 = r10.f10938f
            com.google.android.play.core.assetpacks.g3 r0 = r0.c()
            boolean r2 = r0.d()
            if (r2 == 0) goto L3d
            r10.f10942r = r1
            return r0
        L3d:
            long r2 = r0.b()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L85
            com.google.android.play.core.assetpacks.f2 r0 = r10.f10938f
            int r0 = r0.a()
            int r0 = r0 + (-30)
            long r2 = (long) r0
            byte[] r4 = r10.f10939m
            int r4 = r4.length
            long r5 = (long) r4
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L69
        L5b:
            int r4 = r4 + r4
            long r5 = (long) r4
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L5b
            byte[] r2 = r10.f10939m
            byte[] r2 = java.util.Arrays.copyOf(r2, r4)
            r10.f10939m = r2
        L69:
            boolean r0 = r10.m(r0)
            if (r0 != 0) goto L78
            r10.f10941q = r1
            com.google.android.play.core.assetpacks.f2 r0 = r10.f10938f
            com.google.android.play.core.assetpacks.g3 r0 = r0.c()
            return r0
        L78:
            com.google.android.play.core.assetpacks.f2 r0 = r10.f10938f
            com.google.android.play.core.assetpacks.g3 r0 = r0.c()
            long r1 = r0.b()
            r10.f10940p = r1
            return r0
        L85:
            com.google.android.play.core.assetpacks.c1 r0 = new com.google.android.play.core.assetpacks.c1
            java.lang.String r1 = "Files bigger than 4GiB are not supported."
            r0.<init>(r1)
            throw r0
        L8d:
            com.google.android.play.core.assetpacks.l0 r0 = new com.google.android.play.core.assetpacks.l0
            r3 = 0
            r4 = -1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r0
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.p0.c():com.google.android.play.core.assetpacks.g3");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return this.f10942r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.f10941q;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f10940p;
        if (j10 <= 0 || this.f10941q) {
            return -1;
        }
        int j11 = j(bArr, i10, (int) Math.min(j10, i11));
        this.f10940p -= j11;
        if (j11 == 0) {
            this.f10941q = true;
            return 0;
        }
        return j11;
    }
}
