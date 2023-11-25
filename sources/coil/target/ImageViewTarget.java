package coil.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import qc.q;

/* compiled from: ImageViewTarget.kt */
/* loaded from: classes.dex */
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* renamed from: m  reason: collision with root package name */
    private final ImageView f9059m;

    public ImageViewTarget(ImageView imageView) {
        this.f9059m = imageView;
    }

    @Override // coil.target.GenericViewTarget, f5.d
    public Drawable a() {
        return getView().getDrawable();
    }

    @Override // coil.target.GenericViewTarget
    public void b(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ImageViewTarget) && q.d(getView(), ((ImageViewTarget) obj).getView())) {
            return true;
        }
        return false;
    }

    @Override // d5.c
    /* renamed from: g  reason: merged with bridge method [inline-methods] */
    public ImageView getView() {
        return this.f9059m;
    }

    public int hashCode() {
        return getView().hashCode();
    }
}
