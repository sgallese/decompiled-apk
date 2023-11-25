package d2;

import a1.e1;
import a1.f1;
import a1.h1;
import a1.m4;
import a1.o4;
import a1.r4;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;

/* compiled from: AndroidMultiParagraphDraw.kt */
/* loaded from: classes.dex */
public final class b {
    public static final void a(v1.h hVar, h1 h1Var, e1 e1Var, float f10, o4 o4Var, g2.k kVar, c1.g gVar, int i10) {
        qc.q.i(hVar, "$this$drawMultiParagraph");
        qc.q.i(h1Var, "canvas");
        qc.q.i(e1Var, "brush");
        h1Var.k();
        if (hVar.v().size() <= 1) {
            b(hVar, h1Var, e1Var, f10, o4Var, kVar, gVar, i10);
        } else if (e1Var instanceof r4) {
            b(hVar, h1Var, e1Var, f10, o4Var, kVar, gVar, i10);
        } else if (e1Var instanceof m4) {
            List<v1.n> v10 = hVar.v();
            int size = v10.size();
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                v1.n nVar = v10.get(i11);
                f12 += nVar.e().getHeight();
                f11 = Math.max(f11, nVar.e().getWidth());
            }
            Shader b10 = ((m4) e1Var).b(z0.m.a(f11, f12));
            Matrix matrix = new Matrix();
            b10.getLocalMatrix(matrix);
            List<v1.n> v11 = hVar.v();
            int size2 = v11.size();
            for (int i12 = 0; i12 < size2; i12++) {
                v1.n nVar2 = v11.get(i12);
                nVar2.e().b(h1Var, f1.a(b10), f10, o4Var, kVar, gVar, i10);
                h1Var.b(0.0f, nVar2.e().getHeight());
                matrix.setTranslate(0.0f, -nVar2.e().getHeight());
                b10.setLocalMatrix(matrix);
            }
        }
        h1Var.p();
    }

    private static final void b(v1.h hVar, h1 h1Var, e1 e1Var, float f10, o4 o4Var, g2.k kVar, c1.g gVar, int i10) {
        List<v1.n> v10 = hVar.v();
        int size = v10.size();
        for (int i11 = 0; i11 < size; i11++) {
            v1.n nVar = v10.get(i11);
            nVar.e().b(h1Var, e1Var, f10, o4Var, kVar, gVar, i10);
            h1Var.b(0.0f, nVar.e().getHeight());
        }
    }
}
