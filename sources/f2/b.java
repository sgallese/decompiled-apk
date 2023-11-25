package f2;

import a1.m4;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import d2.j;
import dc.l;
import dc.r;
import qc.q;

/* compiled from: ShaderBrushSpan.android.kt */
/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: f  reason: collision with root package name */
    private final m4 f15428f;

    /* renamed from: m  reason: collision with root package name */
    private final float f15429m;

    /* renamed from: p  reason: collision with root package name */
    private long f15430p;

    /* renamed from: q  reason: collision with root package name */
    private l<z0.l, ? extends Shader> f15431q;

    public b(m4 m4Var, float f10) {
        q.i(m4Var, "shaderBrush");
        this.f15428f = m4Var;
        this.f15429m = f10;
        this.f15430p = z0.l.f26375b.a();
    }

    public final void a(long j10) {
        this.f15430p = j10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        boolean z10;
        Shader b10;
        q.i(textPaint, "textPaint");
        j.a(textPaint, this.f15429m);
        if (this.f15430p == z0.l.f26375b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        l<z0.l, ? extends Shader> lVar = this.f15431q;
        if (lVar != null && z0.l.f(lVar.c().m(), this.f15430p)) {
            b10 = lVar.d();
        } else {
            b10 = this.f15428f.b(this.f15430p);
        }
        textPaint.setShader(b10);
        this.f15431q = r.a(z0.l.c(this.f15430p), b10);
    }
}
