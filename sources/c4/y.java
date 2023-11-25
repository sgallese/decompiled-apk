package c4;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18.java */
/* loaded from: classes.dex */
class y implements z {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f8839a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(View view) {
        this.f8839a = view.getOverlay();
    }

    @Override // c4.z
    public void a(Drawable drawable) {
        this.f8839a.add(drawable);
    }

    @Override // c4.z
    public void b(Drawable drawable) {
        this.f8839a.remove(drawable);
    }
}
