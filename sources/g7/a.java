package g7;

import android.content.Context;
import android.graphics.Color;
import m7.b;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: f  reason: collision with root package name */
    private static final int f16227f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16228a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16229b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16230c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16231d;

    /* renamed from: e  reason: collision with root package name */
    private final float f16232e;

    public a(Context context) {
        this(b.b(context, v6.b.f24651u, false), d7.a.b(context, v6.b.f24650t, 0), d7.a.b(context, v6.b.f24649s, 0), d7.a.b(context, v6.b.f24647q, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean f(int i10) {
        if (androidx.core.graphics.a.k(i10, 255) == this.f16231d) {
            return true;
        }
        return false;
    }

    public float a(float f10) {
        if (this.f16232e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float a10 = a(f10);
        int alpha = Color.alpha(i10);
        int j10 = d7.a.j(androidx.core.graphics.a.k(i10, 255), this.f16229b, a10);
        if (a10 > 0.0f && (i11 = this.f16230c) != 0) {
            j10 = d7.a.i(j10, androidx.core.graphics.a.k(i11, f16227f));
        }
        return androidx.core.graphics.a.k(j10, alpha);
    }

    public int c(int i10, float f10) {
        if (this.f16228a && f(i10)) {
            return b(i10, f10);
        }
        return i10;
    }

    public int d(float f10) {
        return c(this.f16231d, f10);
    }

    public boolean e() {
        return this.f16228a;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f16228a = z10;
        this.f16229b = i10;
        this.f16230c = i11;
        this.f16231d = i12;
        this.f16232e = f10;
    }
}
