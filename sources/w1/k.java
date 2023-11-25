package w1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* compiled from: LayoutIntrinsics.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f25285a;

    /* renamed from: b  reason: collision with root package name */
    private final TextPaint f25286b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25287c;

    /* renamed from: d  reason: collision with root package name */
    private float f25288d;

    /* renamed from: e  reason: collision with root package name */
    private float f25289e;

    /* renamed from: f  reason: collision with root package name */
    private BoringLayout.Metrics f25290f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f25291g;

    public k(CharSequence charSequence, TextPaint textPaint, int i10) {
        qc.q.i(charSequence, "charSequence");
        qc.q.i(textPaint, "textPaint");
        this.f25285a = charSequence;
        this.f25286b = textPaint;
        this.f25287c = i10;
        this.f25288d = Float.NaN;
        this.f25289e = Float.NaN;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f25291g) {
            this.f25290f = e.f25265a.c(this.f25285a, this.f25286b, o1.j(this.f25287c));
            this.f25291g = true;
        }
        return this.f25290f;
    }

    public final float b() {
        Float f10;
        boolean e10;
        if (!Float.isNaN(this.f25288d)) {
            return this.f25288d;
        }
        if (a() != null) {
            f10 = Float.valueOf(r0.width);
        } else {
            f10 = null;
        }
        if (f10 == null) {
            CharSequence charSequence = this.f25285a;
            f10 = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f25286b)));
        }
        e10 = m.e(f10.floatValue(), this.f25285a, this.f25286b);
        if (e10) {
            f10 = Float.valueOf(f10.floatValue() + 0.5f);
        }
        float floatValue = f10.floatValue();
        this.f25288d = floatValue;
        return floatValue;
    }

    public final float c() {
        if (!Float.isNaN(this.f25289e)) {
            return this.f25289e;
        }
        float c10 = m.c(this.f25285a, this.f25286b);
        this.f25289e = c10;
        return c10;
    }
}
