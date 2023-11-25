package ma;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TimerTask;
import na.e;
import na.f;
import na.g;

/* compiled from: ParticleSystem.java */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f19833a;

    /* renamed from: b  reason: collision with root package name */
    private int f19834b;

    /* renamed from: c  reason: collision with root package name */
    private Random f19835c;

    /* renamed from: d  reason: collision with root package name */
    private ma.c f19836d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<ma.b> f19837e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<ma.b> f19838f;

    /* renamed from: g  reason: collision with root package name */
    private long f19839g;

    /* renamed from: h  reason: collision with root package name */
    private long f19840h;

    /* renamed from: i  reason: collision with root package name */
    private float f19841i;

    /* renamed from: j  reason: collision with root package name */
    private int f19842j;

    /* renamed from: k  reason: collision with root package name */
    private long f19843k;

    /* renamed from: l  reason: collision with root package name */
    private List<oa.b> f19844l;

    /* renamed from: m  reason: collision with root package name */
    private List<na.b> f19845m;

    /* renamed from: n  reason: collision with root package name */
    private ValueAnimator f19846n;

    /* renamed from: o  reason: collision with root package name */
    private final c f19847o;

    /* renamed from: p  reason: collision with root package name */
    private float f19848p;

    /* renamed from: q  reason: collision with root package name */
    private int[] f19849q;

    /* renamed from: r  reason: collision with root package name */
    private int f19850r;

    /* renamed from: s  reason: collision with root package name */
    private int f19851s;

    /* renamed from: t  reason: collision with root package name */
    private int f19852t;

    /* renamed from: u  reason: collision with root package name */
    private int f19853u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParticleSystem.java */
    /* loaded from: classes4.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.o(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* compiled from: ParticleSystem.java */
    /* loaded from: classes4.dex */
    private static class c extends TimerTask {

        /* renamed from: f  reason: collision with root package name */
        private final WeakReference<d> f19856f;

        public c(d dVar) {
            this.f19856f = new WeakReference<>(dVar);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (this.f19856f.get() != null) {
                d dVar = this.f19856f.get();
                dVar.o(dVar.f19840h);
                d.b(dVar, 50L);
            }
        }
    }

    private d(ViewGroup viewGroup, int i10, long j10) {
        this.f19838f = new ArrayList<>();
        this.f19840h = 0L;
        this.f19847o = new c(this);
        this.f19835c = new Random();
        this.f19849q = new int[2];
        t(viewGroup);
        this.f19844l = new ArrayList();
        this.f19845m = new ArrayList();
        this.f19834b = i10;
        this.f19837e = new ArrayList<>();
        this.f19839g = j10;
        this.f19848p = viewGroup.getContext().getResources().getDisplayMetrics().xdpi / 160.0f;
    }

    private void A(Interpolator interpolator, long j10) {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) j10);
        this.f19846n = ofInt;
        ofInt.setDuration(j10);
        this.f19846n.addUpdateListener(new a());
        this.f19846n.addListener(new b());
        this.f19846n.setInterpolator(interpolator);
        this.f19846n.start();
    }

    private void B(int i10, int i11) {
        this.f19842j = 0;
        this.f19841i = i10 / 1000.0f;
        ma.c cVar = new ma.c(this.f19833a.getContext());
        this.f19836d = cVar;
        this.f19833a.addView(cVar);
        this.f19836d.a(this.f19838f);
        C(i10);
        long j10 = i11;
        this.f19843k = j10;
        A(new LinearInterpolator(), j10 + this.f19839g);
    }

    private void C(int i10) {
        if (i10 == 0) {
            return;
        }
        long j10 = this.f19840h;
        long j11 = (j10 / 1000) / i10;
        if (j11 == 0) {
            return;
        }
        long j12 = j10 / j11;
        int i11 = 1;
        while (true) {
            long j13 = i11;
            if (j13 <= j11) {
                o((j13 * j12) + 1);
                i11++;
            } else {
                return;
            }
        }
    }

    static /* synthetic */ long b(d dVar, long j10) {
        long j11 = dVar.f19840h + j10;
        dVar.f19840h = j11;
        return j11;
    }

    private void e(long j10) {
        ma.b remove = this.f19837e.remove(0);
        remove.d();
        for (int i10 = 0; i10 < this.f19845m.size(); i10++) {
            this.f19845m.get(i10).a(remove, this.f19835c);
        }
        remove.b(this.f19839g, m(this.f19850r, this.f19851s), m(this.f19852t, this.f19853u));
        remove.a(j10, this.f19844l);
        this.f19838f.add(remove);
        this.f19842j++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f19833a.removeView(this.f19836d);
        this.f19836d = null;
        this.f19833a.postInvalidate();
        this.f19837e.addAll(this.f19838f);
    }

    private void g(int i10, int i11) {
        int[] iArr = this.f19849q;
        int i12 = i10 - iArr[0];
        this.f19850r = i12;
        this.f19851s = i12;
        int i13 = i11 - iArr[1];
        this.f19852t = i13;
        this.f19853u = i13;
    }

    private void h(View view, int i10) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        if (n(i10, 3)) {
            int i11 = iArr[0] - this.f19849q[0];
            this.f19850r = i11;
            this.f19851s = i11;
        } else if (n(i10, 5)) {
            int width = (iArr[0] + view.getWidth()) - this.f19849q[0];
            this.f19850r = width;
            this.f19851s = width;
        } else if (n(i10, 1)) {
            int width2 = (iArr[0] + (view.getWidth() / 2)) - this.f19849q[0];
            this.f19850r = width2;
            this.f19851s = width2;
        } else {
            int i12 = iArr[0];
            this.f19850r = i12 - this.f19849q[0];
            this.f19851s = (i12 + view.getWidth()) - this.f19849q[0];
        }
        if (n(i10, 48)) {
            int i13 = iArr[1] - this.f19849q[1];
            this.f19852t = i13;
            this.f19853u = i13;
        } else if (n(i10, 80)) {
            int height = (iArr[1] + view.getHeight()) - this.f19849q[1];
            this.f19852t = height;
            this.f19853u = height;
        } else if (n(i10, 16)) {
            int height2 = (iArr[1] + (view.getHeight() / 2)) - this.f19849q[1];
            this.f19852t = height2;
            this.f19853u = height2;
        } else {
            int i14 = iArr[1];
            this.f19852t = i14 - this.f19849q[1];
            this.f19853u = (i14 + view.getHeight()) - this.f19849q[1];
        }
    }

    private int m(int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        if (i10 < i11) {
            return this.f19835c.nextInt(i11 - i10) + i10;
        }
        return this.f19835c.nextInt(i10 - i11) + i11;
    }

    private boolean n(int i10, int i11) {
        if ((i10 & i11) == i11) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(long j10) {
        while (true) {
            long j11 = this.f19843k;
            if (((j11 <= 0 || j10 >= j11) && j11 != -1) || this.f19837e.isEmpty() || this.f19842j >= this.f19841i * ((float) j10)) {
                break;
            }
            e(j10);
        }
        synchronized (this.f19838f) {
            int i10 = 0;
            while (i10 < this.f19838f.size()) {
                if (!this.f19838f.get(i10).e(j10)) {
                    ma.b remove = this.f19838f.remove(i10);
                    i10--;
                    this.f19837e.add(remove);
                }
                i10++;
            }
        }
        this.f19836d.postInvalidate();
    }

    public float i(float f10) {
        return f10 * this.f19848p;
    }

    public void j(int i10, int i11, int i12, int i13) {
        g(i10, i11);
        B(i12, i13);
    }

    public void k(View view, int i10, int i11) {
        l(view, 17, i10, i11);
    }

    public void l(View view, int i10, int i11, int i12) {
        h(view, i10);
        B(i11, i12);
    }

    public d p(float f10, int i10) {
        this.f19845m.add(new na.a(f10, f10, i10, i10));
        return this;
    }

    public d q(long j10) {
        return r(j10, new LinearInterpolator());
    }

    public d r(long j10, Interpolator interpolator) {
        List<oa.b> list = this.f19844l;
        long j11 = this.f19839g;
        list.add(new oa.a(255, 0, j11 - j10, j11, interpolator));
        return this;
    }

    public d s(int i10, int i11) {
        this.f19845m.add(new na.c(i10, i11));
        return this;
    }

    public d t(ViewGroup viewGroup) {
        this.f19833a = viewGroup;
        if (viewGroup != null) {
            viewGroup.getLocationInWindow(this.f19849q);
        }
        return this;
    }

    public d u(float f10) {
        this.f19845m.add(new na.d(f10, f10));
        return this;
    }

    public d v(float f10, float f11) {
        this.f19845m.add(new na.d(f10, f11));
        return this;
    }

    public d w(float f10, float f11) {
        this.f19845m.add(new e(f10, f11));
        return this;
    }

    public d x(float f10, float f11, float f12, float f13) {
        this.f19845m.add(new f(i(f10), i(f11), i(f12), i(f13)));
        return this;
    }

    public d y(float f10, float f11, int i10, int i11) {
        while (i11 < i10) {
            i11 += 360;
        }
        this.f19845m.add(new g(i(f10), i(f11), i10, i11));
        return this;
    }

    public d z(float f10, float f11) {
        this.f19845m.add(new g(i(f10), i(f11), 0, 360));
        return this;
    }

    public d(ViewGroup viewGroup, int i10, Drawable drawable, long j10) {
        this(viewGroup, i10, j10);
        Bitmap createBitmap;
        int i11 = 0;
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            while (i11 < this.f19834b) {
                this.f19837e.add(new ma.a(animationDrawable));
                i11++;
            }
            return;
        }
        if (drawable instanceof BitmapDrawable) {
            createBitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        while (i11 < this.f19834b) {
            this.f19837e.add(new ma.b(createBitmap));
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ParticleSystem.java */
    /* loaded from: classes4.dex */
    public class b implements Animator.AnimatorListener {
        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            d.this.f();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public d(Activity activity, int i10, Drawable drawable, long j10) {
        this(activity, i10, drawable, j10, 16908290);
    }

    public d(Activity activity, int i10, Drawable drawable, long j10, int i11) {
        this((ViewGroup) activity.findViewById(i11), i10, drawable, j10);
    }
}
