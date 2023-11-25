package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class h extends y {

    /* renamed from: l  reason: collision with root package name */
    private static TimeInterpolator f6736l;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<RecyclerView.f0> f6737a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<RecyclerView.f0> f6738b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<j> f6739c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<i> f6740d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.f0>> f6741e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    ArrayList<ArrayList<j>> f6742f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    ArrayList<ArrayList<i>> f6743g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    ArrayList<RecyclerView.f0> f6744h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    ArrayList<RecyclerView.f0> f6745i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    ArrayList<RecyclerView.f0> f6746j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    ArrayList<RecyclerView.f0> f6747k = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f6748f;

        a(ArrayList arrayList) {
            this.f6748f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f6748f.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                h.this.animateMoveImpl(jVar.f6782a, jVar.f6783b, jVar.f6784c, jVar.f6785d, jVar.f6786e);
            }
            this.f6748f.clear();
            h.this.f6742f.remove(this.f6748f);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f6750f;

        b(ArrayList arrayList) {
            this.f6750f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f6750f.iterator();
            while (it.hasNext()) {
                h.this.a((i) it.next());
            }
            this.f6750f.clear();
            h.this.f6743g.remove(this.f6750f);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f6752f;

        c(ArrayList arrayList) {
            this.f6752f = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f6752f.iterator();
            while (it.hasNext()) {
                h.this.animateAddImpl((RecyclerView.f0) it.next());
            }
            this.f6752f.clear();
            h.this.f6741e.remove(this.f6752f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f6754a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6755b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6756c;

        d(RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6754a = f0Var;
            this.f6755b = viewPropertyAnimator;
            this.f6756c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6755b.setListener(null);
            this.f6756c.setAlpha(1.0f);
            h.this.dispatchRemoveFinished(this.f6754a);
            h.this.f6746j.remove(this.f6754a);
            h.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.dispatchRemoveStarting(this.f6754a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f6758a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f6759b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6760c;

        e(RecyclerView.f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6758a = f0Var;
            this.f6759b = view;
            this.f6760c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6759b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6760c.setListener(null);
            h.this.dispatchAddFinished(this.f6758a);
            h.this.f6744h.remove(this.f6758a);
            h.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.dispatchAddStarting(this.f6758a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.f0 f6762a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f6763b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6764c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f6765d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6766e;

        f(RecyclerView.f0 f0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6762a = f0Var;
            this.f6763b = i10;
            this.f6764c = view;
            this.f6765d = i11;
            this.f6766e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f6763b != 0) {
                this.f6764c.setTranslationX(0.0f);
            }
            if (this.f6765d != 0) {
                this.f6764c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6766e.setListener(null);
            h.this.dispatchMoveFinished(this.f6762a);
            h.this.f6745i.remove(this.f6762a);
            h.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.dispatchMoveStarting(this.f6762a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f6768a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6769b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6770c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6768a = iVar;
            this.f6769b = viewPropertyAnimator;
            this.f6770c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6769b.setListener(null);
            this.f6770c.setAlpha(1.0f);
            this.f6770c.setTranslationX(0.0f);
            this.f6770c.setTranslationY(0.0f);
            h.this.dispatchChangeFinished(this.f6768a.f6776a, true);
            h.this.f6747k.remove(this.f6768a.f6776a);
            h.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.dispatchChangeStarting(this.f6768a.f6776a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0157h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f6772a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f6773b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6774c;

        C0157h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6772a = iVar;
            this.f6773b = viewPropertyAnimator;
            this.f6774c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6773b.setListener(null);
            this.f6774c.setAlpha(1.0f);
            this.f6774c.setTranslationX(0.0f);
            this.f6774c.setTranslationY(0.0f);
            h.this.dispatchChangeFinished(this.f6772a.f6777b, false);
            h.this.f6747k.remove(this.f6772a.f6777b);
            h.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.dispatchChangeStarting(this.f6772a.f6777b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.f0 f6782a;

        /* renamed from: b  reason: collision with root package name */
        public int f6783b;

        /* renamed from: c  reason: collision with root package name */
        public int f6784c;

        /* renamed from: d  reason: collision with root package name */
        public int f6785d;

        /* renamed from: e  reason: collision with root package name */
        public int f6786e;

        j(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
            this.f6782a = f0Var;
            this.f6783b = i10;
            this.f6784c = i11;
            this.f6785d = i12;
            this.f6786e = i13;
        }
    }

    private void animateRemoveImpl(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f6746j.add(f0Var);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new d(f0Var, animate, view)).start();
    }

    private void b(i iVar) {
        RecyclerView.f0 f0Var = iVar.f6776a;
        if (f0Var != null) {
            c(iVar, f0Var);
        }
        RecyclerView.f0 f0Var2 = iVar.f6777b;
        if (f0Var2 != null) {
            c(iVar, f0Var2);
        }
    }

    private boolean c(i iVar, RecyclerView.f0 f0Var) {
        boolean z10 = false;
        if (iVar.f6777b == f0Var) {
            iVar.f6777b = null;
        } else if (iVar.f6776a != f0Var) {
            return false;
        } else {
            iVar.f6776a = null;
            z10 = true;
        }
        f0Var.itemView.setAlpha(1.0f);
        f0Var.itemView.setTranslationX(0.0f);
        f0Var.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(f0Var, z10);
        return true;
    }

    private void endChangeAnimation(List<i> list, RecyclerView.f0 f0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (c(iVar, f0Var) && iVar.f6776a == null && iVar.f6777b == null) {
                list.remove(iVar);
            }
        }
    }

    private void resetAnimation(RecyclerView.f0 f0Var) {
        if (f6736l == null) {
            f6736l = new ValueAnimator().getInterpolator();
        }
        f0Var.itemView.animate().setInterpolator(f6736l);
        endAnimation(f0Var);
    }

    void a(i iVar) {
        View view;
        RecyclerView.f0 f0Var = iVar.f6776a;
        View view2 = null;
        if (f0Var == null) {
            view = null;
        } else {
            view = f0Var.itemView;
        }
        RecyclerView.f0 f0Var2 = iVar.f6777b;
        if (f0Var2 != null) {
            view2 = f0Var2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.f6747k.add(iVar.f6776a);
            duration.translationX(iVar.f6780e - iVar.f6778c);
            duration.translationY(iVar.f6781f - iVar.f6779d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f6747k.add(iVar.f6777b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C0157h(iVar, animate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.y
    @SuppressLint({"UnknownNullness"})
    public boolean animateAdd(RecyclerView.f0 f0Var) {
        resetAnimation(f0Var);
        f0Var.itemView.setAlpha(0.0f);
        this.f6738b.add(f0Var);
        return true;
    }

    void animateAddImpl(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f6744h.add(f0Var);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new e(f0Var, view, animate)).start();
    }

    @Override // androidx.recyclerview.widget.y
    @SuppressLint({"UnknownNullness"})
    public boolean animateChange(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
        if (f0Var == f0Var2) {
            return animateMove(f0Var, i10, i11, i12, i13);
        }
        float translationX = f0Var.itemView.getTranslationX();
        float translationY = f0Var.itemView.getTranslationY();
        float alpha = f0Var.itemView.getAlpha();
        resetAnimation(f0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        f0Var.itemView.setTranslationX(translationX);
        f0Var.itemView.setTranslationY(translationY);
        f0Var.itemView.setAlpha(alpha);
        if (f0Var2 != null) {
            resetAnimation(f0Var2);
            f0Var2.itemView.setTranslationX(-i14);
            f0Var2.itemView.setTranslationY(-i15);
            f0Var2.itemView.setAlpha(0.0f);
        }
        this.f6740d.add(new i(f0Var, f0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.y
    @SuppressLint({"UnknownNullness"})
    public boolean animateMove(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        View view = f0Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) f0Var.itemView.getTranslationY());
        resetAnimation(f0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            dispatchMoveFinished(f0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f6739c.add(new j(f0Var, translationX, translationY, i12, i13));
        return true;
    }

    void animateMoveImpl(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        View view = f0Var.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f6745i.add(f0Var);
        animate.setDuration(getMoveDuration()).setListener(new f(f0Var, i14, view, i15, animate)).start();
    }

    @Override // androidx.recyclerview.widget.y
    @SuppressLint({"UnknownNullness"})
    public boolean animateRemove(RecyclerView.f0 f0Var) {
        resetAnimation(f0Var);
        this.f6737a.add(f0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canReuseUpdatedViewHolder(RecyclerView.f0 f0Var, List<Object> list) {
        if (list.isEmpty() && !super.canReuseUpdatedViewHolder(f0Var, list)) {
            return false;
        }
        return true;
    }

    void cancelAll(List<RecyclerView.f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public void endAnimation(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        view.animate().cancel();
        int size = this.f6739c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f6739c.get(size).f6782a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(f0Var);
                this.f6739c.remove(size);
            }
        }
        endChangeAnimation(this.f6740d, f0Var);
        if (this.f6737a.remove(f0Var)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(f0Var);
        }
        if (this.f6738b.remove(f0Var)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(f0Var);
        }
        for (int size2 = this.f6743g.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f6743g.get(size2);
            endChangeAnimation(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.f6743g.remove(size2);
            }
        }
        for (int size3 = this.f6742f.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f6742f.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f6782a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(f0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f6742f.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f6741e.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.f0> arrayList3 = this.f6741e.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(f0Var);
                if (arrayList3.isEmpty()) {
                    this.f6741e.remove(size5);
                }
            }
        }
        this.f6746j.remove(f0Var);
        this.f6744h.remove(f0Var);
        this.f6747k.remove(f0Var);
        this.f6745i.remove(f0Var);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimations() {
        int size = this.f6739c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f6739c.get(size);
            View view = jVar.f6782a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(jVar.f6782a);
            this.f6739c.remove(size);
        }
        for (int size2 = this.f6737a.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.f6737a.get(size2));
            this.f6737a.remove(size2);
        }
        int size3 = this.f6738b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = this.f6738b.get(size3);
            f0Var.itemView.setAlpha(1.0f);
            dispatchAddFinished(f0Var);
            this.f6738b.remove(size3);
        }
        for (int size4 = this.f6740d.size() - 1; size4 >= 0; size4--) {
            b(this.f6740d.get(size4));
        }
        this.f6740d.clear();
        if (!isRunning()) {
            return;
        }
        for (int size5 = this.f6742f.size() - 1; size5 >= 0; size5--) {
            ArrayList<j> arrayList = this.f6742f.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                j jVar2 = arrayList.get(size6);
                View view2 = jVar2.f6782a.itemView;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                dispatchMoveFinished(jVar2.f6782a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.f6742f.remove(arrayList);
                }
            }
        }
        for (int size7 = this.f6741e.size() - 1; size7 >= 0; size7--) {
            ArrayList<RecyclerView.f0> arrayList2 = this.f6741e.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.f0 f0Var2 = arrayList2.get(size8);
                f0Var2.itemView.setAlpha(1.0f);
                dispatchAddFinished(f0Var2);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.f6741e.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.f6743g.size() - 1; size9 >= 0; size9--) {
            ArrayList<i> arrayList3 = this.f6743g.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                b(arrayList3.get(size10));
                if (arrayList3.isEmpty()) {
                    this.f6743g.remove(arrayList3);
                }
            }
        }
        cancelAll(this.f6746j);
        cancelAll(this.f6745i);
        cancelAll(this.f6744h);
        cancelAll(this.f6747k);
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean isRunning() {
        if (this.f6738b.isEmpty() && this.f6740d.isEmpty() && this.f6739c.isEmpty() && this.f6737a.isEmpty() && this.f6745i.isEmpty() && this.f6746j.isEmpty() && this.f6744h.isEmpty() && this.f6747k.isEmpty() && this.f6742f.isEmpty() && this.f6741e.isEmpty() && this.f6743g.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void runPendingAnimations() {
        long j10;
        long j11;
        boolean z10 = !this.f6737a.isEmpty();
        boolean z11 = !this.f6739c.isEmpty();
        boolean z12 = !this.f6740d.isEmpty();
        boolean z13 = !this.f6738b.isEmpty();
        if (!z10 && !z11 && !z13 && !z12) {
            return;
        }
        Iterator<RecyclerView.f0> it = this.f6737a.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.f6737a.clear();
        if (z11) {
            ArrayList<j> arrayList = new ArrayList<>();
            arrayList.addAll(this.f6739c);
            this.f6742f.add(arrayList);
            this.f6739c.clear();
            a aVar = new a(arrayList);
            if (z10) {
                p0.n0(arrayList.get(0).f6782a.itemView, aVar, getRemoveDuration());
            } else {
                aVar.run();
            }
        }
        if (z12) {
            ArrayList<i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f6740d);
            this.f6743g.add(arrayList2);
            this.f6740d.clear();
            b bVar = new b(arrayList2);
            if (z10) {
                p0.n0(arrayList2.get(0).f6776a.itemView, bVar, getRemoveDuration());
            } else {
                bVar.run();
            }
        }
        if (z13) {
            ArrayList<RecyclerView.f0> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.f6738b);
            this.f6741e.add(arrayList3);
            this.f6738b.clear();
            c cVar = new c(arrayList3);
            if (!z10 && !z11 && !z12) {
                cVar.run();
                return;
            }
            long j12 = 0;
            if (z10) {
                j10 = getRemoveDuration();
            } else {
                j10 = 0;
            }
            if (z11) {
                j11 = getMoveDuration();
            } else {
                j11 = 0;
            }
            if (z12) {
                j12 = getChangeDuration();
            }
            p0.n0(arrayList3.get(0).itemView, cVar, j10 + Math.max(j11, j12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.f0 f6776a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.f0 f6777b;

        /* renamed from: c  reason: collision with root package name */
        public int f6778c;

        /* renamed from: d  reason: collision with root package name */
        public int f6779d;

        /* renamed from: e  reason: collision with root package name */
        public int f6780e;

        /* renamed from: f  reason: collision with root package name */
        public int f6781f;

        private i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.f6776a = f0Var;
            this.f6777b = f0Var2;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f6776a + ", newHolder=" + this.f6777b + ", fromX=" + this.f6778c + ", fromY=" + this.f6779d + ", toX=" + this.f6780e + ", toY=" + this.f6781f + '}';
        }

        i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
            this(f0Var, f0Var2);
            this.f6778c = i10;
            this.f6779d = i11;
            this.f6780e = i12;
            this.f6781f = i13;
        }
    }
}
