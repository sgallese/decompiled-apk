package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import f3.b;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    private static boolean S = false;
    private androidx.activity.result.b<Intent> D;
    private androidx.activity.result.b<IntentSenderRequest> E;
    private androidx.activity.result.b<String[]> F;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList<androidx.fragment.app.a> M;
    private ArrayList<Boolean> N;
    private ArrayList<Fragment> O;
    private e0 P;
    private b.c Q;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4589b;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f4591d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f4592e;

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f4594g;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<l> f4600m;

    /* renamed from: v  reason: collision with root package name */
    private v<?> f4609v;

    /* renamed from: w  reason: collision with root package name */
    private s f4610w;

    /* renamed from: x  reason: collision with root package name */
    private Fragment f4611x;

    /* renamed from: y  reason: collision with root package name */
    Fragment f4612y;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<m> f4588a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final j0 f4590c = new j0();

    /* renamed from: f  reason: collision with root package name */
    private final w f4593f = new w(this);

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.m f4595h = new b(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f4596i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    private final Map<String, BackStackState> f4597j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Bundle> f4598k = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, Object> f4599l = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    private final x f4601n = new x(this);

    /* renamed from: o  reason: collision with root package name */
    private final CopyOnWriteArrayList<f0> f4602o = new CopyOnWriteArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    private final androidx.core.util.a<Configuration> f4603p = new androidx.core.util.a() { // from class: androidx.fragment.app.y
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            FragmentManager.this.V0((Configuration) obj);
        }
    };

    /* renamed from: q  reason: collision with root package name */
    private final androidx.core.util.a<Integer> f4604q = new androidx.core.util.a() { // from class: androidx.fragment.app.z
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            FragmentManager.this.W0((Integer) obj);
        }
    };

    /* renamed from: r  reason: collision with root package name */
    private final androidx.core.util.a<androidx.core.app.j> f4605r = new androidx.core.util.a() { // from class: androidx.fragment.app.a0
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            FragmentManager.this.X0((androidx.core.app.j) obj);
        }
    };

    /* renamed from: s  reason: collision with root package name */
    private final androidx.core.util.a<androidx.core.app.v> f4606s = new androidx.core.util.a() { // from class: androidx.fragment.app.b0
        @Override // androidx.core.util.a
        public final void a(Object obj) {
            FragmentManager.this.Y0((androidx.core.app.v) obj);
        }
    };

    /* renamed from: t  reason: collision with root package name */
    private final androidx.core.view.a0 f4607t = new c();

    /* renamed from: u  reason: collision with root package name */
    int f4608u = -1;

    /* renamed from: z  reason: collision with root package name */
    private u f4613z = null;
    private u A = new d();
    private v0 B = null;
    private v0 C = new e();
    ArrayDeque<LaunchedFragmentInfo> G = new ArrayDeque<>();
    private Runnable R = new f();

    /* renamed from: androidx.fragment.app.FragmentManager$6  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass6 implements androidx.lifecycle.s {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f4614f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.p f4615m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ FragmentManager f4616p;

        @Override // androidx.lifecycle.s
        public void c(androidx.lifecycle.v vVar, p.a aVar) {
            if (aVar == p.a.ON_START && ((Bundle) this.f4616p.f4598k.get(this.f4614f)) != null) {
                throw null;
            }
            if (aVar == p.a.ON_DESTROY) {
                this.f4615m.d(this);
                this.f4616p.f4599l.remove(this.f4614f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.a<Map<String, Boolean>> {
        a() {
        }

        @Override // androidx.activity.result.a
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            int i10;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((Boolean) arrayList.get(i11)).booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                iArr[i11] = i10;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f4617f;
            int i12 = pollFirst.f4618m;
            Fragment i13 = FragmentManager.this.f4590c.i(str);
            if (i13 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i13.onRequestPermissionsResult(i12, strArr, iArr);
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.activity.m {
        b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.m
        public void b() {
            FragmentManager.this.I0();
        }
    }

    /* loaded from: classes.dex */
    class c implements androidx.core.view.a0 {
        c() {
        }

        @Override // androidx.core.view.a0
        public boolean a(MenuItem menuItem) {
            return FragmentManager.this.L(menuItem);
        }

        @Override // androidx.core.view.a0
        public void b(Menu menu) {
            FragmentManager.this.M(menu);
        }

        @Override // androidx.core.view.a0
        public void c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.E(menu, menuInflater);
        }

        @Override // androidx.core.view.a0
        public void d(Menu menu) {
            FragmentManager.this.Q(menu);
        }
    }

    /* loaded from: classes.dex */
    class d extends u {
        d() {
        }

        @Override // androidx.fragment.app.u
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.z0().b(FragmentManager.this.z0().f(), str, null);
        }
    }

    /* loaded from: classes.dex */
    class e implements v0 {
        e() {
        }

        @Override // androidx.fragment.app.v0
        public t0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.i(viewGroup);
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.c0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements f0 {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Fragment f4625f;

        g(Fragment fragment) {
            this.f4625f = fragment;
        }

        @Override // androidx.fragment.app.f0
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f4625f.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements androidx.activity.result.a<ActivityResult> {
        h() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollLast = FragmentManager.this.G.pollLast();
            if (pollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollLast.f4617f;
            int i10 = pollLast.f4618m;
            Fragment i11 = FragmentManager.this.f4590c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i11.onActivityResult(i10, activityResult.b(), activityResult.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements androidx.activity.result.a<ActivityResult> {
        i() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f4617f;
            int i10 = pollFirst.f4618m;
            Fragment i11 = FragmentManager.this.f4590c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i11.onActivityResult(i10, activityResult.b(), activityResult.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j extends f.a<IntentSenderRequest, ActivityResult> {
        j() {
        }

        @Override // f.a
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a10 = intentSenderRequest.a();
            if (a10 != null && (bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.d()).b(null).c(intentSenderRequest.c(), intentSenderRequest.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.M0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // f.a
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i10, Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        void a(Fragment fragment, boolean z10);

        void b(Fragment fragment, boolean z10);

        void c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface m {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    private class n implements m {

        /* renamed from: a  reason: collision with root package name */
        final String f4629a;

        /* renamed from: b  reason: collision with root package name */
        final int f4630b;

        /* renamed from: c  reason: collision with root package name */
        final int f4631c;

        n(String str, int i10, int i11) {
            this.f4629a = str;
            this.f4630b = i10;
            this.f4631c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f4612y;
            if (fragment != null && this.f4630b < 0 && this.f4629a == null && fragment.getChildFragmentManager().j1()) {
                return false;
            }
            return FragmentManager.this.m1(arrayList, arrayList2, this.f4629a, this.f4630b, this.f4631c);
        }
    }

    /* loaded from: classes.dex */
    private class o implements m {

        /* renamed from: a  reason: collision with root package name */
        private final String f4633a;

        o(String str) {
            this.f4633a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.u1(arrayList, arrayList2, this.f4633a);
        }
    }

    /* loaded from: classes.dex */
    private class p implements m {

        /* renamed from: a  reason: collision with root package name */
        private final String f4635a;

        p(String str) {
            this.f4635a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.z1(arrayList, arrayList2, this.f4635a);
        }
    }

    private void F1(Fragment fragment) {
        ViewGroup v02 = v0(fragment);
        if (v02 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            int i10 = e3.b.f14020c;
            if (v02.getTag(i10) == null) {
                v02.setTag(i10, fragment);
            }
            ((Fragment) v02.getTag(i10)).setPopDirection(fragment.getPopDirection());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Fragment G0(View view) {
        Object tag = view.getTag(e3.b.f14018a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void H1() {
        Iterator<h0> it = this.f4590c.k().iterator();
        while (it.hasNext()) {
            f1(it.next());
        }
    }

    private void I1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new q0("FragmentManager"));
        v<?> vVar = this.f4609v;
        if (vVar != null) {
            try {
                vVar.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            Y("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    private void K1() {
        synchronized (this.f4588a) {
            boolean z10 = true;
            if (!this.f4588a.isEmpty()) {
                this.f4595h.f(true);
                return;
            }
            androidx.activity.m mVar = this.f4595h;
            if (r0() <= 0 || !R0(this.f4611x)) {
                z10 = false;
            }
            mVar.f(z10);
        }
    }

    public static boolean M0(int i10) {
        if (!S && !Log.isLoggable("FragmentManager", i10)) {
            return false;
        }
        return true;
    }

    private void N(Fragment fragment) {
        if (fragment != null && fragment.equals(g0(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    private boolean N0(Fragment fragment) {
        if ((fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.r()) {
            return true;
        }
        return false;
    }

    private boolean O0() {
        Fragment fragment = this.f4611x;
        if (fragment == null) {
            return true;
        }
        if (fragment.isAdded() && this.f4611x.getParentFragmentManager().O0()) {
            return true;
        }
        return false;
    }

    private void U(int i10) {
        try {
            this.f4589b = true;
            this.f4590c.d(i10);
            c1(i10, false);
            Iterator<t0> it = v().iterator();
            while (it.hasNext()) {
                it.next().n();
            }
            this.f4589b = false;
            c0(true);
        } catch (Throwable th) {
            this.f4589b = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(Configuration configuration) {
        if (O0()) {
            B(configuration, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0(Integer num) {
        if (O0() && num.intValue() == 80) {
            H(false);
        }
    }

    private void X() {
        if (this.L) {
            this.L = false;
            H1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(androidx.core.app.j jVar) {
        if (O0()) {
            I(jVar.a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0(androidx.core.app.v vVar) {
        if (O0()) {
            P(vVar.a(), false);
        }
    }

    private void Z() {
        Iterator<t0> it = v().iterator();
        while (it.hasNext()) {
            it.next().n();
        }
    }

    private void b0(boolean z10) {
        if (!this.f4589b) {
            if (this.f4609v == null) {
                if (this.K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f4609v.g().getLooper()) {
                if (!z10) {
                    s();
                }
                if (this.M == null) {
                    this.M = new ArrayList<>();
                    this.N = new ArrayList<>();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private static void e0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.y(-1);
                aVar.E();
            } else {
                aVar.y(1);
                aVar.D();
            }
            i10++;
        }
    }

    private void f0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        ArrayList<l> arrayList3;
        boolean z10 = arrayList.get(i10).f4748r;
        ArrayList<Fragment> arrayList4 = this.O;
        if (arrayList4 == null) {
            this.O = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.O.addAll(this.f4590c.o());
        Fragment D0 = D0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            if (!arrayList2.get(i12).booleanValue()) {
                D0 = aVar.F(this.O, D0);
            } else {
                D0 = aVar.I(this.O, D0);
            }
            if (!z11 && !aVar.f4739i) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        this.O.clear();
        if (!z10 && this.f4608u >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator<k0.a> it = arrayList.get(i13).f4733c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f4751b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f4590c.r(x(fragment));
                    }
                }
            }
        }
        e0(arrayList, arrayList2, i10, i11);
        boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
        if (z11 && (arrayList3 = this.f4600m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<androidx.fragment.app.a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(o0(it2.next()));
            }
            Iterator<l> it3 = this.f4600m.iterator();
            while (it3.hasNext()) {
                l next = it3.next();
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    next.b((Fragment) it4.next(), booleanValue);
                }
            }
            Iterator<l> it5 = this.f4600m.iterator();
            while (it5.hasNext()) {
                l next2 = it5.next();
                Iterator it6 = linkedHashSet.iterator();
                while (it6.hasNext()) {
                    next2.a((Fragment) it6.next(), booleanValue);
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i14);
            if (booleanValue) {
                for (int size = aVar2.f4733c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = aVar2.f4733c.get(size).f4751b;
                    if (fragment2 != null) {
                        x(fragment2).m();
                    }
                }
            } else {
                Iterator<k0.a> it7 = aVar2.f4733c.iterator();
                while (it7.hasNext()) {
                    Fragment fragment3 = it7.next().f4751b;
                    if (fragment3 != null) {
                        x(fragment3).m();
                    }
                }
            }
        }
        c1(this.f4608u, true);
        for (t0 t0Var : w(arrayList, i10, i11)) {
            t0Var.v(booleanValue);
            t0Var.t();
            t0Var.k();
        }
        while (i10 < i11) {
            androidx.fragment.app.a aVar3 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && aVar3.f4660v >= 0) {
                aVar3.f4660v = -1;
            }
            aVar3.H();
            i10++;
        }
        if (z11) {
            s1();
        }
    }

    private int h0(String str, int i10, boolean z10) {
        ArrayList<androidx.fragment.app.a> arrayList = this.f4591d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f4591d.size() - 1;
        }
        int size = this.f4591d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f4591d.get(size);
            if ((str != null && str.equals(aVar.G())) || (i10 >= 0 && i10 == aVar.f4660v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z10) {
            while (size > 0) {
                androidx.fragment.app.a aVar2 = this.f4591d.get(size - 1);
                if ((str != null && str.equals(aVar2.G())) || (i10 >= 0 && i10 == aVar2.f4660v)) {
                    size--;
                } else {
                    return size;
                }
            }
            return size;
        } else if (size == this.f4591d.size() - 1) {
            return -1;
        } else {
            return size + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FragmentManager l0(View view) {
        q qVar;
        Fragment m02 = m0(view);
        if (m02 != null) {
            if (m02.isAdded()) {
                return m02.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + m02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof q) {
                    qVar = (q) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                qVar = null;
                break;
            }
        }
        if (qVar != null) {
            return qVar.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private boolean l1(String str, int i10, int i11) {
        c0(false);
        b0(true);
        Fragment fragment = this.f4612y;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().j1()) {
            return true;
        }
        boolean m12 = m1(this.M, this.N, str, i10, i11);
        if (m12) {
            this.f4589b = true;
            try {
                q1(this.M, this.N);
            } finally {
                t();
            }
        }
        K1();
        X();
        this.f4590c.b();
        return m12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Fragment m0(View view) {
        while (view != null) {
            Fragment G0 = G0(view);
            if (G0 != null) {
                return G0;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    private void n0() {
        Iterator<t0> it = v().iterator();
        while (it.hasNext()) {
            it.next().o();
        }
    }

    private Set<Fragment> o0(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f4733c.size(); i10++) {
            Fragment fragment = aVar.f4733c.get(i10).f4751b;
            if (fragment != null && aVar.f4739i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    private boolean p0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f4588a) {
            if (this.f4588a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f4588a.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    z10 |= this.f4588a.get(i10).a(arrayList, arrayList2);
                }
                return z10;
            } finally {
                this.f4588a.clear();
                this.f4609v.g().removeCallbacks(this.R);
            }
        }
    }

    private void q1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                if (!arrayList.get(i10).f4748r) {
                    if (i11 != i10) {
                        f0(arrayList, arrayList2, i11, i10);
                    }
                    i11 = i10 + 1;
                    if (arrayList2.get(i10).booleanValue()) {
                        while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f4748r) {
                            i11++;
                        }
                    }
                    f0(arrayList, arrayList2, i10, i11);
                    i10 = i11 - 1;
                }
                i10++;
            }
            if (i11 != size) {
                f0(arrayList, arrayList2, i11, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    private void s() {
        if (!T0()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private e0 s0(Fragment fragment) {
        return this.P.g(fragment);
    }

    private void s1() {
        if (this.f4600m != null) {
            for (int i10 = 0; i10 < this.f4600m.size(); i10++) {
                this.f4600m.get(i10).c();
            }
        }
    }

    private void t() {
        this.f4589b = false;
        this.N.clear();
        this.M.clear();
    }

    private void u() {
        boolean z10;
        v<?> vVar = this.f4609v;
        if (vVar instanceof c1) {
            z10 = this.f4590c.p().k();
        } else if (vVar.f() instanceof Activity) {
            z10 = !((Activity) this.f4609v.f()).isChangingConfigurations();
        } else {
            z10 = true;
        }
        if (z10) {
            Iterator<BackStackState> it = this.f4597j.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f4540f.iterator();
                while (it2.hasNext()) {
                    this.f4590c.p().d(it2.next());
                }
            }
        }
    }

    private Set<t0> v() {
        HashSet hashSet = new HashSet();
        Iterator<h0> it = this.f4590c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(t0.s(viewGroup, E0()));
            }
        }
        return hashSet;
    }

    private ViewGroup v0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f4610w.d()) {
            View c10 = this.f4610w.c(fragment.mContainerId);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    private Set<t0> w(ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<k0.a> it = arrayList.get(i10).f4733c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f4751b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(t0.r(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 8194) {
            if (i10 == 8197) {
                return 4100;
            }
            if (i10 != 4099) {
                if (i10 != 4100) {
                    return 0;
                }
                return 8197;
            }
            return 4099;
        }
        return 4097;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        this.I = false;
        this.J = false;
        this.P.m(false);
        U(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 A0() {
        return this.f4593f;
    }

    public Fragment.SavedState A1(Fragment fragment) {
        h0 n10 = this.f4590c.n(fragment.mWho);
        if (n10 == null || !n10.k().equals(fragment)) {
            I1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return n10.q();
    }

    void B(Configuration configuration, boolean z10) {
        if (z10 && (this.f4609v instanceof androidx.core.content.c)) {
            I1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f4590c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.B(configuration, true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x B0() {
        return this.f4601n;
    }

    void B1() {
        synchronized (this.f4588a) {
            boolean z10 = true;
            if (this.f4588a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f4609v.g().removeCallbacks(this.R);
                this.f4609v.g().post(this.R);
                K1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean C(MenuItem menuItem) {
        if (this.f4608u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4590c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment C0() {
        return this.f4611x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C1(Fragment fragment, boolean z10) {
        ViewGroup v02 = v0(fragment);
        if (v02 != null && (v02 instanceof FragmentContainerView)) {
            ((FragmentContainerView) v02).setDrawDisappearingViewsLast(!z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        this.I = false;
        this.J = false;
        this.P.m(false);
        U(1);
    }

    public Fragment D0() {
        return this.f4612y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D1(Fragment fragment, p.b bVar) {
        if (fragment.equals(g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.f4608u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f4590c.o()) {
            if (fragment != null && Q0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f4592e != null) {
            for (int i10 = 0; i10 < this.f4592e.size(); i10++) {
                Fragment fragment2 = this.f4592e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4592e = arrayList;
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0 E0() {
        v0 v0Var = this.B;
        if (v0Var != null) {
            return v0Var;
        }
        Fragment fragment = this.f4611x;
        if (fragment != null) {
            return fragment.mFragmentManager.E0();
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(g0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f4612y;
        this.f4612y = fragment;
        N(fragment2);
        N(this.f4612y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        this.K = true;
        c0(true);
        Z();
        u();
        U(-1);
        v<?> vVar = this.f4609v;
        if (vVar instanceof androidx.core.content.d) {
            ((androidx.core.content.d) vVar).removeOnTrimMemoryListener(this.f4604q);
        }
        v<?> vVar2 = this.f4609v;
        if (vVar2 instanceof androidx.core.content.c) {
            ((androidx.core.content.c) vVar2).removeOnConfigurationChangedListener(this.f4603p);
        }
        v<?> vVar3 = this.f4609v;
        if (vVar3 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) vVar3).removeOnMultiWindowModeChangedListener(this.f4605r);
        }
        v<?> vVar4 = this.f4609v;
        if (vVar4 instanceof androidx.core.app.t) {
            ((androidx.core.app.t) vVar4).removeOnPictureInPictureModeChangedListener(this.f4606s);
        }
        v<?> vVar5 = this.f4609v;
        if ((vVar5 instanceof androidx.core.view.u) && this.f4611x == null) {
            ((androidx.core.view.u) vVar5).removeMenuProvider(this.f4607t);
        }
        this.f4609v = null;
        this.f4610w = null;
        this.f4611x = null;
        if (this.f4594g != null) {
            this.f4595h.d();
            this.f4594g = null;
        }
        androidx.activity.result.b<Intent> bVar = this.D;
        if (bVar != null) {
            bVar.c();
            this.E.c();
            this.F.c();
        }
    }

    public b.c F0() {
        return this.Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        U(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G1(Fragment fragment) {
        if (M0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    void H(boolean z10) {
        if (z10 && (this.f4609v instanceof androidx.core.content.d)) {
            I1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f4590c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.H(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1 H0(Fragment fragment) {
        return this.P.j(fragment);
    }

    void I(boolean z10, boolean z11) {
        if (z11 && (this.f4609v instanceof androidx.core.app.s)) {
            I1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f4590c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.I(z10, true);
                }
            }
        }
    }

    void I0() {
        c0(true);
        if (this.f4595h.c()) {
            j1();
        } else {
            this.f4594g.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(Fragment fragment) {
        Iterator<f0> it = this.f4602o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J0(Fragment fragment) {
        if (M0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            F1(fragment);
        }
    }

    public void J1(k kVar) {
        this.f4601n.p(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K() {
        for (Fragment fragment : this.f4590c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.K();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K0(Fragment fragment) {
        if (fragment.mAdded && N0(fragment)) {
            this.H = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean L(MenuItem menuItem) {
        if (this.f4608u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4590c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean L0() {
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(Menu menu) {
        if (this.f4608u < 1) {
            return;
        }
        for (Fragment fragment : this.f4590c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O() {
        U(5);
    }

    void P(boolean z10, boolean z11) {
        if (z11 && (this.f4609v instanceof androidx.core.app.t)) {
            I1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f4590c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.P(z10, true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean P0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Q(Menu menu) {
        boolean z10 = false;
        if (this.f4608u < 1) {
            return false;
        }
        for (Fragment fragment : this.f4590c.o()) {
            if (fragment != null && Q0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Q0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R() {
        K1();
        N(this.f4612y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean R0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragment.equals(fragmentManager.D0()) && R0(fragmentManager.f4611x)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S() {
        this.I = false;
        this.J = false;
        this.P.m(false);
        U(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean S0(int i10) {
        if (this.f4608u >= i10) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T() {
        this.I = false;
        this.J = false;
        this.P.m(false);
        U(5);
    }

    public boolean T0() {
        if (!this.I && !this.J) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V() {
        this.J = true;
        this.P.m(true);
        U(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W() {
        U(2);
    }

    public void Y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f4590c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f4592e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment = this.f4592e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f4591d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                androidx.fragment.app.a aVar = this.f4591d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.B(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4596i.get());
        synchronized (this.f4588a) {
            int size3 = this.f4588a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    m mVar = this.f4588a.get(i12);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(mVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4609v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4610w);
        if (this.f4611x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4611x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4608u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z0(Fragment fragment, String[] strArr, int i10) {
        if (this.F != null) {
            this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
            this.F.a(strArr);
            return;
        }
        this.f4609v.k(fragment, strArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0(m mVar, boolean z10) {
        if (!z10) {
            if (this.f4609v == null) {
                if (this.K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            s();
        }
        synchronized (this.f4588a) {
            if (this.f4609v == null) {
                if (z10) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            this.f4588a.add(mVar);
            B1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a1(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.D != null) {
            this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.D.a(intent);
            return;
        }
        this.f4609v.m(fragment, intent, i10, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b1(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.E != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (M0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            } else {
                intent2 = intent;
            }
            IntentSenderRequest a10 = new IntentSenderRequest.a(intentSender).b(intent2).c(i12, i11).a();
            this.G.addLast(new LaunchedFragmentInfo(fragment.mWho, i10));
            if (M0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.E.a(a10);
            return;
        }
        this.f4609v.n(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c0(boolean z10) {
        b0(z10);
        boolean z11 = false;
        while (p0(this.M, this.N)) {
            z11 = true;
            this.f4589b = true;
            try {
                q1(this.M, this.N);
            } finally {
                t();
            }
        }
        K1();
        X();
        this.f4590c.b();
        return z11;
    }

    void c1(int i10, boolean z10) {
        v<?> vVar;
        if (this.f4609v == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z10 && i10 == this.f4608u) {
            return;
        }
        this.f4608u = i10;
        this.f4590c.t();
        H1();
        if (this.H && (vVar = this.f4609v) != null && this.f4608u == 7) {
            vVar.o();
            this.H = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(m mVar, boolean z10) {
        if (z10 && (this.f4609v == null || this.K)) {
            return;
        }
        b0(z10);
        if (mVar.a(this.M, this.N)) {
            this.f4589b = true;
            try {
                q1(this.M, this.N);
            } finally {
                t();
            }
        }
        K1();
        X();
        this.f4590c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d1() {
        if (this.f4609v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.m(false);
        for (Fragment fragment : this.f4590c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1(FragmentContainerView fragmentContainerView) {
        View view;
        for (h0 h0Var : this.f4590c.k()) {
            Fragment k10 = h0Var.k();
            if (k10.mContainerId == fragmentContainerView.getId() && (view = k10.mView) != null && view.getParent() == null) {
                k10.mContainer = fragmentContainerView;
                h0Var.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f1(h0 h0Var) {
        Fragment k10 = h0Var.k();
        if (k10.mDeferStart) {
            if (this.f4589b) {
                this.L = true;
                return;
            }
            k10.mDeferStart = false;
            h0Var.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g0(String str) {
        return this.f4590c.f(str);
    }

    public void g1() {
        a0(new n(null, -1, 0), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            a0(new n(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(androidx.fragment.app.a aVar) {
        if (this.f4591d == null) {
            this.f4591d = new ArrayList<>();
        }
        this.f4591d.add(aVar);
    }

    public Fragment i0(int i10) {
        return this.f4590c.g(i10);
    }

    public void i1(String str, int i10) {
        a0(new n(str, -1, i10), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0 j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            f3.b.f(fragment, str);
        }
        if (M0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        h0 x10 = x(fragment);
        fragment.mFragmentManager = this;
        this.f4590c.r(x10);
        if (!fragment.mDetached) {
            this.f4590c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (N0(fragment)) {
                this.H = true;
            }
        }
        return x10;
    }

    public Fragment j0(String str) {
        return this.f4590c.h(str);
    }

    public boolean j1() {
        return l1(null, -1, 0);
    }

    public void k(f0 f0Var) {
        this.f4602o.add(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment k0(String str) {
        return this.f4590c.i(str);
    }

    public boolean k1(int i10, int i11) {
        if (i10 >= 0) {
            return l1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public void l(l lVar) {
        if (this.f4600m == null) {
            this.f4600m = new ArrayList<>();
        }
        this.f4600m.add(lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Fragment fragment) {
        this.P.b(fragment);
    }

    boolean m1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        boolean z10;
        if ((i11 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int h02 = h0(str, i10, z10);
        if (h02 < 0) {
            return false;
        }
        for (int size = this.f4591d.size() - 1; size >= h02; size--) {
            arrayList.add(this.f4591d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f4596i.getAndIncrement();
    }

    public void n1(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            I1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SyntheticAccessor"})
    public void o(v<?> vVar, s sVar, Fragment fragment) {
        String str;
        if (this.f4609v == null) {
            this.f4609v = vVar;
            this.f4610w = sVar;
            this.f4611x = fragment;
            if (fragment != null) {
                k(new g(fragment));
            } else if (vVar instanceof f0) {
                k((f0) vVar);
            }
            if (this.f4611x != null) {
                K1();
            }
            if (vVar instanceof androidx.activity.o) {
                androidx.activity.o oVar = (androidx.activity.o) vVar;
                OnBackPressedDispatcher onBackPressedDispatcher = oVar.getOnBackPressedDispatcher();
                this.f4594g = onBackPressedDispatcher;
                androidx.lifecycle.v vVar2 = oVar;
                if (fragment != null) {
                    vVar2 = fragment;
                }
                onBackPressedDispatcher.b(vVar2, this.f4595h);
            }
            if (fragment != null) {
                this.P = fragment.mFragmentManager.s0(fragment);
            } else if (vVar instanceof c1) {
                this.P = e0.h(((c1) vVar).getViewModelStore());
            } else {
                this.P = new e0(false);
            }
            this.P.m(T0());
            this.f4590c.A(this.P);
            v<?> vVar3 = this.f4609v;
            if ((vVar3 instanceof w3.d) && fragment == null) {
                androidx.savedstate.a savedStateRegistry = ((w3.d) vVar3).getSavedStateRegistry();
                savedStateRegistry.h("android:support:fragments", new a.c() { // from class: androidx.fragment.app.c0
                    @Override // androidx.savedstate.a.c
                    public final Bundle saveState() {
                        Bundle U0;
                        U0 = FragmentManager.this.U0();
                        return U0;
                    }
                });
                Bundle b10 = savedStateRegistry.b("android:support:fragments");
                if (b10 != null) {
                    v1(b10);
                }
            }
            v<?> vVar4 = this.f4609v;
            if (vVar4 instanceof androidx.activity.result.c) {
                ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.c) vVar4).getActivityResultRegistry();
                if (fragment != null) {
                    str = fragment.mWho + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.D = activityResultRegistry.j(str2 + "StartActivityForResult", new f.d(), new h());
                this.E = activityResultRegistry.j(str2 + "StartIntentSenderForResult", new j(), new i());
                this.F = activityResultRegistry.j(str2 + "RequestPermissions", new f.b(), new a());
            }
            v<?> vVar5 = this.f4609v;
            if (vVar5 instanceof androidx.core.content.c) {
                ((androidx.core.content.c) vVar5).addOnConfigurationChangedListener(this.f4603p);
            }
            v<?> vVar6 = this.f4609v;
            if (vVar6 instanceof androidx.core.content.d) {
                ((androidx.core.content.d) vVar6).addOnTrimMemoryListener(this.f4604q);
            }
            v<?> vVar7 = this.f4609v;
            if (vVar7 instanceof androidx.core.app.s) {
                ((androidx.core.app.s) vVar7).addOnMultiWindowModeChangedListener(this.f4605r);
            }
            v<?> vVar8 = this.f4609v;
            if (vVar8 instanceof androidx.core.app.t) {
                ((androidx.core.app.t) vVar8).addOnPictureInPictureModeChangedListener(this.f4606s);
            }
            v<?> vVar9 = this.f4609v;
            if ((vVar9 instanceof androidx.core.view.u) && fragment == null) {
                ((androidx.core.view.u) vVar9).addMenuProvider(this.f4607t);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public void o1(k kVar, boolean z10) {
        this.f4601n.o(kVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Fragment fragment) {
        if (M0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f4590c.a(fragment);
                if (M0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (N0(fragment)) {
                    this.H = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p1(Fragment fragment) {
        if (M0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            this.f4590c.u(fragment);
            if (N0(fragment)) {
                this.H = true;
            }
            fragment.mRemoving = true;
            F1(fragment);
        }
    }

    public k0 q() {
        return new androidx.fragment.app.a(this);
    }

    List<Fragment> q0() {
        return this.f4590c.l();
    }

    boolean r() {
        boolean z10 = false;
        for (Fragment fragment : this.f4590c.l()) {
            if (fragment != null) {
                z10 = N0(fragment);
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public int r0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f4591d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r1(Fragment fragment) {
        this.P.l(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s t0() {
        return this.f4610w;
    }

    public void t1(String str) {
        a0(new o(str), false);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f4611x;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f4611x)));
            sb2.append("}");
        } else {
            v<?> vVar = this.f4609v;
            if (vVar != null) {
                sb2.append(vVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f4609v)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public Fragment u0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment g02 = g0(string);
        if (g02 == null) {
            I1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return g02;
    }

    boolean u1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str) {
        BackStackState remove = this.f4597j.remove(str);
        if (remove == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator<androidx.fragment.app.a> it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.a next = it.next();
            if (next.f4661w) {
                Iterator<k0.a> it2 = next.f4733c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = it2.next().f4751b;
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator<androidx.fragment.app.a> it3 = remove.a(this, hashMap).iterator();
        while (true) {
            boolean z10 = false;
            while (it3.hasNext()) {
                if (it3.next().a(arrayList, arrayList2) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v1(Parcelable parcelable) {
        h0 h0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f4609v.f().getClassLoader());
                this.f4598k.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> hashMap = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f4609v.f().getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        this.f4590c.x(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.f4590c.v();
        Iterator<String> it = fragmentManagerState.f4637f.iterator();
        while (it.hasNext()) {
            Bundle B = this.f4590c.B(it.next(), null);
            if (B != null) {
                Fragment f10 = this.P.f(((FragmentState) B.getParcelable("state")).f4646m);
                if (f10 != null) {
                    if (M0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + f10);
                    }
                    h0Var = new h0(this.f4601n, this.f4590c, f10, B);
                } else {
                    h0Var = new h0(this.f4601n, this.f4590c, this.f4609v.f().getClassLoader(), w0(), B);
                }
                Fragment k10 = h0Var.k();
                k10.mSavedFragmentState = B;
                k10.mFragmentManager = this;
                if (M0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k10.mWho + "): " + k10);
                }
                h0Var.o(this.f4609v.f().getClassLoader());
                this.f4590c.r(h0Var);
                h0Var.t(this.f4608u);
            }
        }
        for (Fragment fragment : this.P.i()) {
            if (!this.f4590c.c(fragment.mWho)) {
                if (M0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f4637f);
                }
                this.P.l(fragment);
                fragment.mFragmentManager = this;
                h0 h0Var2 = new h0(this.f4601n, this.f4590c, fragment);
                h0Var2.t(1);
                h0Var2.m();
                fragment.mRemoving = true;
                h0Var2.m();
            }
        }
        this.f4590c.w(fragmentManagerState.f4638m);
        if (fragmentManagerState.f4639p != null) {
            this.f4591d = new ArrayList<>(fragmentManagerState.f4639p.length);
            int i10 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f4639p;
                if (i10 >= backStackRecordStateArr.length) {
                    break;
                }
                androidx.fragment.app.a b10 = backStackRecordStateArr[i10].b(this);
                if (M0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + b10.f4660v + "): " + b10);
                    PrintWriter printWriter = new PrintWriter(new q0("FragmentManager"));
                    b10.C("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4591d.add(b10);
                i10++;
            }
        } else {
            this.f4591d = null;
        }
        this.f4596i.set(fragmentManagerState.f4640q);
        String str3 = fragmentManagerState.f4641r;
        if (str3 != null) {
            Fragment g02 = g0(str3);
            this.f4612y = g02;
            N(g02);
        }
        ArrayList<String> arrayList = fragmentManagerState.f4642s;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f4597j.put(arrayList.get(i11), fragmentManagerState.f4643t.get(i11));
            }
        }
        this.G = new ArrayDeque<>(fragmentManagerState.f4644u);
    }

    public u w0() {
        u uVar = this.f4613z;
        if (uVar != null) {
            return uVar;
        }
        Fragment fragment = this.f4611x;
        if (fragment != null) {
            return fragment.mFragmentManager.w0();
        }
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0 x(Fragment fragment) {
        h0 n10 = this.f4590c.n(fragment.mWho);
        if (n10 != null) {
            return n10;
        }
        h0 h0Var = new h0(this.f4601n, this.f4590c, fragment);
        h0Var.o(this.f4609v.f().getClassLoader());
        h0Var.t(this.f4608u);
        return h0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0 x0() {
        return this.f4590c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x1  reason: merged with bridge method [inline-methods] */
    public Bundle U0() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        n0();
        Z();
        c0(true);
        this.I = true;
        this.P.m(true);
        ArrayList<String> y10 = this.f4590c.y();
        HashMap<String, Bundle> m10 = this.f4590c.m();
        if (m10.isEmpty()) {
            if (M0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            ArrayList<String> z10 = this.f4590c.z();
            ArrayList<androidx.fragment.app.a> arrayList = this.f4591d;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i10 = 0; i10 < size; i10++) {
                    backStackRecordStateArr[i10] = new BackStackRecordState(this.f4591d.get(i10));
                    if (M0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f4591d.get(i10));
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f4637f = y10;
            fragmentManagerState.f4638m = z10;
            fragmentManagerState.f4639p = backStackRecordStateArr;
            fragmentManagerState.f4640q = this.f4596i.get();
            Fragment fragment = this.f4612y;
            if (fragment != null) {
                fragmentManagerState.f4641r = fragment.mWho;
            }
            fragmentManagerState.f4642s.addAll(this.f4597j.keySet());
            fragmentManagerState.f4643t.addAll(this.f4597j.values());
            fragmentManagerState.f4644u = new ArrayList<>(this.G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f4598k.keySet()) {
                bundle.putBundle("result_" + str, this.f4598k.get(str));
            }
            for (String str2 : m10.keySet()) {
                bundle.putBundle("fragment_" + str2, m10.get(str2));
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(Fragment fragment) {
        if (M0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (M0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f4590c.u(fragment);
                if (N0(fragment)) {
                    this.H = true;
                }
                F1(fragment);
            }
        }
    }

    public List<Fragment> y0() {
        return this.f4590c.o();
    }

    public void y1(String str) {
        a0(new p(str), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        this.I = false;
        this.J = false;
        this.P.m(false);
        U(4);
    }

    public v<?> z0() {
        return this.f4609v;
    }

    boolean z1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str) {
        String str2;
        String str3;
        int i10;
        int h02 = h0(str, -1, true);
        if (h02 < 0) {
            return false;
        }
        for (int i11 = h02; i11 < this.f4591d.size(); i11++) {
            androidx.fragment.app.a aVar = this.f4591d.get(i11);
            if (!aVar.f4748r) {
                I1(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i12 = h02; i12 < this.f4591d.size(); i12++) {
            androidx.fragment.app.a aVar2 = this.f4591d.get(i12);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<k0.a> it = aVar2.f4733c.iterator();
            while (it.hasNext()) {
                k0.a next = it.next();
                Fragment fragment = next.f4751b;
                if (fragment != null) {
                    if (!next.f4752c || (i10 = next.f4750a) == 1 || i10 == 2 || i10 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i13 = next.f4750a;
                    if (i13 == 1 || i13 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    str3 = " " + hashSet2.iterator().next();
                } else {
                    str3 = "s " + hashSet2;
                }
                sb2.append(str3);
                sb2.append(" in ");
                sb2.append(aVar2);
                sb2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                I1(new IllegalArgumentException(sb2.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("saveBackStack(\"");
                sb3.append(str);
                sb3.append("\") must not contain retained fragments. Found ");
                if (hashSet.contains(fragment2)) {
                    str2 = "direct reference to retained ";
                } else {
                    str2 = "retained child ";
                }
                sb3.append(str2);
                sb3.append("fragment ");
                sb3.append(fragment2);
                I1(new IllegalArgumentException(sb3.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.q0()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f4591d.size() - h02);
        for (int i14 = h02; i14 < this.f4591d.size(); i14++) {
            arrayList4.add(null);
        }
        BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
        for (int size = this.f4591d.size() - 1; size >= h02; size--) {
            androidx.fragment.app.a remove = this.f4591d.remove(size);
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(remove);
            aVar3.z();
            arrayList4.set(size - h02, new BackStackRecordState(aVar3));
            remove.f4661w = true;
            arrayList.add(remove);
            arrayList2.add(Boolean.TRUE);
        }
        this.f4597j.put(str, backStackState);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        String f4617f;

        /* renamed from: m  reason: collision with root package name */
        int f4618m;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        LaunchedFragmentInfo(String str, int i10) {
            this.f4617f = str;
            this.f4618m = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f4617f);
            parcel.writeInt(this.f4618m);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f4617f = parcel.readString();
            this.f4618m = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public void d(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void e(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void f(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void i(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void k(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void l(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void n(FragmentManager fragmentManager, Fragment fragment) {
        }

        @Deprecated
        public void a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void g(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void h(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void j(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }
    }
}
