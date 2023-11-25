package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import d5.c;
import f5.d;

/* compiled from: GenericViewTarget.kt */
/* loaded from: classes.dex */
public abstract class GenericViewTarget<T extends View> implements c<T>, d, i {

    /* renamed from: f  reason: collision with root package name */
    private boolean f9058f;

    @Override // f5.d
    public abstract Drawable a();

    public abstract void b(Drawable drawable);

    protected final void e() {
        Animatable animatable;
        Drawable a10 = a();
        if (a10 instanceof Animatable) {
            animatable = (Animatable) a10;
        } else {
            animatable = null;
        }
        if (animatable == null) {
            return;
        }
        if (this.f9058f) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    protected final void f(Drawable drawable) {
        Animatable animatable;
        Drawable a10 = a();
        if (a10 instanceof Animatable) {
            animatable = (Animatable) a10;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        b(drawable);
        e();
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onCreate(v vVar) {
        h.a(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onDestroy(v vVar) {
        h.b(this, vVar);
    }

    @Override // d5.b
    public void onError(Drawable drawable) {
        f(drawable);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onPause(v vVar) {
        h.c(this, vVar);
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ void onResume(v vVar) {
        h.d(this, vVar);
    }

    @Override // d5.b
    public void onStart(Drawable drawable) {
        f(drawable);
    }

    @Override // androidx.lifecycle.i
    public void onStop(v vVar) {
        this.f9058f = false;
        e();
    }

    @Override // d5.b
    public void onSuccess(Drawable drawable) {
        f(drawable);
    }

    @Override // androidx.lifecycle.i
    public void onStart(v vVar) {
        this.f9058f = true;
        e();
    }
}
