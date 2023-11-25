package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.f;
import androidx.fragment.app.i;
import androidx.fragment.app.r;
import androidx.fragment.app.t0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: DefaultSpecialEffectsController.kt */
/* loaded from: classes.dex */
public final class i extends t0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: c  reason: collision with root package name */
        private final boolean f4700c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4701d;

        /* renamed from: e  reason: collision with root package name */
        private r.a f4702e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t0.c cVar, androidx.core.os.f fVar, boolean z10) {
            super(cVar, fVar);
            qc.q.i(cVar, "operation");
            qc.q.i(fVar, "signal");
            this.f4700c = z10;
        }

        public final r.a e(Context context) {
            boolean z10;
            qc.q.i(context, "context");
            if (this.f4701d) {
                return this.f4702e;
            }
            Fragment h10 = b().h();
            if (b().g() == t0.c.b.VISIBLE) {
                z10 = true;
            } else {
                z10 = false;
            }
            r.a b10 = r.b(context, h10, z10, this.f4700c);
            this.f4702e = b10;
            this.f4701d = true;
            return b10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final t0.c f4703a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.os.f f4704b;

        public b(t0.c cVar, androidx.core.os.f fVar) {
            qc.q.i(cVar, "operation");
            qc.q.i(fVar, "signal");
            this.f4703a = cVar;
            this.f4704b = fVar;
        }

        public final void a() {
            this.f4703a.f(this.f4704b);
        }

        public final t0.c b() {
            return this.f4703a;
        }

        public final androidx.core.os.f c() {
            return this.f4704b;
        }

        public final boolean d() {
            t0.c.b bVar;
            t0.c.b.a aVar = t0.c.b.Companion;
            View view = this.f4703a.h().mView;
            qc.q.h(view, "operation.fragment.mView");
            t0.c.b a10 = aVar.a(view);
            t0.c.b g10 = this.f4703a.g();
            if (a10 != g10 && (a10 == (bVar = t0.c.b.VISIBLE) || g10 == bVar)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class c extends b {

        /* renamed from: c  reason: collision with root package name */
        private final Object f4705c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f4706d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f4707e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t0.c cVar, androidx.core.os.f fVar, boolean z10, boolean z11) {
            super(cVar, fVar);
            Object exitTransition;
            boolean z12;
            Object obj;
            qc.q.i(cVar, "operation");
            qc.q.i(fVar, "signal");
            t0.c.b g10 = cVar.g();
            t0.c.b bVar = t0.c.b.VISIBLE;
            if (g10 == bVar) {
                Fragment h10 = cVar.h();
                if (z10) {
                    exitTransition = h10.getReenterTransition();
                } else {
                    exitTransition = h10.getEnterTransition();
                }
            } else {
                Fragment h11 = cVar.h();
                if (z10) {
                    exitTransition = h11.getReturnTransition();
                } else {
                    exitTransition = h11.getExitTransition();
                }
            }
            this.f4705c = exitTransition;
            if (cVar.g() == bVar) {
                if (z10) {
                    z12 = cVar.h().getAllowReturnTransitionOverlap();
                } else {
                    z12 = cVar.h().getAllowEnterTransitionOverlap();
                }
            } else {
                z12 = true;
            }
            this.f4706d = z12;
            if (z11) {
                if (z10) {
                    obj = cVar.h().getSharedElementReturnTransition();
                } else {
                    obj = cVar.h().getSharedElementEnterTransition();
                }
            } else {
                obj = null;
            }
            this.f4707e = obj;
        }

        private final n0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            n0 n0Var = l0.f4761b;
            if (n0Var != null && n0Var.e(obj)) {
                return n0Var;
            }
            n0 n0Var2 = l0.f4762c;
            if (n0Var2 != null && n0Var2.e(obj)) {
                return n0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final n0 e() {
            boolean z10;
            n0 f10 = f(this.f4705c);
            n0 f11 = f(this.f4707e);
            if (f10 != null && f11 != null && f10 != f11) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (f10 == null) {
                    return f11;
                }
                return f10;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().h() + " returned Transition " + this.f4705c + " which uses a different Transition  type than its shared element transition " + this.f4707e).toString());
        }

        public final Object g() {
            return this.f4707e;
        }

        public final Object h() {
            return this.f4705c;
        }

        public final boolean i() {
            if (this.f4707e != null) {
                return true;
            }
            return false;
        }

        public final boolean j() {
            return this.f4706d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.l<Map.Entry<String, View>, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Collection<String> f4708f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Collection<String> collection) {
            super(1);
            this.f4708f = collection;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry<String, View> entry) {
            boolean T;
            qc.q.i(entry, "entry");
            T = ec.b0.T(this.f4708f, androidx.core.view.p0.N(entry.getValue()));
            return Boolean.valueOf(T);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f4710b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f4711c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t0.c f4712d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f4713e;

        e(View view, boolean z10, t0.c cVar, a aVar) {
            this.f4710b = view;
            this.f4711c = z10;
            this.f4712d = cVar;
            this.f4713e = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            qc.q.i(animator, "anim");
            i.this.q().endViewTransition(this.f4710b);
            if (this.f4711c) {
                t0.c.b g10 = this.f4712d.g();
                View view = this.f4710b;
                qc.q.h(view, "viewToAnimate");
                g10.applyState(view);
            }
            this.f4713e.a();
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f4712d + " has ended.");
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class f implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0.c f4714a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f4715b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4716c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f4717d;

        f(t0.c cVar, i iVar, View view, a aVar) {
            this.f4714a = cVar;
            this.f4715b = iVar;
            this.f4716c = view;
            this.f4717d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(i iVar, View view, a aVar) {
            qc.q.i(iVar, "this$0");
            qc.q.i(aVar, "$animationInfo");
            iVar.q().endViewTransition(view);
            aVar.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            qc.q.i(animation, "animation");
            ViewGroup q10 = this.f4715b.q();
            final i iVar = this.f4715b;
            final View view = this.f4716c;
            final a aVar = this.f4717d;
            q10.post(new Runnable() { // from class: androidx.fragment.app.j
                @Override // java.lang.Runnable
                public final void run() {
                    i.f.b(i.this, view, aVar);
                }
            });
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4714a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            qc.q.i(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            qc.q.i(animation, "animation");
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4714a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ViewGroup viewGroup) {
        super(viewGroup);
        qc.q.i(viewGroup, "container");
    }

    private final void D(t0.c cVar) {
        View view = cVar.h().mView;
        t0.c.b g10 = cVar.g();
        qc.q.h(view, "view");
        g10.applyState(view);
    }

    private final void E(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (androidx.core.view.s0.a(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    qc.q.h(childAt, "child");
                    E(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(List list, t0.c cVar, i iVar) {
        qc.q.i(list, "$awaitingContainerChanges");
        qc.q.i(cVar, "$operation");
        qc.q.i(iVar, "this$0");
        if (list.contains(cVar)) {
            list.remove(cVar);
            iVar.D(cVar);
        }
    }

    private final void G(Map<String, View> map, View view) {
        String N = androidx.core.view.p0.N(view);
        if (N != null) {
            map.put(N, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    qc.q.h(childAt, "child");
                    G(map, childAt);
                }
            }
        }
    }

    private final void H(androidx.collection.a<String, View> aVar, Collection<String> collection) {
        Set<Map.Entry<String, View>> entrySet = aVar.entrySet();
        qc.q.h(entrySet, "entries");
        ec.y.H(entrySet, new d(collection));
    }

    private final void I(List<a> list, List<t0.c> list2, boolean z10, Map<t0.c, Boolean> map) {
        boolean z11;
        Context context = q().getContext();
        ArrayList<a> arrayList = new ArrayList();
        boolean z12 = false;
        for (a aVar : list) {
            if (aVar.d()) {
                aVar.a();
            } else {
                qc.q.h(context, "context");
                r.a e10 = aVar.e(context);
                if (e10 == null) {
                    aVar.a();
                } else {
                    final Animator animator = e10.f4800b;
                    if (animator == null) {
                        arrayList.add(aVar);
                    } else {
                        final t0.c b10 = aVar.b();
                        Fragment h10 = b10.h();
                        if (qc.q.d(map.get(b10), Boolean.TRUE)) {
                            if (FragmentManager.M0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + h10 + " as this Fragment was involved in a Transition.");
                            }
                            aVar.a();
                        } else {
                            if (b10.g() == t0.c.b.GONE) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                list2.remove(b10);
                            }
                            View view = h10.mView;
                            q().startViewTransition(view);
                            animator.addListener(new e(view, z11, b10, aVar));
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.M0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + b10 + " has started.");
                            }
                            aVar.c().b(new f.b() { // from class: androidx.fragment.app.g
                                @Override // androidx.core.os.f.b
                                public final void a() {
                                    i.J(animator, b10);
                                }
                            });
                            z12 = true;
                        }
                    }
                }
            }
        }
        for (final a aVar2 : arrayList) {
            final t0.c b11 = aVar2.b();
            Fragment h11 = b11.h();
            if (z10) {
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + h11 + " as Animations cannot run alongside Transitions.");
                }
                aVar2.a();
            } else if (z12) {
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + h11 + " as Animations cannot run alongside Animators.");
                }
                aVar2.a();
            } else {
                final View view2 = h11.mView;
                qc.q.h(context, "context");
                r.a e11 = aVar2.e(context);
                if (e11 != null) {
                    Animation animation = e11.f4799a;
                    if (animation != null) {
                        if (b11.g() != t0.c.b.REMOVED) {
                            view2.startAnimation(animation);
                            aVar2.a();
                        } else {
                            q().startViewTransition(view2);
                            r.b bVar = new r.b(animation, q(), view2);
                            bVar.setAnimationListener(new f(b11, this, view2, aVar2));
                            view2.startAnimation(bVar);
                            if (FragmentManager.M0(2)) {
                                Log.v("FragmentManager", "Animation from operation " + b11 + " has started.");
                            }
                        }
                        aVar2.c().b(new f.b() { // from class: androidx.fragment.app.h
                            @Override // androidx.core.os.f.b
                            public final void a() {
                                i.K(view2, this, aVar2, b11);
                            }
                        });
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Animator animator, t0.c cVar) {
        qc.q.i(cVar, "$operation");
        animator.end();
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Animator from operation " + cVar + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(View view, i iVar, a aVar, t0.c cVar) {
        qc.q.i(iVar, "this$0");
        qc.q.i(aVar, "$animationInfo");
        qc.q.i(cVar, "$operation");
        view.clearAnimation();
        iVar.q().endViewTransition(view);
        aVar.a();
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Animation from operation " + cVar + " has been cancelled.");
        }
    }

    private final Map<t0.c, Boolean> L(List<c> list, List<t0.c> list2, final boolean z10, final t0.c cVar, final t0.c cVar2) {
        boolean z11;
        boolean z12;
        View view;
        Object obj;
        Object obj2;
        View view2;
        Object obj3;
        LinkedHashMap linkedHashMap;
        Object obj4;
        t0.c cVar3;
        final ArrayList<View> arrayList;
        Rect rect;
        View view3;
        Set H0;
        Set H02;
        Rect rect2;
        dc.l a10;
        Object obj5;
        Object obj6;
        View view4;
        final Rect rect3;
        View view5;
        final View view6;
        boolean z13;
        boolean z14;
        i iVar = this;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj7 : list) {
            if (!((c) obj7).d()) {
                arrayList2.add(obj7);
            }
        }
        ArrayList<c> arrayList3 = new ArrayList();
        for (Object obj8 : arrayList2) {
            if (((c) obj8).e() != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                arrayList3.add(obj8);
            }
        }
        final n0 n0Var = null;
        for (c cVar4 : arrayList3) {
            n0 e10 = cVar4.e();
            if (n0Var != null && e10 != n0Var) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13) {
                n0Var = e10;
            } else {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + cVar4.b().h() + " returned Transition " + cVar4.h() + " which uses a different Transition type than other Fragments.").toString());
            }
        }
        if (n0Var == null) {
            for (c cVar5 : list) {
                linkedHashMap2.put(cVar5.b(), Boolean.FALSE);
                cVar5.a();
            }
            return linkedHashMap2;
        }
        View view7 = new View(q().getContext());
        Rect rect4 = new Rect();
        ArrayList<View> arrayList4 = new ArrayList<>();
        ArrayList<View> arrayList5 = new ArrayList<>();
        androidx.collection.a aVar = new androidx.collection.a();
        View view8 = null;
        Object obj9 = null;
        boolean z15 = false;
        for (c cVar6 : list) {
            if (cVar6.i() && cVar != null && cVar2 != null) {
                Object u10 = n0Var.u(n0Var.f(cVar6.g()));
                ArrayList<String> sharedElementSourceNames = cVar2.h().getSharedElementSourceNames();
                qc.q.h(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = cVar.h().getSharedElementSourceNames();
                View view9 = view8;
                qc.q.h(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = cVar.h().getSharedElementTargetNames();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                qc.q.h(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                View view10 = view7;
                Rect rect5 = rect4;
                int i10 = 0;
                while (i10 < size) {
                    int i11 = size;
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i10));
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i10));
                    }
                    i10++;
                    size = i11;
                }
                ArrayList<String> sharedElementTargetNames2 = cVar2.h().getSharedElementTargetNames();
                qc.q.h(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                if (!z10) {
                    a10 = dc.r.a(cVar.h().getExitTransitionCallback(), cVar2.h().getEnterTransitionCallback());
                } else {
                    a10 = dc.r.a(cVar.h().getEnterTransitionCallback(), cVar2.h().getExitTransitionCallback());
                }
                androidx.core.app.x xVar = (androidx.core.app.x) a10.a();
                androidx.core.app.x xVar2 = (androidx.core.app.x) a10.b();
                int size2 = sharedElementSourceNames.size();
                int i12 = 0;
                while (i12 < size2) {
                    aVar.put(sharedElementSourceNames.get(i12), sharedElementTargetNames2.get(i12));
                    i12++;
                    size2 = size2;
                    n0Var = n0Var;
                }
                n0 n0Var2 = n0Var;
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator<String> it = sharedElementTargetNames2.iterator(); it.hasNext(); it = it) {
                        Log.v("FragmentManager", "Name: " + it.next());
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator<String> it2 = sharedElementSourceNames.iterator(); it2.hasNext(); it2 = it2) {
                        Log.v("FragmentManager", "Name: " + it2.next());
                    }
                }
                androidx.collection.a aVar2 = new androidx.collection.a();
                View view11 = cVar.h().mView;
                qc.q.h(view11, "firstOut.fragment.mView");
                iVar.G(aVar2, view11);
                aVar2.r(sharedElementSourceNames);
                if (xVar != null) {
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "Executing exit callback for operation " + cVar);
                    }
                    xVar.d(sharedElementSourceNames, aVar2);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i13 = size3 - 1;
                            String str = sharedElementSourceNames.get(size3);
                            View view12 = (View) aVar2.get(str);
                            if (view12 == null) {
                                aVar.remove(str);
                                obj5 = u10;
                            } else {
                                obj5 = u10;
                                if (!qc.q.d(str, androidx.core.view.p0.N(view12))) {
                                    aVar.put(androidx.core.view.p0.N(view12), (String) aVar.remove(str));
                                }
                            }
                            if (i13 < 0) {
                                break;
                            }
                            size3 = i13;
                            u10 = obj5;
                        }
                    } else {
                        obj5 = u10;
                    }
                } else {
                    obj5 = u10;
                    aVar.r(aVar2.keySet());
                }
                final androidx.collection.a aVar3 = new androidx.collection.a();
                View view13 = cVar2.h().mView;
                qc.q.h(view13, "lastIn.fragment.mView");
                iVar.G(aVar3, view13);
                aVar3.r(sharedElementTargetNames2);
                aVar3.r(aVar.values());
                if (xVar2 != null) {
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "Executing enter callback for operation " + cVar2);
                    }
                    xVar2.d(sharedElementTargetNames2, aVar3);
                    int size4 = sharedElementTargetNames2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i14 = size4 - 1;
                            String str2 = sharedElementTargetNames2.get(size4);
                            View view14 = (View) aVar3.get(str2);
                            if (view14 == null) {
                                qc.q.h(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
                                String b10 = l0.b(aVar, str2);
                                if (b10 != null) {
                                    aVar.remove(b10);
                                }
                            } else if (!qc.q.d(str2, androidx.core.view.p0.N(view14))) {
                                qc.q.h(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
                                String b11 = l0.b(aVar, str2);
                                if (b11 != null) {
                                    aVar.put(b11, androidx.core.view.p0.N(view14));
                                }
                            }
                            if (i14 < 0) {
                                break;
                            }
                            size4 = i14;
                        }
                    }
                } else {
                    l0.d(aVar, aVar3);
                }
                Set keySet = aVar.keySet();
                qc.q.h(keySet, "sharedElementNameMapping.keys");
                iVar.H(aVar2, keySet);
                Collection values = aVar.values();
                qc.q.h(values, "sharedElementNameMapping.values");
                iVar.H(aVar3, values);
                if (aVar.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    view8 = view9;
                    rect4 = rect5;
                    linkedHashMap2 = linkedHashMap3;
                    view7 = view10;
                    n0Var = n0Var2;
                    obj9 = null;
                } else {
                    l0.a(cVar2.h(), cVar.h(), z10, aVar2, true);
                    androidx.core.view.k0.a(q(), new Runnable() { // from class: androidx.fragment.app.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            i.P(t0.c.this, cVar, z10, aVar3);
                        }
                    });
                    arrayList4.addAll(aVar2.values());
                    if ((!sharedElementSourceNames.isEmpty()) != false) {
                        view4 = (View) aVar2.get(sharedElementSourceNames.get(0));
                        obj6 = obj5;
                        n0Var = n0Var2;
                        n0Var.p(obj6, view4);
                    } else {
                        obj6 = obj5;
                        n0Var = n0Var2;
                        view4 = view9;
                    }
                    arrayList5.addAll(aVar3.values());
                    if ((!sharedElementTargetNames2.isEmpty()) != false && (view6 = (View) aVar3.get(sharedElementTargetNames2.get(0))) != null) {
                        rect3 = rect5;
                        androidx.core.view.k0.a(q(), new Runnable() { // from class: androidx.fragment.app.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                i.M(n0.this, view6, rect3);
                            }
                        });
                        view5 = view10;
                        z15 = true;
                    } else {
                        rect3 = rect5;
                        view5 = view10;
                    }
                    n0Var.s(obj6, view5, arrayList4);
                    obj9 = obj6;
                    ArrayList<View> arrayList6 = arrayList5;
                    rect2 = rect3;
                    n0Var.n(obj9, null, null, null, null, obj6, arrayList6);
                    Boolean bool = Boolean.TRUE;
                    linkedHashMap3.put(cVar, bool);
                    linkedHashMap3.put(cVar2, bool);
                    view8 = view4;
                    arrayList5 = arrayList6;
                    arrayList4 = arrayList4;
                    aVar = aVar;
                    view7 = view5;
                    linkedHashMap2 = linkedHashMap3;
                }
            } else {
                rect2 = rect4;
                view7 = view7;
                arrayList5 = arrayList5;
                arrayList4 = arrayList4;
                linkedHashMap2 = linkedHashMap2;
                view8 = view8;
                aVar = aVar;
            }
            rect4 = rect2;
        }
        View view15 = view8;
        androidx.collection.a aVar4 = aVar;
        ArrayList<View> arrayList7 = arrayList5;
        ArrayList<View> arrayList8 = arrayList4;
        Rect rect6 = rect4;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        View view16 = view7;
        ArrayList arrayList9 = new ArrayList();
        Iterator<c> it3 = list.iterator();
        Object obj10 = null;
        Object obj11 = null;
        while (it3.hasNext()) {
            c next = it3.next();
            if (next.d()) {
                linkedHashMap4.put(next.b(), Boolean.FALSE);
                next.a();
            } else {
                Object f10 = n0Var.f(next.h());
                t0.c b12 = next.b();
                if (obj9 != null && (b12 == cVar || b12 == cVar2)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (f10 == null) {
                    if (!z12) {
                        linkedHashMap4.put(b12, Boolean.FALSE);
                        next.a();
                    }
                } else {
                    LinkedHashMap linkedHashMap5 = linkedHashMap4;
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Iterator<c> it4 = it3;
                    View view17 = b12.h().mView;
                    Object obj12 = obj9;
                    qc.q.h(view17, "operation.fragment.mView");
                    iVar.E(arrayList10, view17);
                    if (z12) {
                        if (b12 == cVar) {
                            H02 = ec.b0.H0(arrayList8);
                            arrayList10.removeAll(H02);
                        } else {
                            H0 = ec.b0.H0(arrayList7);
                            arrayList10.removeAll(H0);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        n0Var.a(f10, view16);
                        view2 = view16;
                        cVar3 = b12;
                        obj2 = obj10;
                        obj3 = obj11;
                        arrayList = arrayList10;
                        view = view15;
                        linkedHashMap = linkedHashMap5;
                        obj = obj12;
                        obj4 = f10;
                    } else {
                        n0Var.b(f10, arrayList10);
                        view = view15;
                        obj = obj12;
                        obj2 = obj10;
                        view2 = view16;
                        obj3 = obj11;
                        linkedHashMap = linkedHashMap5;
                        n0Var.n(f10, f10, arrayList10, null, null, null, null);
                        if (b12.g() == t0.c.b.GONE) {
                            cVar3 = b12;
                            list2.remove(cVar3);
                            arrayList = arrayList10;
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList);
                            arrayList11.remove(cVar3.h().mView);
                            obj4 = f10;
                            n0Var.m(obj4, cVar3.h().mView, arrayList11);
                            androidx.core.view.k0.a(q(), new Runnable() { // from class: androidx.fragment.app.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    i.N(arrayList);
                                }
                            });
                        } else {
                            obj4 = f10;
                            cVar3 = b12;
                            arrayList = arrayList10;
                        }
                    }
                    if (cVar3.g() == t0.c.b.VISIBLE) {
                        arrayList9.addAll(arrayList);
                        rect = rect6;
                        if (z15) {
                            n0Var.o(obj4, rect);
                        }
                        view3 = view;
                    } else {
                        rect = rect6;
                        view3 = view;
                        n0Var.p(obj4, view3);
                    }
                    linkedHashMap.put(cVar3, Boolean.TRUE);
                    if (next.j()) {
                        obj11 = n0Var.k(obj3, obj4, null);
                    } else {
                        obj2 = n0Var.k(obj2, obj4, null);
                        obj11 = obj3;
                    }
                    linkedHashMap4 = linkedHashMap;
                    rect6 = rect;
                    view15 = view3;
                    obj9 = obj;
                    view16 = view2;
                    it3 = it4;
                    obj10 = obj2;
                    iVar = this;
                }
            }
        }
        LinkedHashMap linkedHashMap6 = linkedHashMap4;
        Object obj13 = obj9;
        Object j10 = n0Var.j(obj11, obj10, obj13);
        if (j10 == null) {
            return linkedHashMap6;
        }
        ArrayList<c> arrayList12 = new ArrayList();
        for (Object obj14 : list) {
            if (!((c) obj14).d()) {
                arrayList12.add(obj14);
            }
        }
        for (final c cVar7 : arrayList12) {
            Object h10 = cVar7.h();
            final t0.c b13 = cVar7.b();
            if (obj13 != null && (b13 == cVar || b13 == cVar2)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (h10 != null || z11) {
                if (!androidx.core.view.p0.Y(q())) {
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + q() + " has not been laid out. Completing operation " + b13);
                    }
                    cVar7.a();
                } else {
                    n0Var.q(cVar7.b().h(), j10, cVar7.c(), new Runnable() { // from class: androidx.fragment.app.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            i.O(i.c.this, b13);
                        }
                    });
                }
            }
        }
        if (!androidx.core.view.p0.Y(q())) {
            return linkedHashMap6;
        }
        l0.e(arrayList9, 4);
        ArrayList<String> l10 = n0Var.l(arrayList7);
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator<View> it5 = arrayList8.iterator();
            while (it5.hasNext()) {
                View next2 = it5.next();
                qc.q.h(next2, "sharedElementFirstOutViews");
                View view18 = next2;
                Log.v("FragmentManager", "View: " + view18 + " Name: " + androidx.core.view.p0.N(view18));
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            Iterator<View> it6 = arrayList7.iterator();
            while (it6.hasNext()) {
                View next3 = it6.next();
                qc.q.h(next3, "sharedElementLastInViews");
                View view19 = next3;
                Log.v("FragmentManager", "View: " + view19 + " Name: " + androidx.core.view.p0.N(view19));
            }
        }
        n0Var.c(q(), j10);
        n0Var.r(q(), arrayList8, arrayList7, l10, aVar4);
        l0.e(arrayList9, 0);
        n0Var.t(obj13, arrayList8, arrayList7);
        return linkedHashMap6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(n0 n0Var, View view, Rect rect) {
        qc.q.i(n0Var, "$impl");
        qc.q.i(rect, "$lastInEpicenterRect");
        n0Var.h(view, rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(ArrayList arrayList) {
        qc.q.i(arrayList, "$transitioningViews");
        l0.e(arrayList, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(c cVar, t0.c cVar2) {
        qc.q.i(cVar, "$transitionInfo");
        qc.q.i(cVar2, "$operation");
        cVar.a();
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Transition for operation " + cVar2 + " has completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(t0.c cVar, t0.c cVar2, boolean z10, androidx.collection.a aVar) {
        qc.q.i(aVar, "$lastInViews");
        l0.a(cVar.h(), cVar2.h(), z10, aVar, false);
    }

    private final void Q(List<? extends t0.c> list) {
        Object m02;
        m02 = ec.b0.m0(list);
        Fragment h10 = ((t0.c) m02).h();
        for (t0.c cVar : list) {
            cVar.h().mAnimationInfo.f4563c = h10.mAnimationInfo.f4563c;
            cVar.h().mAnimationInfo.f4564d = h10.mAnimationInfo.f4564d;
            cVar.h().mAnimationInfo.f4565e = h10.mAnimationInfo.f4565e;
            cVar.h().mAnimationInfo.f4566f = h10.mAnimationInfo.f4566f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // androidx.fragment.app.t0
    public void j(List<? extends t0.c> list, boolean z10) {
        t0.c cVar;
        ?? r22;
        final List<t0.c> F0;
        boolean z11;
        boolean z12;
        boolean z13;
        qc.q.i(list, "operations");
        Iterator it = list.iterator();
        while (true) {
            cVar = null;
            if (it.hasNext()) {
                r22 = it.next();
                t0.c cVar2 = (t0.c) r22;
                t0.c.b.a aVar = t0.c.b.Companion;
                View view = cVar2.h().mView;
                qc.q.h(view, "operation.fragment.mView");
                t0.c.b a10 = aVar.a(view);
                t0.c.b bVar = t0.c.b.VISIBLE;
                if (a10 == bVar && cVar2.g() != bVar) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    break;
                }
            } else {
                r22 = 0;
                break;
            }
        }
        t0.c cVar3 = r22;
        ListIterator<? extends t0.c> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            t0.c previous = listIterator.previous();
            t0.c cVar4 = previous;
            t0.c.b.a aVar2 = t0.c.b.Companion;
            View view2 = cVar4.h().mView;
            qc.q.h(view2, "operation.fragment.mView");
            t0.c.b a11 = aVar2.a(view2);
            t0.c.b bVar2 = t0.c.b.VISIBLE;
            if (a11 != bVar2 && cVar4.g() == bVar2) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                cVar = previous;
                break;
            }
        }
        t0.c cVar5 = cVar;
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Executing operations from " + cVar3 + " to " + cVar5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        F0 = ec.b0.F0(list);
        Q(list);
        for (final t0.c cVar6 : list) {
            androidx.core.os.f fVar = new androidx.core.os.f();
            cVar6.l(fVar);
            arrayList.add(new a(cVar6, fVar, z10));
            androidx.core.os.f fVar2 = new androidx.core.os.f();
            cVar6.l(fVar2);
            if (!z10 ? cVar6 == cVar5 : cVar6 == cVar3) {
                z11 = true;
            } else {
                z11 = false;
            }
            arrayList2.add(new c(cVar6, fVar2, z10, z11));
            cVar6.c(new Runnable() { // from class: androidx.fragment.app.b
                @Override // java.lang.Runnable
                public final void run() {
                    i.F(F0, cVar6, this);
                }
            });
        }
        Map<t0.c, Boolean> L = L(arrayList2, F0, z10, cVar3, cVar5);
        I(arrayList, F0, L.containsValue(Boolean.TRUE), L);
        Iterator<t0.c> it2 = F0.iterator();
        while (it2.hasNext()) {
            D(it2.next());
        }
        F0.clear();
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + cVar3 + " to " + cVar5);
        }
    }
}
