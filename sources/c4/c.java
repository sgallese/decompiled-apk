package c4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.p0;
import java.util.Map;

/* compiled from: ChangeBounds.java */
/* loaded from: classes.dex */
public class c extends l {
    private static final String[] Y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> Z = new b(PointF.class, "boundsOrigin");

    /* renamed from: a0  reason: collision with root package name */
    private static final Property<k, PointF> f8711a0 = new C0221c(PointF.class, "topLeft");

    /* renamed from: b0  reason: collision with root package name */
    private static final Property<k, PointF> f8712b0 = new d(PointF.class, "bottomRight");

    /* renamed from: c0  reason: collision with root package name */
    private static final Property<View, PointF> f8713c0 = new e(PointF.class, "bottomRight");

    /* renamed from: d0  reason: collision with root package name */
    private static final Property<View, PointF> f8714d0 = new f(PointF.class, "topLeft");

    /* renamed from: e0  reason: collision with root package name */
    private static final Property<View, PointF> f8715e0 = new g(PointF.class, "position");

    /* renamed from: f0  reason: collision with root package name */
    private static c4.j f8716f0 = new c4.j();
    private int[] V = new int[2];
    private boolean W = false;
    private boolean X = false;

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f8717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f8718b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f8719c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f8720d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f8717a = viewGroup;
            this.f8718b = bitmapDrawable;
            this.f8719c = view;
            this.f8720d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a0.b(this.f8717a).b(this.f8718b);
            a0.g(this.f8719c, this.f8720d);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class b extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f8722a;

