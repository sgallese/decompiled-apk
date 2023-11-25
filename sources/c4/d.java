package c4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.p0;

/* compiled from: Fade.java */
/* loaded from: classes.dex */
public class d extends m0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Fade.java */
    /* loaded from: classes.dex */
    public class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f8743a;

        a(View view) {
            this.f8743a = view;
        }

        @Override // c4.l.f
        public void a(l lVar) {
            a0.g(this.f8743a, 1.0f);
            a0.a(this.f8743a);
            lVar.Q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Fade.java */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f8745a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f8746b = false;

        b(View view) {
            this.f8745a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a0.g(this.f8745a, 1.0f);
            if (this.f8746b) {
                this.f8745a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (p0.U(this.f8745a) && this.f8745a.getLayerType() == 0) {
                this.f8746b = true;
                this.f8745a.setLayerType(2, null);
            }
        }
    }

    public d(int i10) {
        j0(i10);
    }

    private Animator k0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        a0.g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, a0.f8709b, f11);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    private static float l0(s sVar, float f10) {
        Float f11;
        if (sVar != null && (f11 = (Float) sVar.f8830a.get("android:fade:transitionAlpha")) != null) {
            return f11.floatValue();
        }
        return f10;
    }

    @Override // c4.m0
    public Animator f0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float f10 = 0.0f;
        float l02 = l0(sVar, 0.0f);
        if (l02 != 1.0f) {
            f10 = l02;
        }
        return k0(view, f10, 1.0f);
    }

    @Override // c4.m0
    public Animator h0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        a0.e(view);
        return k0(view, l0(sVar, 1.0f), 0.0f);
    }

    @Override // c4.m0, c4.l
    public void i(s sVar) {
        super.i(sVar);
        sVar.f8830a.put("android:fade:transitionAlpha", Float.valueOf(a0.c(sVar.f8831b)));
    }

    public d() {
    }
}
