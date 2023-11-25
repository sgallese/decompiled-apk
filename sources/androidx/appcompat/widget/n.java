package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: AppCompatImageButton.java */
/* loaded from: classes.dex */
public class n extends ImageButton {

    /* renamed from: f  reason: collision with root package name */
    private final e f1573f;

    /* renamed from: m  reason: collision with root package name */
    private final o f1574m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1575p;

    public n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.E);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1573f;
        if (eVar != null) {
            eVar.b();
        }
        o oVar = this.f1574m;
        if (oVar != null) {
            oVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1573f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1573f;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        o oVar = this.f1574m;
        if (oVar != null) {
            return oVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        o oVar = this.f1574m;
        if (oVar != null) {
            return oVar.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if (this.f1574m.f() && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1573f;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1573f;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        o oVar = this.f1574m;
        if (oVar != null) {
            oVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        o oVar = this.f1574m;
        if (oVar != null && drawable != null && !this.f1575p) {
            oVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        o oVar2 = this.f1574m;
        if (oVar2 != null) {
            oVar2.c();
            if (!this.f1575p) {
                this.f1574m.b();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1575p = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f1574m.i(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o oVar = this.f1574m;
        if (oVar != null) {
            oVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1573f;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1573f;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        o oVar = this.f1574m;
        if (oVar != null) {
            oVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1574m;
        if (oVar != null) {
            oVar.k(mode);
        }
    }

    public n(Context context, AttributeSet attributeSet, int i10) {
        super(d1.b(context), attributeSet, i10);
        this.f1575p = false;
        b1.a(this, getContext());
        e eVar = new e(this);
        this.f1573f = eVar;
        eVar.e(attributeSet, i10);
        o oVar = new o(this);
        this.f1574m = oVar;
        oVar.g(attributeSet, i10);
    }
}
