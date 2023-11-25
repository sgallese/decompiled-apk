package c4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import c4.l;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class m0 extends l {
    private static final String[] W = {"android:visibility:visibility", "android:visibility:parent"};
    private int V = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f8800a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f8801b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f8802c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f8800a = viewGroup;
            this.f8801b = view;
            this.f8802c = view2;
        }

        @Override // c4.l.f
        public void a(l lVar) {
            this.f8802c.setTag(i.f8769a, null);
            x.a(this.f8800a).d(this.f8801b);
            lVar.Q(this);
        }

        @Override // c4.m, c4.l.f
        public void b(l lVar) {
            if (this.f8801b.getParent() == null) {
                x.a(this.f8800a).c(this.f8801b);
            } else {
                m0.this.cancel();
            }
        }

        @Override // c4.m, c4.l.f
        public void d(l lVar) {
            x.a(this.f8800a).d(this.f8801b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f8810a;

        /* renamed from: b  reason: collision with root package name */
        boolean f8811b;

        /* renamed from: c  reason: collision with root package name */
        int f8812c;

        /* renamed from: d  reason: collision with root package name */
        int f8813d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f8814e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f8815f;

        c() {
        }
    }

    private void d0(s sVar) {
        sVar.f8830a.put("android:visibility:visibility", Integer.valueOf(sVar.f8831b.getVisibility()));
        sVar.f8830a.put("android:visibility:parent", sVar.f8831b.getParent());
        int[] iArr = new int[2];
        sVar.f8831b.getLocationOnScreen(iArr);
        sVar.f8830a.put("android:visibility:screenLocation", iArr);
    }

    private c e0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f8810a = false;
        cVar.f8811b = false;
        if (sVar != null && sVar.f8830a.containsKey("android:visibility:visibility")) {
            cVar.f8812c = ((Integer) sVar.f8830a.get("android:visibility:visibility")).intValue();
            cVar.f8814e = (ViewGroup) sVar.f8830a.get("android:visibility:parent");
        } else {
            cVar.f8812c = -1;
            cVar.f8814e = null;
        }
        if (sVar2 != null && sVar2.f8830a.containsKey("android:visibility:visibility")) {
            cVar.f8813d = ((Integer) sVar2.f8830a.get("android:visibility:visibility")).intValue();
            cVar.f8815f = (ViewGroup) sVar2.f8830a.get("android:visibility:parent");
        } else {
            cVar.f8813d = -1;
            cVar.f8815f = null;
        }
        if (sVar != null && sVar2 != null) {
            int i10 = cVar.f8812c;
            int i11 = cVar.f8813d;
            if (i10 == i11 && cVar.f8814e == cVar.f8815f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f8811b = false;
                    cVar.f8810a = true;
                } else if (i11 == 0) {
                    cVar.f8811b = true;
                    cVar.f8810a = true;
                }
            } else if (cVar.f8815f == null) {
                cVar.f8811b = false;
                cVar.f8810a = true;
            } else if (cVar.f8814e == null) {
                cVar.f8811b = true;
                cVar.f8810a = true;
            }
        } else if (sVar == null && cVar.f8813d == 0) {
            cVar.f8811b = true;
            cVar.f8810a = true;
        } else if (sVar2 == null && cVar.f8812c == 0) {
            cVar.f8811b = false;
            cVar.f8810a = true;
        }
        return cVar;
    }

    @Override // c4.l
    public String[] E() {
        return W;
    }

    @Override // c4.l
    public boolean G(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f8830a.containsKey("android:visibility:visibility") != sVar.f8830a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c e02 = e0(sVar, sVar2);
        if (!e02.f8810a) {
            return false;
        }
        if (e02.f8812c != 0 && e02.f8813d != 0) {
            return false;
        }
        return true;
    }

    @Override // c4.l
    public void f(s sVar) {
        d0(sVar);
    }

    public abstract Animator f0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator g0(ViewGroup viewGroup, s sVar, int i10, s sVar2, int i11) {
        if ((this.V & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f8831b.getParent();
            if (e0(t(view, false), F(view, false)).f8810a) {
                return null;
            }
        }
        return f0(viewGroup, sVar2.f8831b, sVar, sVar2);
    }

    public abstract Animator h0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    @Override // c4.l
    public void i(s sVar) {
        d0(sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r17.I != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator i0(android.view.ViewGroup r18, c4.s r19, int r20, c4.s r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.m0.i0(android.view.ViewGroup, c4.s, int, c4.s, int):android.animation.Animator");
    }

    public void j0(int i10) {
        if ((i10 & (-4)) == 0) {
            this.V = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // c4.l
    public Animator n(ViewGroup viewGroup, s sVar, s sVar2) {
        c e02 = e0(sVar, sVar2);
        if (e02.f8810a) {
            if (e02.f8814e != null || e02.f8815f != null) {
                if (e02.f8811b) {
                    return g0(viewGroup, sVar, e02.f8812c, sVar2, e02.f8813d);
                }
                return i0(viewGroup, sVar, e02.f8812c, sVar2, e02.f8813d);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements l.f {

        /* renamed from: a  reason: collision with root package name */
        private final View f8804a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8805b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f8806c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f8807d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f8808e;

        /* renamed from: f  reason: collision with root package name */
        boolean f8809f = false;

        b(View view, int i10, boolean z10) {
            this.f8804a = view;
            this.f8805b = i10;
            this.f8806c = (ViewGroup) view.getParent();
            this.f8807d = z10;
            g(true);
        }

        private void f() {
            if (!this.f8809f) {
                a0.h(this.f8804a, this.f8805b);
                ViewGroup viewGroup = this.f8806c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (this.f8807d && this.f8808e != z10 && (viewGroup = this.f8806c) != null) {
                this.f8808e = z10;
                x.c(viewGroup, z10);
            }
        }

        @Override // c4.l.f
        public void a(l lVar) {
            f();
            lVar.Q(this);
        }

        @Override // c4.l.f
        public void b(l lVar) {
            g(true);
        }

        @Override // c4.l.f
        public void d(l lVar) {
            g(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8809f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (!this.f8809f) {
                a0.h(this.f8804a, this.f8805b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (!this.f8809f) {
                a0.h(this.f8804a, 0);
            }
        }

        @Override // c4.l.f
        public void c(l lVar) {
        }

        @Override // c4.l.f
        public void e(l lVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
