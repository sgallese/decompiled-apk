package c4;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.f;
import androidx.fragment.app.Fragment;
import c4.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class e extends androidx.fragment.app.n0 {

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class a extends l.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f8748a;

        a(Rect rect) {
            this.f8748a = rect;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class c extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f8753a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f8754b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f8755c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f8756d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f8757e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f8758f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f8753a = obj;
            this.f8754b = arrayList;
            this.f8755c = obj2;
            this.f8756d = arrayList2;
            this.f8757e = obj3;
            this.f8758f = arrayList3;
        }

        @Override // c4.l.f
        public void a(l lVar) {
            lVar.Q(this);
        }

        @Override // c4.m, c4.l.f
        public void c(l lVar) {
            Object obj = this.f8753a;
            if (obj != null) {
                e.this.w(obj, this.f8754b, null);
            }
            Object obj2 = this.f8755c;
            if (obj2 != null) {
                e.this.w(obj2, this.f8756d, null);
            }
            Object obj3 = this.f8757e;
            if (obj3 != null) {
                e.this.w(obj3, this.f8758f, null);
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class d implements f.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f8760a;

        d(l lVar) {
            this.f8760a = lVar;
        }

        @Override // androidx.core.os.f.b
        public void a() {
            this.f8760a.cancel();
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class f extends l.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f8764a;

        f(Rect rect) {
            this.f8764a = rect;
        }
    }

    private static boolean v(l lVar) {
        if (androidx.fragment.app.n0.i(lVar.A()) && androidx.fragment.app.n0.i(lVar.B()) && androidx.fragment.app.n0.i(lVar.C())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.n0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((l) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.n0
    public void b(Object obj, ArrayList<View> arrayList) {
        l lVar = (l) obj;
        if (lVar == null) {
            return;
        }
        int i10 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int i02 = pVar.i0();
            while (i10 < i02) {
                b(pVar.h0(i10), arrayList);
                i10++;
            }
        } else if (!v(lVar) && androidx.fragment.app.n0.i(lVar.D())) {
            int size = arrayList.size();
            while (i10 < size) {
                lVar.b(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.n0
    public void c(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (l) obj);
    }

    @Override // androidx.fragment.app.n0
    public boolean e(Object obj) {
        return obj instanceof l;
    }

    @Override // androidx.fragment.app.n0
    public Object f(Object obj) {
        if (obj != null) {
            return ((l) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.n0
    public Object j(Object obj, Object obj2, Object obj3) {
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        l lVar3 = (l) obj3;
        if (lVar != null && lVar2 != null) {
            lVar = new p().f0(lVar).f0(lVar2).n0(1);
        } else if (lVar == null) {
            if (lVar2 != null) {
                lVar = lVar2;
            } else {
                lVar = null;
            }
        }
        if (lVar3 != null) {
            p pVar = new p();
            if (lVar != null) {
                pVar.f0(lVar);
            }
            pVar.f0(lVar3);
            return pVar;
        }
        return lVar;
    }

    @Override // androidx.fragment.app.n0
    public Object k(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.f0((l) obj);
        }
        if (obj2 != null) {
            pVar.f0((l) obj2);
        }
        if (obj3 != null) {
            pVar.f0((l) obj3);
        }
        return pVar;
    }

    @Override // androidx.fragment.app.n0
    public void m(Object obj, View view, ArrayList<View> arrayList) {
        ((l) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.n0
    public void n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((l) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.n0
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((l) obj).W(new f(rect));
        }
    }

    @Override // androidx.fragment.app.n0
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((l) obj).W(new a(rect));
        }
    }

    @Override // androidx.fragment.app.n0
    public void q(Fragment fragment, Object obj, androidx.core.os.f fVar, Runnable runnable) {
        l lVar = (l) obj;
        fVar.b(new d(lVar));
        lVar.a(new C0222e(runnable));
    }

    @Override // androidx.fragment.app.n0
    public void s(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        List<View> D = pVar.D();
        D.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.n0.d(D, arrayList.get(i10));
        }
        D.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    @Override // androidx.fragment.app.n0
    public void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.D().clear();
            pVar.D().addAll(arrayList2);
            w(pVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.n0
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.f0((l) obj);
        return pVar;
    }

    public void w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int size;
        l lVar = (l) obj;
        int i10 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int i02 = pVar.i0();
            while (i10 < i02) {
                w(pVar.h0(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!v(lVar)) {
            List<View> D = lVar.D();
            if (D.size() == arrayList.size() && D.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i10 < size) {
                    lVar.b(arrayList2.get(i10));
                    i10++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    lVar.R(arrayList.get(size2));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* loaded from: classes.dex */
    class b implements l.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f8750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f8751b;

        b(View view, ArrayList arrayList) {
            this.f8750a = view;
            this.f8751b = arrayList;
        }

        @Override // c4.l.f
        public void a(l lVar) {
            lVar.Q(this);
            this.f8750a.setVisibility(8);
            int size = this.f8751b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f8751b.get(i10)).setVisibility(0);
            }
        }

        @Override // c4.l.f
        public void c(l lVar) {
            lVar.Q(this);
            lVar.a(this);
        }

        @Override // c4.l.f
        public void b(l lVar) {
        }

        @Override // c4.l.f
        public void d(l lVar) {
        }

        @Override // c4.l.f
        public void e(l lVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    /* renamed from: c4.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0222e implements l.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f8762a;

        C0222e(Runnable runnable) {
            this.f8762a = runnable;
        }

        @Override // c4.l.f
        public void a(l lVar) {
            this.f8762a.run();
        }

        @Override // c4.l.f
        public void b(l lVar) {
        }

        @Override // c4.l.f
        public void c(l lVar) {
        }

        @Override // c4.l.f
        public void d(l lVar) {
        }

        @Override // c4.l.f
        public void e(l lVar) {
        }
    }
}
