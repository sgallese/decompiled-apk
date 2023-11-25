package ad;

/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public class z1 extends e2 implements y {

    /* renamed from: p  reason: collision with root package name */
    private final boolean f588p;

    public z1(x1 x1Var) {
        super(true);
        m0(x1Var);
        this.f588p = T0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r0.c0() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        r0 = r0.g0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if ((r0 instanceof ad.t) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        r0 = (ad.t) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r0 = r0.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean T0() {
        /*
            r4 = this;
            ad.s r0 = r4.g0()
            boolean r1 = r0 instanceof ad.t
            r2 = 0
            if (r1 == 0) goto Lc
            ad.t r0 = (ad.t) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r1 = 0
            if (r0 == 0) goto L33
            ad.e2 r0 = r0.s()
            if (r0 != 0) goto L17
            goto L33
        L17:
            boolean r3 = r0.c0()
            if (r3 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            ad.s r0 = r0.g0()
            boolean r3 = r0 instanceof ad.t
            if (r3 == 0) goto L2a
            ad.t r0 = (ad.t) r0
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L33
            ad.e2 r0 = r0.s()
            if (r0 != 0) goto L17
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.z1.T0():boolean");
    }

    @Override // ad.e2
    public boolean c0() {
        return this.f588p;
    }

    @Override // ad.e2
    public boolean d0() {
        return true;
    }

    @Override // ad.y
    public boolean f0(Throwable th) {
        return t0(new a0(th, false, 2, null));
    }
}
