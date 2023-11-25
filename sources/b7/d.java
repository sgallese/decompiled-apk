package b7;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes3.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f8079b = new b();

        /* renamed from: a  reason: collision with root package name */
        private final e f8080a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f8080a.a(i7.a.c(eVar.f8083a, eVar2.f8083a, f10), i7.a.c(eVar.f8084b, eVar2.f8084b, f10), i7.a.c(eVar.f8085c, eVar2.f8085c, f10));
            return this.f8080a;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes3.dex */
    public static class c extends Property<d, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, e> f8081a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: b7.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0184d extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f8082a = new C0184d("circularRevealScrimColor");

        private C0184d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f8083a;

        /* renamed from: b  reason: collision with root package name */
        public float f8084b;

        /* renamed from: c  reason: collision with root package name */
        public float f8085c;

        private e() {
        }

        public void a(float f10, float f11, float f12) {
            this.f8083a = f10;
            this.f8084b = f11;
            this.f8085c = f12;
        }

        public e(float f10, float f11, float f12) {
            this.f8083a = f10;
            this.f8084b = f11;
            this.f8085c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
