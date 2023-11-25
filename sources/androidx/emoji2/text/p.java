package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: TypefaceEmojiRasterizer.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<c3.a> f4453d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final int f4454a;

    /* renamed from: b  reason: collision with root package name */
    private final n f4455b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f4456c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(n nVar, int i10) {
        this.f4455b = nVar;
        this.f4454a = i10;
    }

    private c3.a g() {
        ThreadLocal<c3.a> threadLocal = f4453d;
        c3.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new c3.a();
            threadLocal.set(aVar);
        }
        this.f4455b.d().j(aVar, this.f4454a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface g10 = this.f4455b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g10);
        canvas.drawText(this.f4455b.c(), this.f4454a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.f4456c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        if ((this.f4456c & 4) > 0) {
            return true;
        }
        return false;
    }

    public void l(boolean z10) {
        int d10 = d();
        if (z10) {
            this.f4456c = d10 | 4;
        } else {
            this.f4456c = d10;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void m(boolean z10) {
        int i10;
        int i11 = this.f4456c & 4;
        if (z10) {
            i10 = i11 | 2;
        } else {
            i10 = i11 | 1;
        }
        this.f4456c = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int c10 = c();
        for (int i10 = 0; i10 < c10; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
