package t4;

import android.graphics.Paint;

/* compiled from: ExifUtils.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f23591a = new m();

    /* renamed from: b  reason: collision with root package name */
    private static final Paint f23592b = new Paint(3);

    private m() {
    }

    public final j a(String str, okio.e eVar, l lVar) {
        if (n.c(lVar, str)) {
            androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(new k(eVar.L0().U0()));
            return new j(aVar.s(), aVar.l());
        }
        return j.f23586d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r3 == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(android.graphics.Bitmap r8, t4.j r9) {
        /*
            r7 = this;
            boolean r0 = r9.b()
            if (r0 != 0) goto Ld
            boolean r0 = t4.n.a(r9)
            if (r0 != 0) goto Ld
            return r8
        Ld:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r8.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r2
            boolean r2 = r9.b()
            if (r2 == 0) goto L2d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r2, r4, r1, r3)
        L2d:
            boolean r2 = t4.n.a(r9)
            if (r2 == 0) goto L3b
            int r2 = r9.a()
            float r2 = (float) r2
            r0.postRotate(r2, r1, r3)
        L3b:
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r8.getWidth()
            float r2 = (float) r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            r0.mapRect(r1)
            float r2 = r1.left
            r3 = 1
            r5 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L58
            r6 = 1
            goto L59
        L58:
            r6 = 0
        L59:
            if (r6 == 0) goto L65
            float r6 = r1.top
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L62
            goto L63
        L62:
            r3 = 0
        L63:
            if (r3 != 0) goto L6c
        L65:
            float r2 = -r2
            float r1 = r1.top
            float r1 = -r1
            r0.postTranslate(r2, r1)
        L6c:
            boolean r9 = t4.n.b(r9)
            java.lang.String r1 = "createBitmap(width, height, config)"
            if (r9 == 0) goto L88
            int r9 = r8.getHeight()
            int r2 = r8.getWidth()
            android.graphics.Bitmap$Config r3 = g5.a.c(r8)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r2, r3)
            qc.q.h(r9, r1)
            goto L9b
        L88:
            int r9 = r8.getWidth()
            int r2 = r8.getHeight()
            android.graphics.Bitmap$Config r3 = g5.a.c(r8)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r2, r3)
            qc.q.h(r9, r1)
        L9b:
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r9)
            android.graphics.Paint r2 = t4.m.f23592b
            r1.drawBitmap(r8, r0, r2)
            r8.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.m.b(android.graphics.Bitmap, t4.j):android.graphics.Bitmap");
    }
}
