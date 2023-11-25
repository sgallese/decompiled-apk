package com.google.android.play.core.assetpacks;

import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class x0 {

    /* renamed from: g  reason: collision with root package name */
    private static final x7.f f11078g = new x7.f("ExtractChunkTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f11079a = new byte[8192];

    /* renamed from: b  reason: collision with root package name */
    private final d0 f11080b;

    /* renamed from: c  reason: collision with root package name */
    private final x7.b0 f11081c;

    /* renamed from: d  reason: collision with root package name */
    private final x7.b0 f11082d;

    /* renamed from: e  reason: collision with root package name */
    private final g1 f11083e;

    /* renamed from: f  reason: collision with root package name */
    private final o2 f11084f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(d0 d0Var, x7.b0 b0Var, x7.b0 b0Var2, g1 g1Var, o2 o2Var) {
        this.f11080b = d0Var;
        this.f11081c = b0Var;
        this.f11082d = b0Var2;
        this.f11083e = g1Var;
        this.f11084f = o2Var;
    }

    private final File b(w0 w0Var) {
        File C = this.f11080b.C(w0Var.f11086b, w0Var.f11053c, w0Var.f11054d, w0Var.f11056f);
        if (!C.exists()) {
            C.mkdirs();
        }
        return C;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:11|(2:13|(12:15|(1:(1:(2:19|(1:21)(2:86|87))(2:88|89))(2:90|(10:92|(6:24|(4:25|(2:29|(1:38)(4:33|(1:35)|36|37))|39|(1:41)(1:66))|44|(1:46)|47|(2:49|(1:51)(2:52|(1:54)(3:55|(2:57|(1:59)(2:61|62))(1:64)|60))))|67|68|(2:80|81)|70|71|72|73|(2:75|76)(1:77))(2:93|94)))(2:95|(4:97|(4:98|(1:100)|101|(1:104)(1:112))|107|(3:109|110|111))(2:113|114))|22|(0)|67|68|(0)|70|71|72|73|(0)(0))(2:115|116))|117|(0)|67|68|(0)|70|71|72|73|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02fa, code lost:
    
        com.google.android.play.core.assetpacks.x0.f11078g.e("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(r23.f11058h), r23.f11056f, r23.f11086b);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0186 A[Catch: all -> 0x0292, TryCatch #2 {all -> 0x0292, blocks: (B:54:0x0186, B:55:0x018f, B:57:0x0199, B:59:0x019f, B:61:0x01a5, B:63:0x01ab, B:65:0x01cf, B:66:0x01db, B:67:0x01df, B:68:0x01e6, B:70:0x01ec, B:72:0x01f2, B:74:0x01f8, B:75:0x0208, B:77:0x020e, B:79:0x0214, B:80:0x0227, B:82:0x022d, B:83:0x023c, B:85:0x0242, B:91:0x0283, B:88:0x026a, B:89:0x0271, B:90:0x0272, B:47:0x0151, B:48:0x0156, B:49:0x0160, B:50:0x0161, B:51:0x0181), top: B:122:0x0041 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.play.core.assetpacks.d0] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.play.core.assetpacks.w0 r23) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.x0.a(com.google.android.play.core.assetpacks.w0):void");
    }
}
