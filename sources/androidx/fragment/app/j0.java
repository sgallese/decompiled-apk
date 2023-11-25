package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Fragment> f4721a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, h0> f4722b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, Bundle> f4723c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private e0 f4724d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(e0 e0Var) {
        this.f4724d = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle B(String str, Bundle bundle) {
        if (bundle != null) {
            return this.f4723c.put(str, bundle);
        }
        return this.f4723c.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (!this.f4721a.contains(fragment)) {
            synchronized (this.f4721a) {
                this.f4721a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f4722b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(String str) {
        if (this.f4722b.get(str) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i10) {
        for (h0 h0Var : this.f4722b.values()) {
            if (h0Var != null) {
                h0Var.t(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4722b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (h0 h0Var : this.f4722b.values()) {
                printWriter.print(str);
                if (h0Var != null) {
                    Fragment k10 = h0Var.k();
                    printWriter.println(k10);
                    k10.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4721a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f4721a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment f(String str) {
        h0 h0Var = this.f4722b.get(str);
        if (h0Var != null) {
            return h0Var.k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g(int i10) {
        for (int size = this.f4721a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f4721a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (h0 h0Var : this.f4722b.values()) {
            if (h0Var != null) {
                Fragment k10 = h0Var.k();
                if (k10.mFragmentId == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f4721a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f4721a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (h0 h0Var : this.f4722b.values()) {
                if (h0Var != null) {
                    Fragment k10 = h0Var.k();
                    if (str.equals(k10.mTag)) {
                        return k10;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment findFragmentByWho;
        for (h0 h0Var : this.f4722b.values()) {
            if (h0Var != null && (findFragmentByWho = h0Var.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f4721a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f4721a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f4721a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f4721a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<h0> k() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : this.f4722b.values()) {
            if (h0Var != null) {
                arrayList.add(h0Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : this.f4722b.values()) {
            if (h0Var != null) {
                arrayList.add(h0Var.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, Bundle> m() {
        return this.f4723c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0 n(String str) {
        return this.f4722b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> o() {
        ArrayList arrayList;
        if (this.f4721a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4721a) {
            arrayList = new ArrayList(this.f4721a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0 p() {
        return this.f4724d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle q(String str) {
        return this.f4723c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(h0 h0Var) {
        Fragment k10 = h0Var.k();
        if (c(k10.mWho)) {
            return;
        }
        this.f4722b.put(k10.mWho, h0Var);
        if (k10.mRetainInstanceChangedWhileDetached) {
            if (k10.mRetainInstance) {
                this.f4724d.b(k10);
            } else {
                this.f4724d.l(k10);
            }
            k10.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(h0 h0Var) {
        Fragment k10 = h0Var.k();
        if (k10.mRetainInstance) {
            this.f4724d.l(k10);
        }
        if (this.f4722b.get(k10.mWho) == h0Var && this.f4722b.put(k10.mWho, null) != null && FragmentManager.M0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        boolean z10;
        Iterator<Fragment> it = this.f4721a.iterator();
        while (it.hasNext()) {
            h0 h0Var = this.f4722b.get(it.next().mWho);
            if (h0Var != null) {
                h0Var.m();
            }
        }
        for (h0 h0Var2 : this.f4722b.values()) {
            if (h0Var2 != null) {
                h0Var2.m();
                Fragment k10 = h0Var2.k();
                if (k10.mRemoving && !k10.isInBackStack()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (k10.mBeingSaved && !this.f4723c.containsKey(k10.mWho)) {
                        B(k10.mWho, h0Var2.r());
                    }
                    s(h0Var2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(Fragment fragment) {
        synchronized (this.f4721a) {
            this.f4721a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        this.f4722b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(List<String> list) {
        this.f4721a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f10 = f(str);
                if (f10 != null) {
                    if (FragmentManager.M0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f10);
                    }
                    a(f10);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(HashMap<String, Bundle> hashMap) {
        this.f4723c.clear();
        this.f4723c.putAll(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f4722b.size());
        for (h0 h0Var : this.f4722b.values()) {
            if (h0Var != null) {
                Fragment k10 = h0Var.k();
                B(k10.mWho, h0Var.r());
                arrayList.add(k10.mWho);
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + k10.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> z() {
        synchronized (this.f4721a) {
            if (this.f4721a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f4721a.size());
            Iterator<Fragment> it = this.f4721a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.M0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }
}
