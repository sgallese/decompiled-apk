package a1;

import android.graphics.Bitmap;

/* compiled from: AndroidImageBitmap.android.kt */
/* loaded from: classes.dex */
public final class i0 implements t3 {

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f106b;

    public i0(Bitmap bitmap) {
        qc.q.i(bitmap, "bitmap");
        this.f106b = bitmap;
    }

    @Override // a1.t3
    public void a() {
        this.f106b.prepareToDraw();
    }

    @Override // a1.t3
    public int b() {
        Bitmap.Config config = this.f106b.getConfig();
        qc.q.h(config, "bitmap.config");
        return l0.e(config);
    }

    public final Bitmap c() {
        return this.f106b;
    }

    @Override // a1.t3
    public int getHeight() {
        return this.f106b.getHeight();
    }

    @Override // a1.t3
    public int getWidth() {
        return this.f106b.getWidth();
    }
}
