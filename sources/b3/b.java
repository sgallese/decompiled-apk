package b3;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.p0;
import b3.a;
import b3.b;
import java.util.ArrayList;

/* compiled from: DynamicAnimation.java */
/* loaded from: classes.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: m  reason: collision with root package name */
    public static final r f7884m = new f("translationX");

    /* renamed from: n  reason: collision with root package name */
    public static final r f7885n = new g("translationY");

    /* renamed from: o  reason: collision with root package name */
    public static final r f7886o = new h("translationZ");

    /* renamed from: p  reason: collision with root package name */
    public static final r f7887p = new i("scaleX");

    /* renamed from: q  reason: collision with root package name */
    public static final r f7888q = new j("scaleY");

    /* renamed from: r  reason: collision with root package name */
    public static final r f7889r = new k("rotation");

    /* renamed from: s  reason: collision with root package name */
    public static final r f7890s = new l("rotationX");

    /* renamed from: t  reason: collision with root package name */
    public static final r f7891t = new m("rotationY");

    /* renamed from: u  reason: collision with root package name */
    public static final r f7892u = new n("x");

    /* renamed from: v  reason: collision with root package name */
    public static final r f7893v = new a("y");

    /* renamed from: w  reason: collision with root package name */
    public static final r f7894w = new C0182b("z");

    /* renamed from: x  reason: collision with root package name */
    public static final r f7895x = new c("alpha");

    /* renamed from: y  reason: collision with root package name */
    public static final r f7896y = new d("scrollX");

    /* renamed from: z  reason: collision with root package name */
    public static final r f7897z = new e("scrollY");

    /* renamed from: d  reason: collision with root package name */
    final Object f7901d;

    /* renamed from: e  reason: collision with root package name */
    final b3.c f7902e;

    /* renamed from: j  reason: collision with root package name */
    private float f7907j;

    /* renamed from: a  reason: collision with root package name */
    float f7898a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    float f7899b = Float.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    boolean f7900c = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f7903f = false;

    /* renamed from: g  reason: collision with root package name */
    float f7904g = Float.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    float f7905h = -Float.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    private long f7906i = 0;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<p> f7908k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<q> f7909l = new ArrayList<>();

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class a extends r {
        a(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: b3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0182b extends r {
        C0182b(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return p0.R(view);
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            p0.S0(view, f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class c extends r {
        c(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class d extends r {
        d(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class e extends r {
        e(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class f extends r {
        f(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class g extends r {
        g(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class h extends r {
        h(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return p0.O(view);
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            p0.Q0(view, f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class i extends r {
        i(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class j extends r {
        j(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class k extends r {
        k(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class l extends r {
        l(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class m extends r {
        m(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class n extends r {
        n(String str) {
            super(str, null);
        }

        @Override // b3.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // b3.c
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    static class o {

        /* renamed from: a  reason: collision with root package name */
        float f7910a;

        /* renamed from: b  reason: collision with root package name */
        float f7911b;
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public interface p {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public interface q {
        void a(b bVar, float f10, float f11);
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static abstract class r extends b3.c<View> {
        /* synthetic */ r(String str, f fVar) {
            this(str);
        }

        private r(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <K> b(K k10, b3.c<K> cVar) {
        this.f7901d = k10;
        this.f7902e = cVar;
        if (cVar != f7889r && cVar != f7890s && cVar != f7891t) {
            if (cVar == f7895x) {
                this.f7907j = 0.00390625f;
                return;
            } else if (cVar != f7887p && cVar != f7888q) {
                this.f7907j = 1.0f;
                return;
            } else {
                this.f7907j = 0.00390625f;
                return;
            }
        }
        this.f7907j = 0.1f;
    }

    private void b(boolean z10) {
        this.f7903f = false;
        b3.a.d().g(this);
        this.f7906i = 0L;
        this.f7900c = false;
        for (int i10 = 0; i10 < this.f7908k.size(); i10++) {
            if (this.f7908k.get(i10) != null) {
                this.f7908k.get(i10).a(this, z10, this.f7899b, this.f7898a);
            }
        }
        f(this.f7908k);
    }

    private float c() {
        return this.f7902e.a(this.f7901d);
    }

    private static <T> void f(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void j() {
        if (!this.f7903f) {
            this.f7903f = true;
            if (!this.f7900c) {
                this.f7899b = c();
            }
            float f10 = this.f7899b;
            if (f10 <= this.f7904g && f10 >= this.f7905h) {
                b3.a.d().a(this, 0L);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
    }

    @Override // b3.a.b
    public boolean a(long j10) {
        long j11 = this.f7906i;
        if (j11 == 0) {
            this.f7906i = j10;
            g(this.f7899b);
            return false;
        }
        this.f7906i = j10;
        boolean k10 = k(j10 - j11);
        float min = Math.min(this.f7899b, this.f7904g);
        this.f7899b = min;
        float max = Math.max(min, this.f7905h);
        this.f7899b = max;
        g(max);
        if (k10) {
            b(false);
        }
        return k10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.f7907j * 0.75f;
    }

    public boolean e() {
        return this.f7903f;
    }

    void g(float f10) {
        this.f7902e.b(this.f7901d, f10);
        for (int i10 = 0; i10 < this.f7909l.size(); i10++) {
            if (this.f7909l.get(i10) != null) {
                this.f7909l.get(i10).a(this, this.f7899b, this.f7898a);
            }
        }
        f(this.f7909l);
    }

    public T h(float f10) {
        this.f7899b = f10;
        this.f7900c = true;
        return this;
    }

    public void i() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f7903f) {
                j();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    abstract boolean k(long j10);
}