        b(Class cls, String str) {
            super(cls, str);
            this.f8722a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f8722a);
            Rect rect = this.f8722a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f8722a);
            this.f8722a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f8722a);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0221c extends Property<k, PointF> {
        C0221c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            a0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            a0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            a0.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f8723a;
        private k mViewBounds;

        h(k kVar) {
            this.f8723a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f8725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f8726b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f8727c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f8728d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f8729e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f8730f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f8731g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f8726b = view;
            this.f8727c = rect;
            this.f8728d = i10;
            this.f8729e = i11;
            this.f8730f = i12;
            this.f8731g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8725a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f8725a) {
                p0.B0(this.f8726b, this.f8727c);
                a0.f(this.f8726b, this.f8728d, this.f8729e, this.f8730f, this.f8731g);
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    class j extends m {

        /* renamed from: a  reason: collision with root package name */
        boolean f8733a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f8734b;

        j(ViewGroup viewGroup) {
            this.f8734b = viewGroup;
        }

        @Override // c4.l.f
        public void a(l lVar) {
            if (!this.f8733a) {
                x.c(this.f8734b, false);
            }
            lVar.Q(this);
        }

        @Override // c4.m, c4.l.f
        public void b(l lVar) {
            x.c(this.f8734b, true);
        }

        @Override // c4.m, c4.l.f
        public void d(l lVar) {
            x.c(this.f8734b, false);
        }

        @Override // c4.m, c4.l.f
        public void e(l lVar) {
            x.c(this.f8734b, false);
            this.f8733a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        private int f8736a;

        /* renamed from: b  reason: collision with root package name */
        private int f8737b;

        /* renamed from: c  reason: collision with root package name */
        private int f8738c;

        /* renamed from: d  reason: collision with root package name */
        private int f8739d;

        /* renamed from: e  reason: collision with root package name */
        private View f8740e;

        /* renamed from: f  reason: collision with root package name */
        private int f8741f;

        /* renamed from: g  reason: collision with root package name */
        private int f8742g;

        k(View view) {
            this.f8740e = view;
        }

        private void b() {
            a0.f(this.f8740e, this.f8736a, this.f8737b, this.f8738c, this.f8739d);
            this.f8741f = 0;
            this.f8742g = 0;
        }

        void a(PointF pointF) {
            this.f8738c = Math.round(pointF.x);
            this.f8739d = Math.round(pointF.y);
            int i10 = this.f8742g + 1;
            this.f8742g = i10;
            if (this.f8741f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f8736a = Math.round(pointF.x);
            this.f8737b = Math.round(pointF.y);
            int i10 = this.f8741f + 1;
            this.f8741f = i10;
            if (i10 == this.f8742g) {
                b();
            }
        }
    }

    private void d0(s sVar) {
        View view = sVar.f8831b;
        if (p0.Y(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f8830a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f8830a.put("android:changeBounds:parent", sVar.f8831b.getParent());
            if (this.X) {
                sVar.f8831b.getLocationInWindow(this.V);
                sVar.f8830a.put("android:changeBounds:windowX", Integer.valueOf(this.V[0]));
                sVar.f8830a.put("android:changeBounds:windowY", Integer.valueOf(this.V[1]));
            }
            if (this.W) {
                sVar.f8830a.put("android:changeBounds:clip", p0.w(view));
            }
        }
    }

    private boolean e0(View view, View view2) {
        if (!this.X) {
            return true;
        }
        s t10 = t(view, true);
        if (t10 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == t10.f8831b) {
            return true;
        }
        return false;
    }

    @Override // c4.l
    public String[] E() {
        return Y;
    }

    @Override // c4.l
    public void f(s sVar) {
        d0(sVar);
    }

    @Override // c4.l
    public void i(s sVar) {
        d0(sVar);
    }

    @Override // c4.l
    public Animator n(ViewGroup viewGroup, s sVar, s sVar2) {
        int i10;
        View view;
        ObjectAnimator a10;
        int i11;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimator;
        Animator c10;
        if (sVar != null && sVar2 != null) {
            Map<String, Object> map = sVar.f8830a;
            Map<String, Object> map2 = sVar2.f8830a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                View view2 = sVar2.f8831b;
                if (e0(viewGroup2, viewGroup3)) {
                    Rect rect3 = (Rect) sVar.f8830a.get("android:changeBounds:bounds");
                    Rect rect4 = (Rect) sVar2.f8830a.get("android:changeBounds:bounds");
                    int i12 = rect3.left;
                    int i13 = rect4.left;
                    int i14 = rect3.top;
                    int i15 = rect4.top;
                    int i16 = rect3.right;
                    int i17 = rect4.right;
                    int i18 = rect3.bottom;
                    int i19 = rect4.bottom;
                    int i20 = i16 - i12;
                    int i21 = i18 - i14;
                    int i22 = i17 - i13;
                    int i23 = i19 - i15;
                    Rect rect5 = (Rect) sVar.f8830a.get("android:changeBounds:clip");
                    Rect rect6 = (Rect) sVar2.f8830a.get("android:changeBounds:clip");
                    if ((i20 != 0 && i21 != 0) || (i22 != 0 && i23 != 0)) {
                        if (i12 == i13 && i14 == i15) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        if (i16 != i17 || i18 != i19) {
                            i10++;
                        }
                    } else {
                        i10 = 0;
                    }
                    if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                        i10++;
                    }
                    if (i10 > 0) {
                        if (!this.W) {
                            view = view2;
                            a0.f(view, i12, i14, i16, i18);
                            if (i10 == 2) {
                                if (i20 == i22 && i21 == i23) {
                                    c10 = c4.f.a(view, f8715e0, v().a(i12, i14, i13, i15));
                                } else {
                                    k kVar = new k(view);
                                    ObjectAnimator a11 = c4.f.a(kVar, f8711a0, v().a(i12, i14, i13, i15));
                                    ObjectAnimator a12 = c4.f.a(kVar, f8712b0, v().a(i16, i18, i17, i19));
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(a11, a12);
                                    animatorSet.addListener(new h(kVar));
                                    c10 = animatorSet;
                                }
                            } else if (i12 == i13 && i14 == i15) {
                                c10 = c4.f.a(view, f8713c0, v().a(i16, i18, i17, i19));
                            } else {
                                c10 = c4.f.a(view, f8714d0, v().a(i12, i14, i13, i15));
                            }
                        } else {
                            view = view2;
                            a0.f(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                            if (i12 == i13 && i14 == i15) {
                                a10 = null;
                            } else {
                                a10 = c4.f.a(view, f8715e0, v().a(i12, i14, i13, i15));
                            }
                            if (rect5 == null) {
                                i11 = 0;
                                rect = new Rect(0, 0, i20, i21);
                            } else {
                                i11 = 0;
                                rect = rect5;
                            }
                            if (rect6 == null) {
                                rect2 = new Rect(i11, i11, i22, i23);
                            } else {
                                rect2 = rect6;
                            }
                            if (!rect.equals(rect2)) {
                                p0.B0(view, rect);
                                c4.j jVar = f8716f0;
                                Object[] objArr = new Object[2];
                                objArr[i11] = rect;
                                objArr[1] = rect2;
                                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", jVar, objArr);
                                ofObject.addListener(new i(view, rect6, i13, i15, i17, i19));
                                objectAnimator = ofObject;
                            } else {
                                objectAnimator = null;
                            }
                            c10 = r.c(a10, objectAnimator);
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            x.c(viewGroup4, true);
                            a(new j(viewGroup4));
                        }
                        return c10;
                    }
                    return null;
                }
                int intValue = ((Integer) sVar.f8830a.get("android:changeBounds:windowX")).intValue();
                int intValue2 = ((Integer) sVar.f8830a.get("android:changeBounds:windowY")).intValue();
                int intValue3 = ((Integer) sVar2.f8830a.get("android:changeBounds:windowX")).intValue();
                int intValue4 = ((Integer) sVar2.f8830a.get("android:changeBounds:windowY")).intValue();
                if (intValue == intValue3 && intValue2 == intValue4) {
                    return null;
                }
                viewGroup.getLocationInWindow(this.V);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float c11 = a0.c(view2);
                a0.g(view2, 0.0f);
                a0.b(viewGroup).a(bitmapDrawable);
                c4.g v10 = v();
                int[] iArr = this.V;
                int i24 = iArr[0];
                int i25 = iArr[1];
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, c4.h.a(Z, v10.a(intValue - i24, intValue2 - i25, intValue3 - i24, intValue4 - i25)));
                ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c11));
                return ofPropertyValuesHolder;
            }
            return null;
        }
        return null;
    }
}
