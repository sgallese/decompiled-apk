package n7;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.c;
import p7.g;
import p7.k;
import p7.n;

/* compiled from: RippleDrawableCompat.java */
/* loaded from: classes3.dex */
public class a extends Drawable implements n, c {

    /* renamed from: f  reason: collision with root package name */
    private b f20268f;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f20268f = new b(this.f20268f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f20268f;
        if (bVar.f20270b) {
            bVar.f20269a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f20268f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f20268f.f20269a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f20268f.f20269a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f20268f.f20269a.setState(iArr)) {
            onStateChange = true;
        }
        boolean f10 = n7.b.f(iArr);
        b bVar = this.f20268f;
        if (bVar.f20270b != f10) {
            bVar.f20270b = f10;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f20268f.f20269a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20268f.f20269a.setColorFilter(colorFilter);
    }

    @Override // p7.n
    public void setShapeAppearanceModel(k kVar) {
        this.f20268f.f20269a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f20268f.f20269a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f20268f.f20269a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f20268f.f20269a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleDrawableCompat.java */
    /* loaded from: classes3.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        g f20269a;

        /* renamed from: b  reason: collision with root package name */
        boolean f20270b;

        public b(g gVar) {
            this.f20269a = gVar;
            this.f20270b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f20269a = (g) bVar.f20269a.getConstantState().newDrawable();
            this.f20270b = bVar.f20270b;
        }
    }

    private a(b bVar) {
        this.f20268f = bVar;
    }
}
