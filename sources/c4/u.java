package c4;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18.java */
/* loaded from: classes.dex */
class u implements v {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f8837a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(ViewGroup viewGroup) {
        this.f8837a = viewGroup.getOverlay();
    }

    @Override // c4.z
    public void a(Drawable drawable) {
        this.f8837a.add(drawable);
    }

    @Override // c4.z
    public void b(Drawable drawable) {
        this.f8837a.remove(drawable);
    }

    @Override // c4.v
    public void c(View view) {
        this.f8837a.add(view);
    }

    @Override // c4.v
    public void d(View view) {
        this.f8837a.remove(view);
    }
}
