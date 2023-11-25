package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources.java */
/* loaded from: classes.dex */
class f1 extends x0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f1511b;

    public f1(Context context, Resources resources) {
        super(resources);
        this.f1511b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable a10 = a(i10);
        Context context = this.f1511b.get();
        if (a10 != null && context != null) {
            w0.h().x(context, i10, a10);
        }
        return a10;
    }
}
