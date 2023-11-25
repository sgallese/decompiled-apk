package c4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static l f8816a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<l>>>> f8817b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f8818c = new ArrayList<>();

    public static void a(ViewGroup viewGroup, l lVar) {
        if (!f8818c.contains(viewGroup) && p0.Y(viewGroup)) {
            f8818c.add(viewGroup);
            if (lVar == null) {
                lVar = f8816a;
            }
            l clone = lVar.clone();
            d(viewGroup, clone);
            k.c(viewGroup, null);
            c(viewGroup, clone);
        }
    }

    static androidx.collection.a<ViewGroup, ArrayList<l>> b() {
        androidx.collection.a<ViewGroup, ArrayList<l>> aVar;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<l>>> weakReference = f8817b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a<ViewGroup, ArrayList<l>> aVar2 = new androidx.collection.a<>();
        f8817b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, l lVar) {
        if (lVar != null && viewGroup != null) {
            a aVar = new a(lVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, l lVar) {
        ArrayList<l> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<l> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().O(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.j(viewGroup, true);
        }
        k b10 = k.b(viewGroup);
        if (b10 != null) {
            b10.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransitionManager.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: f  reason: collision with root package name */
        l f8819f;

        /* renamed from: m  reason: collision with root package name */
        ViewGroup f8820m;

        /* compiled from: TransitionManager.java */
        /* renamed from: c4.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0223a extends m {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f8821a;

            C0223a(androidx.collection.a aVar) {
                this.f8821a = aVar;
            }

            @Override // c4.l.f
            public void a(l lVar) {
                ((ArrayList) this.f8821a.get(a.this.f8820m)).remove(lVar);
                lVar.Q(this);
            }
        }

        a(l lVar, ViewGroup viewGroup) {
            this.f8819f = lVar;
            this.f8820m = viewGroup;
        }

        private void a() {
            this.f8820m.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f8820m.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!n.f8818c.remove(this.f8820m)) {
                return true;
            }
            androidx.collection.a<ViewGroup, ArrayList<l>> b10 = n.b();
            ArrayList<l> arrayList = b10.get(this.f8820m);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                b10.put(this.f8820m, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f8819f);
            this.f8819f.a(new C0223a(b10));
            this.f8819f.j(this.f8820m, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).S(this.f8820m);
                }
            }
            this.f8819f.P(this.f8820m);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            n.f8818c.remove(this.f8820m);
            ArrayList<l> arrayList = n.b().get(this.f8820m);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<l> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().S(this.f8820m);
                }
            }
            this.f8819f.k(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
