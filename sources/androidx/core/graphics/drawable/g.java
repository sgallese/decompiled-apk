package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableState.java */
/* loaded from: classes.dex */
public final class g extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f3904a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f3905b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f3906c;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f3907d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(g gVar) {
        this.f3906c = null;
        this.f3907d = e.f3896t;
        if (gVar != null) {
            this.f3904a = gVar.f3904a;
            this.f3905b = gVar.f3905b;
            this.f3906c = gVar.f3906c;
            this.f3907d = gVar.f3907d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f3905b != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10;
        int i11 = this.f3904a;
        Drawable.ConstantState constantState = this.f3905b;
        if (constantState != null) {
            i10 = constantState.getChangingConfigurations();
        } else {
            i10 = 0;
        }
        return i11 | i10;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new f(this, resources);
    }
}
