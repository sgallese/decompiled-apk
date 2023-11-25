package c4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public abstract class l implements Cloneable {
    private static final int[] S = {2, 1, 3, 4};
    private static final g T = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> U = new ThreadLocal<>();
    private ArrayList<s> G;
    private ArrayList<s> H;
    private e P;
    private androidx.collection.a<String, String> Q;

    /* renamed from: f  reason: collision with root package name */
    private String f8775f = getClass().getName();

    /* renamed from: m  reason: collision with root package name */
    private long f8776m = -1;

    /* renamed from: p  reason: collision with root package name */
    long f8777p = -1;

    /* renamed from: q  reason: collision with root package name */
    private TimeInterpolator f8778q = null;

    /* renamed from: r  reason: collision with root package name */
    ArrayList<Integer> f8779r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    ArrayList<View> f8780s = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<String> f8781t = null;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<Class<?>> f8782u = null;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<Integer> f8783v = null;

    /* renamed from: w  reason: collision with root package name */
    private ArrayList<View> f8784w = null;

    /* renamed from: x  reason: collision with root package name */
    private ArrayList<Class<?>> f8785x = null;

    /* renamed from: y  reason: collision with root package name */
    private ArrayList<String> f8786y = null;

    /* renamed from: z  reason: collision with root package name */
    private ArrayList<Integer> f8787z = null;
    private ArrayList<View> A = null;
    private ArrayList<Class<?>> B = null;
    private t C = new t();
    private t D = new t();
    p E = null;
    private int[] F = S;
    boolean I = false;
    ArrayList<Animator> J = new ArrayList<>();
    private int K = 0;
    private boolean L = false;
    private boolean M = false;
    private ArrayList<f> N = null;
    private ArrayList<Animator> O = new ArrayList<>();
    private g R = T;

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    class a extends g {
        a() {
        }

        @Override // c4.g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f8788a;

        b(androidx.collection.a aVar) {
            this.f8788a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8788a.remove(animator);
            l.this.J.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.this.J.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.this.p();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        View f8791a;

        /* renamed from: b  reason: collision with root package name */
        String f8792b;

        /* renamed from: c  reason: collision with root package name */
        s f8793c;

        /* renamed from: d  reason: collision with root package name */
        o0 f8794d;

        /* renamed from: e  reason: collision with root package name */
        l f8795e;

        d(View view, String str, l lVar, o0 o0Var, s sVar) {
            this.f8791a = view;
            this.f8792b = str;
            this.f8793c = sVar;
            this.f8794d = o0Var;
            this.f8795e = lVar;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public interface f {
        void a(l lVar);

        void b(l lVar);

        void c(l lVar);

        void d(l lVar);

        void e(l lVar);
    }

    private static boolean I(s sVar, s sVar2, String str) {
        Object obj = sVar.f8830a.get(str);
        Object obj2 = sVar2.f8830a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    private void J(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && H(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && H(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.G.add(sVar);
                    this.H.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void K(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View j10 = aVar.j(size);
            if (j10 != null && H(j10) && (remove = aVar2.remove(j10)) != null && H(remove.f8831b)) {
                this.G.add(aVar.l(size));
                this.H.add(remove);
            }
        }
    }

    private void L(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, androidx.collection.e<View> eVar, androidx.collection.e<View> eVar2) {
        View f10;
        int o10 = eVar.o();
        for (int i10 = 0; i10 < o10; i10++) {
            View p10 = eVar.p(i10);
            if (p10 != null && H(p10) && (f10 = eVar2.f(eVar.j(i10))) != null && H(f10)) {
                s sVar = aVar.get(p10);
                s sVar2 = aVar2.get(f10);
                if (sVar != null && sVar2 != null) {
                    this.G.add(sVar);
                    this.H.add(sVar2);
                    aVar.remove(p10);
                    aVar2.remove(f10);
                }
            }
        }
    }

    private void M(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View n10 = aVar3.n(i10);
            if (n10 != null && H(n10) && (view = aVar4.get(aVar3.j(i10))) != null && H(view)) {
                s sVar = aVar.get(n10);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.G.add(sVar);
                    this.H.add(sVar2);
                    aVar.remove(n10);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void N(t tVar, t tVar2) {
        androidx.collection.a<View, s> aVar = new androidx.collection.a<>(tVar.f8833a);
        androidx.collection.a<View, s> aVar2 = new androidx.collection.a<>(tVar2.f8833a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.F;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                L(aVar, aVar2, tVar.f8835c, tVar2.f8835c);
                            }
                        } else {
                            J(aVar, aVar2, tVar.f8834b, tVar2.f8834b);
                        }
                    } else {
                        M(aVar, aVar2, tVar.f8836d, tVar2.f8836d);
                    }
                } else {
                    K(aVar, aVar2);
                }
                i10++;
            } else {
                c(aVar, aVar2);
                return;
            }
        }
    }

    private void T(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            e(animator);
        }
    }

    private void c(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            s n10 = aVar.n(i10);
            if (H(n10.f8831b)) {
                this.G.add(n10);
                this.H.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            s n11 = aVar2.n(i11);
            if (H(n11.f8831b)) {
                this.H.add(n11);
                this.G.add(null);
            }
        }
    }

    private static void d(t tVar, View view, s sVar) {
        tVar.f8833a.put(view, sVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (tVar.f8834b.indexOfKey(id2) >= 0) {
                tVar.f8834b.put(id2, null);
            } else {
                tVar.f8834b.put(id2, view);
            }
        }
        String N = p0.N(view);
        if (N != null) {
            if (tVar.f8836d.containsKey(N)) {
                tVar.f8836d.put(N, null);
            } else {
                tVar.f8836d.put(N, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f8835c.h(itemIdAtPosition) >= 0) {
                    View f10 = tVar.f8835c.f(itemIdAtPosition);
                    if (f10 != null) {
                        p0.E0(f10, false);
                        tVar.f8835c.k(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                p0.E0(view, true);
                tVar.f8835c.k(itemIdAtPosition, view);
            }
        }
    }

    private void g(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f8783v;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id2))) {
            return;
        }
        ArrayList<View> arrayList2 = this.f8784w;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList<Class<?>> arrayList3 = this.f8785x;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f8785x.get(i10).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            s sVar = new s(view);
            if (z10) {
                i(sVar);
            } else {
                f(sVar);
            }
            sVar.f8832c.add(this);
            h(sVar);
            if (z10) {
                d(this.C, view, sVar);
            } else {
                d(this.D, view, sVar);
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList<Integer> arrayList4 = this.f8787z;
            if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id2))) {
                return;
            }
            ArrayList<View> arrayList5 = this.A;
            if (arrayList5 != null && arrayList5.contains(view)) {
                return;
            }
            ArrayList<Class<?>> arrayList6 = this.B;
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (this.B.get(i11).isInstance(view)) {
                        return;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                g(viewGroup.getChildAt(i12), z10);
            }
        }
    }

    private static androidx.collection.a<Animator, d> y() {
        androidx.collection.a<Animator, d> aVar = U.get();
        if (aVar == null) {
            androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
            U.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    public List<Integer> A() {
        return this.f8779r;
    }

    public List<String> B() {
        return this.f8781t;
    }

    public List<Class<?>> C() {
        return this.f8782u;
    }

    public List<View> D() {
        return this.f8780s;
    }

    public String[] E() {
        return null;
    }

    public s F(View view, boolean z10) {
        t tVar;
        p pVar = this.E;
        if (pVar != null) {
            return pVar.F(view, z10);
        }
        if (z10) {
            tVar = this.C;
        } else {
            tVar = this.D;
        }
        return tVar.f8833a.get(view);
    }

    public boolean G(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] E = E();
        if (E != null) {
            for (String str : E) {
                if (!I(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        Iterator<String> it = sVar.f8830a.keySet().iterator();
        while (it.hasNext()) {
            if (I(sVar, sVar2, it.next())) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f8783v;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f8784w;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f8785x;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f8785x.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f8786y != null && p0.N(view) != null && this.f8786y.contains(p0.N(view))) {
            return false;
        }
        if ((this.f8779r.size() == 0 && this.f8780s.size() == 0 && (((arrayList = this.f8782u) == null || arrayList.isEmpty()) && ((arrayList2 = this.f8781t) == null || arrayList2.isEmpty()))) || this.f8779r.contains(Integer.valueOf(id2)) || this.f8780s.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f8781t;
        if (arrayList6 != null && arrayList6.contains(p0.N(view))) {
            return true;
        }
        if (this.f8782u != null) {
            for (int i11 = 0; i11 < this.f8782u.size(); i11++) {
                if (this.f8782u.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void O(View view) {
        if (!this.M) {
            for (int size = this.J.size() - 1; size >= 0; size--) {
                c4.a.b(this.J.get(size));
            }
            ArrayList<f> arrayList = this.N;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.N.clone();
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((f) arrayList2.get(i10)).d(this);
                }
            }
            this.L = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(ViewGroup viewGroup) {
        d dVar;
        boolean z10;
        this.G = new ArrayList<>();
        this.H = new ArrayList<>();
        N(this.C, this.D);
        androidx.collection.a<Animator, d> y10 = y();
        int size = y10.size();
        o0 d10 = a0.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator j10 = y10.j(i10);
            if (j10 != null && (dVar = y10.get(j10)) != null && dVar.f8791a != null && d10.equals(dVar.f8794d)) {
                s sVar = dVar.f8793c;
                View view = dVar.f8791a;
                s F = F(view, true);
                s t10 = t(view, true);
                if (F == null && t10 == null) {
                    t10 = this.D.f8833a.get(view);
                }
                if ((F != null || t10 != null) && dVar.f8795e.G(sVar, t10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (!j10.isRunning() && !j10.isStarted()) {
                        y10.remove(j10);
                    } else {
                        j10.cancel();
                    }
                }
            }
        }
        o(viewGroup, this.C, this.D, this.G, this.H);
        U();
    }

    public l Q(f fVar) {
        ArrayList<f> arrayList = this.N;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.N.size() == 0) {
            this.N = null;
        }
        return this;
    }

    public l R(View view) {
        this.f8780s.remove(view);
        return this;
    }

    public void S(View view) {
        if (this.L) {
            if (!this.M) {
                for (int size = this.J.size() - 1; size >= 0; size--) {
                    c4.a.c(this.J.get(size));
                }
                ArrayList<f> arrayList = this.N;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.N.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((f) arrayList2.get(i10)).b(this);
                    }
                }
            }
            this.L = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U() {
        b0();
        androidx.collection.a<Animator, d> y10 = y();
        Iterator<Animator> it = this.O.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (y10.containsKey(next)) {
                b0();
                T(next, y10);
            }
        }
        this.O.clear();
        p();
    }

    public l V(long j10) {
        this.f8777p = j10;
        return this;
    }

    public void W(e eVar) {
        this.P = eVar;
    }

    public l X(TimeInterpolator timeInterpolator) {
        this.f8778q = timeInterpolator;
        return this;
    }

    public void Y(g gVar) {
        if (gVar == null) {
            this.R = T;
        } else {
            this.R = gVar;
        }
    }

    public l a(f fVar) {
        if (this.N == null) {
            this.N = new ArrayList<>();
        }
        this.N.add(fVar);
        return this;
    }

    public l a0(long j10) {
        this.f8776m = j10;
        return this;
    }

    public l b(View view) {
        this.f8780s.add(view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b0() {
        if (this.K == 0) {
            ArrayList<f> arrayList = this.N;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.N.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).c(this);
                }
            }
            this.M = false;
        }
        this.K++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f8777p != -1) {
            str2 = str2 + "dur(" + this.f8777p + ") ";
        }
        if (this.f8776m != -1) {
            str2 = str2 + "dly(" + this.f8776m + ") ";
        }
        if (this.f8778q != null) {
            str2 = str2 + "interp(" + this.f8778q + ") ";
        }
        if (this.f8779r.size() > 0 || this.f8780s.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f8779r.size() > 0) {
                for (int i10 = 0; i10 < this.f8779r.size(); i10++) {
                    if (i10 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f8779r.get(i10);
                }
            }
            if (this.f8780s.size() > 0) {
                for (int i11 = 0; i11 < this.f8780s.size(); i11++) {
                    if (i11 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f8780s.get(i11);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.J.size() - 1; size >= 0; size--) {
            this.J.get(size).cancel();
        }
        ArrayList<f> arrayList = this.N;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.N.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((f) arrayList2.get(i10)).e(this);
            }
        }
    }

    protected void e(Animator animator) {
        if (animator == null) {
            p();
            return;
        }
        if (q() >= 0) {
            animator.setDuration(q());
        }
        if (z() >= 0) {
            animator.setStartDelay(z() + animator.getStartDelay());
        }
        if (s() != null) {
            animator.setInterpolator(s());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void f(s sVar);

    public abstract void i(s sVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a<String, String> aVar;
        k(z10);
        if ((this.f8779r.size() <= 0 && this.f8780s.size() <= 0) || (((arrayList = this.f8781t) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f8782u) != null && !arrayList2.isEmpty()))) {
            g(viewGroup, z10);
        } else {
            for (int i10 = 0; i10 < this.f8779r.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f8779r.get(i10).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z10) {
                        i(sVar);
                    } else {
                        f(sVar);
                    }
                    sVar.f8832c.add(this);
                    h(sVar);
                    if (z10) {
                        d(this.C, findViewById, sVar);
                    } else {
                        d(this.D, findViewById, sVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f8780s.size(); i11++) {
                View view = this.f8780s.get(i11);
                s sVar2 = new s(view);
                if (z10) {
                    i(sVar2);
                } else {
                    f(sVar2);
                }
                sVar2.f8832c.add(this);
                h(sVar2);
                if (z10) {
                    d(this.C, view, sVar2);
                } else {
                    d(this.D, view, sVar2);
                }
            }
        }
        if (!z10 && (aVar = this.Q) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(this.C.f8836d.remove(this.Q.j(i12)));
            }
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayList3.get(i13);
                if (view2 != null) {
                    this.C.f8836d.put(this.Q.n(i13), view2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(boolean z10) {
        if (z10) {
            this.C.f8833a.clear();
            this.C.f8834b.clear();
            this.C.f8835c.b();
            return;
        }
        this.D.f8833a.clear();
        this.D.f8834b.clear();
        this.D.f8835c.b();
    }

    @Override // 
    /* renamed from: l */
    public l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.O = new ArrayList<>();
            lVar.C = new t();
            lVar.D = new t();
            lVar.G = null;
            lVar.H = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator n(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        boolean z10;
        View view;
        Animator animator;
        s sVar;
        int i10;
        Animator animator2;
        s sVar2;
        androidx.collection.a<Animator, d> y10 = y();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar3 = arrayList.get(i11);
            s sVar4 = arrayList2.get(i11);
            if (sVar3 != null && !sVar3.f8832c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f8832c.contains(this)) {
                sVar4 = null;
            }
            if (sVar3 != null || sVar4 != null) {
                if (sVar3 != null && sVar4 != null && !G(sVar3, sVar4)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    Animator n10 = n(viewGroup, sVar3, sVar4);
                    if (n10 != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f8831b;
                            String[] E = E();
                            if (E != null && E.length > 0) {
                                sVar2 = new s(view2);
                                s sVar5 = tVar2.f8833a.get(view2);
                                if (sVar5 != null) {
                                    int i12 = 0;
                                    while (i12 < E.length) {
                                        Map<String, Object> map = sVar2.f8830a;
                                        Animator animator3 = n10;
                                        String str = E[i12];
                                        map.put(str, sVar5.f8830a.get(str));
                                        i12++;
                                        n10 = animator3;
                                        E = E;
                                    }
                                }
                                Animator animator4 = n10;
                                int size2 = y10.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 < size2) {
                                        d dVar = y10.get(y10.j(i13));
                                        if (dVar.f8793c != null && dVar.f8791a == view2 && dVar.f8792b.equals(u()) && dVar.f8793c.equals(sVar2)) {
                                            animator2 = null;
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        animator2 = animator4;
                                        break;
                                    }
                                }
                            } else {
                                animator2 = n10;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            view = sVar3.f8831b;
                            animator = n10;
                            sVar = null;
                        }
                        if (animator != null) {
                            i10 = size;
                            y10.put(animator, new d(view, u(), this, a0.d(viewGroup), sVar));
                            this.O.add(animator);
                            i11++;
                            size = i10;
                        }
                        i10 = size;
                        i11++;
                        size = i10;
                    }
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator5 = this.O.get(sparseIntArray.keyAt(i14));
                animator5.setStartDelay((sparseIntArray.valueAt(i14) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p() {
        int i10 = this.K - 1;
        this.K = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.N;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.N.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).a(this);
                }
            }
            for (int i12 = 0; i12 < this.C.f8835c.o(); i12++) {
                View p10 = this.C.f8835c.p(i12);
                if (p10 != null) {
                    p0.E0(p10, false);
                }
            }
            for (int i13 = 0; i13 < this.D.f8835c.o(); i13++) {
                View p11 = this.D.f8835c.p(i13);
                if (p11 != null) {
                    p0.E0(p11, false);
                }
            }
            this.M = true;
        }
    }

    public long q() {
        return this.f8777p;
    }

    public e r() {
        return this.P;
    }

    public TimeInterpolator s() {
        return this.f8778q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s t(View view, boolean z10) {
        ArrayList<s> arrayList;
        ArrayList<s> arrayList2;
        p pVar = this.E;
        if (pVar != null) {
            return pVar.t(view, z10);
        }
        if (z10) {
            arrayList = this.G;
        } else {
            arrayList = this.H;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                s sVar = arrayList.get(i10);
                if (sVar == null) {
                    return null;
                }
                if (sVar.f8831b == view) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return null;
        }
        if (z10) {
            arrayList2 = this.H;
        } else {
            arrayList2 = this.G;
        }
        return arrayList2.get(i10);
    }

    public String toString() {
        return c0("");
    }

    public String u() {
        return this.f8775f;
    }

    public g v() {
        return this.R;
    }

    public o w() {
        return null;
    }

    public long z() {
        return this.f8776m;
    }

    public void Z(o oVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(s sVar) {
    }
}
