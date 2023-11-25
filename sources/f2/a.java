package f2;

import a1.f4;
import a1.r0;
import a1.s4;
import a1.t4;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import c1.g;
import c1.k;
import c1.l;
import qc.q;

/* compiled from: DrawStyleSpan.android.kt */
/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: f  reason: collision with root package name */
    private final g f15427f;

    public a(g gVar) {
        q.i(gVar, "drawStyle");
        this.f15427f = gVar;
    }

    private final Paint.Cap a(int i10) {
        s4.a aVar = s4.f186b;
        if (s4.g(i10, aVar.a())) {
            return Paint.Cap.BUTT;
        }
        if (s4.g(i10, aVar.b())) {
            return Paint.Cap.ROUND;
        }
        if (s4.g(i10, aVar.c())) {
            return Paint.Cap.SQUARE;
        }
        return Paint.Cap.BUTT;
    }

    private final Paint.Join b(int i10) {
        t4.a aVar = t4.f193b;
        if (t4.g(i10, aVar.b())) {
            return Paint.Join.MITER;
        }
        if (t4.g(i10, aVar.c())) {
            return Paint.Join.ROUND;
        }
        if (t4.g(i10, aVar.a())) {
            return Paint.Join.BEVEL;
        }
        return Paint.Join.MITER;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        PathEffect pathEffect;
        if (textPaint != null) {
            g gVar = this.f15427f;
            if (q.d(gVar, k.f8683a)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (gVar instanceof l) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((l) this.f15427f).f());
                textPaint.setStrokeMiter(((l) this.f15427f).d());
                textPaint.setStrokeJoin(b(((l) this.f15427f).c()));
                textPaint.setStrokeCap(a(((l) this.f15427f).b()));
                f4 e10 = ((l) this.f15427f).e();
                if (e10 != null) {
                    pathEffect = r0.a(e10);
                } else {
                    pathEffect = null;
                }
                textPaint.setPathEffect(pathEffect);
            }
        }
    }
}
