package a1;

/* compiled from: ImageBitmap.kt */
/* loaded from: classes.dex */
public final class v3 {
    public static final t3 a(int i10, int i11, int i12, boolean z10, b1.c cVar) {
        qc.q.i(cVar, "colorSpace");
        return l0.a(i10, i11, i12, z10, cVar);
    }

    public static /* synthetic */ t3 b(int i10, int i11, int i12, boolean z10, b1.c cVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = u3.f198b.b();
        }
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        if ((i13 & 16) != 0) {
            cVar = b1.g.f7641a.w();
        }
        return a(i10, i11, i12, z10, cVar);
    }
}
